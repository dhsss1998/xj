<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>Layui</title>
  <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
  <script type="text/javascript" src="./dist/layui.all.js"></script>
  <script type="text/javascript" src="./dist/jQuery1.9.1.js"></script>
  <link rel="stylesheet" href="./dist/css/layui.css?t=1590915280231" media="all">
  <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<body> 
 
<div class="demoTable">
  搜索ID：
  <div class="layui-inline">
    <input class="layui-input" name="id" id="demoReload" autocomplete="off">
  </div>
  <div class="layui-btn" data-type="reload">搜索</div>
</div>
 
 
<table class="layui-hide" id="demo" lay-filter="test"></table>
<script type="text/html" id="barDemo">
  <a class="layui-btn layui-btn-xs" lay-event="edit">加入</a>
</script>
               
          
<script src="./dist/layui.js?t=1590915280231" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script>
layui.use(['laypage', 'table'], function(){
	  var table = layui.table,laypage = layui.laypage;
  //方法级渲染
  table.render({
    elem: '#demo'
    ,url: 'http://localhost:8080/xuejimvc_war_exploded/student/reward'
    ,limit:10
    ,totalRow: true
    ,limits:[10,20,50]
    ,page: true
    ,cols: [[ //表头
    	{checkbox: true, fixed: true}
          ,{field: 'studentId', title: '组织编号', width:120, sort: true, fixed: 'left', totalRowText: '合计：'}
          ,{field: 'team_id', title: '组织名称', width:150}
          ,{field: 'team_type', title: '组织类型', width:120, sort: true}
          ,{fixed: 'right', width:80, align:'center', toolbar: '#barDemo'}
     ]]
        ,id: 'testReload'
	    ,height: 310,
  });
  var $ = layui.$, active = {
    reload: function(){
      var demoReload = $('#demoReload').val();
      //执行重载
      table.reload('testReload', {
        page: {
          curr: 1 //重新从第 1 页开始
        }
        ,where: {
        	  team_id:demoReload,
        }
      }, 'data');
    }
  };
  table.on('tool(test)', function(obj){ //注：tool 是工具条事件名，test 是 table 原始容器的属性 lay-filter="对应的值"
	    var data = obj.data //获得当前行数据
	    ,layEvent = obj.event; //获得 lay-event 对应的值
	    if(layEvent === 'edit'){
	     //可执行确定按钮事件并把备注信息（即多行文本框值）存入需要的地方
	               $.post("/Jointeam",{team_id:data.team_id},function(data){
	            	 $(".layui-laypage-btn").click()//刷新当前分页
	      	      }); 
	    }
	  });
  $('.demoTable .layui-btn').on('click', function(){
    var type = $(this).data('type');
    active[type] ? active[type].call(this) : '';
  });
  
});
</script>

</body>
</html>       
        