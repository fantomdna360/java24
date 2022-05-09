package part1;

import org.apache.commons.lang3.RandomStringUtils;
import java.nio.charset.Charset;
import java.util.Random;

public class Arrays {
    public static void main(String[] args) {
        String[]  clients = new String[20];

        for (int i = 0; i < clients.length; i++) {
            clients[i] = generateRandomString();
            System.out.println(clients[i]);
        }

        String[] persons = new String[20];
        for (int i = 0; i < persons.length; i++) {
            persons[i] = generateRandomString(10);
            System.out.println(persons[i]);
        }

        String[] collection = new String[20];
        for (int i = 0; i < collection.length; i++) {
            collection[i] = generateRandomStringInts(6);
            System.out.println(collection[i]);
        }

        String[] collect = new String[20];
        for (int i = 0; i < collect.length; i++) {
            collect[i] = generatingRandomStringBounded(12);
            System.out.println(collect[i]);
        }

        //toCharArray
        String strToArray = "Рудольф - это мой песик";
        char[] mfl = strToArray.toCharArray();

        for (int w = 0; w < strToArray.length(); w++) {
            System.out.println(mfl[w]);
        }
    }

    public static String generateRandomString() {
        byte[] array = new byte[7];
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("UTF-8"));
        return generatedString;
    }

    public static String generateRandomString(int targetStringLength) {
        int leftLimit = 97;         //letter 'a'
        int rightLimit = 122;       //letter 'z'
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();
        return generatedString;
    }

    public static String generateRandomStringInts(int targetStringLength) {
        int leftLimit = 97;         //letter 'a'
        int rightLimit = 122;       //letter 'z'
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        return generatedString;
    }

    public static String generatingRandomStringBounded(int targetStringLength) {

        boolean useLetters = true;
        boolean useNumbers = false;
        String generatedString = RandomStringUtils.random(targetStringLength, useLetters, useNumbers);

        return generatedString;
    }




}
