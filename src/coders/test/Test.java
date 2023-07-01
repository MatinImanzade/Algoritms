package coders.test;

public class Test {
    public static void main(String[] args) {
        int count = 0;
        BEANY:
        for (int i = 1; i < 3; i++)
            CONY:for (int j = 0; j < 3; j++) {
                if ((i + j) % 2 == 0)
                    continue CONY;
                count++;
            }

        System.out.println(count);
    }

}

class Snake{
     static StringBuilder sb = new StringBuilder();

    {sb.append("a");}

    static {
        sb.append("b");
    }

    {sb.append("c");}

    public static void main(String[] args) {

        System.out.println(sb);
    }
}
class Scorpion extends Snake{
    {sb.append("d");}
    static {sb.append("f");
    }
    {sb.append("g");}

    public static void main(String[] args) {
        System.out.println(Scorpion.sb);
        System.out.println(Scorpion.sb);

        System.out.println("--------------------------------");

        new Scorpion();
        new Snake();

        System.out.println(Scorpion.sb);
        System.out.println(Snake.sb);
    }
}