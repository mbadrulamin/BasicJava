package company.com;

public class Main {

    public static void main(String[] args) {

        int[] num = {1, 2, 3, 4, 5, 6};
        String[] names = {"Ahmad", "Muhammad", "Ali", "Abu Bakar"};
        Boolean [] arrbool = {true, false, true, false};

        for(int i = 0; i < num.length; i++){
            System.out.println("Item #:" + num[i]);
        }

        for(int i = 0; i < names.length; i++){
            System.out.println("Name: " + names[i]);
        }

        for(int i = 0; i < arrbool.length; i++){
            System.out.println("Output: " + arrbool[i]);
        }
    }
}
