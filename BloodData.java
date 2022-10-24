class BloodData{
	
	static String bloodType;
	static String rhFactor;
	
	public BloodData(){
		bloodType = "O";
		rhFactor = "+";
}
		
	public void setBloodData(String bt){
		this.bloodType = bt;
		
		}
		
	public void setRhFactor(String rh) {
		this.rhFactor = rh;
		
		
		}
	public String getBloodType() {
		return bloodType;
	}
	
	 public void display (){
	 	System.out.println(bloodType + rhFactor + "added to the blood bank");
	 	}
}
	
	
	