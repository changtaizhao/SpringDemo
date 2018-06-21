<%@ page language="java" contentType="text/html; UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <script type="text/javascript" src="assets/jquery.js"></script>
    <script type="text/javascript">

        deferred();

        function deferred() {
            $.get('defer', function (data) {
                console.log(data);
                deferred();
            })
        }
    </script>
</body>
</html>