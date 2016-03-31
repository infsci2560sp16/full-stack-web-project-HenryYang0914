<html>  
  <head>  
        <title>Management Backdoor</title>  
    </head>  
    <body>
      
        <h1>Welcome to Management Backdoor!</h1>
   <p>
    <#if name == "John">
     Welcome ${name}
     </#if>
</p>
<p>Cars in inventory</p>
    <#list cars as car>
    <p>${car.name}</p>
    </#list>
    </body>  
</html>