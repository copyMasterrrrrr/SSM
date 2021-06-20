<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://libs.baidu.com/jquery/1.7.2/jquery.js"></script>
    <script>
        $(function () {
            $("#btn").click(function () {
                $.post("${pageContext.request.contextPath}/ajax2",function (data) {
                    //console.log(data)
                    var html="";
                    for (let i = 0; i <data.length ; i++) {
                        html+="<tr>"+
                            "<td>"+data[i].name+"</td>"+
                            "<td>"+data[i].age+"</td>"+
                            "<td>"+data[i].address+"</td>"+
                            "</tr>"
                    }
                    $("#content").html(html)
                })
            })
        })


        $("").
    </script>
</head>
<body>
    <input type="button" value="加载数据" id="btn" >
    <table>
        <tr>
            <td>姓名</td>
            <td>年龄</td>
            <td>地址</td>
        </tr>
        <tbody id="content">
        <%--后台书据--%>
        </tbody>
    </table>

</body>
</html>