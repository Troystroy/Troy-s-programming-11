

public class Main {
    //Code your solution to problem number one here
    static int problemOne(String s) {
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {

            if (s.substring(i, i + 1).equals("a") || s.substring(i, i + 1).equals("e") ||
                    s.substring(i, i + 1).equals("i") || s.substring(i, i + 1).equals("o")
                    || s.substring(i, i + 1).equals("u")) {
                answer++;
            }
        }
        System.out.println("Vowels Count: " + answer + "\n");



        return answer;
    }

    //Code you problem number two here
    static int problemTwo(String s) {
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i).startsWith("bob")) {
                answer++;
            }

        }

        System.out.println("bob Count: " + answer + "\n");

        return answer;
    }

    //Code your solution to problem number 3 here
    static String problemThree(String s) {

        String previous = "";
        String current= "";
        String longestString = "";


        for (int i = 0; i < s.length(); i++) {
            String alphabet = s.substring(i,i+1);
            if (alphabet.compareToIgnoreCase(previous)>=0) {
                current += s.substring(i, i + 1);

                if (current.length() > longestString.length())
                    longestString = current;

            }
            else{
                current =alphabet;
            }
            previous = alphabet;

        }
        s = longestString;

        System.out.println("Longest alphabet: " + s);
        return s;
    }


    public static void main(String[] args) {
        /*
        Set s to a string and run your method using s as the parameter
        Run your method in a println statement to determine what the output was
        Once you think you have it working try running the tests.
        The tests will put your method through several different Strings to test
        all possible cases.  If you have 100% success then there is no bugs in your methods.
         */


        String s = "lzxyryxmllshpkt";

        System.out.println("String " + s + "\t" + "has: ");

        problemOne(s);
        problemTwo(s);
        problemThree(s);























    }
}
