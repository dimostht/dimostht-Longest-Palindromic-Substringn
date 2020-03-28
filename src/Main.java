class Solution {
    public String longestPalindrome(String s) {

        String p = "";

        char t[] = s.toCharArray();

        int max = -1;

        for (int i = 0 ; i < t.length  ; i ++){
            char x = t[i];
            for(int j = i ; j < t.length ; j++) {
                if(t[j] == x && (j-i+1)>max){

                    String s1 = s.substring(i,j+1);
                    //System.out.println(s1);
                    if(isPalindromic(s1)){
                        p = s1;
                        max = p.length();
                    }
                }
            }
        }
        return p;
    }

    boolean isPalindromic(String s1){
        char t[] = s1.toCharArray();

        char tR[] = new char[s1.length()];

        int i=tR.length-1;
        for (int j=0;j<t.length;j++){
            tR[i] = t[j];
            i--;
        }
        //reverse s1
        String s1R = String.copyValueOf(tR);
        return s1.equals(s1R);
    }
}












