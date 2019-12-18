/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.patientdata.fragment.controller;

import java.util.ArrayList;
import java.util.List;

import org.openmrs.Patient;
import org.openmrs.api.PatientService;
import org.openmrs.api.context.Context;
import org.openmrs.ui.framework.fragment.FragmentModel;

/**
 *  * Controller for a fragment that shows all users  
 */
public class UsersFragmentController {
	
	public void controller(FragmentModel model) {
		PatientService service = Context.getPatientService();
		List<Patient> maturePatients = new ArrayList<Patient>();
		List<Patient> allpatients = service.getAllPatients();
		for (Patient patient : allpatients) {
			if (patient.getAge() >= 15) {
				maturePatients.add(patient);
			}
		}
		model.addAttribute("patients", maturePatients);
	}
	
}
