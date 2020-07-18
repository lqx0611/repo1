<%--
  Created by IntelliJ IDEA.
  User: DUMBLEDOG
  Date: 2020/7/14 17:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <script type="text/javascript">
    function checkForm(thisForm) {
      var value = thisForm.d1.value;
      var len = value.length;
      for(var i = 0; i < len; i++){
        if(value.charAt(i)>"9" ||value.charAt(i)<"0"){
          alert("含有非数字字符");
          return false;
        }
      }
      return true;

    }
  </script>
  <body>
  <form onsubmit="return checkForm(this)">
    <input id="d1" type="text">
    <input type="submit" value="提交">
  </form>
  </body>
</html>
