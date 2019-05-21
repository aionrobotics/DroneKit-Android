/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

package com.MAVLink.ardupilotmega;

import java.util.HashMap;
import java.util.Map;

/**
 * X.25 CRC calculation for MAVlink messages. The checksum must be initialized,
 * updated with witch field of the message, and then finished with the message
 * id.
 */
public class CRC {
    private static final Map<Integer, Integer> MAVLINK_MESSAGE_CRCS;
    private static final int CRC_INIT_VALUE = 0xffff;
    private int crcValue;

    static {
        MAVLINK_MESSAGE_CRCS = new HashMap<>();
        MAVLINK_MESSAGE_CRCS.put(0, 50);
        MAVLINK_MESSAGE_CRCS.put(1, 124);
        MAVLINK_MESSAGE_CRCS.put(2, 137);
        MAVLINK_MESSAGE_CRCS.put(4, 237);
        MAVLINK_MESSAGE_CRCS.put(5, 217);
        MAVLINK_MESSAGE_CRCS.put(6, 104);
        MAVLINK_MESSAGE_CRCS.put(7, 119);
        MAVLINK_MESSAGE_CRCS.put(11, 89);
        MAVLINK_MESSAGE_CRCS.put(20, 214);
        MAVLINK_MESSAGE_CRCS.put(21, 159);
        MAVLINK_MESSAGE_CRCS.put(22, 220);
        MAVLINK_MESSAGE_CRCS.put(23, 168);
        MAVLINK_MESSAGE_CRCS.put(24, 24);
        MAVLINK_MESSAGE_CRCS.put(25, 23);
        MAVLINK_MESSAGE_CRCS.put(26, 170);
        MAVLINK_MESSAGE_CRCS.put(27, 144);
        MAVLINK_MESSAGE_CRCS.put(28, 67);
        MAVLINK_MESSAGE_CRCS.put(29, 115);
        MAVLINK_MESSAGE_CRCS.put(30, 39);
        MAVLINK_MESSAGE_CRCS.put(31, 246);
        MAVLINK_MESSAGE_CRCS.put(32, 185);
        MAVLINK_MESSAGE_CRCS.put(33, 104);
        MAVLINK_MESSAGE_CRCS.put(34, 237);
        MAVLINK_MESSAGE_CRCS.put(35, 244);
        MAVLINK_MESSAGE_CRCS.put(36, 222);
        MAVLINK_MESSAGE_CRCS.put(37, 212);
        MAVLINK_MESSAGE_CRCS.put(38, 9);
        MAVLINK_MESSAGE_CRCS.put(39, 254);
        MAVLINK_MESSAGE_CRCS.put(40, 230);
        MAVLINK_MESSAGE_CRCS.put(41, 28);
        MAVLINK_MESSAGE_CRCS.put(42, 28);
        MAVLINK_MESSAGE_CRCS.put(43, 132);
        MAVLINK_MESSAGE_CRCS.put(44, 221);
        MAVLINK_MESSAGE_CRCS.put(45, 232);
        MAVLINK_MESSAGE_CRCS.put(46, 11);
        MAVLINK_MESSAGE_CRCS.put(47, 153);
        MAVLINK_MESSAGE_CRCS.put(48, 41);
        MAVLINK_MESSAGE_CRCS.put(49, 39);
        MAVLINK_MESSAGE_CRCS.put(50, 78);
        MAVLINK_MESSAGE_CRCS.put(51, 196);
        MAVLINK_MESSAGE_CRCS.put(54, 15);
        MAVLINK_MESSAGE_CRCS.put(55, 3);
        MAVLINK_MESSAGE_CRCS.put(61, 167);
        MAVLINK_MESSAGE_CRCS.put(62, 183);
        MAVLINK_MESSAGE_CRCS.put(63, 119);
        MAVLINK_MESSAGE_CRCS.put(64, 191);
        MAVLINK_MESSAGE_CRCS.put(65, 118);
        MAVLINK_MESSAGE_CRCS.put(66, 148);
        MAVLINK_MESSAGE_CRCS.put(67, 21);
        MAVLINK_MESSAGE_CRCS.put(69, 243);
        MAVLINK_MESSAGE_CRCS.put(70, 124);
        MAVLINK_MESSAGE_CRCS.put(73, 38);
        MAVLINK_MESSAGE_CRCS.put(74, 20);
        MAVLINK_MESSAGE_CRCS.put(75, 158);
        MAVLINK_MESSAGE_CRCS.put(76, 152);
        MAVLINK_MESSAGE_CRCS.put(77, 143);
        MAVLINK_MESSAGE_CRCS.put(81, 106);
        MAVLINK_MESSAGE_CRCS.put(82, 49);
        MAVLINK_MESSAGE_CRCS.put(83, 22);
        MAVLINK_MESSAGE_CRCS.put(84, 143);
        MAVLINK_MESSAGE_CRCS.put(85, 140);
        MAVLINK_MESSAGE_CRCS.put(86, 5);
        MAVLINK_MESSAGE_CRCS.put(87, 150);
        MAVLINK_MESSAGE_CRCS.put(89, 231);
        MAVLINK_MESSAGE_CRCS.put(90, 183);
        MAVLINK_MESSAGE_CRCS.put(91, 63);
        MAVLINK_MESSAGE_CRCS.put(92, 54);
        MAVLINK_MESSAGE_CRCS.put(93, 47);
        MAVLINK_MESSAGE_CRCS.put(100, 175);
        MAVLINK_MESSAGE_CRCS.put(101, 102);
        MAVLINK_MESSAGE_CRCS.put(102, 158);
        MAVLINK_MESSAGE_CRCS.put(103, 208);
        MAVLINK_MESSAGE_CRCS.put(104, 56);
        MAVLINK_MESSAGE_CRCS.put(105, 93);
        MAVLINK_MESSAGE_CRCS.put(106, 138);
        MAVLINK_MESSAGE_CRCS.put(107, 108);
        MAVLINK_MESSAGE_CRCS.put(108, 32);
        MAVLINK_MESSAGE_CRCS.put(109, 185);
        MAVLINK_MESSAGE_CRCS.put(110, 84);
        MAVLINK_MESSAGE_CRCS.put(111, 34);
        MAVLINK_MESSAGE_CRCS.put(112, 174);
        MAVLINK_MESSAGE_CRCS.put(113, 124);
        MAVLINK_MESSAGE_CRCS.put(114, 237);
        MAVLINK_MESSAGE_CRCS.put(115, 4);
        MAVLINK_MESSAGE_CRCS.put(116, 76);
        MAVLINK_MESSAGE_CRCS.put(117, 128);
        MAVLINK_MESSAGE_CRCS.put(118, 56);
        MAVLINK_MESSAGE_CRCS.put(119, 116);
        MAVLINK_MESSAGE_CRCS.put(120, 134);
        MAVLINK_MESSAGE_CRCS.put(121, 237);
        MAVLINK_MESSAGE_CRCS.put(122, 203);
        MAVLINK_MESSAGE_CRCS.put(123, 250);
        MAVLINK_MESSAGE_CRCS.put(124, 87);
        MAVLINK_MESSAGE_CRCS.put(125, 203);
        MAVLINK_MESSAGE_CRCS.put(126, 220);
        MAVLINK_MESSAGE_CRCS.put(127, 25);
        MAVLINK_MESSAGE_CRCS.put(128, 226);
        MAVLINK_MESSAGE_CRCS.put(129, 46);
        MAVLINK_MESSAGE_CRCS.put(130, 29);
        MAVLINK_MESSAGE_CRCS.put(131, 223);
        MAVLINK_MESSAGE_CRCS.put(132, 85);
        MAVLINK_MESSAGE_CRCS.put(133, 6);
        MAVLINK_MESSAGE_CRCS.put(134, 229);
        MAVLINK_MESSAGE_CRCS.put(135, 203);
        MAVLINK_MESSAGE_CRCS.put(136, 1);
        MAVLINK_MESSAGE_CRCS.put(137, 195);
        MAVLINK_MESSAGE_CRCS.put(138, 109);
        MAVLINK_MESSAGE_CRCS.put(139, 168);
        MAVLINK_MESSAGE_CRCS.put(140, 181);
        MAVLINK_MESSAGE_CRCS.put(141, 47);
        MAVLINK_MESSAGE_CRCS.put(142, 72);
        MAVLINK_MESSAGE_CRCS.put(143, 131);
        MAVLINK_MESSAGE_CRCS.put(144, 127);
        MAVLINK_MESSAGE_CRCS.put(146, 103);
        MAVLINK_MESSAGE_CRCS.put(147, 154);
        MAVLINK_MESSAGE_CRCS.put(148, 178);
        MAVLINK_MESSAGE_CRCS.put(149, 200);
        MAVLINK_MESSAGE_CRCS.put(150, 134);
        MAVLINK_MESSAGE_CRCS.put(151, 219);
        MAVLINK_MESSAGE_CRCS.put(152, 208);
        MAVLINK_MESSAGE_CRCS.put(153, 188);
        MAVLINK_MESSAGE_CRCS.put(154, 84);
        MAVLINK_MESSAGE_CRCS.put(155, 22);
        MAVLINK_MESSAGE_CRCS.put(156, 19);
        MAVLINK_MESSAGE_CRCS.put(157, 21);
        MAVLINK_MESSAGE_CRCS.put(158, 134);
        MAVLINK_MESSAGE_CRCS.put(160, 78);
        MAVLINK_MESSAGE_CRCS.put(161, 68);
        MAVLINK_MESSAGE_CRCS.put(162, 189);
        MAVLINK_MESSAGE_CRCS.put(163, 127);
        MAVLINK_MESSAGE_CRCS.put(164, 154);
        MAVLINK_MESSAGE_CRCS.put(165, 21);
        MAVLINK_MESSAGE_CRCS.put(166, 21);
        MAVLINK_MESSAGE_CRCS.put(167, 144);
        MAVLINK_MESSAGE_CRCS.put(168, 1);
        MAVLINK_MESSAGE_CRCS.put(169, 234);
        MAVLINK_MESSAGE_CRCS.put(170, 73);
        MAVLINK_MESSAGE_CRCS.put(171, 181);
        MAVLINK_MESSAGE_CRCS.put(172, 22);
        MAVLINK_MESSAGE_CRCS.put(173, 83);
        MAVLINK_MESSAGE_CRCS.put(174, 167);
        MAVLINK_MESSAGE_CRCS.put(175, 138);
        MAVLINK_MESSAGE_CRCS.put(176, 234);
        MAVLINK_MESSAGE_CRCS.put(177, 240);
        MAVLINK_MESSAGE_CRCS.put(178, 47);
        MAVLINK_MESSAGE_CRCS.put(179, 189);
        MAVLINK_MESSAGE_CRCS.put(180, 52);
        MAVLINK_MESSAGE_CRCS.put(181, 174);
        MAVLINK_MESSAGE_CRCS.put(182, 229);
        MAVLINK_MESSAGE_CRCS.put(183, 85);
        MAVLINK_MESSAGE_CRCS.put(184, 159);
        MAVLINK_MESSAGE_CRCS.put(185, 186);
        MAVLINK_MESSAGE_CRCS.put(186, 72);
        MAVLINK_MESSAGE_CRCS.put(191, 92);
        MAVLINK_MESSAGE_CRCS.put(192, 36);
        MAVLINK_MESSAGE_CRCS.put(193, 71);
        MAVLINK_MESSAGE_CRCS.put(194, 98);
        MAVLINK_MESSAGE_CRCS.put(195, 120);
        MAVLINK_MESSAGE_CRCS.put(200, 134);
        MAVLINK_MESSAGE_CRCS.put(201, 205);
        MAVLINK_MESSAGE_CRCS.put(214, 69);
        MAVLINK_MESSAGE_CRCS.put(215, 101);
        MAVLINK_MESSAGE_CRCS.put(216, 50);
        MAVLINK_MESSAGE_CRCS.put(217, 202);
        MAVLINK_MESSAGE_CRCS.put(218, 17);
        MAVLINK_MESSAGE_CRCS.put(219, 162);
        MAVLINK_MESSAGE_CRCS.put(226, 207);
        MAVLINK_MESSAGE_CRCS.put(230, 163);
        MAVLINK_MESSAGE_CRCS.put(231, 105);
        MAVLINK_MESSAGE_CRCS.put(232, 151);
        MAVLINK_MESSAGE_CRCS.put(233, 35);
        MAVLINK_MESSAGE_CRCS.put(234, 150);
        MAVLINK_MESSAGE_CRCS.put(241, 90);
        MAVLINK_MESSAGE_CRCS.put(242, 104);
        MAVLINK_MESSAGE_CRCS.put(243, 85);
        MAVLINK_MESSAGE_CRCS.put(244, 95);
        MAVLINK_MESSAGE_CRCS.put(245, 130);
        MAVLINK_MESSAGE_CRCS.put(246, 184);
        MAVLINK_MESSAGE_CRCS.put(247, 81);
        MAVLINK_MESSAGE_CRCS.put(248, 8);
        MAVLINK_MESSAGE_CRCS.put(249, 204);
        MAVLINK_MESSAGE_CRCS.put(250, 49);
        MAVLINK_MESSAGE_CRCS.put(251, 170);
        MAVLINK_MESSAGE_CRCS.put(252, 44);
        MAVLINK_MESSAGE_CRCS.put(253, 83);
        MAVLINK_MESSAGE_CRCS.put(254, 46);
        MAVLINK_MESSAGE_CRCS.put(256, 71);
        MAVLINK_MESSAGE_CRCS.put(257, 131);
        MAVLINK_MESSAGE_CRCS.put(258, 187);
        MAVLINK_MESSAGE_CRCS.put(259, 92);
        MAVLINK_MESSAGE_CRCS.put(260, 146);
        MAVLINK_MESSAGE_CRCS.put(261, 179);
        MAVLINK_MESSAGE_CRCS.put(262, 12);
        MAVLINK_MESSAGE_CRCS.put(263, 133);
        MAVLINK_MESSAGE_CRCS.put(264, 49);
        MAVLINK_MESSAGE_CRCS.put(265, 26);
        MAVLINK_MESSAGE_CRCS.put(266, 193);
        MAVLINK_MESSAGE_CRCS.put(267, 35);
        MAVLINK_MESSAGE_CRCS.put(268, 14);
        MAVLINK_MESSAGE_CRCS.put(299, 19);
        MAVLINK_MESSAGE_CRCS.put(310, 28);
        MAVLINK_MESSAGE_CRCS.put(311, 95);
        MAVLINK_MESSAGE_CRCS.put(330, 23);
        MAVLINK_MESSAGE_CRCS.put(331, 91);
        MAVLINK_MESSAGE_CRCS.put(350, 232);
        MAVLINK_MESSAGE_CRCS.put(365, 36);
        MAVLINK_MESSAGE_CRCS.put(9000, 113);
        MAVLINK_MESSAGE_CRCS.put(10001, 209);
        MAVLINK_MESSAGE_CRCS.put(10002, 186);
        MAVLINK_MESSAGE_CRCS.put(10003, 4);
        MAVLINK_MESSAGE_CRCS.put(11000, 134);
        MAVLINK_MESSAGE_CRCS.put(11001, 15);
        MAVLINK_MESSAGE_CRCS.put(11002, 234);
        MAVLINK_MESSAGE_CRCS.put(11003, 64);
        MAVLINK_MESSAGE_CRCS.put(11010, 46);
        MAVLINK_MESSAGE_CRCS.put(11011, 106);
        MAVLINK_MESSAGE_CRCS.put(11020, 205);
        MAVLINK_MESSAGE_CRCS.put(11030, 144);
        MAVLINK_MESSAGE_CRCS.put(11031, 133);
        MAVLINK_MESSAGE_CRCS.put(11032, 85);
        MAVLINK_MESSAGE_CRCS.put(42000, 227);
        MAVLINK_MESSAGE_CRCS.put(42001, 239);
        
    }

