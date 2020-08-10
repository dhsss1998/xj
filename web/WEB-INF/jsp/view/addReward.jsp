
<template:user_backend htmlTitle="添加学生奖惩" bodyTitle="添加学生奖惩">

    <div class="col-md-11">
        <div class="panel panel-success">
            <div class="panel-heading"
                 style="background-color:#0b7285;color: white">
                <span class="glyphicon glyphicon-book"></span> 添加奖惩信息
            </div>
            <div class="panel-body">
                <form action="${cx}/student/addR"  method="POST" enctype="multipart/form-data">
                    <fieldset>
                        <div class="form-group ">
                            <label class="control-label">学生Id</label>
                            <input type="text" style="width: 340px;"
                                   class="form-control" placeholder="请输入学生Id"

                                   name="rapId"/>
                        </div>

                        <div class="form-group ">
                            <label class="control-label">类型</label>
                            <select class="form-control" name="re_type"
                                    style="width: 240px;">
                                <option value="奖励">奖励</option>
                                <option value="惩罚">惩罚</option>
                            </select>
                        </div>

                        <div class="form-group ">
                            <label class="control-label">备注</label>
                            <textarea  class="form-control" name="re_note" rows="6" cols="28">
                                具体描述
                        </textarea>
                        </div>


                            <p class="col-lg-4 col-lg-offset-4">
                                <button class="btn btn-default">重置</button>
                                <button class="btn"  style="background-color:#0b7285;color: white">添加奖惩信息</button>
                        </p>
                    </fieldset>
                </form>
            </div>

        </div>
    </div>
    <script>
        //设置页面对应的菜单选项


    </script>
</template:user_backend>
