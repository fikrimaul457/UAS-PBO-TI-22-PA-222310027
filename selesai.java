package com.ibik.pbo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class selesai extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private score finalScore;

    // Konstruktor untuk kelas selesai, menerima objek score sebagai parameter
    public selesai(score scoring) {
        this.finalScore = scoring;

        // Membuat objek Dao untuk menyimpan skor
        HomepageDao Dao = new HomepageDao();

        // Menyimpan skor menggunakan metode saveScore dari Dao
        Dao.saveScore(finalScore);

        // Konfigurasi frame utama
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Menambahkan label "TERIMA KASIH" ke dalam panel
        JLabel lblNewLabel = new JLabel("TERIMA KASIH");
        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 23));
        lblNewLabel.setBounds(129, 49, 177, 145);
        contentPane.add(lblNewLabel);
    }
}
