<%@ page language="java" contentType="text/html; UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>SSE Demo</title>
</head>
<body>
    <div id="msgFromPush"/>
    <script type="text/javascript" src="assets/jquery.js"></script>
    <script type="text/javascript">
        if(window.EventSource){
           var source = new EventSource('push');
           s = '';
           source.addEventListener('message', function (e) {
               s += e.data + "<br/>";
               $("#msgFromPush").html(s);
           });
           source.addEventListener('open', function (e) {
               console.log("连接打开.");
           }, false);
           source.addEventListener('error', function (e) {
               if(e.readyState == EventSource.CLOSED){
                   console.log("连接关闭.");
               }else{
                   console.log(e.readyState);
               }
           }, false);
        }else{
            console.log("你的浏览器不支持SSE");
        }
    </script>
</body>
</html>