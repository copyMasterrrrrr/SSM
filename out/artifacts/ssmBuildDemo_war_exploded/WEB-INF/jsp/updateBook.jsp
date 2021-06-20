<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改书籍</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
<div>
    <div class="container" style="text-align: center">
        <div class="row clearfix">
            <div class="col-md-12 column">
                <div class="page-header">
                    <h1>
                        <small>修改书籍</small>
                    </h1>
                </div>
            </div>
        </div>
    </div>

    <div>
        <form action="/books/updateBook" method="post">
            <div class="form-group">
                <input type="hidden" name="bookID" class="form-control" value="${UpBook.bookID}">
            </div>
            <div class="form-group">
                <label>书籍名称</label>
                <input type="text" name="bookName" class="form-control" value="${UpBook.bookName}" required>
            </div>
            <div class="form-group">
                <label>书籍数量</label>
                <input type="text" name="bookCounts" class="form-control" value="${UpBook.bookCounts}" required>
            </div>
            <div class="form-group">
                <label>书籍描述</label>
                <input type="text" name="detail" class="form-control" value="${UpBook.detail}" required>
            </div>
            <div class="form-group">
                <input type="submit" class="form-control" value="确认修改">
            </div>
        </form>
    </div>
</div>

</body>
</html>