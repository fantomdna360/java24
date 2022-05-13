package part2;

import java.net.*;

public class PageCatalog {
    public static void main(String[] args) throws MalformedURLException {
        HomePage[] catalog = new HomePage[5];
        try {
            catalog[0] = new HomePage("Mike", "http://www.file770.com", "science");
            catalog[1] = new HomePage("Duke", "http://www.file772.com", "science");
            catalog[2] = new HomePage("Bob", "http://www.file773.com", "science");
            catalog[3] = new HomePage("Robins", "http://www.file774.com", "science");
            catalog[4] = new HomePage("Matuy", "www.file775.com");

            for (HomePage hp : catalog) {
                System.out.println(hp.owner + ": " + hp.address + ", " + hp.category);
            }
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }

    }




}
