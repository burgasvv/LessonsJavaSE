package BullsCowsSQL;

public class BullsCows {
    private int[]ints;
    private final int[]result;
    public BullsCows() {
        ints = generate();
        result = new int[]{0,0};
    }
    private int[]generate(){
        ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        for (int i = 0; i < 10; i++){
            int num = (int)(Math.random()*10);
            int temp = ints[i];
            ints[i] = ints[num];
            ints[num] = temp;
        }
        return new int[]{ints[0], ints[1], ints[2], ints[3]};
    }
    public boolean isWinner(){
        return result[0]==4 && result[1]==4;
    }
    public int[]check(int[]userNumber){
        result[0]=0;
        result[1]=0;
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++){
                if (ints[i] == userNumber[j])result[0]++;
                if (i == j)result[1]++;
            }
        return result;
    }
}