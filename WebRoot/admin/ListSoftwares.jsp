<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>添加</title>
</head>

<body>
<form action="addsoftware.action" method="post">
名称：<input type="text" name="software.title" id="title" value="${software.title }" /><br />
类型：<input type="text" name="software.typename" id="typename" value="${software.typename }" /><br />
标签：<input type="text" name="software.tags" id="tags" value="${software.tags}" /><br />
界面语言:<input type="text" name="software.language" id="language" value="${software.language }" /><br />
文件大小：<input type="text" name="software.filesize" id="filesize" value="${software.filesize }" /><br />
安装：<input type="text" name="software.installenv" id="installenv" value="${software.installenv }" /><br />
简介：<input type="text" name="software.intro" id="intro" value="${software.intro }" /><br />
文件选择：<input type="text" name="software.address" id="address" value="${software.address }" /><br />
<input type="submit" value="提交" />
</form>
</body>
</html>
