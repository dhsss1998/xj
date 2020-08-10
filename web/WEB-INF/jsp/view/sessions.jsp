<template:user_backend htmlTitle="在线用户" bodyTitle="在线用户列表">
    当前管理员是： ${admin.adminname} 管理员ID：${admin.adminId} email:${admin.email}  密码${admin.password}<br /><br />

    <div class="panel panel-default">
        <div class="panel-heading">
            <strong>工号#</strong>  ${admin.adminId}
        </div>
        <div class="panel-heading">
            <strong>管理员:</strong>  ${admin.adminname}
        </div>
        <div class="panel-heading">
            <strong>密码:</strong> ${admin.password}
        </div>

        <div class="panel-heading">
            <strong>邮箱:</strong>  ${admin.email}
        </div>


    </div>

    <a href="${cx}/student/"  class="btn btn-primary btn-lg" role="button">返回 </a>
    <a href="${cx}/admin/edit/${admin.adminId}"  class="btn btn-primary btn-lg" role="button"> 编辑</a>
    <script>
        //设置页面对应的菜单选项
        var ItemId ="Item2_1";
    </script>

</template:user_backend>

