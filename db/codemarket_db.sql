-- phpMy SQL Dump
-- version 4.5.4.1deb2ubuntu2
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Aug 19, 2017 at 11:22 PM
-- Server version: 5.7.19-0ubuntu0.16.04.1
-- PHP Version: 7.0.22-0ubuntu0.16.04.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `codemarket_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `badges`
--

CREATE TABLE `badges` (
  `id` int(11) NOT NULL,
  `created` datetime DEFAULT NULL,
  `modified` datetime DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `badges`
--

INSERT INTO `badges` (`id`, `created`, `modified`, `name`) VALUES
(1, '2017-08-03 00:00:00', '2017-08-03 00:00:00', 'Starter');

-- --------------------------------------------------------

--
-- Table structure for table `catagories`
--

CREATE TABLE `catagories` (
  `id` int(11) NOT NULL,
  `created` datetime DEFAULT NULL,
  `modified` datetime DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `parent_id` int(11) DEFAULT NULL,
  `slug` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `multiple_price_extended` int(11) DEFAULT NULL,
  `price_extended` int(11) DEFAULT NULL,
  `extended_price_extended` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `catagories`
--

INSERT INTO `catagories` (`id`, `created`, `modified`, `name`, `parent_id`, `slug`, `status`, `multiple_price_extended`, `price_extended`, `extended_price_extended`) VALUES
(1, '2017-08-03 00:00:00', '2017-08-03 00:00:00', 'Android', 0, 'android', 'ACTIVE', 10, 5, 8),
(3, '2017-08-14 00:00:00', '2017-08-14 00:00:00', 'ecommerce', 1, 'ecom', 'ACTIVE', 110, 10, 10);

-- --------------------------------------------------------

--
-- Table structure for table `compatable_browsers`
--

CREATE TABLE `compatable_browsers` (
  `id` int(11) NOT NULL,
  `created` datetime DEFAULT NULL,
  `modified` datetime DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `catagories_id` int(11) DEFAULT NULL,
  `slug` varchar(150) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `compatable_browsers`
--

INSERT INTO `compatable_browsers` (`id`, `created`, `modified`, `name`, `catagories_id`, `slug`) VALUES
(1, '2017-07-08 00:00:00', '2017-07-08 00:00:00', 'FireFox', 1, 'firefox'),
(2, '2017-07-08 00:00:00', '2017-07-08 00:00:00', 'Chrome', 1, 'chrome'),
(11, '2017-08-17 19:06:00', NULL, 'compatble_3', 1, NULL),
(15, '2017-08-17 20:39:57', NULL, 'material', 1, 'material');

-- --------------------------------------------------------

--
-- Table structure for table `compatible_with`
--

CREATE TABLE `compatible_with` (
  `id` int(11) NOT NULL,
  `created` datetime DEFAULT NULL,
  `modified` datetime DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `catagories_id` int(11) DEFAULT NULL,
  `slug` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `compatible_with`
--

INSERT INTO `compatible_with` (`id`, `created`, `modified`, `name`, `catagories_id`, `slug`) VALUES
(1, '2017-08-13 00:00:00', '2017-08-13 00:00:00', 'compatible_1', 1, 'compatible_1'),
(2, '2017-08-13 00:00:00', '2017-08-13 00:00:00', 'compatible_2', 1, 'compatible_2'),
(12, '2017-08-17 19:55:44', NULL, 'compatble_334', 1, 'android');

-- --------------------------------------------------------

--
-- Table structure for table `digital_items`
--

CREATE TABLE `digital_items` (
  `id` int(11) NOT NULL,
  `created` datetime DEFAULT NULL,
  `description` varchar(500) DEFAULT NULL,
  `documentation` varchar(255) DEFAULT NULL,
  `extended_price` int(11) DEFAULT NULL,
  `high_resolution` varchar(255) DEFAULT NULL,
  `long_description` varchar(255) DEFAULT NULL,
  `modified` datetime DEFAULT NULL,
  `multiple_price` int(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `pname` varchar(100) DEFAULT NULL,
  `price` int(11) NOT NULL,
  `six_month_support_price` int(11) DEFAULT NULL,
  `slug` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `frame_work_id` int(11) DEFAULT NULL,
  `softwateversion_id` int(11) DEFAULT NULL,
  `user_profile_info_id` int(11) DEFAULT NULL,
  `catagories_id` int(11) DEFAULT NULL,
  `catagories_child_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `digital_items`
--

INSERT INTO `digital_items` (`id`, `created`, `description`, `documentation`, `extended_price`, `high_resolution`, `long_description`, `modified`, `multiple_price`, `name`, `pname`, `price`, `six_month_support_price`, `slug`, `status`, `frame_work_id`, `softwateversion_id`, `user_profile_info_id`, `catagories_id`, `catagories_child_id`) VALUES
(1, '2017-08-05 15:52:32', 'Firstt', 'well documented', 56, 'YES', '<p>Firstt</p>\r\n', '2017-08-05 15:52:32', 56, 'Firstt', 'Firstt', 0, 56, 'firstt', 'UPLOADED', 1, 1, 2, 1, 3),
(2, '2017-08-05 00:29:27', 'you can talk to other people.', 'well documented', 56, 'YES', '<p>you can talk to other people.</p>\r\n', '2017-08-05 00:29:27', 56, 'social media', 'Skype', 34, 56, 'social-media', 'REJECTED', 1, 1, 9, 1, 3),
(3, '2017-08-05 00:12:11', 'social viber', 'well documented', 56, 'YES', '<p>social viber</p>\r\n', '2017-08-05 00:12:11', 56, 'social viber', 'ViberAppssss', 34, 56, 'social-viber', 'ULOADED', 1, 1, 9, 1, 3),
(4, '2017-08-04 04:17:07', 'social destroydfdfd', 'well documented', 56, 'YES', '<p>social destroy</p>\r\n', '2017-08-04 04:17:07', 56, 'social destroy', 'facebook', 34, 56, 'social-destroy', 'ULOADED', 1, 1, 2, 1, 3),
(5, '2017-08-05 14:12:03', 'twittertwitter', 'well documented', 56, 'YES', '<p>twittertwitter</p>\r\n', '2017-08-05 14:12:03', 56, 'twittertwitter', 'twitter', 34, 56, 'twittertwitter', 'ULOADED', 1, 1, 2, 1, 3),
(6, '2017-08-05 01:42:37', 'TestTest', 'well documented', 56, 'YES', '<p>TestTest</p>\r\n', '2017-08-05 01:42:37', 56, 'TestTest', 'Test', 34, 56, 'testtest', 'ULOADED', 1, 1, 9, 1, 3),
(7, '2017-08-05 01:46:15', 'test.vesion 2', 'well documented', 56, 'YES', '<p>test.vesion 2</p>\r\n', '2017-08-05 01:46:15', 56, 'test.vesion 2', 'test.vesion 2', 34, 56, 'test-vesion-2', 'ULOADED', 1, 1, 9, 1, 3),
(8, '2017-08-05 02:35:04', 'test.vesion 2', 'well documented', 56, 'YES', '<p>test.vesion 2</p>\r\n', '2017-08-05 02:35:04', 56, 'test.vesion 2   2.5', 'test.vesion 2', 34, 56, 'test-vesion-2-2-5', 'ULOADED', 1, 1, 9, 1, 3),
(9, '2017-08-05 02:36:21', 'test.vesion 2', 'well documented', 56, 'YES', '<p>test.vesion 2</p>\r\n', '2017-08-05 02:36:21', 56, 'test.vesion 2   2.5', 'test.vesion 2', 34, 56, 'test-vesion-2-2-5', 'ULOADED', 1, 1, 9, 1, 3),
(10, '2017-08-05 02:41:10', 'test.vesion 2', 'well documented', 56, 'YES', '<p>test.vesion 2</p>\r\n', '2017-08-05 02:41:10', 56, 'test.vesion 2   2.5', 'test.vesion 2', 34, 56, 'test-vesion-2-2-5', 'ULOADED', 1, 1, 9, 1, 3),
(11, '2017-08-05 02:41:36', 'test.vesion 2', 'well documented', 56, 'YES', '<p>test.vesion 2</p>\r\n', '2017-08-05 02:41:36', 56, 'test.vesion 2   2.5', 'test.vesion 2', 34, 56, 'test-vesion-2-2-5', 'ULOADED', 1, 1, 9, 1, 3),
(12, '2017-08-06 00:28:30', 'secondsecondsecondsecondsecondsecondsecondsecondsecondsecond', 'well documented', 56, 'YES', '<p>secondsecond</p>\r\n', '2017-08-06 00:28:30', 56, 'secondsecond', 'second', 0, 56, 'secondsecond', 'ULOADED', 1, 1, 2, 1, 3),
(13, '2017-08-13 13:29:59', 'hellohellohello', 'well documented', 116, 'YES', '<p>hellohellohello</p>\r\n', '2017-08-13 13:29:59', 120, 'hellohellohello', 'helloSomething', 110, 100, 'hellohellohello', 'ULOADED', 1, 1, 2, 1, 1),
(14, '2017-08-13 17:23:15', 'product2product2', 'well documented', 132, 'YES', '<p>product2product2</p>\r\n', '2017-08-13 17:23:15', 140, 'product2product2', 'product2', 220, 100, 'product2product2', 'ULOADED', 1, 1, 2, 1, 1),
(15, '2017-08-15 01:19:24', 'Your Name must', 'well documented', 212, 'YES', '<p>Your Name must</p>\r\n', '2017-08-15 01:19:24', 240, 'Your Name must', 'Your Name must', 130, 0, 'your-name-must', 'ULOADED', 1, 1, 2, 1, 3),
(16, '2017-08-16 02:02:42', 'twenty_one', 'well documented', 1767, 'YES', '<p>twenty_one</p>\r\n', '2017-08-16 02:02:42', 320, 'twenty_one', 'twenty_one', 110, 0, 'twenty_one', 'ULOADED', 1, 1, 2, 1, 3),
(17, '2017-08-17 17:20:58', 'lastlast', 'well documented', 19, 'YES', '<p>lastlast</p>\r\n', '2017-08-17 17:20:58', 21, 'lastlast', 'lastlast', 16, 20, 'lastlast', 'ULOADED', 1, 1, 2, 1, 3),
(18, '2017-08-17 17:25:15', 'helloSomething', 'well documented', 8, 'YES', '<p>helloSomething</p>\r\n', '2017-08-17 17:25:15', 10, 'helloSomething', 'helloSomething', 5, 0, 'hellosomething', 'ULOADED', 1, 1, 2, 1, 3),
(19, '2017-08-17 19:44:23', 'helloSome', 'well documented', 8, 'YES', '<p>helloSome</p>\r\n', '2017-08-17 19:44:23', 10, 'helloSome', 'helloSome', 5, 0, 'hellosome', 'ULOADED', 1, 1, 2, 1, 3),
(20, '2017-08-17 22:32:44', 'asdasdasdasd', 'well documented', 8, 'YES', '<p>asdasdasdasd</p>\r\n', '2017-08-17 22:32:44', 10, 'asdasdasdasd', 'asdasdasdasd', 6, 0, 'asdasdasdasd', 'ULOADED', 1, 1, 2, 1, 3);

