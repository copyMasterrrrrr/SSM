
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <script src="https://libs.baidu.com/jquery/1.7.2/jquery.js"></script>
    <script>
        function a1(){
            $.post(
                "${pageContext.request.contextPath}/login",
                {"name":$("#name").val()},
                function (data) {
                    if (data=="true"){
                        $("#nameInfo").css("color","green")
                    }
                    $("#nameInfo").html(data)
                }
                )
        }
        function a2(){
            $.post(
                "${pageContext.request.contextPath}/login",
                {"pwd":$("#pwd").val()},
                function (data) {
                        if (data=="true"){
                            $("#pwdInfo").css("color","green")
                        }
                    $("#pwdInfo").html(data)
                    }
                )

        }

    </script>

</head>
<body>

    用户名：<input type="text" id="name" onblur="a1()">
    <span id="nameInfo"></span>
    密码：<input type="text" id="pwd" onblur="a2()">
    <span id="pwdInfo"></span>
</body>
</html>
