public class PartyAffiliationSwitch {
    public static void main(String[] args) {

        String partyAffiliation;

        System.out.println("Enter your party affiliation: [D/R/I/O]");
        partyAffiliation="R";

        switch (partyAffiliation){
            case "D":
                System.out.println("You are a Democratic Donkey");
                break;
            case "R":
                System.out.println("You are a Republican Elephant");
                break;
            case"I":
                System.out.println("You are a man!");
                break;
            case"O":
                System.out.println("You are another party.");
                break;
            default:
                System.out.println("You did not select a valid option.");
        }
    }
}
