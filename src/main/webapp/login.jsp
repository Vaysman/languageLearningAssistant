<%@include file="parts/header.jsp" %>
<%@include file="parts/head.jsp" %>

 <h3>Welcome! Please login below</h3>
<div>
<s:form action="login" role="form">
  <s:property value="message"></s:property>
  <s:textfield name="login" label="Login" class="form-control" id="inputSuccess"></s:textfield>
  <s:textfield name="password" label="Password" type="password"  class="form-control" id="inputSuccess"></s:textfield>
  <s:submit value="Login"></s:submit>
</s:form>
</div>
<a href="registration">Create new user</a>
 
<%@include file="parts/footer.jsp" %>
