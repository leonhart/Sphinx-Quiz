package com.sphinx.calculator2;

/**
 * Created by LeonhartZ on 2017/2/28.
 */

/**
 * Currently, first problem is how to write if the first number is a negative number
 * second problem is how to write in order to calculate long function like 1+2*3/4
 * By the way, the second problem has caused another problem, how to calculate * and / first then + and -
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class calculator2 extends JFrame {

    TextField tf = new TextField(60);
    StringBuffer s1 = new StringBuffer();
    StringBuffer s2 = new StringBuffer();
    StringBuffer s3 = new StringBuffer();
    static String flag = new String();
    boolean start = true;

    public void screen() {
        JFrame f = new JFrame("Calculator");
        JPanel p1 = new JPanel();
        p1.add(tf);
        f.add(p1, BorderLayout.NORTH);

        JPanel p3 = new JPanel();
        p3.setLayout(new GridLayout(4,5));

        JButton button1 = new JButton("7");
        JButton button2 = new JButton("8");
        JButton button3 = new JButton("9");
        JButton button4 = new JButton("BackSpace");
        JButton button5 = new JButton("ClearAll");

        JButton button6 = new JButton("4");
        JButton button7 = new JButton("5");
        JButton button8 = new JButton("6");
        JButton button9 = new JButton("*");
        JButton button10 = new JButton("/");

        JButton button11 = new JButton("1");
        JButton button12 = new JButton("2");
        JButton button13 = new JButton("3");
        JButton button14 = new JButton("+");
        JButton button15 = new JButton("-");

        JButton button16 = new JButton("0");
        JButton button17 = new JButton(".");
        JButton button18 = new JButton("10^x");
        JButton button19 = new JButton("sqrt");
        JButton button20 = new JButton("=");

        p3.add(button1);
        p3.add(button2);
        p3.add(button3);
        p3.add(button4);
        p3.add(button5);
        p3.add(button6);
        p3.add(button7);
        p3.add(button8);
        p3.add(button9);
        p3.add(button10);
        p3.add(button11);
        p3.add(button12);
        p3.add(button13);
        p3.add(button14);
        p3.add(button15);
        p3.add(button16);
        p3.add(button17);
        p3.add(button18);
        p3.add(button19);
        p3.add(button20);

        f.add(p3, BorderLayout.SOUTH);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);

        ActionListener operate = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getActionCommand() == "0") {
                    if (!s1.toString().equals(new String())) {
                        if (!start) {
                            s1.delete(0, s1.length());
                            s3.delete(0, s3.length());
                        }
                        start = true;
                        tf.setText(s3.append("0").toString());
                        s1.append("0").toString();
                    }
                }

                if (e.getActionCommand() == "1") {
                    if (!start) {
                        s1.delete(0, s1.length());
                        s3.delete(0, s3.length());
                    }
                    start = true;
                    tf.setText(s3.append("1").toString());
                    s1.append("1").toString();
                }

                if (e.getActionCommand() == "2") {
                    if (!start) {
                        s1.delete(0, s1.length());
                        s3.delete(0, s3.length());
                    }
                    start = true;
                    tf.setText(s3.append("2").toString());
                    s1.append("2").toString();
                }

                if (e.getActionCommand() == "3") {
                    if (!start) {
                        s1.delete(0, s1.length());
                        s3.delete(0, s3.length());
                    }
                    start = true;
                    tf.setText(s3.append("3").toString());
                    s1.append("3").toString();
                }

                if (e.getActionCommand() == "4") {
                    if (!start) {
                        s1.delete(0, s1.length());
                        s3.delete(0, s3.length());
                    }
                    start = true;
                    tf.setText(s3.append("4").toString());
                    s1.append("4").toString();
                }

                if (e.getActionCommand() == "5") {
                    if (!start) {
                        s1.delete(0, s1.length());
                        s3.delete(0, s3.length());
                    }
                    start = true;
                    tf.setText(s3.append("5").toString());
                    s1.append("5").toString();
                }

                if (e.getActionCommand() == "6") {
                    if (!start) {
                        s1.delete(0, s1.length());
                        s3.delete(0, s3.length());
                    }
                    start = true;
                    tf.setText(s3.append("6").toString());
                    s1.append("6").toString();
                }

                if (e.getActionCommand() == "7") {
                    if (!start) {
                        s1.delete(0, s1.length());
                        s3.delete(0, s3.length());
                    }
                    start = true;
                    tf.setText(s3.append("7").toString());
                    s1.append("7").toString();
                }

                if (e.getActionCommand() == "8") {
                    if (!start) {
                        s1.delete(0, s1.length());
                        s3.delete(0, s3.length());
                    }
                    start = true;
                    tf.setText(s3.append("8").toString());
                    s1.append("8").toString();
                }

                if (e.getActionCommand() == "9") {
                    if (!start) {
                        s1.delete(0, s1.length());
                        s3.delete(0, s3.length());
                    }
                    start = true;
                    tf.setText(s3.append("9").toString());
                    s1.append("9").toString();
                }

                if (e.getActionCommand() == ".") {
                    if (s1.toString().equals(new String())) {
                        tf.setText(s3.append("0.").toString());
                        s1.append("0.").toString();
                    }
                    else if (s1.length() == 1 && s1.charAt(0) == '-') {
                        tf.setText(s3.append("0.").toString());
                        s1.append("0.").toString();
                    }
                    else {
                        tf.setText(s3.append(".").toString());
                        s1.append(".").toString();
                    }
                }

                /** the first number is a negative number part
                 *
                 * if (e.getActionCommand() == "-") { // how to write if the first number is negative number
                    if (!start) {
                        s1.delete(0, s1.length());
                        s3.delete(0, s3.length());
                    }
                    start = true;
                    tf.setText(s3.append("-").toString());
                    s1.append("-").toString();
                }*/

                if (e.getActionCommand() == "BackSpace") {
                    start = true;
                    if (s1.length() != 0) {
                        s1.deleteCharAt(s1.length() - 1);
                        s3.deleteCharAt(s3.length() - 1);
                        tf.setText(s3.toString());
                    }
                }

                if (e.getActionCommand() == "ClearAll") {
                    start = true;
                    s1.delete(0, s1.length());
                    s2.delete(0, s2.length());
                    s3.delete(0, s3.length());
                    tf.setText(s3.toString());
                }

                if (e.getActionCommand() == "+") {
                    start = true;
                    flag = "+";
                    s2.append(String.valueOf(s1.toString()));
                    s1.delete(0, s1.length());
                    tf.setText(s3.append("+").toString());
                }

                if (e.getActionCommand() == "-") {
                    start = true;
                    flag = "-";
                    s2.append(String.valueOf(s1.toString()));
                    s1.delete(0, s1.length());
                    tf.setText(s3.append("-").toString());
                }

                if (e.getActionCommand() == "*") {
                    start = true;
                    flag = "*";
                    s2.append(String.valueOf(s1.toString()));
                    s1.delete(0, s1.length());
                    tf.setText(s3.append("*").toString());
                }

                if (e.getActionCommand() == "/") {
                    start = true;
                    flag = "/";
                    s2.append(String.valueOf(s1.toString()));
                    s1.delete(0, s1.length());
                    tf.setText(s3.append("/").toString());
                }

                if (e.getActionCommand() == "sqrt") {
                    start = false;
                    double result = Double.parseDouble(s3.toString());
                    s1.delete(0, s1.length());
                    s3.delete(0, s3.length());
                    tf.setText(s3.append(String.valueOf(Math.sqrt(result))).toString());
                }

                if (e.getActionCommand() == "10^x") {
                    start = false;
                    double result = Double.parseDouble(s3.toString());
                    s1.delete(0, s1.length());
                    s3.delete(0, s3.length());
                    tf.setText(s3.append(String.valueOf(Math.pow(10, result))).toString());
                }

                if (e.getActionCommand() == "=" && s1.length() != 0 && s2.length() != 0) {
                    start = false;
                    double gets1 = Double.parseDouble(s1.toString());
                    double gets2 = Double.parseDouble(s2.toString());
                    s1.delete(0, s1.length());
                    s2.delete(0, s2.length());
                    s3.delete(0, s3.length());
                    if (flag == "+")
                        tf.setText(s3.append(String.valueOf(gets1 + gets2)).toString());
                    if (flag == "-")
                        tf.setText(s3.append(String.valueOf(gets2 - gets1)).toString());
                    if (flag == "*")
                        tf.setText(s3.append(String.valueOf(gets1 * gets2)).toString());
                    if (flag == "/")
                        tf.setText(s3.append(String.valueOf(gets2 / gets1)).toString());
                }
            }
        };

        button1.addActionListener(operate);
        button2.addActionListener(operate);
        button3.addActionListener(operate);
        button4.addActionListener(operate);
        button5.addActionListener(operate);
        button6.addActionListener(operate);
        button7.addActionListener(operate);
        button8.addActionListener(operate);
        button9.addActionListener(operate);
        button10.addActionListener(operate);
        button11.addActionListener(operate);
        button12.addActionListener(operate);
        button13.addActionListener(operate);
        button14.addActionListener(operate);
        button15.addActionListener(operate);
        button16.addActionListener(operate);
        button17.addActionListener(operate);
        button18.addActionListener(operate);
        button19.addActionListener(operate);
        button20.addActionListener(operate);
    }

    public static void main(String[] args) {
        new calculator2().screen();
    }
}