-- --------------------------------------------------------

--
-- Table structure for table `digital_item_add_to_cart`
--

CREATE TABLE `digital_item_add_to_cart` (
  `id` int(11) NOT NULL,
  `created` datetime DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `digital_item_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `digital_item_add_to_cart`
--

INSERT INTO `digital_item_add_to_cart` (`id`, `created`, `status`, `digital_item_id`, `user_id`) VALUES
(52, '2017-08-12 23:14:48', 'Active', 13, 5),
(53, '2017-08-17 22:33:09', 'Active', 20, 4);

-- --------------------------------------------------------

--
-- Table structure for table `digital_item_collections`
--

CREATE TABLE `digital_item_collections` (
  `id` int(11) NOT NULL,
  `created` datetime DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `digital_item_id` int(11) DEFAULT NULL,
  `users_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `digital_item_collections`
--

INSERT INTO `digital_item_collections` (`id`, `created`, `status`, `digital_item_id`, `users_id`) VALUES
(3, '2017-08-06 21:46:08', 'Active', 5, 4),
(4, '2017-08-12 16:22:47', 'Active', 13, 4);

-- --------------------------------------------------------

--
-- Table structure for table `digital_item_comments`
--

CREATE TABLE `digital_item_comments` (
  `id` int(11) NOT NULL,
  `comment` varchar(255) DEFAULT NULL,
  `created` datetime DEFAULT NULL,
  `modified` datetime DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `digital_item_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `digital_item_comments`
--

INSERT INTO `digital_item_comments` (`id`, `comment`, `created`, `modified`, `status`, `digital_item_id`, `user_id`) VALUES
(9, 'SDFSDF', '2017-08-06 20:49:22', '2017-08-06 20:49:22', '', 12, 4),
(10, 'SFSDF', '2017-08-06 20:49:31', '2017-08-06 20:49:31', '', 1, 4),
(11, 'SOMETHING', '2017-08-06 20:49:49', '2017-08-06 20:49:49', '', 1, 4),
(12, 'saefsdf', '2017-08-06 20:54:11', '2017-08-06 20:54:11', '', 12, 4),
(13, 'sfsdf', '2017-08-06 20:58:10', '2017-08-06 20:58:10', '', 12, 4),
(14, 'sfsdf', '2017-08-06 20:58:21', '2017-08-06 20:58:21', '', 12, 4),
(15, 'sdfdsf', '2017-08-06 21:36:16', '2017-08-06 21:36:16', '', 12, 4),
(16, 'sddsfdsf', '2017-08-06 21:46:19', '2017-08-06 21:46:19', '', 5, 4),
(17, 'adsfsdfs', '2017-08-06 21:46:26', '2017-08-06 21:46:26', '', 5, 4),
(18, 'sdfsdf', '2017-08-12 18:16:25', '2017-08-12 18:16:25', '', 13, 4),
(19, 'sdfsdfsdf', '2017-08-12 18:16:29', '2017-08-12 18:16:29', '', 13, 4),
(20, 'sdfsdfs', '2017-08-12 18:33:59', '2017-08-12 18:33:59', '', 13, 4),
(21, 'something', '2017-08-12 21:30:51', '2017-08-12 21:30:51', '', 13, 5),
(22, 'sdfsf', '2017-08-12 21:44:48', '2017-08-12 21:44:48', '', 13, 5);

-- --------------------------------------------------------

--
-- Table structure for table `digital_item_comment_child`
--

CREATE TABLE `digital_item_comment_child` (
  `id` int(11) NOT NULL,
  `comment` varchar(255) DEFAULT NULL,
  `created` datetime DEFAULT NULL,
  `modified` datetime DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `digital_item_comment_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `digital_item_comment_child`
--

INSERT INTO `digital_item_comment_child` (`id`, `comment`, `created`, `modified`, `status`, `digital_item_comment_id`, `user_id`) VALUES
(9, 'sfsd', '2017-08-06 20:58:32', '2017-08-06 20:58:32', '', 14, 4),
(10, '', '2017-08-06 20:58:48', '2017-08-06 20:58:48', '', 13, 4),
(11, 'sdf', '2017-08-06 21:36:08', '2017-08-06 21:36:08', '', 9, 4),
(12, 'sdf', '2017-08-06 21:36:12', '2017-08-06 21:36:12', '', 9, 5),
(13, 'sdfsfd', '2017-08-06 21:38:33', '2017-08-06 21:38:33', '', 14, 5),
(14, 'sdfsdfsdf', '2017-08-06 21:46:23', '2017-08-06 21:46:23', '', 16, 4),
(15, 'sdsdfsdf', '2017-08-06 21:46:31', '2017-08-06 21:46:31', '', 17, 4),
(16, 'sfsdf', '2017-08-12 18:16:32', '2017-08-12 18:16:32', '', 18, 5),
(17, 'sfsdf', '2017-08-12 18:16:39', '2017-08-12 18:16:39', '', 18, 5),
(18, 'sdfsdf', '2017-08-12 18:16:48', '2017-08-12 18:16:48', '', 19, 5),
(19, 'sdfsdf', '2017-08-12 18:21:51', '2017-08-12 18:21:51', '', 18, 5),
(20, '1111', '2017-08-12 18:21:55', '2017-08-12 18:21:55', '', 18, 5),
(21, 'sdfsdfsf', '2017-08-12 18:38:10', '2017-08-12 18:38:10', '', 20, 5),
(22, 'something', '2017-08-12 21:30:37', '2017-08-12 21:30:37', '', 18, 5),
(23, 'you are wrong', '2017-08-12 21:45:03', '2017-08-12 21:45:03', '', 20, 5);

-- --------------------------------------------------------

--
-- Table structure for table `digital_item_compatable_browsers`
--

CREATE TABLE `digital_item_compatable_browsers` (
  `id` int(11) NOT NULL,
  `browsers` varchar(255) DEFAULT NULL,
  `compatable_browser_id` int(11) DEFAULT NULL,
  `digital_item_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `digital_item_compatable_browsers`
--

INSERT INTO `digital_item_compatable_browsers` (`id`, `browsers`, `compatable_browser_id`, `digital_item_id`) VALUES
(1, 'nothing', 2, 1),
(2, 'nothing', 2, 2),
(3, 'nothing', 2, 3),
(4, 'nothing', 2, 4),
(5, 'nothing', 2, 5),
(6, 'nothing', 2, 2),
(7, 'nothing', 2, 3),
(8, 'nothing', 2, 2),
(9, 'nothing', 1, 6),
(10, 'nothing', 1, 7),
(11, 'nothing', 1, 8),
(12, 'nothing', 1, 9),
(13, 'nothing', 1, 10),
(14, 'nothing', 1, 11),
(15, 'nothing', 2, 11),
(17, 'nothing', 2, 5),
(18, 'nothing', 2, 5),
(40, 'nothing', 2, 1),
(41, 'nothing', 2, 1),
(42, 'nothing', 2, 1),
(43, 'nothing', 2, 1),
(44, 'nothing', 2, 1),
(140, 'nothing', 2, 12),
(142, 'nothing', 1, 13),
(143, 'nothing', 1, 14),
(166, 'nothing', 1, 15),
(194, 'nothing', 1, 16),
(199, 'nothing', 1, 17),
(200, 'nothing', 2, 18),
(202, 'nothing', 2, 19),
(203, 'nothing', 1, 20),
(204, 'nothing', 15, 20);

-- --------------------------------------------------------

--
-- Table structure for table `digital_item_compatibility`
--

CREATE TABLE `digital_item_compatibility` (
  `id` int(11) NOT NULL,
  `compatable_with` varchar(255) DEFAULT NULL,
  `digital_item_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `digital_item_compatible_with`
--

CREATE TABLE `digital_item_compatible_with` (
  `id` int(11) NOT NULL,
  `compatible_with_id` int(11) DEFAULT NULL,
  `digital_item_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `digital_item_compatible_with`
--

INSERT INTO `digital_item_compatible_with` (`id`, `compatible_with_id`, `digital_item_id`) VALUES
(1, 1, 14),
(2, 2, 14),
(17, 1, 15),
(18, 2, 15),
(46, 1, 16),
(51, 2, 17),
(52, 2, 18),
(54, 2, 19),
(55, 2, 20);

-- --------------------------------------------------------

--
-- Table structure for table `digital_item_favorites`
--

CREATE TABLE `digital_item_favorites` (
  `id` int(11) NOT NULL,
  `created` datetime DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `digital_item_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `digital_item_favorites`
--

INSERT INTO `digital_item_favorites` (`id`, `created`, `status`, `digital_item_id`, `user_id`) VALUES
(2, '2017-08-10 19:31:00', 'Active', 1, 4),
(3, '2017-08-12 16:22:45', 'Active', 13, 4);

-- --------------------------------------------------------

--
-- Table structure for table `digital_item_file_included`
--

CREATE TABLE `digital_item_file_included` (
  `id` int(11) NOT NULL,
  `digital_item_id` int(11) DEFAULT NULL,
  `file_included_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `digital_item_file_included`
--

INSERT INTO `digital_item_file_included` (`id`, `digital_item_id`, `file_included_id`) VALUES
(1, 1, 1),
(2, 2, 2),
(3, 3, 2),
(4, 4, 1),
(5, 5, 2),
(6, 2, 2),
(7, 3, 2),
(8, 2, 2),
(9, 6, 2),
(10, 7, 2),
(11, 8, 2),
(13, 10, 2),
(14, 11, 1),
(15, 11, 2),
(18, 5, 2),
(19, 5, 2),
(48, 1, 1),
(49, 1, 1),
(50, 1, 1),
(51, 1, 1),
(52, 1, 1),
(150, 12, 2),
(152, 13, 2),
(153, 14, 1),
(154, 14, 2),
(178, 15, 1),
(179, 15, 2),
(207, 16, 2),
(212, 17, 2),
(213, 18, 2),
(215, 19, 2),
(216, 20, 2),
(217, 20, 13);

-- --------------------------------------------------------

--
-- Table structure for table `digital_item_frameworks`
--

CREATE TABLE `digital_item_frameworks` (
  `id` int(11) NOT NULL,
  `digital_item_id` int(11) DEFAULT NULL,
  `frameworks_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `digital_item_frameworks`
--

INSERT INTO `digital_item_frameworks` (`id`, `digital_item_id`, `frameworks_id`) VALUES
(1, 14, 2),
(13, 15, 1),
(14, 15, 2),
(42, 16, 2),
(47, 17, 1),
(48, 18, 2),
(50, 19, 1),
(51, 20, 2),
(52, 20, 14);

-- --------------------------------------------------------

--
-- Table structure for table `digital_item_purchase`
--

CREATE TABLE `digital_item_purchase` (
  `id` int(11) NOT NULL,
  `created` datetime DEFAULT NULL,
  `is_six_month` varchar(255) DEFAULT NULL,
  `modified` datetime DEFAULT NULL,
  `digital_item_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `digital_item_rating`
--

CREATE TABLE `digital_item_rating` (
  `id` int(11) NOT NULL,
  `rating` float DEFAULT NULL,
  `digital_item_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `digital_item_screens`
--

CREATE TABLE `digital_item_screens` (
  `id` int(11) NOT NULL,
  `digital_item_id` int(11) DEFAULT NULL,
  `screen_path` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `digital_item_software_versions`
--

CREATE TABLE `digital_item_software_versions` (
  `id` int(11) NOT NULL,
  `digital_item_id` int(11) DEFAULT NULL,
  `software_versions_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `digital_item_software_versions`
--

INSERT INTO `digital_item_software_versions` (`id`, `digital_item_id`, `software_versions_id`) VALUES
(1, 1, 2),
(2, 2, 1),
(3, 3, 1),
(4, 4, 2),
(5, 5, 2),
(6, 2, 1),
(7, 3, 1),
(8, 2, 1),
(9, 6, 1),
(10, 7, 2),
(11, 8, 2),
(12, 9, 2),
(13, 10, 2),
(14, 11, 1),
(15, 11, 2),
(17, 5, 2),
(18, 5, 2),
(33, 1, 2),
(34, 1, 2),
(35, 1, 2),
(36, 1, 2),
(37, 1, 2),
(122, 12, 1),
(124, 13, 2),
(125, 14, 1),
(126, 14, 2),
(157, 15, 1),
(158, 15, 2),
(186, 16, 2),
(191, 17, 1),
(192, 18, 1),
(194, 19, 1),
(195, 20, 2);

-- --------------------------------------------------------

--
-- Table structure for table `digital_item_support`
--

CREATE TABLE `digital_item_support` (
  `id` int(11) NOT NULL,
  `status` varchar(255) DEFAULT NULL,
  `digital_item_id` int(11) DEFAULT NULL,
  `support_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `digital_item_tags`
--

CREATE TABLE `digital_item_tags` (
  `id` int(11) NOT NULL,
  `tags_name` varchar(255) DEFAULT NULL,
  `digital_item_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `digital_item_tags`
--

INSERT INTO `digital_item_tags` (`id`, `tags_name`, `digital_item_id`) VALUES
(1, 'something', 1),
(2, 'hello', 2),
(3, 'hello', 3),
(4, 'something', 4),
(5, 'dfdfsfd', 5),
(6, 'so', 5),
(7, 'last', 2),
(8, 'hello', 2),
(9, 'last', 2),
(10, 'hello', 3),
(11, 'hello', 2),
(12, 'last', 2),
(13, 'hello', 2),
(14, 'last', 2),
(15, 'hello', 6),
(16, 'test', 7),
(17, 'vesion', 7),
(18, '2', 7),
(19, 'test', 8),
(20, 'vesion', 8),
(21, '2', 8),
(22, 'test', 9),
(23, 'vesion', 9),
(24, '2', 9),
(25, 'test', 10),
(26, 'vesion', 10),
(27, '2', 10),
(28, 'test', 11),
(29, 'vesion', 11),
(30, '222222222222', 11),
(32, 'dfdfsfd', 5),
(33, 'so', 5),
(34, 'dfdfsfd', 5),
(35, 'so', 5),
(36, 'dfdfsfd', 5),
(37, 'so', 5),
(103, 'something', 1),
(104, 'something', 1),
(105, 'something', 1),
(106, 'something', 1),
(107, 'something', 1),
(108, 'doing', 1),
(109, 'something', 1),
(110, 'doing', 1),
(111, 'no', 1),
(112, 'yes', 1),
(113, 'many', 1),
(257, 'hello', 12),
(258, 'something', 12),
(260, 'something', 13),
(261, 'hello', 14),
(275, 'hellio', 15),
(303, 'tag', 16),
(308, 'tag', 17),
(309, 'tag', 18),
(311, 'tag', 19),
(312, 'tag', 20);

-- --------------------------------------------------------

--
-- Table structure for table `digital_item_versions`
--

CREATE TABLE `digital_item_versions` (
  `id` int(11) NOT NULL,
  `change_log` varchar(255) DEFAULT NULL,
  `created` datetime DEFAULT NULL,
  `modified` datetime DEFAULT NULL,
  `path` varchar(255) DEFAULT NULL,
  `preview_url` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `version_no` varchar(255) DEFAULT NULL,
  `video_url` varchar(255) DEFAULT NULL,
  `digital_item_id` int(11) DEFAULT NULL,
  `product_name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `digital_item_versions`
--

INSERT INTO `digital_item_versions` (`id`, `change_log`, `created`, `modified`, `path`, `preview_url`, `status`, `version_no`, `video_url`, `digital_item_id`, `product_name`) VALUES
(75, '', '2017-08-05 21:13:50', '2017-08-05 21:13:50', '', 'hhhhh', 'YES', '10.1010', '', 12, 'secondsecond.10.1010'),
(82, '', '2017-08-05 21:21:19', '2017-08-05 21:21:19', '', 'www.comm', 'YES', '10.156', '', 12, 'secondsecond.10.156'),
(83, '', '2017-08-05 21:29:12', '2017-08-05 21:29:12', '', 'google.com', 'YES', '5.152', '', 5, 'secondsecond.5.152'),
(84, '', '2017-08-05 21:23:36', '2017-08-05 21:23:36', '', 'www.comm', 'YES', '6.15', '', 12, 'secondsecond.6.15'),
(85, '', '2017-08-05 21:24:53', '2017-08-05 21:24:53', '', 'www.comm', 'YES', '7.150152', '', 12, 'secondsecond.7.150152'),
(86, '', '2017-08-05 21:26:47', '2017-08-05 21:26:47', '', 'www.comm', 'YES', '7.150', '', 12, 'secondsecond.7.150'),
(87, '', '2017-08-05 21:37:46', '2017-08-05 21:37:46', '', 'kkhell=[sdfsd', 'YES', '7.15', '', 12, 'secondsecond.7.15'),
(88, '', '2017-08-05 22:46:24', '2017-08-05 22:46:24', '', 'kkhell=[sdfsd', 'YES', '7', '', 12, 'secondsecond.7'),
(89, '', '2017-08-06 00:17:27', '2017-08-06 00:17:27', '', 'kkhell=[sdfsd', 'YES', '8', '', 12, 'secondsecond.8'),
(90, '', '2017-08-06 00:28:31', '2017-08-06 00:28:31', '', 'kkhell=[sdfsd', 'YES', '10', '', 12, 'secondsecond.10'),
(91, '', '2017-08-07 17:51:21', '2017-08-07 17:51:21', '', 'https://github.com/spring-projects/spring-boot/issues/3315', 'YES', '2.5', '', 13, NULL),
(92, '', '2017-08-13 13:29:59', '2017-08-13 13:29:59', '', 'https://github.com/spring-projects/spring-boot/issues/3315', 'YES', '2.5', '', 13, 'hellohellohello.2.5'),
(93, '', '2017-08-13 17:23:15', '2017-08-13 17:23:15', '', 'https://github.com/spring-projects/spring-boot/issues/3315', 'YES', '2.5', '', 14, NULL),
(94, '', '2017-08-13 21:23:17', '2017-08-13 21:23:17', '', 'https://github.com/spring-projects/spring-boot/issues/3315', 'YES', '2.5', '', 15, NULL),
(95, '', '2017-08-15 01:19:24', '2017-08-15 01:19:24', '', 'https://github.com/spring-projects/spring-boot/issues/3315', 'YES', '2.5', '', 15, 'your-name-must.2.5'),
(96, '', '2017-08-15 14:51:05', '2017-08-15 14:51:05', '', 'https://github.com/spring-projects/spring-boot/issues/3315', 'YES', '2.5', '', 16, NULL),
(97, '', '2017-08-15 15:53:22', '2017-08-15 15:53:22', '', 'https://github.com/spring-projects/spring-boot/issues/3315', 'YES', '2.5', '', 16, 'twenty_one.2.5'),
(98, '', '2017-08-16 02:02:43', '2017-08-16 02:02:43', '', 'https://github.com/spring-projects/spring-boot/issues/3315', 'YES', '2.5', '', 16, 'null.2.5'),
(99, '', '2017-08-17 17:13:57', '2017-08-17 17:13:57', '', 'https://github.com/spring-projects/spring-boot/issues/3315', 'YES', '2.5', '', 17, NULL),
(100, '', '2017-08-17 17:18:55', '2017-08-17 17:18:55', '', 'https://github.com/spring-projects/spring-boot/issues/3315', 'YES', '2.5', '', 17, 'null.2.5'),
(101, '', '2017-08-17 17:20:59', '2017-08-17 17:20:59', '', 'https://github.com/spring-projects/spring-boot/issues/3315', 'YES', '2.5', '', 17, 'lastlast.2.5'),
(102, '', '2017-08-17 17:25:15', '2017-08-17 17:25:15', '', 'https://github.com/spring-projects/spring-boot/issues/3315', 'YES', '2.5', '', 18, NULL),
(103, '', '2017-08-17 17:28:09', '2017-08-17 17:28:09', '', 'https://github.com/spring-projects/spring-boot/issues/3315', 'YES', '2.5', '', 19, NULL),
(104, '', '2017-08-17 19:44:23', '2017-08-17 19:44:23', '', 'https://github.com/spring-projects/spring-boot/issues/3315', 'YES', '2.5', '', 19, 'hellosome.2.5'),
(105, '', '2017-08-17 22:32:44', '2017-08-17 22:32:44', '', 'https://github.com/spring-projects/spring-boot/issues/3315', 'YES', '2.5', '', 20, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `file_included`
--

CREATE TABLE `file_included` (
  `id` int(11) NOT NULL,
  `created` datetime DEFAULT NULL,
  `modified` datetime DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `catagories_id` int(11) DEFAULT NULL,
  `slug` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `file_included`
--

INSERT INTO `file_included` (`id`, `created`, `modified`, `name`, `catagories_id`, `slug`) VALUES
(1, '2017-08-03 00:00:00', '2017-08-03 00:00:00', '.Dex', 1, 'dex'),
(2, '2017-08-03 00:00:00', '2017-08-03 00:00:00', '.java', 1, 'java'),
(13, '2017-08-17 20:06:37', '2017-08-17 20:06:37', 'file_1', 1, 'file_1');

-- --------------------------------------------------------

--
-- Table structure for table `frameworks`
--

CREATE TABLE `frameworks` (
  `id` int(11) NOT NULL,
  `created` datetime DEFAULT NULL,
  `modified` datetime DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `slug` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `catagories_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `frameworks`
--

INSERT INTO `frameworks` (`id`, `created`, `modified`, `name`, `slug`, `status`, `catagories_id`) VALUES
(1, '2017-08-13 00:00:00', '2017-08-13 00:00:00', 'framework_1', 'framework_1', 'ACTIVE', 1),
(2, '2017-08-13 00:00:00', '2017-08-13 00:00:00', 'framework_2', 'framework_2', 'ACTIVE', 1),
(14, '2017-08-17 20:25:50', '2017-08-17 20:25:50', 'ionicFrame', 'ionicframe', NULL, 1);

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(21);

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_unique_key`
--

CREATE TABLE `hibernate_unique_key` (
  `next_hi` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `hibernate_unique_key`
--

INSERT INTO `hibernate_unique_key` (`next_hi`) VALUES
(0);

-- --------------------------------------------------------

--
-- Table structure for table `role`
--

CREATE TABLE `role` (
  `role_id` int(11) NOT NULL,
  `role` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `role`
--

INSERT INTO `role` (`role_id`, `role`) VALUES
(1, 'ADMIN');

-- --------------------------------------------------------

--
-- Table structure for table `software_versions`
--

CREATE TABLE `software_versions` (
  `id` int(11) NOT NULL,
  `category_id` varchar(255) DEFAULT NULL,
  `created` datetime DEFAULT NULL,
  `modified` datetime DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `version` varchar(255) DEFAULT NULL,
  `catagories_id` int(11) DEFAULT NULL,
  `slug` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `software_versions`
--

INSERT INTO `software_versions` (`id`, `category_id`, `created`, `modified`, `status`, `version`, `catagories_id`, `slug`) VALUES
(1, '1', '2017-08-03 00:00:00', '2017-08-03 00:00:00', 'ACTIVE', '2.5', 1, '2_5'),
(2, '1', '2017-08-03 00:00:00', '2017-08-03 00:00:00', 'ACTIVE', '3.5', 1, '3_5');

-- --------------------------------------------------------

--
-- Table structure for table `support`
--

CREATE TABLE `support` (
  `id` int(11) NOT NULL,
  `created` datetime DEFAULT NULL,
  `modified` datetime DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tags`
--

CREATE TABLE `tags` (
  `id` int(11) NOT NULL,
  `created` datetime DEFAULT NULL,
  `modified` datetime DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `slug` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tags`
--

INSERT INTO `tags` (`id`, `created`, `modified`, `name`, `slug`, `status`) VALUES
(20, '2017-08-19 14:33:47', NULL, 'a', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `user_id` int(11) NOT NULL,
  `active` int(11) DEFAULT NULL,
  `email` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `reset_token` varchar(255) DEFAULT NULL,
  `user_name` varchar(255) NOT NULL,
  `user_profile_info_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`user_id`, `active`, `email`, `last_name`, `name`, `password`, `reset_token`, `user_name`, `user_profile_info_id`) VALUES
(4, 1, 'ads@gmail.com', 'qq', 'qqq', '$2a$10$x6UGuOUQsDHbw.9jU1rvrOVPuY5yeJK3wUUZcS6A2obKQMBIeYt1S', NULL, 'qq', 2),
(5, 1, 'mhbappy1235@gmail.com', 'hasan', 'mehedi', '$2a$10$lRhqMBTVhC1F6oukcFene.Yf5mSLJO/X2gFfsxNTk7w6ffjzayUFO', NULL, 'mhbappy', 3),
(6, 1, 'mhbappy45@gmail.com', 'ha', 'me', '$2a$10$fzXQQqrBLea34V892Dlk3.4wHhi7NC3KB6UEF/338r.L.2xf6ZfaS', NULL, 'mhbappy18', 4),
(7, 1, 'mhbappy1q2345@gmail.com', 'mj', 'mh', '$2a$10$jvoGQohYYyI3YQtXKQPk5uPnEegzP/4jf3cVESL0s7woZipMZsaOG', NULL, 'mh18', 5),
(8, 1, 'mhbappy123454@gmail.com', 'jjj', 'jjj', '$2a$10$MRk/lRYksGbkEvBQJbEJq.Xm8IUFxihKHbtXRboIcorFJptQ75fBq', NULL, 'jjj', 6),
(9, 1, 'mhbappy121345@gmail.com', 'hh', 'hh', '$2a$10$fuW05cvkMkSS55nlb0jPrOXq0hSnXphX2sIanAD7fxVa20BUJ1Kmu', NULL, 'hh', 7),
(10, 1, 'mhbappy123d45@gmail.com', 'mm', 'mm', '$2a$10$qyWZjbtyxjXk.phzJDYLFu0MwvlhWx5FQdLMmotwZIuyehOk7gZMy', NULL, 'mmm', 8),
(11, 1, 'mhbappy12345@gmail.com', 'Hasan', 'Mehedi', '$2a$10$f/1ODY3e6OvOz93XT4R7pOsg7CP043vYFI.mS8f0aTGBJEYKvjPP6', NULL, 'kkk', 9);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `data` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `user_activity`
--

CREATE TABLE `user_activity` (
  `id` int(11) NOT NULL,
  `follower_name` varchar(255) DEFAULT NULL,
  `following_name` varchar(255) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `user_badges`
--

CREATE TABLE `user_badges` (
  `id` int(11) NOT NULL,
  `created` datetime DEFAULT NULL,
  `modified` datetime DEFAULT NULL,
  `badges_id` int(11) DEFAULT NULL,
  `user_profile_info_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_badges`
--

INSERT INTO `user_badges` (`id`, `created`, `modified`, `badges_id`, `user_profile_info_id`) VALUES
(1, '2017-08-03 12:50:28', '2017-08-03 12:50:28', 1, 1),
(2, '2017-08-03 12:54:43', '2017-08-03 12:54:43', 1, 2),
(3, '2017-08-03 17:01:56', '2017-08-03 17:01:56', 1, 3),
(4, '2017-08-03 20:45:20', '2017-08-03 20:45:20', 1, 4),
(5, '2017-08-03 21:49:43', '2017-08-03 21:49:43', 1, 5),
(6, '2017-08-03 21:58:48', '2017-08-03 21:58:48', 1, 6),
(7, '2017-08-03 22:01:38', '2017-08-03 22:01:38', 1, 7),
(8, '2017-08-03 22:04:32', '2017-08-03 22:04:32', 1, 8),
(9, '2017-08-03 22:10:49', '2017-08-03 22:10:49', 1, 9);

-- --------------------------------------------------------

--
-- Table structure for table `user_digital_item_sales`
--

CREATE TABLE `user_digital_item_sales` (
  `id` int(11) NOT NULL,
  `digital_item_id` int(11) DEFAULT NULL,
  `user_profile_info_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `user_email_settings`
--

CREATE TABLE `user_email_settings` (
  `id` int(11) NOT NULL,
  `buyer_review_notification_status` bit(1) NOT NULL,
  `expire_support_notification_status` bit(1) NOT NULL,
  `item_comment_notification_status` bit(1) NOT NULL,
  `rating_reminder_status` bit(1) NOT NULL,
  `user_profile_info_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_email_settings`
--

INSERT INTO `user_email_settings` (`id`, `buyer_review_notification_status`, `expire_support_notification_status`, `item_comment_notification_status`, `rating_reminder_status`, `user_profile_info_id`) VALUES
(1, b'0', b'0', b'0', b'0', 1),
(2, b'0', b'0', b'0', b'0', 2),
(3, b'0', b'0', b'0', b'0', 3),
(4, b'0', b'0', b'0', b'0', 4),
(5, b'0', b'0', b'0', b'0', 5),
(6, b'0', b'0', b'0', b'0', 6),
(7, b'0', b'0', b'0', b'0', 7),
(8, b'0', b'0', b'0', b'0', 8),
(9, b'0', b'0', b'0', b'0', 9);

-- --------------------------------------------------------

--
-- Table structure for table `user_follower`
--

CREATE TABLE `user_follower` (
  `id` int(11) NOT NULL,
  `created` datetime DEFAULT NULL,
  `modified` datetime DEFAULT NULL,
  `user_profile_info_id` int(11) DEFAULT NULL,
  `user_follower_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_follower`
--

INSERT INTO `user_follower` (`id`, `created`, `modified`, `user_profile_info_id`, `user_follower_id`) VALUES
(13, '2017-08-10 18:12:49', '2017-08-10 18:12:49', 4, 2),
(15, '2017-08-12 22:05:16', '2017-08-12 22:05:16', 2, 3);

-- --------------------------------------------------------

--
-- Table structure for table `user_following`
--

CREATE TABLE `user_following` (
  `id` int(11) NOT NULL,
  `created` datetime DEFAULT NULL,
  `modified` datetime DEFAULT NULL,
  `user_profile_info_id` int(11) DEFAULT NULL,
  `user_following_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_following`
--

INSERT INTO `user_following` (`id`, `created`, `modified`, `user_profile_info_id`, `user_following_id`) VALUES
(13, '2017-08-10 18:12:49', '2017-08-10 18:12:49', 2, 4),
(15, '2017-08-12 22:05:16', '2017-08-12 22:05:16', 3, 2);

-- --------------------------------------------------------

--
-- Table structure for table `user_profile_info`
--

CREATE TABLE `user_profile_info` (
  `id` int(11) NOT NULL,
  `address_one` varchar(50) DEFAULT NULL,
  `address_two` varchar(50) DEFAULT NULL,
  `avatar_path` varchar(100) DEFAULT NULL,
  `city` varchar(30) DEFAULT NULL,
  `company_name` varchar(50) DEFAULT NULL,
  `country` varchar(30) DEFAULT NULL,
  `created` datetime DEFAULT NULL,
  `modified` datetime DEFAULT NULL,
  `phone_number` varchar(20) DEFAULT NULL,
  `state` int(11) DEFAULT NULL,
  `user_name` varchar(20) DEFAULT NULL,
  `zip` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_profile_info`
--

INSERT INTO `user_profile_info` (`id`, `address_one`, `address_two`, `avatar_path`, `city`, `company_name`, `country`, `created`, `modified`, `phone_number`, `state`, `user_name`, `zip`) VALUES
(1, '', '', '', '', '', '', '2017-08-03 12:50:28', '2017-08-03 12:50:28', '', 0, '', 0),
(2, '', '', '', '', '', 'Bangladesh', '2017-08-12 21:26:47', '2017-08-12 21:26:47', '', 0, 'qq', 0),
(3, '', '', '', '', '', '', '2017-08-12 21:30:12', '2017-08-12 21:30:12', '', 0, 'mhbappy', 0),
(4, '', '', '', '', '', '', '2017-08-03 20:45:20', '2017-08-03 20:45:20', '', 0, 'mhbappy18', 0),
(5, '', '', '', '', '', '', '2017-08-03 21:49:42', '2017-08-03 21:49:42', '', 0, '', 0),
(6, '', '', '', '', '', '', '2017-08-03 21:58:47', '2017-08-03 21:58:47', '', 0, '', 0),
(7, '', '', '', '', '', '', '2017-08-03 22:01:37', '2017-08-03 22:01:37', '', 0, '', 0),
(8, '', '', '', '', '', '', '2017-08-03 22:04:31', '2017-08-03 22:04:31', '', 0, '', 0),
(9, '2B/8, Pallabi, Mirpur, Dhaka-1216', '2B/8, Pallabi, Mirpur, Dhaka-1216', NULL, 'Dhaka', 'shadowhite Ltd.', 'Bangladesh', '2017-08-03 22:34:00', '2017-08-03 22:34:00', '1718812839', 12, 'kkk', 1214);

-- --------------------------------------------------------

--
-- Table structure for table `user_role`
--

CREATE TABLE `user_role` (
  `user_id` int(11) NOT NULL,
  `role_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user_role`
--

INSERT INTO `user_role` (`user_id`, `role_id`) VALUES
(4, 1),
(5, 1),
(6, 1),
(7, 1),
(8, 1),
(9, 1),
(10, 1),
(11, 1);

-- --------------------------------------------------------

--
-- Table structure for table `user_social_network`
--

CREATE TABLE `user_social_network` (
  `id` int(11) NOT NULL,
  `created` datetime DEFAULT NULL,
  `modified` datetime DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `user_profile_info_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_social_network`
--

INSERT INTO `user_social_network` (`id`, `created`, `modified`, `type`, `url`, `user_profile_info_id`) VALUES
(1, '2017-08-03 12:50:28', '2017-08-03 12:50:28', 'Facebook', '', 1),
(2, '2017-08-03 12:50:28', '2017-08-03 12:50:28', 'Linkedin', '', 1),
(3, '2017-08-03 12:50:28', '2017-08-03 12:50:28', 'Github', '', 1),
(4, '2017-08-03 12:50:28', '2017-08-03 12:50:28', 'Google Plus', '', 1),
(5, '2017-08-03 14:06:13', '2017-08-03 14:06:13', 'Facebook', 'facebook.com', 2),
(6, '2017-08-03 14:06:13', '2017-08-03 14:06:13', 'Linkedin', '', 2),
(7, '2017-08-03 14:06:13', '2017-08-03 14:06:13', 'Github', '', 2),
(8, '2017-08-03 14:06:13', '2017-08-03 14:06:13', 'Google Plus', '', 2),
(9, '2017-08-03 17:01:55', '2017-08-03 17:01:55', 'Facebook', '', 3),
(10, '2017-08-03 17:01:55', '2017-08-03 17:01:55', 'Linkedin', '', 3),
(11, '2017-08-03 17:01:55', '2017-08-03 17:01:55', 'Github', '', 3),
(12, '2017-08-03 17:01:55', '2017-08-03 17:01:55', 'Google Plus', '', 3),
(13, '2017-08-03 20:45:20', '2017-08-03 20:45:20', 'Facebook', '', 4),
(14, '2017-08-03 20:45:20', '2017-08-03 20:45:20', 'Linkedin', '', 4),
(15, '2017-08-03 20:45:20', '2017-08-03 20:45:20', 'Github', '', 4),
(16, '2017-08-03 20:45:20', '2017-08-03 20:45:20', 'Google Plus', '', 4),
(17, '2017-08-03 21:49:42', '2017-08-03 21:49:42', 'Facebook', '', 5),
(18, '2017-08-03 21:49:42', '2017-08-03 21:49:42', 'Linkedin', '', 5),
(19, '2017-08-03 21:49:43', '2017-08-03 21:49:43', 'Github', '', 5),
(20, '2017-08-03 21:49:43', '2017-08-03 21:49:43', 'Google Plus', '', 5),
(21, '2017-08-03 21:58:47', '2017-08-03 21:58:47', 'Facebook', '', 6),
(22, '2017-08-03 21:58:47', '2017-08-03 21:58:47', 'Linkedin', '', 6),
(23, '2017-08-03 21:58:47', '2017-08-03 21:58:47', 'Github', '', 6),
(24, '2017-08-03 21:58:47', '2017-08-03 21:58:47', 'Google Plus', '', 6),
(25, '2017-08-03 22:01:37', '2017-08-03 22:01:37', 'Facebook', '', 7),
(26, '2017-08-03 22:01:37', '2017-08-03 22:01:37', 'Linkedin', '', 7),
(27, '2017-08-03 22:01:37', '2017-08-03 22:01:37', 'Github', '', 7),
(28, '2017-08-03 22:01:38', '2017-08-03 22:01:38', 'Google Plus', '', 7),
(29, '2017-08-03 22:04:31', '2017-08-03 22:04:31', 'Facebook', '', 8),
(30, '2017-08-03 22:04:31', '2017-08-03 22:04:31', 'Linkedin', '', 8),
(31, '2017-08-03 22:04:31', '2017-08-03 22:04:31', 'Github', '', 8),
(32, '2017-08-03 22:04:31', '2017-08-03 22:04:31', 'Google Plus', '', 8),
(33, '2017-08-03 22:10:49', '2017-08-03 22:10:49', 'Facebook', '', 9),
(34, '2017-08-03 22:10:49', '2017-08-03 22:10:49', 'Linkedin', '', 9),
(35, '2017-08-03 22:10:49', '2017-08-03 22:10:49', 'Github', '', 9),
(36, '2017-08-03 22:10:49', '2017-08-03 22:10:49', 'Google Plus', '', 9);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `badges`
--
ALTER TABLE `badges`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `catagories`
--
ALTER TABLE `catagories`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `compatable_browsers`
--
ALTER TABLE `compatable_browsers`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKoji4gqehirtnao9gn8jg7huif` (`catagories_id`);

--
-- Indexes for table `compatible_with`
--
ALTER TABLE `compatible_with`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKk4gyuxm1pu9k41bi08277lu1` (`catagories_id`);

--
-- Indexes for table `digital_items`
--
ALTER TABLE `digital_items`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKj64dvc51nap6fbr7kvsku7ar8` (`frame_work_id`),
  ADD KEY `FKfectf7qbg3wfm14or4marinc1` (`softwateversion_id`),
  ADD KEY `FKseosv7f0idgn80sydims2sdsf` (`user_profile_info_id`),
  ADD KEY `FKl6cakwpgmygrb6m7beof5cvwo` (`catagories_id`),
  ADD KEY `FKbi8llqga5jl2f9ya5jjmisp6w` (`catagories_child_id`);

--
-- Indexes for table `digital_item_add_to_cart`
--
ALTER TABLE `digital_item_add_to_cart`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKacbmvy9dfmb6i307g21s7v1y8` (`digital_item_id`),
  ADD KEY `FKsrlri8utunb2rhor0xbuy2ib` (`user_id`);

--
-- Indexes for table `digital_item_collections`
--
ALTER TABLE `digital_item_collections`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK4k3ql5te2spjpg5lwl43yo38c` (`digital_item_id`),
  ADD KEY `FKbqdvmrvlmkumi3i5svw2pj7kq` (`users_id`);

--
-- Indexes for table `digital_item_comments`
--
ALTER TABLE `digital_item_comments`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKhjlimurqvhchxd17d8oy8r13t` (`digital_item_id`),
  ADD KEY `FKgj5kuq0v921w5c39g93cvv0ju` (`user_id`);

--
-- Indexes for table `digital_item_comment_child`
--
ALTER TABLE `digital_item_comment_child`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK3h1t7gfih8cyt8etfxqee59ld` (`digital_item_comment_id`),
  ADD KEY `FK6rju5t6ywlk19nn0uycyg1y9l` (`user_id`);

--
-- Indexes for table `digital_item_compatable_browsers`
--
ALTER TABLE `digital_item_compatable_browsers`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKb3i6c0iwvhsgr0pmljk6jjlyr` (`compatable_browser_id`),
  ADD KEY `FKdnkj5fcri9kkuvf6dxypgk72x` (`digital_item_id`);

--
-- Indexes for table `digital_item_compatibility`
--
ALTER TABLE `digital_item_compatibility`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKl34w3e80jsrec5a5t9bhuk81v` (`digital_item_id`);

--
-- Indexes for table `digital_item_compatible_with`
--
ALTER TABLE `digital_item_compatible_with`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKtrjkbqogxntvw0mfivwtthaas` (`compatible_with_id`),
  ADD KEY `FKf019f8pm210v74u9ej8f606sa` (`digital_item_id`);

--
-- Indexes for table `digital_item_favorites`
--
ALTER TABLE `digital_item_favorites`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK5vg2ukjwrdh629pcqa2ej7xvj` (`digital_item_id`),
  ADD KEY `FKbkxalot6okp68yg9xeqrlus0h` (`user_id`);

--
-- Indexes for table `digital_item_file_included`
--
ALTER TABLE `digital_item_file_included`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKr30roytce1aqwbblbsxqeqehy` (`digital_item_id`),
  ADD KEY `FKsh6y970cv5vfnbjsvjwpt5rnu` (`file_included_id`);

--
-- Indexes for table `digital_item_frameworks`
--
ALTER TABLE `digital_item_frameworks`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKdjoulm3hhhyy76p5d10o7p7lk` (`digital_item_id`),
  ADD KEY `FKr6arcv5hot1jctgglxp0yabhi` (`frameworks_id`);

--
-- Indexes for table `digital_item_purchase`
--
ALTER TABLE `digital_item_purchase`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKs9drnq15ysplg5n88fe0ksi89` (`digital_item_id`),
  ADD KEY `FKso1dnblc9qtm1b7pytuaux5x1` (`user_id`);

--
-- Indexes for table `digital_item_rating`
--
ALTER TABLE `digital_item_rating`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKdta3fe88adcgxi7eurte4rb6j` (`digital_item_id`);

--
-- Indexes for table `digital_item_screens`
--
ALTER TABLE `digital_item_screens`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `digital_item_software_versions`
--
ALTER TABLE `digital_item_software_versions`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKtrorn2m45pyljhdua0cevpg33` (`digital_item_id`),
  ADD KEY `FKlu9l9h8a7n3rh5u0elo6d9wsj` (`software_versions_id`);

--
-- Indexes for table `digital_item_support`
--
ALTER TABLE `digital_item_support`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK2aouyfuva5c83vdm0b5r6yxbc` (`digital_item_id`),
  ADD KEY `FK106s4ub8jonnv49wttems36f1` (`support_id`);

--
-- Indexes for table `digital_item_tags`
--
ALTER TABLE `digital_item_tags`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK2uuof9m2kmk9a2utt8mh2yw34` (`digital_item_id`);

--
-- Indexes for table `digital_item_versions`
--
ALTER TABLE `digital_item_versions`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK7qi236e2bjqt81gx7ft34p68c` (`digital_item_id`);

--
-- Indexes for table `file_included`
--
ALTER TABLE `file_included`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKegxtv03d2j2ljlli6mes0rlmo` (`catagories_id`);

--
-- Indexes for table `frameworks`
--
ALTER TABLE `frameworks`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKma06f0a0rbt7t0b1l5d01qqs0` (`catagories_id`);

--
-- Indexes for table `role`
--
ALTER TABLE `role`
  ADD PRIMARY KEY (`role_id`);

--
-- Indexes for table `software_versions`
--
ALTER TABLE `software_versions`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKb88uymfgs99qd375lvekm7da3` (`catagories_id`);

--
-- Indexes for table `support`
--
ALTER TABLE `support`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tags`
--
ALTER TABLE `tags`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`user_id`),
  ADD KEY `FK7094kofp4shjkx4oahp9lg0sk` (`user_profile_info_id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user_activity`
--
ALTER TABLE `user_activity`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user_badges`
--
ALTER TABLE `user_badges`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK337cc9ux9pqlb991y6w43to3j` (`badges_id`),
  ADD KEY `FKmbt3vu5e85gqq611fnknl0xt8` (`user_profile_info_id`);

--
-- Indexes for table `user_digital_item_sales`
--
ALTER TABLE `user_digital_item_sales`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK20fisp9wlcp5kfuks253yv0dg` (`digital_item_id`),
  ADD KEY `FKd2nc55wj1k5qsg690fwakgmcg` (`user_profile_info_id`);

--
-- Indexes for table `user_email_settings`
--
ALTER TABLE `user_email_settings`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKtmucjjgdi7a7cjl8u3ed326rq` (`user_profile_info_id`);

--
-- Indexes for table `user_follower`
--
ALTER TABLE `user_follower`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKlcobpjhjdoiw1udw47fsfta54` (`user_profile_info_id`),
  ADD KEY `FKgtok41oduogm7pna3sbaxki1o` (`user_follower_id`);

--
-- Indexes for table `user_following`
--
ALTER TABLE `user_following`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKor0bee64yo4dr5ilpn8efnd5v` (`user_profile_info_id`),
  ADD KEY `FKnqn6x4jxe3mnpp561x5kjrahp` (`user_following_id`);

--
-- Indexes for table `user_profile_info`
--
ALTER TABLE `user_profile_info`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user_role`
--
ALTER TABLE `user_role`
  ADD PRIMARY KEY (`user_id`,`role_id`),
  ADD KEY `FKa68196081fvovjhkek5m97n3y` (`role_id`);

--
-- Indexes for table `user_social_network`
--
ALTER TABLE `user_social_network`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK7myq61k8e8dobbqipcriq8c55` (`user_profile_info_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `badges`
--
ALTER TABLE `badges`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `catagories`
--
ALTER TABLE `catagories`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT for table `compatable_browsers`
--
ALTER TABLE `compatable_browsers`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
--
-- AUTO_INCREMENT for table `compatible_with`
--
ALTER TABLE `compatible_with`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
--
-- AUTO_INCREMENT for table `digital_items`
--
ALTER TABLE `digital_items`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;
--
-- AUTO_INCREMENT for table `digital_item_add_to_cart`
--
ALTER TABLE `digital_item_add_to_cart`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=54;
--
-- AUTO_INCREMENT for table `digital_item_collections`
--
ALTER TABLE `digital_item_collections`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `digital_item_comments`
--
ALTER TABLE `digital_item_comments`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;
--
-- AUTO_INCREMENT for table `digital_item_comment_child`
--
ALTER TABLE `digital_item_comment_child`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;
--
-- AUTO_INCREMENT for table `digital_item_compatable_browsers`
--
ALTER TABLE `digital_item_compatable_browsers`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=205;
--
-- AUTO_INCREMENT for table `digital_item_compatibility`
--
ALTER TABLE `digital_item_compatibility`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `digital_item_compatible_with`
--
ALTER TABLE `digital_item_compatible_with`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=56;
--
-- AUTO_INCREMENT for table `digital_item_favorites`
--
ALTER TABLE `digital_item_favorites`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `digital_item_file_included`
--
ALTER TABLE `digital_item_file_included`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=218;
--
-- AUTO_INCREMENT for table `digital_item_frameworks`
--
ALTER TABLE `digital_item_frameworks`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=53;
--
-- AUTO_INCREMENT for table `digital_item_purchase`
--
ALTER TABLE `digital_item_purchase`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `digital_item_rating`
--
ALTER TABLE `digital_item_rating`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `digital_item_screens`
--
ALTER TABLE `digital_item_screens`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `digital_item_software_versions`
--
ALTER TABLE `digital_item_software_versions`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=196;
--
-- AUTO_INCREMENT for table `digital_item_support`
--
ALTER TABLE `digital_item_support`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `digital_item_tags`
--
ALTER TABLE `digital_item_tags`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=313;
--
-- AUTO_INCREMENT for table `digital_item_versions`
--
ALTER TABLE `digital_item_versions`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=106;
--
-- AUTO_INCREMENT for table `file_included`
--
ALTER TABLE `file_included`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
--
-- AUTO_INCREMENT for table `frameworks`
--
ALTER TABLE `frameworks`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
--
-- AUTO_INCREMENT for table `role`
--
ALTER TABLE `role`
  MODIFY `role_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `software_versions`
--
ALTER TABLE `software_versions`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;
--
-- AUTO_INCREMENT for table `support`
--
ALTER TABLE `support`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tags`
--
ALTER TABLE `tags`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;
--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `user_activity`
--
ALTER TABLE `user_activity`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `user_badges`
--
ALTER TABLE `user_badges`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT for table `user_digital_item_sales`
--
ALTER TABLE `user_digital_item_sales`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `user_email_settings`
--
ALTER TABLE `user_email_settings`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT for table `user_follower`
--
ALTER TABLE `user_follower`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
--
-- AUTO_INCREMENT for table `user_following`
--
ALTER TABLE `user_following`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
--
-- AUTO_INCREMENT for table `user_profile_info`
--
ALTER TABLE `user_profile_info`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT for table `user_social_network`
--
ALTER TABLE `user_social_network`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=37;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `compatable_browsers`
--
ALTER TABLE `compatable_browsers`
  ADD CONSTRAINT `FKoji4gqehirtnao9gn8jg7huif` FOREIGN KEY (`catagories_id`) REFERENCES `catagories` (`id`);

--
-- Constraints for table `compatible_with`
--
ALTER TABLE `compatible_with`
  ADD CONSTRAINT `FKk4gyuxm1pu9k41bi08277lu1` FOREIGN KEY (`catagories_id`) REFERENCES `catagories` (`id`);

--
-- Constraints for table `digital_items`
--
ALTER TABLE `digital_items`
  ADD CONSTRAINT `FKbi8llqga5jl2f9ya5jjmisp6w` FOREIGN KEY (`catagories_child_id`) REFERENCES `catagories` (`id`),
  ADD CONSTRAINT `FKfectf7qbg3wfm14or4marinc1` FOREIGN KEY (`softwateversion_id`) REFERENCES `software_versions` (`id`),
  ADD CONSTRAINT `FKj64dvc51nap6fbr7kvsku7ar8` FOREIGN KEY (`frame_work_id`) REFERENCES `frameworks` (`id`),
  ADD CONSTRAINT `FKl6cakwpgmygrb6m7beof5cvwo` FOREIGN KEY (`catagories_id`) REFERENCES `catagories` (`id`),
  ADD CONSTRAINT `FKseosv7f0idgn80sydims2sdsf` FOREIGN KEY (`user_profile_info_id`) REFERENCES `user_profile_info` (`id`);

--
-- Constraints for table `digital_item_add_to_cart`
--
ALTER TABLE `digital_item_add_to_cart`
  ADD CONSTRAINT `FKacbmvy9dfmb6i307g21s7v1y8` FOREIGN KEY (`digital_item_id`) REFERENCES `digital_items` (`id`),
  ADD CONSTRAINT `FKsrlri8utunb2rhor0xbuy2ib` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`);

--
-- Constraints for table `digital_item_collections`
--
ALTER TABLE `digital_item_collections`
  ADD CONSTRAINT `FK4k3ql5te2spjpg5lwl43yo38c` FOREIGN KEY (`digital_item_id`) REFERENCES `digital_items` (`id`),
  ADD CONSTRAINT `FKbqdvmrvlmkumi3i5svw2pj7kq` FOREIGN KEY (`users_id`) REFERENCES `user` (`user_id`);

--
-- Constraints for table `digital_item_comments`
--
ALTER TABLE `digital_item_comments`
  ADD CONSTRAINT `FKgj5kuq0v921w5c39g93cvv0ju` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`),
  ADD CONSTRAINT `FKhjlimurqvhchxd17d8oy8r13t` FOREIGN KEY (`digital_item_id`) REFERENCES `digital_items` (`id`);

--
-- Constraints for table `digital_item_comment_child`
--
ALTER TABLE `digital_item_comment_child`
  ADD CONSTRAINT `FK3h1t7gfih8cyt8etfxqee59ld` FOREIGN KEY (`digital_item_comment_id`) REFERENCES `digital_item_comments` (`id`),
  ADD CONSTRAINT `FK6rju5t6ywlk19nn0uycyg1y9l` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`);

--
-- Constraints for table `digital_item_compatable_browsers`
--
ALTER TABLE `digital_item_compatable_browsers`
  ADD CONSTRAINT `FKb3i6c0iwvhsgr0pmljk6jjlyr` FOREIGN KEY (`compatable_browser_id`) REFERENCES `compatable_browsers` (`id`),
  ADD CONSTRAINT `FKdnkj5fcri9kkuvf6dxypgk72x` FOREIGN KEY (`digital_item_id`) REFERENCES `digital_items` (`id`);

--
-- Constraints for table `digital_item_compatibility`
--
ALTER TABLE `digital_item_compatibility`
  ADD CONSTRAINT `FKl34w3e80jsrec5a5t9bhuk81v` FOREIGN KEY (`digital_item_id`) REFERENCES `digital_items` (`id`);

--
-- Constraints for table `digital_item_compatible_with`
--
ALTER TABLE `digital_item_compatible_with`
  ADD CONSTRAINT `FKf019f8pm210v74u9ej8f606sa` FOREIGN KEY (`digital_item_id`) REFERENCES `digital_items` (`id`),
  ADD CONSTRAINT `FKtrjkbqogxntvw0mfivwtthaas` FOREIGN KEY (`compatible_with_id`) REFERENCES `compatible_with` (`id`);

--
-- Constraints for table `digital_item_favorites`
--
ALTER TABLE `digital_item_favorites`
  ADD CONSTRAINT `FK5vg2ukjwrdh629pcqa2ej7xvj` FOREIGN KEY (`digital_item_id`) REFERENCES `digital_items` (`id`),
  ADD CONSTRAINT `FKbkxalot6okp68yg9xeqrlus0h` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`);

--
-- Constraints for table `digital_item_file_included`
--
ALTER TABLE `digital_item_file_included`
  ADD CONSTRAINT `FKr30roytce1aqwbblbsxqeqehy` FOREIGN KEY (`digital_item_id`) REFERENCES `digital_items` (`id`),
  ADD CONSTRAINT `FKsh6y970cv5vfnbjsvjwpt5rnu` FOREIGN KEY (`file_included_id`) REFERENCES `file_included` (`id`);

--
-- Constraints for table `digital_item_frameworks`
--
ALTER TABLE `digital_item_frameworks`
  ADD CONSTRAINT `FKdjoulm3hhhyy76p5d10o7p7lk` FOREIGN KEY (`digital_item_id`) REFERENCES `digital_items` (`id`),
  ADD CONSTRAINT `FKr6arcv5hot1jctgglxp0yabhi` FOREIGN KEY (`frameworks_id`) REFERENCES `frameworks` (`id`);

--
-- Constraints for table `digital_item_purchase`
--
ALTER TABLE `digital_item_purchase`
  ADD CONSTRAINT `FKs9drnq15ysplg5n88fe0ksi89` FOREIGN KEY (`digital_item_id`) REFERENCES `digital_items` (`id`),
  ADD CONSTRAINT `FKso1dnblc9qtm1b7pytuaux5x1` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`);

--
-- Constraints for table `digital_item_rating`
--
ALTER TABLE `digital_item_rating`
  ADD CONSTRAINT `FKdta3fe88adcgxi7eurte4rb6j` FOREIGN KEY (`digital_item_id`) REFERENCES `digital_items` (`id`);

--
-- Constraints for table `digital_item_software_versions`
--
ALTER TABLE `digital_item_software_versions`
  ADD CONSTRAINT `FKlu9l9h8a7n3rh5u0elo6d9wsj` FOREIGN KEY (`software_versions_id`) REFERENCES `software_versions` (`id`),
  ADD CONSTRAINT `FKtrorn2m45pyljhdua0cevpg33` FOREIGN KEY (`digital_item_id`) REFERENCES `digital_items` (`id`);

--
-- Constraints for table `digital_item_support`
--
ALTER TABLE `digital_item_support`
  ADD CONSTRAINT `FK106s4ub8jonnv49wttems36f1` FOREIGN KEY (`support_id`) REFERENCES `support` (`id`),
  ADD CONSTRAINT `FK2aouyfuva5c83vdm0b5r6yxbc` FOREIGN KEY (`digital_item_id`) REFERENCES `digital_items` (`id`);

--
-- Constraints for table `digital_item_tags`
--
ALTER TABLE `digital_item_tags`
  ADD CONSTRAINT `FK2uuof9m2kmk9a2utt8mh2yw34` FOREIGN KEY (`digital_item_id`) REFERENCES `digital_items` (`id`);

--
-- Constraints for table `digital_item_versions`
--
ALTER TABLE `digital_item_versions`
  ADD CONSTRAINT `FK7qi236e2bjqt81gx7ft34p68c` FOREIGN KEY (`digital_item_id`) REFERENCES `digital_items` (`id`);

--
-- Constraints for table `file_included`
--
ALTER TABLE `file_included`
  ADD CONSTRAINT `FKegxtv03d2j2ljlli6mes0rlmo` FOREIGN KEY (`catagories_id`) REFERENCES `catagories` (`id`);

--
-- Constraints for table `frameworks`
--
ALTER TABLE `frameworks`
  ADD CONSTRAINT `FKma06f0a0rbt7t0b1l5d01qqs0` FOREIGN KEY (`catagories_id`) REFERENCES `catagories` (`id`);

--
-- Constraints for table `software_versions`
--
ALTER TABLE `software_versions`
  ADD CONSTRAINT `FKb88uymfgs99qd375lvekm7da3` FOREIGN KEY (`catagories_id`) REFERENCES `catagories` (`id`);

--
-- Constraints for table `user`
--
ALTER TABLE `user`
  ADD CONSTRAINT `FK7094kofp4shjkx4oahp9lg0sk` FOREIGN KEY (`user_profile_info_id`) REFERENCES `user_profile_info` (`id`);

--
-- Constraints for table `user_badges`
--
ALTER TABLE `user_badges`
  ADD CONSTRAINT `FK337cc9ux9pqlb991y6w43to3j` FOREIGN KEY (`badges_id`) REFERENCES `badges` (`id`),
  ADD CONSTRAINT `FKmbt3vu5e85gqq611fnknl0xt8` FOREIGN KEY (`user_profile_info_id`) REFERENCES `user_profile_info` (`id`);

--
-- Constraints for table `user_digital_item_sales`
--
ALTER TABLE `user_digital_item_sales`
  ADD CONSTRAINT `FK20fisp9wlcp5kfuks253yv0dg` FOREIGN KEY (`digital_item_id`) REFERENCES `digital_items` (`id`),
  ADD CONSTRAINT `FKd2nc55wj1k5qsg690fwakgmcg` FOREIGN KEY (`user_profile_info_id`) REFERENCES `user_profile_info` (`id`);

--
-- Constraints for table `user_email_settings`
--
ALTER TABLE `user_email_settings`
  ADD CONSTRAINT `FKtmucjjgdi7a7cjl8u3ed326rq` FOREIGN KEY (`user_profile_info_id`) REFERENCES `user_profile_info` (`id`);

--
-- Constraints for table `user_follower`
--
ALTER TABLE `user_follower`
  ADD CONSTRAINT `FKgtok41oduogm7pna3sbaxki1o` FOREIGN KEY (`user_follower_id`) REFERENCES `user_profile_info` (`id`),
  ADD CONSTRAINT `FKlcobpjhjdoiw1udw47fsfta54` FOREIGN KEY (`user_profile_info_id`) REFERENCES `user_profile_info` (`id`);

--
-- Constraints for table `user_following`
--
ALTER TABLE `user_following`
  ADD CONSTRAINT `FKnqn6x4jxe3mnpp561x5kjrahp` FOREIGN KEY (`user_following_id`) REFERENCES `user_profile_info` (`id`),
  ADD CONSTRAINT `FKor0bee64yo4dr5ilpn8efnd5v` FOREIGN KEY (`user_profile_info_id`) REFERENCES `user_profile_info` (`id`);

--
-- Constraints for table `user_role`
--
ALTER TABLE `user_role`
  ADD CONSTRAINT `FK859n2jvi8ivhui0rl0esws6o` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`),
  ADD CONSTRAINT `FKa68196081fvovjhkek5m97n3y` FOREIGN KEY (`role_id`) REFERENCES `role` (`role_id`);

--
-- Constraints for table `user_social_network`
--
ALTER TABLE `user_social_network`
  ADD CONSTRAINT `FK7myq61k8e8dobbqipcriq8c55` FOREIGN KEY (`user_profile_info_id`) REFERENCES `user_profile_info` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
