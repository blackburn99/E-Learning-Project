<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
     <form action="register" method="POST">
        <pre>
        User Id   : <input type="number" name="id" /><br>
        Username  : <input type="text" name="username" /><br>
        Password  : <input type="password" name="password" /><br>
        Email     : <input type="email" name="email" /><br>
        Age       : <input type="number" name="age" /><br>
        Phone#    : <input type="number" name="phone" /><br>
                    <input type="submit" value="Sign Up" /><br>
       </pre>
     </form>
</body>
</html>