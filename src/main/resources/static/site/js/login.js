var loginButton
var orginStyleOfButton;
window.onload=function(){
	/* 获取id为login_button的按钮元素*/
	loginButton = document.getElementById("login_button");
	/* 保存loginButton原始的css样式 */
	orginStyleOfButton = loginButton.style.cssText;
	/* pressButton()是直接引用并使用函数,我们需要将pressButton()函数赋值的话就不可以加括号 */
	loginButton.onclick = pressButton;
}
function pressButton(){
	/* 设计登录按钮点下的动态效果 */
	loginButton.style.boxShadow="inset 2px 2px 5px black";
	/* setTimeout只执行一次回调函数，用于延迟指定时间后执行 */
	setTimeout(releaseButton,100);
}
function releaseButton(){
	/* 恢复loginButton到没点击的时候的css样式 */
	loginButton.style.cssText = orginStyleOfButton;
}
