<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>上传测试</title>
    <link href="/upload/webuploader-0.1.5/webuploader.css" rel="stylesheet" />    
    <script src="/js/jquery-1.8.2.js"></script>
    <script src="/upload/webuploader-0.1.5/webuploader.js"></script>
</head>
<body>

    <div id="uploader" class="wu-example">
    <!--用来存放文件信息-->
    <div id="thelist" class="uploader-list"></div>
    <div class="btns">
        <div id="picker">选择文件</div>
    </div>
</div> 
    
    <script>
        var $list=$("#thelist");

        var uploader = WebUploader.create({
            swf: 'Upload/webuploader-0.1.5/Uploader.swf',
            server: '/upload/post',
            pick: '#picker',
            resize: false,
            auto: true,
			fileVal:"file"
        });

        uploader.on('uploadSuccess', function (file,data) {
        	console.log("上传成功 Success!!!!!"+file.name);
            $('#' + file.id).find('p.state').text('已上传');

            $list.append("<p>"+file.name+  "    "+data.msg+ "</p>")
        });

        uploader.on('uploadError', function (file) {
            $('#' + file.id).find('p.state').text('上传出错');

            $list.append("<p>"+file.name+  "    上传失败，大小超过限制"+ "</p>")
        });

        uploader.on('uploadComplete', function (file) {
            $('#' + file.id).find('.progress').fadeOut();
        });
    </script>


</body>
</html>
