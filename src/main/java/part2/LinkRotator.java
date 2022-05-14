/*
package part2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

@Deprecated
public class LinkRotator extends JFrame implements Runnable, ActionListener {
    String[] pageTitle = new String[6];
    URI[] pageLink = new URI[6];
    int current = 0;
    Thread runner;
    JLabel siteLabel = new JLabel();

    public LinkRotator() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        add(siteLabel);
        pageTitle = new String[]{
                "Сайт Oracle Java",
                "Сообщество Server Side",
                "Сообщество JavaWorld",
                "Освой самостоятельно Java за 24 час",
                "Издательство Sams Publishing",
                "Сайт Роджерса Кейденхеда"
        };
        pageLink[0] = getURI("http://www.oracle.com/technetwork/java");
        pageLink[1] = getURI("http://www.theserverside.com");
        pageLink[2] = getURI("http://www.javaworld.com");
        pageLink[3] = getURI("http://www.java24.com");
        pageLink[4] = getURI("http://www.samspublishing.com");
        pageLink[5] = getURI("http://www.workbench.cadenhead.com");
        Button visitButton = new Button(" Посетить сайт");
        visitButton.addActionListener(this);
        add(visitButton);
        setVisible(true);
        start();
    }

    private URI getURI(String urlText) {
        URI pageURI = null;
        try {
            pageURI = new URI(urlText);
        } catch (URISyntaxException ex) {
            //ничего не делаем
        }
    }

    public void start() {
        if (runner == null) {
            runner = new Thread(this);
            runner.start();
        }
    }

    public void run() {
        Thread thisThread = Thread.currentThread();
        while (runner == thisThread) {
            current++;
            if (current > 5) {
                current = 0;
            }
            siteLabel.setText(pageTitle[current]);
            repaint();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException exc) {
                //ничего не делать
            }
        }
    }

    public void actionPerfomed(ActionListener event) {
        Desktop desktop = Desktop.getDesktop();
        if (pageLink[current] != null) {
            try {
                desktop.browse(pageLink[current]);
                runner = null;
                System.exit(0);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new LinkRotator();
    }
}
*/
