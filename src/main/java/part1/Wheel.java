package part1;

public class Wheel {
    public static void main(String[] args) {
        String phrase[] = {
                "ВСЫПАТЬ ПО ПЕРВОЕ ЧИСЛО",
                "ГНАТЬСЯ ЗА ДЛИННЫМ РУБЛЕМ",
                "В ЧАС ПО ЧАЙНОЙ ЛОЖКЕ",
                "КАЖДЫЙ КУЛИК СВОЕ БОЛОТО ХВАЛИТ",
                "ЗА ТРИДЕВЯТЬ ЗЕМЕЛЬ",
                "ЗА ДУШОЙ НИЧЕГО НЕТ",
                "СЕМЬ ПЯДЕЙ ВО ЛБУ"
        };
        int[] letterCount = new int[32];
        for (int count = 0; count < phrase.length; count++) {
            String current = phrase[count];
            char[] letters = current.toCharArray();
            for (int count2 = 0; count2 < letters.length; count2++) {
                char lett = letters[count2];
                if ((lett >= 'A') & (lett <= 'Я')) {
                    letterCount[lett - 'A']++;
                }
            }
        }
        for (char count = 'A'; count <= 'Я'; count++) {
            System.out.println(count + ": " +
                    letterCount[count - 'A'] + " ");
            if (count == 'М') {
                System.out.println();
            }
            System.out.println();
        }
    }
}
