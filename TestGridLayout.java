package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestGridLayout extends Menu{
    public static void main(String[] args) {
        //头部，菜单组件部分
        MenuBar menuBar = new MenuBar();
        //创建一级菜单
        java.awt.Menu edit = new java.awt.Menu("编辑");
        java.awt.Menu function = new java.awt.Menu("功能");
        java.awt.Menu count = new java.awt.Menu("计算器");
        java.awt.Menu change = new java.awt.Menu("转换器");
        //复制和粘贴二级菜单
        MenuItem copy = new MenuItem("复制",new MenuShortcut(KeyEvent.VK_C,false) );
        MenuItem paste = new MenuItem("粘贴",new MenuShortcut(KeyEvent.VK_V,false) );
        MenuItem standar = new MenuItem("标准");
        MenuItem science = new MenuItem("科学");
        MenuItem draw = new MenuItem("绘画");
        MenuItem money = new MenuItem("货币");
        MenuItem speed = new MenuItem("速度");
        MenuItem length = new MenuItem("长度");
            //开始组装视图
            edit.add(copy);
            edit.add(paste);
            function.add(count);
            function.add(change);
            count.add(standar);
            count.add(science);
            count.add(draw);
            change.add(money);
            change.add(speed);
            change.add(length);
            menuBar.add(edit);
            menuBar.add(function);
        //创建一个窗口，名字为f
        JFrame f = new JFrame("邹鹏计算器");
        f.setMenuBar(menuBar);
        menuBar.setFont(new  java.awt.Font("黑体",  1,  14));
        //窗口可关闭
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置窗口位置和宽度、高度
        f.setBounds(300, 300, 300, 300);
        //设置窗口f的布局管理器为BorderLayout
        f.setLayout(new BorderLayout());
        //创建一个panel用来存储文本框
        Panel p1 = new Panel();
        p1.setLayout(new FlowLayout(0));
        JTextField text = new JTextField(20);
        text.setEditable(false);
        text.setFont(new  java.awt.Font("黑体",  1,  20));
        Button clear = new Button("C");
        clear.setFont(new  java.awt.Font("黑体",  1,  16));
        //清空功能
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand() == "C") {
                    text.setText("");
                }
            }
        });
        p1.add(text);
        p1.add(clear);
        //创建一个panel用来存储按钮
        Panel p2 = new Panel();
        p2.setLayout(new GridLayout(6, 4, 4, 4));
        Button button[] = new Button[24];
