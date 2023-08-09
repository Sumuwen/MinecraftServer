var register_button
var orginStyleOfButton;
window.onload=function(){
	/* 获取id为register_button的按钮元素*/
	register_button = document.getElementById("register_button");
	/* 保存register_button原始的css样式 */
	orginStyleOfButton = register_button.style.cssText;
	/* pressButton()是直接引用并使用函数,我们需要将pressButton()函数赋值的话就不可以加括号 */
	register_button.onclick = pressButton;
}
function pressButton(){
	/* 设计登录按钮点下的动态效果 */
	register_button.style.boxShadow="inset 2px 2px 5px black";
	/* setTimeout只执行一次回调函数，用于延迟指定时间后执行 */
	setTimeout(releaseButton,100);
}
function releaseButton(){
	/* 恢复register_button到没点击的时候的css样式 */
	register_button.style.cssText = orginStyleOfButton;
}
