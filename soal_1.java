package com.ibik.pbo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class soal_1 extends JFrame {
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;
    private JRadioButton radioButton4;
    private score score1;

    // Konstruktor untuk kelas soal_1, menerima objek score sebagai parameter
    public soal_1(score scoring) {
        this.score1 = scoring;

        // Inisialisasi dan konfigurasi radio button
        radioButton1 = new JRadioButton("Sangat Setuju");
        radioButton1.setBounds(6, 90, 232, 23);
        radioButton2 = new JRadioButton("Setuju");
        radioButton2.setBounds(6, 118, 232, 23);
        radioButton3 = new JRadioButton("Tidak Setuju");
        radioButton3.setBounds(6, 144, 234, 23);
        radioButton4 = new JRadioButton("Sangat Tidak Setuju");
        radioButton4.setBounds(6, 170, 162, 23);

        // Mengelompokkan radio button dalam satu grup
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);
        buttonGroup.add(radioButton4);

        // Membuat panel untuk menempatkan komponen-komponen GUI
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 431, 246);
        panel.setLayout(null);
        panel.add(radioButton1);
        panel.add(radioButton2);
        panel.add(radioButton3);
        panel.add(radioButton4);

        // Konfigurasi frame utama
        setTitle("Soal Kuisoner");
        setSize(445, 283);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(panel);

        // Menambahkan label pertanyaan ke dalam panel
        JLabel lblNewLabel = new JLabel("1. Saya merasa bahwa aplikasi m-banking ini menyediakan semua fitur yang saya   ");
        lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        lblNewLabel.setBounds(10, 21, 933, 79);
        panel.add(lblNewLabel);

        // Menambahkan tombol "Selanjutnya" ke dalam panel
        JButton btnSelanjutnya = new JButton("Selanjutnya");
        btnSelanjutnya.setBounds(174, 197, 121, 23);
        panel.add(btnSelanjutnya);

        // Menambahkan label keterangan ke dalam panel
        JLabel lblNewLabel_1 = new JLabel("butuhkan untuk melakukan transaksi perbankan?");
        lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        lblNewLabel_1.setBounds(24, 66, 283, 14);
        panel.add(lblNewLabel_1);

        // Menambahkan action listener untuk menangani klik tombol "Selanjutnya"
        btnSelanjutnya.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Memeriksa apakah ada jawaban yang dipilih
                if (!radioButton1.isSelected() && !radioButton2.isSelected() && !radioButton3.isSelected() && !radioButton4.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Anda harus mengisi survei terlebih dahulu.");
                } else {
                    // Menentukan nilai berdasarkan jawaban yang dipilih
                    int nilai;
                    if (radioButton1.isSelected()) {
                        nilai = 5;  // Skala Likert: Sangat Setuju = 5
                    } else if (radioButton2.isSelected()) {
                        nilai = 4;  // Skala Likert: Setuju = 4
                    } else if (radioButton3.isSelected()) {
                        nilai = 3;  // Skala Likert: Tidak Setuju = 3
                    } else {
                        nilai = 2;  // Skala Likert: Sangat Tidak Setuju = 2
                    }

                    // Menyimpan nilai ke dalam objek score
                    score1.setSoal1(nilai);

                    // Menutup frame soal_1
                    dispose();

                    // Membuat dan menampilkan frame soal_2
                    soal_2 soal2Frame = new soal_2(score1);
                    soal2Frame.setVisible(true);
                }
            }
        });
    }
}
