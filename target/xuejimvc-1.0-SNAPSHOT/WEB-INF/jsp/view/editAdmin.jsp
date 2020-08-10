
<template:user_backend htmlTitle="编辑管理员信息" bodyTitle="编辑管理员信息">
    <form method="POST" action="${cx}/admin/update/"
          enctype="multipart/form-data">


        <div class="form-group">
            <label for="firstname1" class="col-sm-1 control-label">ID</label>
            <div class="col-sm-6">
                <input type="text" name="adminId" value="${admin.adminId}" class="form-control" id="firstname1" >
            </div>
        </div><br/><br/>
        <div class="form-group">
            <label for="firstname" class="col-sm-1 control-label">账户</label>
            <div class="col-sm-6">
                <input type="text" name="adminname" value="${admin.adminname}" class="form-control" id="firstname">
            </div>
        </div><br/><br/>
        <div class="form-group">
            <label for="firstname2" class="col-sm-1 control-label">密码</label>
            <div class="col-sm-6">
                <input type="text"  name="password" value="${admin.password}" class="form-control" id="firstname2"
                       placeholder="请输入密码">
            </div>
        </div><br/><br/>
        <div class="form-group">
           <%--@declare id="firstname3"--%><label for="firstname3"  class="col-sm-1 control-label">邮箱</label >
            <div class="col-sm-6">
                <input type="text"  name="email" value="${admin.email}" class="form-control" id="firstnae3">
            </div>
        </div><br/><br/>





                <input type="submit" value="提交" class="btn btn-default"/>
        </div>

    </form>
    <script>
        //设置页面对应的菜单选项
        var ItemId ="Item1_0";
    </script>
</template:user_backend>
