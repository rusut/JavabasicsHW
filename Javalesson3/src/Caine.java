public class Caine extends Animal{

    public static void main(String[] args) {
        Caine caine= new Caine();
        caine.setTheColor("Rosu");
        System.out.println(caine.getThecolor());
        caine.culoare = "noua valoare";
        System.out.println(caine.culoare);


    }


}