    /**
     * Accumulate the X.25 CRC by adding one char at a time.
     *
     * The checksum function adds the hash of one char at a time to the 16 bit
     * checksum (uint16_t).
     *
     * @param data new char to hash
     **/
    public void update_checksum(int data) {
        data = data & 0xff; //cast because we want an unsigned type
        int tmp = data ^ (crcValue & 0xff);
        tmp ^= (tmp << 4) & 0xff;
        crcValue = ((crcValue >> 8) & 0xff) ^ (tmp << 8) ^ (tmp << 3) ^ ((tmp >> 4) & 0xf);
    }

    /**
     * Finish the CRC calculation of a message, by running the CRC with the
     * Magic Byte.
     *
     * @param msgid The message id number
     */
    public void finish_checksum(int msgid) {
        if(MAVLINK_MESSAGE_CRCS.containsKey(msgid))
            update_checksum(MAVLINK_MESSAGE_CRCS.get(msgid));
    }

    /**
     * Initialize the buffer for the X.25 CRC
     */
    public void start_checksum() {
        crcValue = CRC_INIT_VALUE;
    }

    public int getMSB() {
        return ((crcValue >> 8) & 0xff);
    }

    public int getLSB() {
        return (crcValue & 0xff);
    }

    public CRC() {
        start_checksum();
    }

}
        