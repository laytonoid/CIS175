<!DOCTYPE html>
<html>
<head>
	<title>Star Wars: List of Force Users</title>
</head>
<body>
	<h1>Force Users</h1>
	<ul>
		<%
			List<model.ForceUser> list = (List<model.ForceUser>) request.getAttribute("allForceUsers");
			for(model.ForceUser fu : list){
		%>
			<li><%= fu.returnForceUserDetails() %></li>
		<% } %>
	</ul>
</body>
</html>