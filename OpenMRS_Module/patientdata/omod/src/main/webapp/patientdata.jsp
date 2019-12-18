<%@ include file="/WEB-INF/template/include.jsp"%>

<%@ include file="/WEB-INF/template/header.jsp"%>

<h2><spring:message code="patientdata-omod.title" /></h2>

<br/>
<h3>PATIENTS ABOVE I5 YEARS</h3>
<table>
  <tr>
   <th>PATIENT ID</th>
   <th>PATIENT NAME</th>
   <th>PATIENT IDENTIFIER</th>
  </tr>
  <c:forEach var="patient" items="${patients}">
      <tr>
        <td>${patient.patientId}</td>
        <td>${patient.personName}</td>
        <td>${patient.patientIdentifier}</td> 
      </tr>		
  </c:forEach>
</table>

<%@ include file="/WEB-INF/template/footer.jsp"%>
