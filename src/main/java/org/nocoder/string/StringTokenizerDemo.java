package org.nocoder.string;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

    private static final int MAX_FIELDS = 5;
    private static final String DELIM = "|";

    public static String[] process(String line){
        String[] results = new String[MAX_FIELDS];

        StringTokenizer st = new StringTokenizer(line, DELIM, true);

        int i = 0;
        while (st.hasMoreTokens()){
            String s = st.nextToken();
            if(DELIM.equals(s)){
                if(i++ >= MAX_FIELDS){
                    throw new IllegalArgumentException("Input line has too many fields.");
                }
                continue;
            }
            results[i] = s;
        }
        return results;
    }

    public static void  print(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        print(process("A|B|C|D"));
        print(process("A||B|C"));
    }
}
