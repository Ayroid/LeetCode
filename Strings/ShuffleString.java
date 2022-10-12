public class ShuffleString {
    public String restoreString(String s, int[] indices) {
        char ch[] = new char[indices.length];
        for(int i=0;i<indices.length;i++){
            ch[indices[i]]=s.charAt(i);
        }
        return new String(ch);
    }
    public static void main(String[] args) {
        ShuffleString s1 = new ShuffleString();
        System.out.println(s1.restoreString("codeleet", new int[]{4,5,6,7,0,2,1,3}));
    }
}
