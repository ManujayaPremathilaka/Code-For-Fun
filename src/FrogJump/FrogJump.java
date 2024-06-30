package FrogJump;

public class FrogJump {

    public int getMinimalJumps(int x, int y,  int d){
        int minimalJumps = 0;

        int distance = Math.subtractExact(y, x);
        minimalJumps = distance / d;

        if (minimalJumps * d < distance){
            minimalJumps++;
        }

        return minimalJumps;
    }

    public static void main(String[] args){
        int x = 10;
        int y = 85;
        int d = 30;

        FrogJump fj = new FrogJump();
        int minimalJumps = fj.getMinimalJumps(x, y, d);
        System.out.println(minimalJumps);
    }
}
