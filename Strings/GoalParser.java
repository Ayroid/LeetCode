public class GoalParser {
    public String interpret(String command) {
        StringBuilder str = new StringBuilder();
        for(int i=0;i<command.length();){
            if(command.charAt(i)=='G'){
                str.append("G");
                i+=1;
            }
            else if(command.substring(i,i+2).equals("()")){
                str.append("o");
                i+=2;
            }
            else if(command.substring(i,i+4).equals("(al)")){
                str.append("al");
                i+=4;
            }
        }
        return str.toString();
    }
    public static void main(String[] args) {
        GoalParser g1 = new GoalParser();
        System.out.println(g1.interpret("G()()(al)()()"));
    }
}
