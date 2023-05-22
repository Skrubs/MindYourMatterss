package Benefits;

import java.util.ArrayList;

import features.MoneyFeatures.MembershipPerks;
import features.MoneyFeatures.MonthlyIncome;
import features.MoneyFeatures.PayIncreases;
import features.advancementFeatures.CommissioningPrograms;
import features.advancementFeatures.ProfessionalDevelopment;
import features.advancementFeatures.Promotions;
import features.educationFeatures.AfCoolProgram;
import features.educationFeatures.ClepAndDantes;
import features.educationFeatures.CollegeLoanRepaymentProgram;
import features.educationFeatures.CommunityCollegeOfTheAirForce;
import features.educationFeatures.MontgomeryGIBillChapter1606;
import features.educationFeatures.MontgomeryGIBillChapter30;
import features.educationFeatures.Post911GIBillChapter33;
import features.educationFeatures.TuitionAssistanceProgram;
import features.recreationFeatures.BaseRecreation;
import features.recreationFeatures.InformationTicketsAndTravel;
import features.recreationFeatures.OutdoorRecreation;
import features.recreationFeatures.PhysicalRecreation;
import features.recreationFeatures.StateNationalParkRecreation;
import features.recreationFeatures.TimeForRecreation;
import features.satisfactionFeatures.Belonging;
import features.satisfactionFeatures.Recognition;
import features.satisfactionFeatures.ServiceToCountry;
import features.securityFeatures.HometownService;
import features.securityFeatures.JobSecurity;
import features.securityFeatures.MedicalCare;
import features.securityFeatures.PostServiceBenefits;
import features.trainingFeatures.BasicMilitaryTraining;
import features.trainingFeatures.TechnicalSchool;
import features.trainingFeatures.UpgradeTraining;
import features.travelFeatures.Hops;
import features.travelFeatures.PermanentChangeOfDutyStation;
import features.travelFeatures.TemporaryDuty;

public class Entitlements {
	
	
	
	
	private ArrayList<Money> moneyList = new ArrayList<>();
	private ArrayList<Advancement> advancementList = new ArrayList<>();
	private ArrayList<Travel> travelList = new ArrayList<>();
	private ArrayList<Training> trainingList = new ArrayList<>();
	private ArrayList<Education> educationList = new ArrayList<>();
	private ArrayList<Recreation> recreationList = new ArrayList<>();
	private ArrayList<Satisfaction> satisfactionList = new ArrayList<>();
	private ArrayList<Security> securityList = new ArrayList<>();
	
	
	public Entitlements() {

		
		//load money list
		moneyList.add(new MonthlyIncome());
		moneyList.add(new PayIncreases());
		moneyList.add(new MembershipPerks());
		
		//load advancement list
		advancementList.add(new Promotions());
		advancementList.add(new ProfessionalDevelopment());
		advancementList.add(new CommissioningPrograms());
		
		//load travel list
		travelList.add(new PermanentChangeOfDutyStation());
		travelList.add(new TemporaryDuty());
		travelList.add(new Hops());
		
		//load training list
		trainingList.add(new BasicMilitaryTraining());
		trainingList.add(new TechnicalSchool());
		trainingList.add(new UpgradeTraining());
		
		
		//load education list
		educationList.add(new AfCoolProgram());
		educationList.add(new ClepAndDantes());
		educationList.add(new CollegeLoanRepaymentProgram());
		educationList.add(new CommunityCollegeOfTheAirForce());
		educationList.add(new MontgomeryGIBillChapter1606());
		educationList.add(new MontgomeryGIBillChapter30());
		educationList.add(new Post911GIBillChapter33());
		educationList.add(new TuitionAssistanceProgram());
		
		//load recreation list
		recreationList.add(new BaseRecreation());
		recreationList.add(new InformationTicketsAndTravel());
		recreationList.add(new OutdoorRecreation());
		recreationList.add(new PhysicalRecreation());
		recreationList.add(new StateNationalParkRecreation());
		recreationList.add(new TimeForRecreation());
		
		//load satisfaction list
		satisfactionList.add(new Belonging());
		satisfactionList.add(new Recognition());
		satisfactionList.add(new ServiceToCountry());
		
		//load security list
		securityList.add(new HometownService());
		securityList.add(new JobSecurity());
		securityList.add(new MedicalCare());
		securityList.add(new PostServiceBenefits());
		
		
		
	}
	
	
	
	public ArrayList<Training> getTrainingList() {
		return trainingList;
	}



	public void setTrainingList(ArrayList<Training> trainingList) {
		this.trainingList = trainingList;
	}



	public ArrayList<Education> getEducationList() {
		return educationList;
	}



	public void setEducationList(ArrayList<Education> educationList) {
		this.educationList = educationList;
	}



	public ArrayList<Recreation> getRecreationList() {
		return recreationList;
	}



	public void setRecreationList(ArrayList<Recreation> recreationList) {
		this.recreationList = recreationList;
	}



	public ArrayList<Satisfaction> getSatisfactionList() {
		return satisfactionList;
	}



	public void setSatisfactionList(ArrayList<Satisfaction> satisfactionList) {
		this.satisfactionList = satisfactionList;
	}



	public ArrayList<Security> getSecurityList() {
		return securityList;
	}



	public void setSecurityList(ArrayList<Security> securityList) {
		this.securityList = securityList;
	}



	public ArrayList<Money> getMoneyList(){
		return moneyList;
	}

	public ArrayList<Advancement> getAdvancementList() {
		return advancementList;
	}

	public void setAdvancementList(ArrayList<Advancement> advancementList) {
		this.advancementList = advancementList;
	}

	public void setMoneyList(ArrayList<Money> moneyList) {
		this.moneyList = moneyList;
	}

	public ArrayList<Travel> getTravelList() {
		return travelList;
	}

	public void setTravelList(ArrayList<Travel> travelList) {
		this.travelList = travelList;
	}
	
	
	
	
	
	
	

}
