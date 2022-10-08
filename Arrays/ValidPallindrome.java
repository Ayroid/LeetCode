public class ValidPallindrome {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int l = s.length();
        for(int i=0, j=s.length()-1;i<j;){
            char ch = s.charAt(i);
            char chb = s.charAt(j);
            if(!((ch>=97 && ch<=122) || (ch>=48 && ch<=57))){
                i++;
            }
            else if (!((chb>=97 && chb<=122) || (chb>=48 && chb<=57))){
                j--;
            }
            else{
                if(ch!=chb){
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;

    public static void main(String[] args) {
        ValidPallindrome v1= new ValidPallindrome();
        System.out.println(v1.isPalindrome("Marge, let's \"[went].\" I await {news} telegram."));
    }
}
