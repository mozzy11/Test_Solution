/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.patientdata;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.api.FormService;
import org.openmrs.api.context.Context;
import org.openmrs.module.BaseModuleActivator;
import org.openmrs.module.htmlformentry.HtmlFormEntryService;
import org.openmrs.module.htmlformentryui.HtmlFormUtil;
import org.openmrs.module.patientdata.reports.PeriodIndicatorReport;
import org.openmrs.module.patientdata.reports.SimplePatientReports;
import org.openmrs.ui.framework.resource.ResourceFactory;

/**
 * This class contains the logic that is run every time this module is either started or shutdown
 */
public class PatientdataActivator extends BaseModuleActivator {
	
	private Log log = LogFactory.getLog(this.getClass());
	
	/**
	 * @see #started()
	 */
	SimplePatientReports simpleReport = new SimplePatientReports();
	
	PeriodIndicatorReport periodReport = new PeriodIndicatorReport();
	
	public void started() {
		log.info("Started Patientdata");
		try {
			setupHtmlForms();
			simpleReport.saveSimpleReport();
			periodReport.saveIndicatorReport();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * @see #shutdown()
	 */
	public void shutdown() {
		log.info("Shutdown Patientdata");
	}
	
	private void setupHtmlForms() throws Exception {
		try {
			ResourceFactory resourceFactory = ResourceFactory.getInstance();
			FormService formService = Context.getFormService();
			
			HtmlFormEntryService htmlFormEntryService = Context.getService(HtmlFormEntryService.class);
			
			List<String> htmlforms = Arrays.asList("patientdata:htmlforms/patientVitals.xml");
			
			for (String htmlform : htmlforms) {
				HtmlFormUtil.getHtmlFormFromUiResource(resourceFactory, formService, htmlFormEntryService, htmlform);
			}
		}
		catch (Exception e) {
			// this is a hack to get component test to pass until we find the proper way to mock this
			if (ResourceFactory.getInstance().getResourceProviders() == null) {
				log.error("Unable to load HTML forms--this error is expected when running component tests");
			} else {
				throw e;
			}
		}
	}
	
}
