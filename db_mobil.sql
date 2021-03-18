-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 18, 2021 at 01:54 PM
-- Server version: 10.4.16-MariaDB
-- PHP Version: 7.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_mobil`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_mobil`
--

CREATE TABLE `tb_mobil` (
  `id` int(11) NOT NULL,
  `merk` varchar(50) NOT NULL,
  `plat` varchar(50) NOT NULL,
  `warna` varchar(50) NOT NULL,
  `jenis` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_mobil`
--

INSERT INTO `tb_mobil` (`id`, `merk`, `plat`, `warna`, `jenis`) VALUES
(1, 'Honda City', 'AB 123 CD', 'Hitam', 'Sport'),
(2, 'Toyota Avanza', 'WX 987 YZ', 'Silver', 'Biasa'),
(3, 'Daihatsu Ayla', 'AS 234 DF', 'Merah', 'Biasa'),
(4, 'Honda CR-Z', 'PO 954 IU', 'Hijau', 'Sport'),
(5, 'Kijang Innova', 'TY 78 RT', 'Cream', 'Biasa'),
(6, 'Tesla Model M', 'YU 97 AA', 'Merah', 'Sport'),
(7, 'Mitsubishi X', 'KL 765 WQ', 'Kuning', 'Truck'),
(8, 'Audi R8', 'YU 99 AA', 'Hitam', 'Balap'),
(9, 'Daihatsu Xenia', 'JG 652 UB', 'Hitam', 'Biasa'),
(10, 'SUV', 'YU 100 AA', 'Hitam', 'Sport'),
(11, 'BMW', 'YU 101 AA', 'Merah', 'Sport'),
(12, 'Mercedes AMG', 'YU 102 AA', 'Kuning', 'Balap'),
(13, 'Ferrari FXX', 'YU 109 AA', 'Putih', 'Balap'),
(14, 'Porsche 911', 'YU 23 AA', 'Putih', 'Balap'),
(15, 'Daihatsu Terios', 'DW 382 AW', 'Silver', 'Biasa'),
(16, 'Honda BR-Z', 'YU 765 TY', 'Silver', 'Balap'),
(17, 'Toyota Agya', 'KJ 680 GH', 'Putih', 'Biasa');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_mobil`
--
ALTER TABLE `tb_mobil`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tb_mobil`
--
ALTER TABLE `tb_mobil`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
