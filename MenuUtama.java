package com.ibik.pbo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuUtama extends JFrame {

    private JTextField textField;
    private score Email;

    public MenuUtama() {
        setTitle("HomePage");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null); // Pusatkan frame di tengah layar

        // Panel utama
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        getContentPane().add(mainPanel);

        // Panel atas dengan JLabel
        JPanel topPanel = new JPanel();
        JLabel label = new JLabel("Masukkan Email:");
        topPanel.add(label);
        mainPanel.add(topPanel, BorderLayout.NORTH);

        // Panel tengah dengan JTextField
        JPanel centerPanel = new JPanel();
        textField = new JTextField(20);
        centerPanel.add(textField);
        mainPanel.add(centerPanel, BorderLayout.CENTER);

        // Panel bawah dengan JButton
        JPanel bottomPanel = new JPanel();
        JButton btnLanjutkan = new JButton("Lanjutkan");
        bottomPanel.add(btnLanjutkan);
        mainPanel.add(bottomPanel, BorderLayout.SOUTH);

        // Inisialisasi objek Email
        Email = new score();

        // Tambahkan ActionListener untuk tombol "Lanjutkan"
        btnLanjutkan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Dapatkan nilai dari JTextField (email)
                String enteredEmail = textField.getText();

                // Periksa apakah email valid (mengandung "@gmail.com")
                if (isValidEmail(enteredEmail)) {
                    // Email valid

                    // Set email pada objek Email
                    Email.setEmail(enteredEmail);

                    // Tutup frame MenuUtama
                    dispose();

                    // Simpan email ke database
                    HomepageDao dao = new HomepageDao();
                    dao.saveEmail(Email);

                    // Buat dan tampilkan frame Soal_1
                    soal_1 soal1Frame = new soal_1(Email);
                    soal1Frame.setVisible(true);
                } else {
                    // Email tidak valid
                   JOptionPane.showMessageDialog(MenuUtama.this, "Email tidak valid. Masukkan email dengan format yang benar.", "Peringatan",
                    		JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }

    // Fungsi untuk memeriksa apakah email valid
    private boolean isValidEmail(String email) {
        // Anda dapat menambahkan logika validasi email yang lebih canggih jika diperlukan
        return email.endsWith("@gmail.com");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }
}
