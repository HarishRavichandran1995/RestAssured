package non_bdd_style;

public class A5_MethodChaining {
	
	String place;
	String modeOfTravel;
	
	public String getPlace() {
		return place;
	}
	
	public String getModeOfTravel() {
		return modeOfTravel;
	}
	
	public A5_MethodChaining setPlace(String place) {
		this.place=place;
		return this;
	}

	public A5_MethodChaining setModeOfTravel(String modeOfTravel) {
		this.modeOfTravel = modeOfTravel;
		return this;
	}
	
	public void heyManWhereAreYouGoing() {
		System.out.println(getPlace());
		System.out.println("oh jolly ah " + getModeOfTravel()+ "la "+getPlace()+" poringa");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A5_MethodChaining a5_MethodChaining = new A5_MethodChaining();
		a5_MethodChaining.setPlace("Kodaikanal");
		a5_MethodChaining.setModeOfTravel("Car");
		a5_MethodChaining.heyManWhereAreYouGoing();
		a5_MethodChaining.setPlace("ooty").setModeOfTravel("horse").heyManWhereAreYouGoing();
	}

}
