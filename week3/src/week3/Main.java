package week3;

class XXXCompetitor {
    private int competitorID;
    private String level;
    private Name name;
    private String country;

    String getLevel(){
        System.out.println(level);
        return level;
    }
    
    void setLevel(String level) {
    	if (level.equals("Beginner") || level.equals("Intermediate") || level.equals("Advanced")) {
            this.level = level;
        } else {
            System.out.println("Please enter Beginner , Intermediate or Advanced.");
        }
    }
   
    void setcountry(String country) {
    	this.country = country;
    }
    
    String getCountry() {
    	return country;
    }
    
    void setCopetitorID(int competitorId) {
    	if (competitorId < 0) {
    		System.out.println("Please enter Id a positve number");
    	}else {
    		this.competitorID = competitorId;
    	}
    }
    
    int getCopetitorID() {
    	return competitorID;
    }
    
    void getOverallScore() {
    	
    }
}

final class Name {
	private final String firstName,lastName;
	
	public Name(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	String getFirstName() {
		return firstName;
	}
	
	String getLastName() {
		return lastName;
	}
}

class BeginnerCompetitor extends XXXCompetitor{
	void getOverallScore() {
		System.out.println("This is the Beginner Competitor");
	}
}

class IntermediateCompetitor extends XXXCompetitor{
	void getOverallScore() {
		System.out.println("This is the Intermediate Competitor");
	}
}

class AdvancedCompetitor extends XXXCompetitor{
	void getOverallScore() {
		System.out.println("This is the Advanced Competitor");
	}
}

public class Main {
    public static void main(String[] args){
        XXXCompetitor x = new XXXCompetitor();
        x.setLevel("Beginner");
        x.getLevel();
        x.setCopetitorID(2);
        System.out.println(x.getCopetitorID());
        
        XXXCompetitor c = new AdvancedCompetitor();
        c.getOverallScore();
        
        
        Name n = new Name("Kraneel","Manandhar");
        System.out.print(n.getFirstName() + " " + n.getLastName());
        
    }
}