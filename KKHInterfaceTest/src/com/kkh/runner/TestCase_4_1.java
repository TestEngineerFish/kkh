package com.kkh.runner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import _4_1.DeleteDoctorBoundPhone;
import _4_1.DoctorBoundPhoneVerifyPassword;
import _4_1.DoctorGetPatientDetail;
import _4_1.DoctorGetWXPatientInfo;
import _4_1.FavoritePopularScienceArticles;
import _4_1.GetDoctorBoundPhone;
import _4_1.GetDoctorBoundPhoneVerifyPassword;
import _4_1.GetPatientFavoritePopularScienceArtivles;
import _4_1.GetPopularScienceArticles;
import _4_1.UnfavoritePopularScienceArticles;

@RunWith(Suite.class)
@SuiteClasses({ DeleteDoctorBoundPhone.class,
		DoctorBoundPhoneVerifyPassword.class, DoctorGetPatientDetail.class,
		DoctorGetWXPatientInfo.class, FavoritePopularScienceArticles.class,
		GetDoctorBoundPhone.class, GetDoctorBoundPhoneVerifyPassword.class,
		GetPatientFavoritePopularScienceArtivles.class,
		GetPopularScienceArticles.class, UnfavoritePopularScienceArticles.class })
public class TestCase_4_1 {

}
