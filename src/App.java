public class App {
    public static void main(String[] args) throws Exception {

        int[] intNumbers = {1,2,3,4,5};
       System.out.println("\nExercicio 01: " + exercicio01(6, 4));


        System.out.println("Exercicio 02: " + exercicio02(3, 2));

        System.out.println("Exercicio 03: " + (exercicio03(1, 4)));

        System.out.println("Exercicio 04: " + exercicio04("casa"));

        System.out.println("Exercicio 05: " + exercicio05(5));

        System.out.println("Exercicio 06: " + exercicio06(2, 2));
        System.out.println("Exercicio 07:" + exercicio07(intNumbers, 0));
        System.out.println("Exercicio 08:" + exercicio08("carro"));

        System.out.println("Exercicio 09:" + exercicio09(3, 5, 4));
    }

    public static int exercicio01(int number1, int number2){
        if(number1 == 0 ) {
            return 0;
        } else {
            return number2 + exercicio01(number1 - 1, number2);    
    }
    }

    public static int exercicio02(int number1, int number2){
        if(number2 == 0) {
            return number1;
        } else {
            return exercicio02(number1, number2 - 1) + 1;
        }

        
    }

    public static double exercicio03(int atual, double number1) {

        if (atual > number1) {
            return 0;
        }

        return 1.0 / atual + exercicio03(atual + 1, number1);
        
    }

    public static String exercicio04 (String palavra){
            if(palavra.equals("")) {
                return "";
            }

            return palavra.charAt(palavra.length() - 1) + exercicio04(palavra.substring(0, palavra.length() - 1));
    }

    public static int exercicio05 (int number01){
        if(number01 == 1) {
            return 1;
        } else if (number01 == 2) {
            return 2;
        }

        return 2 * exercicio05(number01 - 1) + 3 * exercicio05(number01 - 2);
    }

    public static int exercicio06(int number1, int  number2){
        if(number1 == 0) {
            return number2 + 1;

        } else if (number2 == 0){
            return exercicio06(number1 - 1, 1);

        } else {
            return exercicio06(number1 - 1, exercicio06(number1, number2 - 1));
        }
    }

        public static int exercicio07(int[] intNumbers, int posicaoAtual){
            if(posicaoAtual == intNumbers.length){
                return 1;
            }

            return intNumbers[posicaoAtual] * exercicio07( intNumbers, posicaoAtual + 1);
        }

        public static boolean exercicio08(String palavra){
            if(palavra.length() == 0 || palavra.length() == 1)
                return true;
            
            if(palavra.charAt(0) == palavra.charAt(palavra.length() - 1))
            return exercicio08(palavra.substring(1, palavra.length() - 1));

            return false;
        }

        public static int exercicio09(int number1, int number2, int number3){
            if(number3 == 0) {
                return number1;
            } else if(number3 == 1) {
                return number2;
            }

            return exercicio09(number1, number2, number3 - 1) + exercicio09(number1, number2, number3 - 2);
        }


}
