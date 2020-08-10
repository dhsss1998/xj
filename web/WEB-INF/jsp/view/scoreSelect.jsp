<template:user_backend htmlTitle="查询学生信息"
                           bodyTitle="查询学生学分">

        <form method="GET" id="searchform" action="${cx}/student/scoreSelect" style="text-align: center">
            <fieldset class="search">
                <input type="text" class="box" name="studentId" placeholder="请输入学生ID。"/>
                <button class="btn" title="Submit Search">Search</button>${msg}
            </fieldset>
        </form>

    <div class="panel panel-default">
        <div class="panel-heading">


                <div class="panel-heading">



   姓名：<c:out value="${sessionScope.resultstudent1[0].student.name}"></c:out>
                   学分： <c:out value="${sessionScope.resultstudent1[0].score}"></c:out>
                        <c:out value="${sessionScope.resultstudent.get(fn:indexOf(name,name ))}"></c:out>
                </div>

        </div>
    </div>

    <script>
        //设置页面对应的菜单选项
        var ItemId ="Item1_4";
    </script>
</template:user_backend>
