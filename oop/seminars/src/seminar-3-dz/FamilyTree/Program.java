public class Program {
    public static void main(String[] args) {
        FamilyMemeber mem1 = new FamilyMemeber("Ivanov I.I.");
        FamilyMemeber mem2 = new FamilyMemeber("Ivanova E.P.");
        FamilyMemeber mem3 = new FamilyMemeber("Ivanov O.I.", mem1, mem2);
        FamilyMemeber mem4 = new FamilyMemeber("Ivanova A.I.", mem1, mem2);
        mem1.setSpouse(mem2);
        mem2.setSpouse(mem1);
        mem1.addChild(mem3);
        mem1.addChild(mem4);
        mem2.addChild(mem3);
        mem2.addChild(mem4);

        System.out.println(mem1);
        System.out.println(mem2);
        System.out.println(mem3);
        System.out.println(mem4);
    }
}