//        p2.add(new Button("7"));
//        p2.add(new Button("8"));
//        p2.add(new Button("9"));
//        p2.add(new Button("/"));
//        p2.add(new Button("4"));
//        p2.add(new Button("5"));
//        p2.add(new Button("6"));
//        p2.add(new Button("*"));
//        p2.add(new Button("1"));
//        p2.add(new Button("2"));
//        p2.add(new Button("3"));
//        p2.add(new Button("-"));
//        p2.add(new Button("0"));
//        p2.add(new Button("."));
//        Button button = new Button("=");
//        p2.add(button);
////        button.setBackground(Color.orange);
//        button.setForeground(Color.red);
//        p2.add(new Button("+"));
        button[0] = new Button("sin");
        button[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand() == "sin") {
                    Double degrees = Double.valueOf(text.getText());
                    //调用Math.toRadians方法转为角度
                    Double radians = Math.toRadians(degrees);
                    Double a = Math.sin(radians);
                    text.setText(a.toString());
                }
            }
        });
        button[1] = new Button("+/-");
        button[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double a = Double.valueOf(text.getText());
                Double b = -a;
                text.setText(b.toString());
            }
        });
        button[2] = new Button("X²");
        button[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand() == "X²") {
                    Double a = Double.valueOf(text.getText());
                    Double b = a * a;
                    text.setText(b.toString());
                }
            }
        });
        button[3] = new Button("Del");
        button[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a = text.getText();
                if (a.length() != 0) {
                    if (e.getActionCommand() == "Del") {
                        a = a.substring(0, a.length() - 1);
                        text.setText(a);
                    }
                } else {
                    text.setText("当前操作不正确");
                }
            }
        });
        button[4] = new Button("cos");
        button[4].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand() == "cos") {
                    Double degrees = Double.valueOf(text.getText());
                    //调用Math.toRadians方法转为角度
                    Double radians = Math.toRadians(degrees);
                    Double a = Math.cos(radians);
                    text.setText(a.toString());
                }
            }
        });
        button[5] = new Button("log");
        button[5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand() == "log") {
                    Double a = Double.valueOf(text.getText());
                    Double b = Math.log(a);
                    text.setText(b.toString());
                }
            }
        });
        button[6] = new Button("√");
        button[6].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand() == "√") {
                    Double a = Double.valueOf(text.getText());
                    Double b = Math.sqrt(a);
                    text.setText(b.toString());
                }
            }
        });
        button[7] = new Button("%");
        button[7].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand() == "%") {
                    Double a = Double.valueOf(text.getText());
                    Double b = a/100;
                    text.setText(b.toString());
                }
            }
        });
        button[8] = new Button("7");
        button[9] = new Button("8");
        button[10] = new Button("9");
        button[11] = new Button("/");
        button[12] = new Button("4");
        button[13] = new Button("5");
        button[14] = new Button("6");
        button[15] = new Button("*");
        button[16] = new Button("1");
        button[17] = new Button("2");
        button[18] = new Button("3");
        button[19] = new Button("-");
        button[20] = new Button("0");
        button[21] = new Button(".");
        button[22] = new Button("=");
        button[23] = new Button("+");
        button[11].setForeground(Color.red);
        button[15].setForeground(Color.red);
        button[19].setForeground(Color.red);
        button[22].setForeground(Color.red);
        button[23].setForeground(Color.red);
        for (int i = 0; i < button.length; i++) {
            p2.add(button[i]);
            button[i].setFont(new  java.awt.Font("黑体",  1,  16));
            button[i].setBackground(Color.white);
        }
        //把p1 p2 组织到窗口里
        //把p1加到窗口北部
        f.add(p1, BorderLayout.NORTH);
        //把p1加到窗口中部
        f.add(p2);
        //四则运算部分
        String[] firstInput = new String[1];
        String[] operition = new String[1];//初始运算符
        for (int i = 0; i < button.length; i++) {
            //鼠标移入事件
            int index = i;
            button[i].addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    super.mouseEntered(e);
                    button[index].setBackground(Color.gray);
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    super.mouseExited(e);
                    button[index].setBackground(Color.white);
                }
            });
            button[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
//                    text.setText(e.getActionCommand());
                    String click = e.getActionCommand();
                    if (".0123456789".indexOf(click) != -1) {
                        //为了前一个数字不会被一个覆盖
                        text.setText(text.getText() + e.getActionCommand());
                        //计算器使用习惯，数字显示在右边
                        text.setHorizontalAlignment(JTextField.RIGHT);
                    } else if (click.matches("[\\+\\-*/]{1}")) {
                        //保存第一次的数
                        firstInput[0] = text.getText();
                        //清空文本框
                        text.setText("");
                        operition[0] = click;
                    } else if (click.equals("=")) {
                        Double a = Double.valueOf(firstInput[0]);
                        Double b = Double.valueOf(text.getText());
                        Double result = null;
                        switch (operition[0]) {
                            case "+":
                                result = a + b;
                                break;
                            case "-":
                                result = a - b;
                                break;
                            case "*":
                                result = a * b;
                                break;
                            case "/":
                                if (b != 0) {
                                    result = a / b;
                                } else {
                                    text.setText("无效的输入");
                                }
                                break;
                        }
                        //把结果输出到文本框中
                        text.setText(result.toString());
                    }
                }
            });
        }


        //窗口最佳大小
        f.pack();
        //窗口可见化
        f.setVisible(true);
    }
}
