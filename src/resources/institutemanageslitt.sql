-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 21, 2021 at 07:11 PM
-- Server version: 10.4.18-MariaDB
-- PHP Version: 7.4.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `institutemanageslitt`
--

-- --------------------------------------------------------

--
-- Table structure for table `addnewsession`
--

CREATE TABLE `addnewsession` (
  `id` int(11) NOT NULL,
  `lect1` varchar(233) DEFAULT NULL,
  `lect2` varchar(233) DEFAULT NULL,
  `subname` varchar(233) DEFAULT NULL,
  `grpid` varchar(233) DEFAULT NULL,
  `tagz` varchar(233) DEFAULT NULL,
  `studentcount` varchar(233) DEFAULT NULL,
  `durationhr` varchar(233) DEFAULT NULL,
  `durationmin` varchar(233) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `addnewsession`
--

INSERT INTO `addnewsession` (`id`, `lect1`, `lect2`, `subname`, `grpid`, `tagz`, `studentcount`, `durationhr`, `durationmin`) VALUES
(2, 'Lec1', 'Lec2', 'Sub2', 'GRP1', 'Tag1', '2', '10', '30'),
(3, 'Lec2', 'Lec1', 'Sub2', 'GRP3', 'Tag1', '3', '10', '2'),
(4, 'Saman', 'Sunimal gamage', 'ict', 'Y4.S1.CSE.1', 'Practical', '3', '10', '5');

-- --------------------------------------------------------

--
-- Table structure for table `lecturedetails`
--

CREATE TABLE `lecturedetails` (
  `idlecturer` int(11) NOT NULL,
  `lecname` varchar(233) DEFAULT NULL,
  `lecid` varchar(233) DEFAULT NULL,
  `lecfaculty` varchar(233) DEFAULT NULL,
  `lecdepartment` varchar(233) DEFAULT NULL,
  `leccenter` varchar(233) DEFAULT NULL,
  `lecturerbuilding` varchar(233) DEFAULT NULL,
  `lecturerlevel` varchar(233) DEFAULT NULL,
  `lecturerrank` varchar(233) DEFAULT NULL,
  `status` varchar(233) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lecturedetails`
--

INSERT INTO `lecturedetails` (`idlecturer`, `lecname`, `lecid`, `lecfaculty`, `lecdepartment`, `leccenter`, `lecturerbuilding`, `lecturerlevel`, `lecturerrank`, `status`) VALUES
(1, 'Saman', 'LEC12', 'fac4', 'department3', '213', 'building3', 'RANK3', 'RANK3', 'Delete'),
(2, 'Sunimal gamage', 'LEC12', 'fac1', 'department1', 'department3', 'building1', 'department1', 'RANK3', 'Active'),
(3, 'saman', 'lec006', 'fac3', 'department2', 'matara', 'building2', '45', 'lec00645', 'Delete'),
(4, 'Somalatha', '120', 'fac1', 'department1', 'Malabe', 'building1', '10', '12010', 'Delete'),
(6, 'CG', 'A', 'fac1', 'department2', 'Malabe', 'building1', '10', 'A10', 'Active'),
(7, 'ddasda', 'asda', 'fac1', 'department1', 'ada', 'building1', '12', 'asda12', 'Active');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `ID` int(20) NOT NULL,
  `Academic_Year` varchar(50) NOT NULL,
  `Semester` varchar(20) NOT NULL,
  `Programme` varchar(50) NOT NULL,
  `Group_ID` varchar(50) NOT NULL,
  `Sub_group_ID` varchar(50) NOT NULL,
  `Generate ID` varchar(50) NOT NULL,
  `Generate Sub ID` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`ID`, `Academic_Year`, `Semester`, `Programme`, `Group_ID`, `Sub_group_ID`, `Generate ID`, `Generate Sub ID`) VALUES
(19174125, 'Y4', 'S1', 'CSE', '1', '1', 'Y4.S1.CSE.1', 'Y4.S1.CSE.1.1'),
(18169836, 'Y4', 'S1', 'CSSE', '1', '1', 'Y4.S1.CSSE.1', 'Y4.S1.CSSE.1.1'),
(82375132, 'Y1', 'S1', 'CSE', '1', '1', 'Y1.S1.CSE.1', 'Y1.S1.CSE.1.1'),
(18145380, 'Y3', 'S2', 'ISE', '3', '2', 'Y3.S2.ISE.3', 'Y3.S2.ISE.3.2'),
(8521478, 'Y4', 'S1', 'Multimedia', '1', '1', 'Y4.S1.Multimedia.1', 'Y4.S1.Multimedia.1.1'),
(152142, 'Y2', 'S2', 'ISE', '2', '2', 'Y2.S2.ISE.2', 'Y2.S2.ISE.2.2'),
(824596, 'Y3', 'S2', 'CSE', '1', '1', 'Y3.S2.CSE.1', 'Y3.S2.CSE.1.1'),
(123456, 'Y2', 'S2', 'ISE', '2', '2', 'Y2.S2.ISE.2', 'Y2.S2.ISE.2.2'),
(8523147, 'Y2', 'S2', 'Multimedia', '1', '1', 'Y2.S2.Multimedia.1', 'Y2.S2.Multimedia.1.1');

-- --------------------------------------------------------

--
-- Table structure for table `subjectdetails`
--

CREATE TABLE `subjectdetails` (
  `idsubject` int(11) NOT NULL,
  `subjectyear` varchar(233) DEFAULT NULL,
  `semester` varchar(233) DEFAULT NULL,
  `subname` varchar(233) DEFAULT NULL,
  `subcode` varchar(233) DEFAULT NULL,
  `lechours` varchar(233) DEFAULT NULL,
  `tutorialhours` varchar(233) DEFAULT NULL,
  `labhours` varchar(233) DEFAULT NULL,
  `evehours` varchar(233) DEFAULT NULL,
  `statusz` varchar(233) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `subjectdetails`
--

INSERT INTO `subjectdetails` (`idsubject`, `subjectyear`, `semester`, `subname`, `subcode`, `lechours`, `tutorialhours`, `labhours`, `evehours`, `statusz`) VALUES
(2, '2021', 'first semester', 'ict', 'ekhjk', '2', '2', '2', '2', 'Active'),
(3, '2021', 'first semester', 'english', 'kjhk', '0', '0', '0', '0', 'Delete'),
(4, '2024', 'Second semester', 'Algorithm', 's005', '4', '3', '2', '1', 'Active'),
(5, '2021', 'first semester', 'Jalalala', '0122', '1', '2', '2', '2', 'Active'),
(6, '2022', 'first semester', 'eawe', '1122', '2', '1', '2', '4', 'Active');

-- --------------------------------------------------------

--
-- Table structure for table `tags`
--

CREATE TABLE `tags` (
  `Tag_ID` int(11) NOT NULL,
  `Subject_type` varchar(50) NOT NULL,
  `Tag_code` varchar(50) NOT NULL,
  `Tag_name` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tags`
--

INSERT INTO `tags` (`Tag_ID`, `Subject_type`, `Tag_code`, `Tag_name`) VALUES
(2001, 'PAF-Edited', 'IT3020', 'Lecture'),
(6363, 'ITPM', 'IT3030', 'Practical'),
(6003, 'Network', 'IE3003', 'Lecture'),
(31245, 'CN', 'IT2002', 'Lecture'),
(3005, 'DBMS', 'IT0223', 'Tutorial'),
(6630, 'COMPUTER', 'IE2001', 'Practical');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `addnewsession`
--
ALTER TABLE `addnewsession`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `lecturedetails`
--
ALTER TABLE `lecturedetails`
  ADD PRIMARY KEY (`idlecturer`);

--
-- Indexes for table `subjectdetails`
--
ALTER TABLE `subjectdetails`
  ADD PRIMARY KEY (`idsubject`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `addnewsession`
--
ALTER TABLE `addnewsession`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `lecturedetails`
--
ALTER TABLE `lecturedetails`
  MODIFY `idlecturer` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `subjectdetails`
--
ALTER TABLE `subjectdetails`
  MODIFY `idsubject` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
