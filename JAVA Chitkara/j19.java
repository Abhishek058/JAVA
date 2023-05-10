import java.util.Scanner;

class j19 {

    public static int[] maximumLead(int[][] scores) {
        int oneCnt = 0, twoCnt = 0;
        int winner = -1, lead = -1;
        for (int i = 0; i < 5; i++) {
            if (scores[i][0] > scores[i][1]) {
                oneCnt++;
            } else {
                twoCnt++;
            }
        }
        if (oneCnt > twoCnt) {
            winner = 1;
            lead = oneCnt;
        } else {
            winner = 2;
            lead = twoCnt;
        }

        int[] answer = { winner, lead };
        return answer;
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int[][] scores = new int[5][2];
        for (int i = 0; i < 5; i++) {
            scores[i][0] = sc.nextInt();
            scores[i][1] = sc.nextInt();
        }
        System.out.println(maximumLead(scores)[0] + " " + maximumLead(scores)[1]);
        sc.close();
    }
}