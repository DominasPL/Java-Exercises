package Test.String;

public class StringTest {

    public static void main(String[] args) {


        //String

        long start = System.currentTimeMillis();

        String s = new String();
        for(int i=0; i<1000000; i++) {
            s = s + "a";
        }

        //StringBuffer
////
//        StringBuffer buffer = new StringBuffer();
//
//        for(int i=0; i<1000000; i++) {
//            buffer.append("a");
//        }

        //StringBuilder


//        StringBuilder builder = new StringBuilder();
//
//        for(int i=0; i<1000000; i++) {
//            builder.append("a");
//        }


        System.out.println("Time1: "+(System.currentTimeMillis()-start));
    }

}
