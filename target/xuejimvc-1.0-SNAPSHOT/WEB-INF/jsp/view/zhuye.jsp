<%--
  Created by IntelliJ IDEA.
  User: he
  Date: 2018/12/17
  Time: 21:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>



</head>
<body>



<template:user_backend htmlTitle="主页" bodyTitle="主页">
    <div class="col-md-11">

    </div>
    <script>
        //设置页面对应的菜单选项
        var ItemId = "Item0.0";

        $(document).ready(function () {
            //添加文件控件
            $("#addFile").click(function () {
                $(".fileUpload:last").clone().insertBefore($("#addFile"));
                return false;
            });
        });

    </script>
</template:user_backend>

<
<script>

</script>
</body>
</html>
