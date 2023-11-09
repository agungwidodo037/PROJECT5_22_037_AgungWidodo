-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 09, 2023 at 02:49 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `modul5`
--

-- --------------------------------------------------------

--
-- Table structure for table `data_barang`
--

CREATE TABLE `data_barang` (
  `kode_barang` varchar(20) NOT NULL,
  `nama_barang` varchar(35) NOT NULL,
  `harga_barang` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `data_barang`
--

INSERT INTO `data_barang` (`kode_barang`, `nama_barang`, `harga_barang`) VALUES
('001', 'TV', '750000'),
('002', 'Komputer', '1500000'),
('003', 'Kipas Angin', '500000'),
('004', 'Radio', '150000');

-- --------------------------------------------------------

--
-- Table structure for table `dbmodul5`
--

CREATE TABLE `dbmodul5` (
  `NoPembelian` int(50) NOT NULL,
  `NamaBarang` varchar(20) NOT NULL,
  `KodeBarang` varchar(15) NOT NULL,
  `NamaPembeli` varchar(20) NOT NULL,
  `HargaBarang` varchar(15) NOT NULL,
  `JumlahBarang` varchar(30) NOT NULL,
  `TotalHarga` varchar(15) NOT NULL,
  `TotalPembayaran` varchar(15) NOT NULL,
  `Kembalian` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `dbmodul5`
--

INSERT INTO `dbmodul5` (`NoPembelian`, `NamaBarang`, `KodeBarang`, `NamaPembeli`, `HargaBarang`, `JumlahBarang`, `TotalHarga`, `TotalPembayaran`, `Kembalian`) VALUES
(1, '001', 'TV', '750000', 'Bima', '1', '750000', '1000000', '250000'),
(2, '001', 'TV', '750000', 'Nouval', '2', '1500000', '2000000', '500000'),
(3, '002', 'Komputer', '1500000', 'Akbar', '2', '3000000', '5000000', '2000000');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
