package part1;

public class Cycles {
    public static void main(String[] args) {

        // for cycle
        for (int dex = 1; dex <= 200; dex++) {
            int multiple = 9 * dex;
            System.out.print(multiple + " ");
        }
        System.out.println();

        //while cycle
        int gameLives = 3;
        while (gameLives > 0) {
            System.out.print(gameLives + " ");
            gameLives--;
        }
        System.out.print("START!");
        System.out.println();

        //do while cycle
        gameLives = 5;
        do {
            System.out.print(gameLives + " ");
            gameLives--;
        } while (gameLives > 0);

        //break
        for (int x = 0; x < 20; x++) {
            if (x%5!=0) {
                System.out.print(x + " ");
            } else {
                System.out.println("пропуск"+ " ");
                //System.out.println("конец");
                //break;
            }
        }

        //continue
        int index = 0;
        while (index <= 1000) {
            index = index + 5;
            if (index == 400) {
                continue;
            }
            System.out.println("Значение переменной равно " + index);
        }

        //именование цикла
        int points = 0;
        int target = 100;
        targetLoop:
        while (target <= 100) {
            for (int i = 0; i < target; i++) {
                if (points > 50) {
                    break targetLoop;
                }
                points = points + i;
                System.out.println("points: " + points);
            }
        }


    }
}
