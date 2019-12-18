<% ui.decorateWith("appui", "standardEmrPage") %>


<% if (context.authenticated) { %> 
${ ui.includeFragment("patientdata", "users") }
<% } else { %>
    You are not logged in.
<% } %>

