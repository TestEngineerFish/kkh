package com.kkh.runner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import _4_2.DoctorAddPatient;
import _4_2.DoctorDetail;
import _4_2.DoctorFreePhone;
import _4_2.DoctorMedalSharePage;
import _4_2.GetDoctorDetailToDoctor;
import _4_2.GiveAppleToBuyService;
import _4_2.PatientAppleAccount;
import _4_2.PatientDetail;
import _4_2.PatientGetCommendDoctors;
import _4_2.PatientGetDoctorDetail;
import _4_2.PatientGetDoctors;
import _4_2.PatientSearchDoctor;
import _4_2.PromptPatientAttention;
import _4_2.SearchDoctors;

@RunWith(Suite.class)
@SuiteClasses({ DoctorAddPatient.class, DoctorDetail.class,
		DoctorFreePhone.class, DoctorMedalSharePage.class,
		GetDoctorDetailToDoctor.class, GiveAppleToBuyService.class,
		PatientAppleAccount.class, PatientDetail.class,
		PatientGetCommendDoctors.class, PatientGetDoctorDetail.class,
		PatientGetDoctors.class, PatientSearchDoctor.class,
		PromptPatientAttention.class, SearchDoctors.class })
public class TestCase_4_2 {

}
