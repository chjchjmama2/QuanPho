-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th4 14, 2021 lúc 03:10 PM
-- Phiên bản máy phục vụ: 10.4.17-MariaDB
-- Phiên bản PHP: 8.0.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `pho`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `hoadon`
--

CREATE TABLE `hoadon` (
  `idhd` int(11) NOT NULL,
  `tenhoadon` char(50) NOT NULL,
  `tenmon` varchar(100) NOT NULL,
  `tongsomon` int(11) NOT NULL,
  `tongtien` float NOT NULL,
  `ngaythanhtoan` date DEFAULT NULL,
  `maban` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `hoadon`
--

INSERT INTO `hoadon` (`idhd`, `tenhoadon`, `tenmon`, `tongsomon`, `tongtien`, `ngaythanhtoan`, `maban`) VALUES
(11, 'Don hang 2', 'Phở bò(1) Quẩy(1) ', 6, 28000, '2021-04-12', 0),
(12, 'Don hang 1', 'Phở bò(1) Quẩy(1) ', 1, 28000, '2021-04-12', 0),
(14, 'hoa don 1', 'Phở bò(1) Quẩy(1) ', 2, 28000, '2021-04-13', 0),
(16, '0o0o0o0', 'Phở bò(1) Quẩy(1) ', 2, 28000, '2021-04-13', NULL),
(17, 'qqqq1', 'Phở bò(1) Quẩy(1) 123', 2, 28000, '2021-04-02', 0),
(18, 'Don hang 3', 'Phở bò(1) Quẩy(1) hello', 3, 28000, '2021-04-12', 0);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `monan`
--

CREATE TABLE `monan` (
  `idmonan` int(11) NOT NULL,
  `tenmonan` varchar(50) NOT NULL,
  `loato` varchar(50) NOT NULL,
  `loaithit` varchar(30) NOT NULL,
  `giatien` float NOT NULL,
  `idhoadon` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `monthem`
--

CREATE TABLE `monthem` (
  `idmonthem` int(11) NOT NULL,
  `tenmonthem` varchar(20) NOT NULL,
  `giatien` float NOT NULL,
  `idhoadon` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhanvien`
--

CREATE TABLE `nhanvien` (
  `manv` int(11) NOT NULL,
  `hotennv` varchar(50) DEFAULT NULL,
  `diachi` varchar(50) DEFAULT NULL,
  `ngaysinh` date DEFAULT NULL,
  `cmnd` varchar(12) DEFAULT NULL,
  `dienthoai` varchar(12) DEFAULT NULL,
  `ngaylamviec` date DEFAULT NULL,
  `luong` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `nhanvien`
--

INSERT INTO `nhanvien` (`manv`, `hotennv`, `diachi`, `ngaysinh`, `cmnd`, `dienthoai`, `ngaylamviec`, `luong`) VALUES
(1, 'Võ Quang Trường', '137/2 Trương Vĩnh Ký', '2021-04-08', '3119410474', '0332588979', '2021-04-01', 22000000),
(2, 'Võ Thùy Thảo Nguyên', '137/2 Trương Vĩnh Ký', '2021-04-11', '3119410474', '0332588979', '2021-04-01', 2000000),
(9, 'Võ  Quang Trường', '137/2 Trương Vĩnh Ký ', '2021-04-06', '3119410474', '0332588979', '2021-04-06', 2211110),
(921, 'Võ  Quang Trường', '137/2 Trương Vĩnh Ký ', '2021-04-06', '3119410474', '0332588979', '2021-04-05', 2211110),
(922, 'Võ  Quang Trường', '137/2 Trương Vĩnh Ký ', '1970-01-02', '3119410474', '0332588979', '1970-01-02', 2211110),
(924, 'Võ  Quang Trường', '137/2 Trương Vĩnh Ký ', '1970-01-01', '3119410474', '0332588979', '1970-01-01', 2211110);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `user`
--

CREATE TABLE `user` (
  `iduser` int(11) NOT NULL,
  `hoten` char(30) DEFAULT NULL,
  `username` varchar(40) NOT NULL,
  `userpassword` varchar(50) NOT NULL,
  `sodienthoai` char(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `user`
--

INSERT INTO `user` (`iduser`, `hoten`, `username`, `userpassword`, `sodienthoai`) VALUES
(1, NULL, 'truong', '123', NULL);

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `hoadon`
--
ALTER TABLE `hoadon`
  ADD PRIMARY KEY (`idhd`),
  ADD UNIQUE KEY `tenhoadon` (`tenhoadon`);

--
-- Chỉ mục cho bảng `monan`
--
ALTER TABLE `monan`
  ADD PRIMARY KEY (`idmonan`);

--
-- Chỉ mục cho bảng `monthem`
--
ALTER TABLE `monthem`
  ADD PRIMARY KEY (`idmonthem`);

--
-- Chỉ mục cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`manv`);

--
-- Chỉ mục cho bảng `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`iduser`),
  ADD UNIQUE KEY `username` (`username`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `hoadon`
--
ALTER TABLE `hoadon`
  MODIFY `idhd` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT cho bảng `monan`
--
ALTER TABLE `monan`
  MODIFY `idmonan` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `monthem`
--
ALTER TABLE `monthem`
  MODIFY `idmonthem` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  MODIFY `manv` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=925;

--
-- AUTO_INCREMENT cho bảng `user`
--
ALTER TABLE `user`
  MODIFY `iduser` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
