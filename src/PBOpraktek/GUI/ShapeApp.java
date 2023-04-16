//package PBOpraktek.GUI;
//
//import PBOpraktek.belajarClass.Segiempat;
//import PBOpraktek.belajarClass.Segitiga;
//import PBOpraktek.pewarisan.Lingkaran;
//
//import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class ShapeApp extends javax.swing.JFrame{
//    private JPanel panel1;
//    private JPanel Segiempat;
//    private JPanel Persegi;
//    private JPanel Segitiga;
//    private JPanel Lingkaran;
//    private JButton persegiButton;
//    private JButton lingkaranButton;
//    private JButton segiempatButton;
//    private JButton segitigaButton;
//    private JButton hitungButton;
//    private JButton resetButton;
//    private JButton exitButton;
//    private JTextField panjangTextField;
//    private JTextField lebarTextField;
//    private JTextField sisiJariJariTextField;
//
//
//    public ShapeApp() {
//        exitButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.exit(0);
//            }
//        });
//        resetButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                panjangTextField.setText("");
//                lebarTextField.setText("");
//                sisiJariJariTextField.setText("");
//
//                persegiButton = false;
//                segiempatButton = false;
//                segitigaButton= false;
//                lingkaranButton = false;
//            }
//        });
//        persegiButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                ShapeApp.Persegi = true;
//                JOptionPane.showMessageDialog(this,"Masukkan nilai sisi di kolom input!");
//            }
//        });
//        lingkaranButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                ShapeApp.Lingkaran = true;
//                JOptionPane.showMessageDialog(this,"Masukkan nilai jari-jari di kolom input!");
//            }
//        });
//        segiempatButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                ShapeApp.Segiempat = true;
//                JOptionPane.showMessageDialog(this,"Masukkan nilai panjang dan lebar di kolom input!");
//            }
//        });
//        segitigaButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                ShapeApp.Segitiga = true;
//                JOptionPane.showMessageDialog(this,"Masukkan nilai panjang dan lebar di kolom input!");
//            }
//        });
//        hitungButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                double p;
//                double l;
//                double luas = 0;
//                double keliling = 0;
//
//                if(Persegi = true){
//                    p = Double.parseDouble(sisiJariJariTextField.getText());
//                    l = Double.parseDouble(sisiJariJariTextField.getText());
//                    Segiempat bentuk = new Segiempat(p,l);
//                    luas = bentuk.getLuas();
//                    keliling = bentuk.keliling();
//                } else if (lingkaranButton = true){
//                    p = Double.parseDouble(sisiJariJariTextField.getText());
//                    l = Double.parseDouble(sisiJariJariTextField.getText());
//                    Lingkaran bentuk = new Lingkaran(p,l);
//                    luas = bentuk.luas();
//                    keliling = bentuk.keliling();
//                } else if (segitigaButton = true){
//                    p = Double.parseDouble(sisiJariJariTextField.getText());
//                    l = Double.parseDouble(sisiJariJariTextField.getText());
//                    Segitiga bentuk = new Segitiga(p,l);
//                    luas = bentuk.luas();
//                    keliling = bentuk.keliling();
//                } else if (segiempatButton = true){
//                    p = Double.parseDouble(sisiJariJariTextField.getText());
//                    l = Double.parseDouble(sisiJariJariTextField.getText());
//                    Segiempat bentuk = new Segiempat(p,l);
//                    luas = bentuk.luas();
//                    keliling = bentuk.keliling();
//                }
//
//                // Menampilkan Luas
//                String luasstr = String.format("%.2f", luas);
//                hasilLuas.setText(luasstr);
//
//                // Menampilkan Keliling
//                String kelilingstr = String.format("%.2f", luas);
//                hasilKeliling.setText(kelilingstr);
//            }
//        });
//    }
//
//    private void createUIComponents() {
//        // TODO: place custom component creation code here
//    }
//}
