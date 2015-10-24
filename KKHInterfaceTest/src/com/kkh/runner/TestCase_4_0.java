package com.kkh.runner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import _4_0.DutyOffice_ACKMessage;
import _4_0.DutyOffice_AddImageMessage;
import _4_0.DutyOffice_AddTextMessage;
import _4_0.DutyOffice_AddVoiceMessage;
import _4_0.DutyOffice_DoctorCheckGrabStatus;
import _4_0.DutyOffice_DoctorGrabQuestion;
import _4_0.DutyOffice_GetPatientFamilyMembers;
import _4_0.DutyOffice_GetPatientHistoryQuestions;
import _4_0.DutyOffice_GetPatientQuestionMessage;
import _4_0.DutyOffice_GetSpecialties;
import _4_0.DutyOffice_PatientCreateFamilyMember;
import _4_0.DutyOffice_PatientCreateQuestion;
import _4_0.DutyOffice_PatientDeleteFamildMemeber;
import _4_0.DutyOffice_PatientEditFamilyMember;
import _4_0.DutyOffice_PatientGetDutyOfficeStatus;
import _4_0.DutyOffice_SendGift;
import _4_0.PatientSendToDoctorGift;

@RunWith(Suite.class)
@SuiteClasses({ DutyOffice_ACKMessage.class, DutyOffice_AddImageMessage.class,
		DutyOffice_AddTextMessage.class, DutyOffice_AddVoiceMessage.class,
		DutyOffice_DoctorCheckGrabStatus.class,
		DutyOffice_DoctorGrabQuestion.class,
		DutyOffice_GetPatientFamilyMembers.class,
		DutyOffice_GetPatientHistoryQuestions.class,
		DutyOffice_GetPatientQuestionMessage.class,
		DutyOffice_GetSpecialties.class,
		DutyOffice_PatientCreateFamilyMember.class,
		DutyOffice_PatientCreateQuestion.class,
		DutyOffice_PatientDeleteFamildMemeber.class,
		DutyOffice_PatientEditFamilyMember.class,
		DutyOffice_PatientGetDutyOfficeStatus.class, DutyOffice_SendGift.class,
		PatientSendToDoctorGift.class })
public class TestCase_4_0 {

}
