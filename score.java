package com.ibik.pbo;

public class score {
    private String email;
    private String rekomend;
    private int soal1 = 0;
    private int soal2 = 0;
    private int soal3 = 0;
    private int soal4 = 0;
    private int soal5 = 0;
    private int soal6 = 0;
    private int soal7 = 0;

    // Setter untuk mengatur alamat email
    public void setEmail(String email) {
        this.email = email;
    }

    // Metode untuk mendapatkan total skor
    public int getScore() {
        return soal1 + soal2 + soal3 + soal4 + soal5 + soal6 + soal7;
    }

    // Setter untuk mengatur rekomendasi
    public void setRekomend(String rekomend) {
        this.rekomend = rekomend;
    }

    // Getter untuk mendapatkan alamat email
    public String getEmail() {
        return email;
    }

    // Getter untuk mendapatkan rekomendasi
    public String getRekomend() {
        return rekomend;
    }

    // Setter untuk mengatur nilai jawaban soal 1
    public void setSoal1(int nilai) {
        this.soal1 = nilai;
    }

    // Setter untuk mengatur nilai jawaban soal 2
    public void setSoal2(int nilai) {
        this.soal2 = nilai;
    }

    // Setter untuk mengatur nilai jawaban soal 3
    public void setSoal3(int nilai) {
        this.soal3 = nilai;
    }

    // Setter untuk mengatur nilai jawaban soal 4
    public void setSoal4(int nilai) {
        this.soal4 = nilai;
    }

    // Setter untuk mengatur nilai jawaban soal 5
    public void setSoal5(int nilai) {
        this.soal5 = nilai;
    }

    // Setter untuk mengatur nilai jawaban soal 6
    public void setSoal6(int nilai) {
        this.soal6 = nilai;
    }

    // Setter untuk mengatur nilai jawaban soal 7
    public void setSoal7(int nilai) {
        this.soal7 = nilai;
    }
}
