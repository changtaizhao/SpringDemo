<%@ page language="java" contentType="text/html; UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>HttpMessageConverter Demo</title>
</head>
<body>
    <div id="resp"/>
    <input type="button" onclick="req();" value="请求"/>
    <script src="assets/jquery.js"></script>
    <script>
        function req() {
            $.ajax({
                url: "convert",
                data: "1-zhaochangtai",
                type: "POST",
                contentType:"application/x-wisely",
                success: function(data){
                    $("#resp").html(data);
                }
            })
        }
    </script>
</body>
</html>