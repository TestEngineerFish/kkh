package com.kkh.runner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import _4_3.Duty_GetHistoryQuestions;
import _4_3.GetDutyOfficeLatestMessages;
import _4_3.GetIncomeEntryList;
import _4_3.GetPatientQuestionStatus;
import _4_3.GetPromotionList;

@RunWith(Suite.class)
@SuiteClasses({ Duty_GetHistoryQuestions.class,
		GetDutyOfficeLatestMessages.class, GetIncomeEntryList.class,
		GetPatientQuestionStatus.class, GetPromotionList.class })
public class TestCase_4_3 {

}
