package company.com;

public class ArrayList {
    public static void main(String[] args){

        java.util.ArrayList<String> animals = new java.util.ArrayList<>();

        animals.add("Cat");
        animals.add("Monkey");
        animals.add("Goat");
        animals.remove(1);
        animals.add(1, "Horse");




        if(animals.contains("Cat")){
            animals.remove("Cat");
        }
        else{
            System.out.println("Nope");
        }

        for(int i = 0; i < animals.size(); i++){
            System.out.println("Animal: " + animals.get(i));
        }

        for(String animal : animals){
            System.out.println("Animal: " + animal);
        }
    }
}
