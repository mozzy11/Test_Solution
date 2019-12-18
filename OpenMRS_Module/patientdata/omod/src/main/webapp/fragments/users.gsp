<h3>PATIENTS ABOVE I5 YEARS</h3>
<table>
  <tr>
   <th>PATIENT ID</th>
   <th>PATIENT NAME</th>
   <th>PATIENT IDENTIFIER</th>
  </tr>
  <% if (patients) { %>
     <% patients.each { %>
      <tr>
        <td>${ ui.format(it.patientId) }</td>
        <td>${ ui.format(it.personName) }</td>
        <td>${ ui.format(it.patientIdentifier) }</td>
      </tr>
    <% } %>
  <% } else { %>
  <tr>
    <td colspan="2">${ ui.message("general.none") }</td>
  </tr>
  <% } %>
</table>