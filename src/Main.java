public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[]{
                new Product("eyeliner", 00000001, 20),
                new Product("eyeshadow", 00000002, 10),
                new Product("lipstick", 00000003, 25)
        };

        String[] namesArray = new String[3];
            namesArray[0] = products[0].getName();
            namesArray[1] = products[1].getName();
            namesArray[2] = products[2].getName();


        printLastLetters(namesArray);
        System.out.println(concatenateLastLetters(namesArray));
    }


    public static void printLastLetters(String[] object){
        for (String element : object) {
            System.out.println(element.charAt(element.length() -1));
        }
    }

    public static String concatenateLastLetters(String[] object2){
        String concatenazione = "";
        for (int i = 0; i< object2.length; i++){
            String str = object2[i];
            concatenazione += str.charAt(str.length() -1);
        }
        return concatenazione;
    }
}


