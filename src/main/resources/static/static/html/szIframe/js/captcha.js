/**
 * 
 * 新做加载验证码 Add by yuqinhan
 */
// ############## 实名登录校验 #####################

//$("#yzmID").hover(function() {
//	$("#yzmpic").css("display", "block");
//}, function() {
//	$("#yzmpic").css("display", "none");
//});

//$('#yzmpic').mouseenter(function() {
//	$(this).css("display", "block");
//});
//$('#yzmpic').mouseleave(function() {
//	$(this).css("display", "none");
//});
$(function() {
	/*$("#yzmID").hover(function(){
	    $("#yzmpic").css("display","block");
	},function(){
	    $("#yzmpic").css("display","none");
	});

	$('#yzmpic').mouseover(function(){
	    $(this).css("display","block");
	});
	$('#yzmpic').mouseout(function(){
	    $(this).css("display","none");
	});*/

    // 点击刷新按钮
    $('#refreshImg').click(function() {
        refreshClickTipCaptcha();
    });

	// 点击图片上的汉字
	$('#clickTipCaptcha').click(function(event) {
		var code = $("#clickTipCaptchaCode").val();
		var codeJson = [];
		if (code != "") {
			codeJson = JSON.parse(code);
		}
		if (codeJson.length >= tipLength) {
			$("#yzmID").text("最多只能选择" + tipLength + "个点");
			$('#yzmID').prepend("<i class='fa fa-bullhorn'></i>");
			$("#yzmID").css("color", "red");
			return;
		}
		newClientX = event.pageX - $(this).offset().left;
		newClientY = event.pageY - $(this).offset().top;
		var pos = {
			x : newClientX,
			y : newClientY
		};
		codeJson.push(pos);
		$("#clickTipCaptchaCode").val(JSON.stringify(codeJson));
		// 点击点选文字标志
		addMarkTipCaptcha(newClientX, newClientY);
		// 如果选好三个汉字 直接去校验
		if (codeJson.length == tipLength) {
			checkClickTipCaptcha();
		}
	});
});


// 点击点选文字标志
function addMarkTipCaptcha(x, y) {
	$('#clickTipCaptcha').after(
			"<span class=\"Captcha-mark sprite-index-icon-mark\" style=\"left: "
					+ (x + 2) + "px; top: " + (y - 7) + "px;\" coordinate=\""
					+ x + "," + y + "\"></span>");

	$(".Captcha-mark").click(function(event) {
		var coordinate = $(this).attr("coordinate");
		if (coordinate != "") {
			var c = coordinate.split(",");
			if (c.length == 2) {
				var xx = c[0];
				var yy = c[1];
				var codeJson = JSON.parse($("#clickTipCaptchaCode").val());
				var newCodeJson = [];
				for (var i = 0; i < codeJson.length; i++) {
					var c = codeJson[i];
					if (c.x != xx || c.y != yy) {
						newCodeJson.push(c);
					}
				}
				$("#clickTipCaptchaCode").val(JSON.stringify(newCodeJson));
			}
		}
		$(this).remove();
	});
	$(".Captcha-mark").mouseover(function(event) {
		$(this).removeClass("sprite-index-icon-mark");
		$(this).addClass("sprite-index-icon-delete");
	});

	$(".Captcha-mark").mouseout(function(event) {
		$(this).removeClass("sprite-index-icon-delete");
		$(this).addClass("sprite-index-icon-mark");
	});
}



/*$('#refreshImg').on('click', function(e) {
    refreshClickTipCaptcha();
});*/

/*
$('#yzmpic').delegate('#refreshImg', 'click', function() {
    refreshClickTipCaptcha();
});
*/


// 刷新字体图标
function refreshClickTipCaptcha() {
	$.ajax({
		url : "/cms/EtaxServletSz?action=newyzm",
		type : "post",
		dataType: "json",
		success : function(res) {
			console.log(res);
			// 图片赋值
			$("#clickTipCaptcha").attr("src",
					"data:image/jpg;base64," + res.image);
			// 图片下的汉字提示赋值
			var tipMessage = res.tipMessage;
			$("#yzmID").text(tipMessage);
			$('#yzmID').prepend("<i class='fa fa-hand-o-right'></i>");
			$('#yzmID').css({
				"border" : "1px solid #BDBDBD",
				"color" : "#9CC3E3",
				"background-color" : "#35749E"
			});
			// 获取提示汉字的长度
			var tip = tipMessage.split(" ");
			tipLength = tip.length;
		}
	});
	$("#clickTipCaptchaCode").val("");
	$(".Captcha-mark").remove();
}

// 校验验证码
function checkClickTipCaptcha() {
	$.ajax({
		url : "/cms/EtaxServletSz",
		type : "post",
		//contentType : "application/json",
		dataType:"json",
		data : {
			action:"checkyzm",
			zb:$("#clickTipCaptchaCode").val()
		},
		success : function(res) {
			if (res.success) {
				// 验证成功
				$('#yzmID').text(res.message);
				$('#yzmID').prepend("<i class='fa fa-check'></i>");
				$('#yzmID').css({
					"border" : "1px solid #52CCBA",
					"color" : "#52CCBA",
					"background-color" : "#D2F4EF"
				});
				$('#yzmpic').css("display", "none");
			} else {
				// 验证失败
				$('#yzmID').text(res.message);
				$('#yzmID').prepend("<i class='fa fa-times'></i>");
				$('#yzmID').css({
					"border" : "1px solid #DB4922",
					"color" : "#DB4922",
					"background-color" : "#FCE1E1"
				});
				setTimeout(refreshClickTipCaptcha, 1800);
			}
		}
	});
}