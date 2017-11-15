<!DOCTYPE HTML>
<html>
<head>
    <title>Poco SpringBoot with Freemarker</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
    <h1>Form</h1>
    <form action="#" method="post">
    	<p>Id: <input type="text" name="id" value="${greeting.id!"Enter an Id"}" /></p>
        <p>Message: <input type="text" name="content" value="${greeting.content!"Enter a message"}" /></p>
        <p><input type="submit" value="Submit" /> <input type="reset" value="Reset" /></p>
    </form>
</body>
</html>
