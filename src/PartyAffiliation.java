public class PartyAffiliation {
    public static void main(String[] args) {

        String partyAffiliation;

        System.out.println("Enter your party affiliation: [D/R/I/O]");
        partyAffiliation="O";

        if (partyAffiliation.equals("D")) {
            System.out.println("You are a Donkey");
        }
        else if (partyAffiliation.equals("R")) {
            System.out.println("You are an Elephant");}

        else if (partyAffiliation.equals("I")) {
            System.out.println("You are a man!");
        } else if (partyAffiliation.equals("O")){
            System.out.println("You are another party");
        }
         else{
            System.out.println("You did not input a valid party of D R I or O");
        }
    }
}
