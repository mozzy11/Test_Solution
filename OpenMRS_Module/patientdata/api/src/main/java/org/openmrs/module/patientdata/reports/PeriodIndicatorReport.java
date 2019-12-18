package org.openmrs.module.patientdata.reports;

import org.openmrs.api.context.Context;
import org.openmrs.module.reporting.cohort.definition.GenderCohortDefinition;
import org.openmrs.module.reporting.dataset.definition.SqlDataSetDefinition;
import org.openmrs.module.reporting.indicator.CohortIndicator;
import org.openmrs.module.reporting.indicator.CohortIndicator.IndicatorType;
import org.openmrs.module.reporting.report.definition.PeriodIndicatorReportDefinition;
import org.openmrs.module.reporting.report.definition.service.ReportDefinitionService;

public class PeriodIndicatorReport {
	
	public void saveIndicatorReport() {
		
		PeriodIndicatorReportDefinition rd = new PeriodIndicatorReportDefinition();
		rd.setName("Indicator Report");
		rd.setupDataSetDefinition();
		//set Dataset Definition
		SqlDataSetDefinition dfn = new SqlDataSetDefinition();
		String sql = "SELECT pn.given_name ,pt.identifier ,o.value_numeric FROM patient_identifier pt ,person_name pn ,"
		        + " concept_name c ,obs o WHERE pn.person_name_id = o.person_id and pn.person_name_id = pt.patient_id and "
		        + "c.concept_id = o.concept_id AND o.concept_id = 5088 and o.value_numeric > 37 ";
		
		dfn.setSqlQuery(sql);
		
		//set Corhot definition
		GenderCohortDefinition females = new GenderCohortDefinition();
		females.setName("Females");
		females.setFemaleIncluded(true);
		females.setMaleIncluded(false);
		//set Corhot indicator
		CohortIndicator numberOfFeMales = new CohortIndicator();
		numberOfFeMales.setName("Females");
		numberOfFeMales.setType(IndicatorType.COUNT);
		numberOfFeMales.setCohortDefinition(females, "");
		
		rd.setBaseCohortDefinition(females, null);
		rd.addIndicator("1.A", "Number of Females", numberOfFeMales);
		rd.addDataSetDefinition("Count Of Female", dfn, null);
		
		ReportDefinitionService rds = (ReportDefinitionService) Context.getService(ReportDefinitionService.class);
		rds.saveDefinition(rd);
	}
}
