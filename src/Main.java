
//C191038

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Frame frame = new JFrame("JFrame Example");
        frame.setSize(1048, 540);
        frame.add(new Board());
        frame.setVisible(true);
    }
}
