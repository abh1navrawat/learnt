<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="addAlien">
		<label> AID 
		<input  type=text name="aid">
		</label>
		<label> Aname
		<input type=text name="aname">
		</label>
		<label> Alang
		<input type=text name="alang">
		</label>
		<input type=submit>
	</form>

	<form action="delAlien">
		<input type=text name="aid">
		<input type=text name="aname">
		<input type=text name="alang">
		<input type=submit>
	</form>
	
	<form action="getAlien">
		<input type=text name="aid" placeholder="aid">
		<input type=submit>
	</form>
	<form action="getAliens">
		<input type=submit>
		
	</form>
	
</body>
</html>