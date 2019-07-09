package Test.Tablice;

public class Exercise9 {

    public static void main(String[] args) {

        int[] tab1 = {1, 2, 3, 4};
        int[] tab2 = {1, 2, 3, 3};

        boolean equal = true;

        if (tab1.length == tab2.length) {

            for (int i = 0; i < tab1.length; i++) {

                if (tab1[i] != tab2[i]) {

                    equal = false;
                    break;

                }

            }

        }

        if (equal) {
            System.out.println("Tablice są równe!");
        } else {
            System.out.println("Tablice są rożne!");
        }




    }


}
