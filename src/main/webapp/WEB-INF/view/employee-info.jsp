<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<h2> add new employee </h2>
<br><br>

<form:form action="saveEmployee" modelAttribute="employee">
    Name<form:input path="name"/>
    <br><br>
    Surname<form:input path="surname"/>
    <br><br>
    Department <form:input path="department"/>

    <br><br>
    Salary <form:input path="salary"/>
    <br><br>

    <input type="submit" value="ok">
</form:form>


</body>

</html>