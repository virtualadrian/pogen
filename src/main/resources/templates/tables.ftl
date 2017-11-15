<!DOCTYPE HTML>
<html>
<head>
    <title>Poco SpringBoot with Freemarker</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>


    <h1>DB Tables</h1>


    <#list allTables as table>

        <div>${table.tableName}</div>
        <br>

    </#list>



</body>
</html>
