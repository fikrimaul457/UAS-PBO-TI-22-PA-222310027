-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 07 Jan 2024 pada 23.28
-- Versi server: 10.4.27-MariaDB
-- Versi PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `survey_iso`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `scoring`
--

CREATE TABLE `scoring` (
  `email` varchar(50) NOT NULL,
  `score` int(11) DEFAULT NULL,
  `rekomendasi` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `scoring`
--

INSERT INTO `scoring` (`email`, `score`, `rekomendasi`) VALUES
('Dlan@gmail.com', NULL, NULL),
('fadlan@gmail.com', NULL, NULL),
('fadlansyakur21@gmail.com', 35, 'Baik'),
('fikri1232@gmail.com', 35, 'Baik'),
('javierrachman21@gmail.com', 35, 'Baik'),
('muhammadfadlan@gmail.com', 17, 'Kurang Baik');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `scoring`
--
ALTER TABLE `scoring`
  ADD PRIMARY KEY (`email`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
