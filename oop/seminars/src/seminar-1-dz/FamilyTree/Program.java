package FamilyTree;

public class Program {
    public static void main(String[] args) {
        FamilyMember Ivan = new FamilyMember("Ivanov I.A", "11.09.2001", "-----",
                "male","Ivanova E.P.", "Ivanov A.E.");
        FamilyMember Elena = new FamilyMember("Ivanova E.P.", "21.05.1980", "------",
                "female","Petrova O.I.", "Petrov P.G.");
        FamilyMember Andrey = new FamilyMember("Ivanov A.E.", "01.01.1978", "-------",
                "male","Ivanova A.V.", "Ivanov E.R.");

        Ivan.degreeOfKinship("Ivanova E.P.");
        Elena.degreeOfKinship("Sidorov I.P.");
        Andrey.degreeOfKinship("Ivanov E.R.");
        Ivan.showInfo();
    }
}