public class Vulpe extends Animal {

    public Vulpe(){
        System.out.println("Vulpea vaneaza");
    }


    public void colorTheFox(){
        System.out.println("I blea");
    }

    public static void main(String args[]){
        Vulpe vulpe= new Vulpe();

        vulpe.culoare = "bleu";
        vulpe.culoare = "bb";
        System.out.println(vulpe.culoare);
        System.out.println(vulpe.culoare);

    }

}
