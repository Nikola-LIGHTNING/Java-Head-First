package bg.tsvetkov;

public class PhraseOMatic {
    public static void main(String args[]) {
        String wordListOne[] = {"24/7", "multi-tier", "next level", "tryhard"};
        String wordListTwo[] = {"365", "showoff", "retarded", "smartboy"};
        String wordListThree[] = {"critical thinking", "multi-tasker", "level 9001", "strong"};  
        
        int rand1 = (int) (Math.random() * wordListOne.length);
        int rand2 = (int) (Math.random() * wordListTwo.length);
        int rand3 = (int) (Math.random() * wordListThree.length);
        
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        
        System.out.println("What we need is a: " + phrase);
    }
}
