package org.openmrs.module.patientdata.reports;

import org.openmrs.api.context.Context;
import org.openmrs.module.reporting.dataset.definition.SqlDataSetDefinition;
import org.openmrs.module.reporting.report.definition.ReportDefinition;
import org.openmrs.module.reporting.report.definition.service.ReportDefinitionService;

public class SimplePatientReports {
	
	public void saveSimpleReport() {
		
		ReportDefinition rd = new ReportDefinition();
		rd.setName("Patient Vital Report");
		//Data set Definition For weight
		SqlDataSetDefinition wt = new SqlDataSetDefinition();
		String sqlWt = "SELECT pn.given_name ,pt.identifier ,c.name ,o.value_numeric FROM patient_identifier pt"
		        + " ,person_name pn , concept_name c ,obs o WHERE pn.person_name_id = o.person_id and pn.person_name_id = pt.patient_id "
		        + "and c.concept_id = o.concept_id AND o.concept_id = 5089 and o.value_numeric is NOT NULL";
		wt.setSqlQuery(sqlWt);
		//Data set Definition For height
		SqlDataSetDefinition ht = new SqlDataSetDefinition();
		String sqlHt = "SELECT pn.given_name ,pt.identifier ,c.name ,o.value_numeric FROM patient_identifier pt"
		        + " ,person_name pn , concept_name c ,obs o WHERE pn.person_name_id = o.person_id and pn.person_name_id = pt.patient_id "
		        + "and c.concept_id = o.concept_id AND o.concept_id = 5090 and o.value_numeric is NOT NULL";
		ht.setSqlQuery(sqlHt);
		//Data set Definition For Temperature
		SqlDataSetDefinition tmp = new SqlDataSetDefinition();
		String sqlTemp = "SELECT pn.given_name ,pt.identifier ,c.name ,o.value_numeric FROM patient_identifier pt"
		        + " ,person_name pn , concept_name c ,obs o WHERE pn.person_name_id = o.person_id and pn.person_name_id = pt.patient_id "
		        + "and c.concept_id = o.concept_id AND o.concept_id = 5088 and o.value_numeric is NOT NULL";
		tmp.setSqlQuery(sqlTemp);
		
		rd.addDataSetDefinition("Weight", wt, null);
		rd.addDataSetDefinition("Height", ht, null);
		rd.addDataSetDefinition("Temperature", tmp, null);
		ReportDefinitionService reportDefinitionService = (ReportDefinitionService) Context
		        .getService(ReportDefinitionService.class);
		reportDefinitionService.saveDefinition(rd);
	}
}
