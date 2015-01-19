<%@include file="parts/header.jsp" %>
<%@include file="parts/head.jsp" %>

  <s:form action="register">
    <s:property value="message"></s:property>
    <s:textfield name="name" label="Enter your name" onclick="this.select()" class="form-control" id="inputSuccess"></s:textfield>
    <s:textfield name="lastName" label="Enter your last name" class="form-control" id="inputSuccess"></s:textfield>
    <s:textfield name="email" label="Enter your email" class="form-control" id="inputSuccess"></s:textfield>
    <s:textfield name="login" label="Enter your nickname(login)" class="form-control" id="inputSuccess"></s:textfield>
    <s:textfield name="password" label="Enter password here" type="password" class="form-control" id="inputSuccess"></s:textfield>
    <s:textfield name="repeatedPassword" label="Repeat password" type="password" class="form-control" id="inputSuccess"></s:textfield>
    <s:select name="role" label="Select your role" class="form-control" id="inputSuccess"
       list="roles" />
    <s:submit value="register"></s:submit>
  </s:form>
<%@include file="parts/footer.jsp" %>