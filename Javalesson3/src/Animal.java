public class Animal {

    private String color;
    //protected String culoare;
    public static String culoare;



    public Animal(String color){
        this.color = color;

    }
    public Animal(Animal animal){
        color = animal.color;
    }

    public void setTheColor(String color){
        this.color=color;
        // this - referinta la clasa in care este
    }

    public String getThecolor(){
        return color;
    }


    }


