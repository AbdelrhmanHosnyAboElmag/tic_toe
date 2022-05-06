package hosny;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Main {
    static int  x_flag=0;
    public static void main(String[] args) {
        final int[] counter_of_x = {0};
        final int[] counter_of_o = {0};
        final byte[] p_counter = {2};
        String[] p1_array = {"Z", "Z", "Z", "z", "z", "z", "z", "z", "z", "z"};
        String[] p2_array = {"Z", "Z", "Z", "z", "z", "z", "z", "z", "z", "z"};
        JFrame f = new JFrame(" TIC_TOC");
        JTextField p1 = new JTextField("player1 be >>>x");
        JTextField p2 = new JTextField("player2 be >>>o");
        JTextField H_x = new JTextField("H check of X");
        JTextField H_o = new JTextField("H check of o");
        JTextField H_number = new JTextField("H number");
        JButton rest = new JButton("rest");
        JButton H_show = new JButton("H");
        rest.setBounds(150, 10, 95, 30);
        f.add(rest);
        H_show.setBounds(150, 40, 95, 30);
        f.add(H_show);
        JButton b1 = new JButton("1");
        b1.setBounds(50, 100, 95, 50);
        f.add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (p_counter[0] % 2 == 0) {//start with player x
                    b1.setText("x");
                    p_counter[0]++;
                    p1_array[1] = "x";
                    byte x = p_counter[0];
                    check_winner(x, p2_array, p1_array, p1, p2);
                    check_winner2(x, p2_array, p1_array, p1, p2);
                    check_winner3(x, p2_array, p1_array, p1, p2);

                } else {
                    b1.setText("0");
                    p_counter[0]++;
                    p2_array[1] = "y";
                    byte x = p_counter[0];
                    check_winner(x, p2_array, p1_array, p1, p2);
                    check_winner2(x, p2_array, p1_array, p1, p2);
                    check_winner3(x, p2_array, p1_array, p1, p2);
                }
            }
        });
        JButton b2 = new JButton("2");
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (p_counter[0] % 2 == 0) {
                    b2.setText("x");
                    p_counter[0]++;
                    p1_array[2] = "x";
                    byte x = p_counter[0];
                    check_winner(x, p2_array, p1_array, p1, p2);
                    check_winner2(x, p2_array, p1_array, p1, p2);
                    check_winner3(x, p2_array, p1_array, p1, p2);
                } else {
                    b2.setText("0");
                    p_counter[0]++;
                    p2_array[2] = "y";
                    byte x = p_counter[0];
                    check_winner(x, p2_array, p1_array, p1, p2);
                    check_winner2(x, p2_array, p1_array, p1, p2);
                    check_winner3(x, p2_array, p1_array, p1, p2);
                }
            }
        });
        b2.setBounds(140, 100, 95, 50);
        f.add(b2);
        JButton b3 = new JButton("3");
        b3.setBounds(230, 100, 95, 50);
        f.add(b3);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (p_counter[0] % 2 == 0) {
                    b3.setText("x");
                    p_counter[0]++;
                    p1_array[3] = "x";
                    byte x = p_counter[0];
                    check_winner(x, p2_array, p1_array, p1, p2);
                    check_winner2(x, p2_array, p1_array, p1, p2);
                    check_winner3(x, p2_array, p1_array, p1, p2);
                } else {
                    b3.setText("0");
                    p_counter[0]++;
                    p2_array[3] = "y";
                    byte x = p_counter[0];
                    check_winner(x, p2_array, p1_array, p1, p2);
                    check_winner2(x, p2_array, p1_array, p1, p2);
                    check_winner3(x, p2_array, p1_array, p1, p2);
                }
            }
        });
        JButton b4 = new JButton("4");
        b4.setBounds(50, 149, 95, 50);
        f.add(b4);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (p_counter[0] % 2 == 0) {
                    b4.setText("x");
                    p_counter[0]++;
                    p1_array[4] = "x";
                    byte x = p_counter[0];
                    check_winner(x, p2_array, p1_array, p1, p2);
                    check_winner2(x, p2_array, p1_array, p1, p2);
                    check_winner3(x, p2_array, p1_array, p1, p2);
                } else {
                    b4.setText("0");
                    p_counter[0]++;
                    p2_array[4] = "y";
                    byte x = p_counter[0];
                    check_winner(x, p2_array, p1_array, p1, p2);
                    check_winner2(x, p2_array, p1_array, p1, p2);
                    check_winner3(x, p2_array, p1_array, p1, p2);
                }
            }
        });
        JButton b5 = new JButton("5");
        b5.setBounds(145, 149, 95, 50);
        f.add(b5);
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (p_counter[0] % 2 == 0) {
                    b5.setText("x");
                    p_counter[0]++;
                    p1_array[5] = "x";
                    byte x = p_counter[0];
                    check_winner(x, p2_array, p1_array, p1, p2);
                    check_winner2(x, p2_array, p1_array, p1, p2);
                    check_winner3(x, p2_array, p1_array, p1, p2);
                } else {
                    b5.setText("0");
                    p_counter[0]++;
                    p2_array[5] = "y";
                    byte x = p_counter[0];
                    check_winner(x, p2_array, p1_array, p1, p2);
                    check_winner2(x, p2_array, p1_array, p1, p2);
                    check_winner3(x, p2_array, p1_array, p1, p2);
                }
            }
        });
        JButton b6 = new JButton("6");
        b6.setBounds(235, 149, 90, 50);
        f.add(b6);
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (p_counter[0] % 2 == 0) {
                    b6.setText("x");
                    p_counter[0]++;
                    p1_array[6] = "x";
                    byte x = p_counter[0];
                    check_winner(x, p2_array, p1_array, p1, p2);
                    check_winner2(x, p2_array, p1_array, p1, p2);
                    check_winner3(x, p2_array, p1_array, p1, p2);
                } else {
                    b6.setText("0");
                    p_counter[0]++;
                    p2_array[6] = "y";
                    byte x = p_counter[0];
                    check_winner(x, p2_array, p1_array, p1, p2);
                    check_winner2(x, p2_array, p1_array, p1, p2);
                    check_winner3(x, p2_array, p1_array, p1, p2);
                }
            }
        });
        JButton b7 = new JButton("7");
        b7.setBounds(50, 195, 95, 50);
        f.add(b7);
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (p_counter[0] % 2 == 0) {
                    b7.setText("x");
                    p_counter[0]++;
                    p1_array[7] = "x";
                    byte x = p_counter[0];
                    check_winner(x, p2_array, p1_array, p1, p2);
                    check_winner2(x, p2_array, p1_array, p1, p2);
                    check_winner3(x, p2_array, p1_array, p1, p2);
                } else {
                    b7.setText("0");
                    p_counter[0]++;
                    p2_array[7] = "y";
                    byte x = p_counter[0];
                    check_winner(x, p2_array, p1_array, p1, p2);
                    check_winner2(x, p2_array, p1_array, p1, p2);
                    check_winner3(x, p2_array, p1_array, p1, p2);
                }
            }
        });
        JButton b8 = new JButton("8");
        b8.setBounds(145, 195, 95, 50);
        f.add(b8);
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (p_counter[0] % 2 == 0) {
                    b8.setText("x");
                    p_counter[0]++;
                    p1_array[8] = "x";
                    byte x = p_counter[0];
                    check_winner(x, p2_array, p1_array, p1, p2);
                    check_winner2(x, p2_array, p1_array, p1, p2);
                    check_winner3(x, p2_array, p1_array, p1, p2);
                } else {
                    b8.setText("0");
                    p_counter[0]++;
                    p2_array[8] = "y";
                    byte x = p_counter[0];
                    check_winner(x, p2_array, p1_array, p1, p2);
                    check_winner2(x, p2_array, p1_array, p1, p2);
                    check_winner3(x, p2_array, p1_array, p1, p2);
                }
            }
        });
        JButton b9 = new JButton("9");
        b9.setBounds(235, 195, 90, 50);
        f.add(b9);
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (p_counter[0] % 2 == 0) {
                    b9.setText("x");
                    p_counter[0]++;
                    p1_array[9] = "x";
                    byte x = p_counter[0];
                    check_winner(x, p2_array, p1_array, p1, p2);
                    check_winner2(x, p2_array, p1_array, p1, p2);
                    check_winner3(x, p2_array, p1_array, p1, p2);
                } else {
                    b9.setText("0");
                    p_counter[0]++;
                    p2_array[9] = "y";
                    byte x = p_counter[0];
                    check_winner(x, p2_array, p1_array, p1, p2);
                    check_winner2(x, p2_array, p1_array, p1, p2);
                    check_winner3(x, p2_array, p1_array, p1, p2);
                }
            }
        });
        rest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (String z : p1_array) {
                    p_counter[0] = 2;
                    p1.setText("player1>>x");
                    p2.setText("player2>>o");
                    b1.setText("1");
                    b2.setText("2");
                    b3.setText("3");
                    b4.setText("4");
                    b5.setText("5");
                    b6.setText("6");
                    b7.setText("7");
                    b8.setText("8");
                    b9.setText("9");
                    Arrays.fill(p1_array, "Z");
                    Arrays.fill(p2_array, "Z");
                }
            }
        });
        H_show.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                counter_of_x[0] =check_H_x(p2_array,H_x);
                counter_of_o[0] =check_H_o(p1_array,H_o);
                H_number.setText(counter_of_x[0]- counter_of_o[0]+">>H Total");

            }
        });
        p1.setBounds(50, 300, 95, 50);
        H_x.setBounds(10, 250, 76, 30);
        H_o.setBounds(300, 250, 76, 30);
        H_number.setBounds(170, 250, 76, 30);
        f.add(p1);
        f.add(H_x);
        f.add(H_o);
        f.add(H_number);
        p2.setBounds(250, 300, 95, 50);
        f.add(p2);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void check_winner(byte p_counter, String[] p2_array, String[] p1_array, JTextField p1, JTextField p2) {//check row
        int j = 2, k = 3;
        for (int i = 1; i <= 7; i = i + 3) {
            if (p1_array[i].equalsIgnoreCase(p1_array[j]) && p1_array[j].equalsIgnoreCase(p1_array[k]) && !p1_array[i].equalsIgnoreCase("z") && !p1_array[j].equalsIgnoreCase("z") && !p1_array[k].equalsIgnoreCase("z")) {
                p1.setText("player1 win");
            }
            if (p2_array[i].equalsIgnoreCase(p2_array[j]) && p2_array[j].equalsIgnoreCase(p2_array[k]) && !p2_array[i].equalsIgnoreCase("z") && !p2_array[j].equalsIgnoreCase("z") && !p2_array[k].equalsIgnoreCase("z")) {
                p2.setText("player2 win");
            }
            j = j + 3;
            k = k + 3;
        }


    }

    public static void check_winner2(byte p_counter, String[] p2_array, String[] p1_array, JTextField p1, JTextField p2) {//check column
        int j = 4, k = 7;
        for (int i = 1; i <= 3; i++) {
            if (p1_array[i].equalsIgnoreCase(p1_array[j]) && p1_array[j].equalsIgnoreCase(p1_array[k]) && !p1_array[i].equalsIgnoreCase("z") && !p1_array[j].equalsIgnoreCase("z") && !p1_array[k].equalsIgnoreCase("z")) {
                p1.setText("player1 win ");
            }
            if (p2_array[i].equalsIgnoreCase(p2_array[j]) && p2_array[j].equalsIgnoreCase(p2_array[k]) && !p2_array[i].equalsIgnoreCase("z") && !p2_array[j].equalsIgnoreCase("z") && !p2_array[k].equalsIgnoreCase("z")) {
                p2.setText("player2 win");
            }
            j++;
            k++;
        }
    }

    public static void check_winner3(byte p_counter, String[] p2_array, String[] p1_array, JTextField p1, JTextField p2) {//check diagonal
        int j = 5, k = 9, i = 1;

        if (p1_array[i].equalsIgnoreCase(p1_array[j]) && p1_array[j].equalsIgnoreCase(p1_array[k]) && !p1_array[i].equalsIgnoreCase("z") && !p1_array[j].equalsIgnoreCase("z") && !p1_array[k].equalsIgnoreCase("z")) {
            p1.setText("player win");
        }
        if (p2_array[i].equalsIgnoreCase(p2_array[j]) && p2_array[j].equalsIgnoreCase(p2_array[k]) && !p2_array[i].equalsIgnoreCase("z") && !p2_array[j].equalsIgnoreCase("z") && !p2_array[k].equalsIgnoreCase("z")) {
            p2.setText("player2 win");
        }
        //check another diagonal
        i = 3;
        k = 7;
        if (p1_array[i].equalsIgnoreCase(p1_array[j]) && p1_array[j].equalsIgnoreCase(p1_array[k]) && !p1_array[i].equalsIgnoreCase("z") && !p1_array[j].equalsIgnoreCase("z") && !p1_array[k].equalsIgnoreCase("z")) {
            p1.setText("player win");
        }
        if (p2_array[i].equalsIgnoreCase(p2_array[j]) && p2_array[j].equalsIgnoreCase(p2_array[k]) && !p2_array[i].equalsIgnoreCase("z") && !p2_array[j].equalsIgnoreCase("z") && !p2_array[k].equalsIgnoreCase("z")) {
            p2.setText("player2 win");
        }

    }

    public static int check_H_x(String[] p2_array, JTextField h_x) {//check row
        int counter=0;
        int j = 2, k = 3;
        for (int i = 1; i <= 7; i = i + 3) {
            if (!p2_array[i].equalsIgnoreCase("y") && !p2_array[j].equalsIgnoreCase("y") && !p2_array[k].equalsIgnoreCase("y")) {
                counter++;
                h_x.setText(counter+">>H(x)");
            }
            j = j + 3;
            k = k + 3;
        }
         j = 4;
         k = 7;
        for (int i = 1; i <= 3; i++) {
            if (!p2_array[i].equalsIgnoreCase("y") && !p2_array[j].equalsIgnoreCase("y") && !p2_array[k].equalsIgnoreCase("y")) {
                counter++;
                h_x.setText(counter+">>H(x)");
            }
            j++;
            k++;
        }
        j = 5;
        k = 9;
        int i = 1;

        if (!p2_array[i].equalsIgnoreCase("y") && !p2_array[j].equalsIgnoreCase("y") && !p2_array[k].equalsIgnoreCase("y")) {
            counter++;
            h_x.setText(counter+">>H(x)");
        }
        //check another diagonal
        i = 3;
        k = 7;
        if (!p2_array[i].equalsIgnoreCase("y") && !p2_array[j].equalsIgnoreCase("y") && !p2_array[k].equalsIgnoreCase("y")) {
            counter++;
            h_x.setText(counter+">>H(x)");
        }
        return counter;
    }

    public static int check_H_o(String[] p1_array, JTextField h_o) {//check row
        int counter=0;
        int j = 2, k = 3;
        for (int i = 1; i <= 7; i = i + 3) {
            if (!p1_array[i].equalsIgnoreCase("x") && !p1_array[j].equalsIgnoreCase("x") && !p1_array[k].equalsIgnoreCase("x")) {
                counter++;
                h_o.setText(counter+">>H(o)");
            }
            j = j + 3;
            k = k + 3;
        }
        j = 4;
        k = 7;
        for (int i = 1; i <= 3; i++) {
            if (!p1_array[i].equalsIgnoreCase("x") && !p1_array[j].equalsIgnoreCase("x") && !p1_array[k].equalsIgnoreCase("x")) {
                counter++;
                h_o.setText(counter+">>H(o)");
            }
            j++;
            k++;
        }
        j = 5;
        k = 9;
        int i = 1;

        if (!p1_array[i].equalsIgnoreCase("x") && !p1_array[j].equalsIgnoreCase("x") && !p1_array[k].equalsIgnoreCase("x")) {
            counter++;
            h_o.setText(counter+">>H(o)");
        }
        //check another diagonal
        i = 3;
        k = 7;
        if (!p1_array[i].equalsIgnoreCase("x") && !p1_array[j].equalsIgnoreCase("x") && !p1_array[k].equalsIgnoreCase("x")) {
            counter++;
            h_o.setText(counter+">>H(o)");
        }
        return counter;
    }

}

