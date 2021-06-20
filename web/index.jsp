
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script src="https://libs.baidu.com/jquery/1.7.2/jquery.js"></script>
    <script>
      function ajax(){
        $.post({
          url:"${pageContext.request.contextPath}/ajax",
          data:{"username":$("#name").val()},
          success:function (data){
            alert(data);
          },
          error:function (status){
            alert(status);
          }
        })

      }
    </script>
  </head>
  <body>

  <p>请输入用户名</p>
  <input type="text" id="name" onblur="ajax()">

  <h3>
    <a href="${pageContext.request.contextPath}/books/AllBook">所有书籍</a>
  </h3>



  <h3><a href="${pageContext.request.contextPath}/goLogin">登入</a></h3>
  </body>
</html>
