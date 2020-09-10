<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>List</title>
</head>
<body>
   <h1>Dept List Page</h1>
   <table>
      <tr>
         <th>deptno</th>
         <th>dname</th>
         <th>loc</th>
      </tr>
      <c:forEach items="${list }" var="bean">
      <tr>
         <td>${bean.deptno }</td>      
         <td>${bean.dname }</td>      
         <td>${bean.loc }</td>      
      </tr>
      </c:forEach>
   </table>
   
</body>
</html>