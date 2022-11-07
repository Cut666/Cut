package homeWork;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class HomeWork2 {

                            //    1108. Defanging an IP Address

//    public static String defangIPaddr(String address) {
//        return address.replace(".","[.]");
//    }

                            //2011. Final Value of Variable After Performing Operations

//    public static int finalValueAfterOperations(String[] operations) {
//
//        int bienDem = 0;
//        for (int i = 0; i < operations.length; i++) {
//            if (operations[i].equalsIgnoreCase("--X") || operations[i].equalsIgnoreCase("X--")){
//                bienDem--;
//            }
//            if (operations[i].equalsIgnoreCase("++X")|| operations[i].equalsIgnoreCase("X++")){
//                bienDem++;
//            }
//        }
//        return bienDem;
//    }

                        //2114. Maximum Number of Words Found in Sentences
//    public static int mostWordsFound(String[] sentences) {
//        int bienDem = 0;
//        int soTu = 0;
//        for (int i = 0; i < sentences.length; i++) {
//            for (int j = 0; j < sentences[i].length(); j++) {
//                sentences[i].replace("  "," ");
//                if(sentences[i].charAt(j)==' '){
//                    bienDem+=1;
//
//                }
//            }
//            soTu = Math.max(bienDem,soTu);
//            bienDem=0;
//        }
//        return soTu+1;
//    }


                        //    771. Jewels and Stones

//    public static int numJewelsInStones(String jewels, String stones) {
//        int bienDem = 0;
//        for (int i = 0; i < jewels.length(); i++) {
//            for (int j = 0; j < stones.length(); j++) {
//                if (jewels.charAt(i)==stones.charAt(j)){
//                    bienDem++;
//                }
//            }
//        }
//        return bienDem;
//    }

                     // 1678. Goal Parser Interpretation


                    //    1221. Split a String in Balanced Strings
//    public static int balancedStringSplit(String s) {
//        int demL = 0;
//        int demR = 0;
//        int dem = 0;
//        for (int i = 0; i < s.length(); i++) {
//            if(s.charAt(i)=='R'){
//                demR++;
//            } else demL++;
//            if (demL==demR){
//                dem++;
//            }
//        }
//        return dem;
//    }

                        // 1859. Sorting the Sentence

//    public static String sortSentence(String s) {
//
//    }

                        //557. Reverse Words in a String III
//    public String reverseWords(String s) {
//        StringBuilder r = new StringBuilder();
//        String[] p = s.split(" ");
//        for (String i: p) {
//            StringBuilder w = new StringBuilder();
//            w.append(i);
//            w.reverse();
//            r.append(w + " ");
//        }
//        r.setLength(r.length()-1);
//        return r.toString();
//    }


    public static void main(String[] args) {
      String command = "G()(al)";
        command.replace("()","o");
        command.replace("(al)","al");
        System.out.println(command);
    }
}
