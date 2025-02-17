/*
 * Energy readers and parsers toolkit
 * Copyright (C) 2019-2021 Niels Basjes
 *
 * This work is licensed under the Creative Commons
 * Attribution-NonCommercial-NoDerivatives 4.0 International License.
 *
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    https://creativecommons.org/licenses/by-nc-nd/4.0/
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an AS IS BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */

package nl.basjes.energy.sdm630;

import nl.basjes.energy.AbstractSunSpecProcessImage;

public class SDM630ProcessImage extends AbstractSunSpecProcessImage {

    public SDM630ProcessImage(Integer offset, Integer unit) {
        super(offset, unit);
    }

    @Override
    public byte[] getRawBytes() {
        // 400 bytes of data extracted from my own (very new) SMD 630
        byte[] bytes = {
            (byte)0x43, (byte)0x6A, (byte)0xA2, (byte)0xCB, (byte)0x43, (byte)0x6A, (byte)0x5E, (byte)0x5E,
            (byte)0x43, (byte)0x6B, (byte)0xCF, (byte)0xF8, (byte)0x40, (byte)0x60, (byte)0x35, (byte)0x4B,
            (byte)0x40, (byte)0x48, (byte)0xA3, (byte)0xA4, (byte)0x40, (byte)0x81, (byte)0x36, (byte)0x97,
            (byte)0x44, (byte)0x05, (byte)0xC7, (byte)0xE8, (byte)0x44, (byte)0x09, (byte)0x8D, (byte)0xA7,
            (byte)0x44, (byte)0x37, (byte)0xE3, (byte)0x84, (byte)0x44, (byte)0x4C, (byte)0xA9, (byte)0x22,
            (byte)0x44, (byte)0x37, (byte)0x42, (byte)0x83, (byte)0x44, (byte)0x6D, (byte)0x72, (byte)0x31,
            (byte)0x44, (byte)0x1A, (byte)0xE1, (byte)0xFC, (byte)0x43, (byte)0xF2, (byte)0x2F, (byte)0x0C,
            (byte)0x44, (byte)0x16, (byte)0x37, (byte)0xEA, (byte)0x3F, (byte)0x27, (byte)0x57, (byte)0x06,
            (byte)0x3F, (byte)0x40, (byte)0x26, (byte)0xC9, (byte)0x3F, (byte)0x46, (byte)0x41, (byte)0xFA,
            (byte)0x42, (byte)0x44, (byte)0xBD, (byte)0x0D, (byte)0x42, (byte)0x25, (byte)0x72, (byte)0x0D,
            (byte)0x42, (byte)0x1C, (byte)0xFE, (byte)0x2D, (byte)0x43, (byte)0x6A, (byte)0xF0, (byte)0x60,
            (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x40, (byte)0x63, (byte)0xC2, (byte)0x09,
            (byte)0x41, (byte)0x2A, (byte)0xD1, (byte)0x87, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00,
            (byte)0x44, (byte)0xE3, (byte)0x9C, (byte)0x8A, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00,
            (byte)0x45, (byte)0x1B, (byte)0xE5, (byte)0xF6, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00,
            (byte)0x44, (byte)0xD5, (byte)0x18, (byte)0xB6, (byte)0x3F, (byte)0x3A, (byte)0xE1, (byte)0x46,
            (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x42, (byte)0x2C, (byte)0x77, (byte)0x97,
            (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x42, (byte)0x47, (byte)0x99, (byte)0xA6,
            (byte)0x41, (byte)0x09, (byte)0xBA, (byte)0x5E, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00,
            (byte)0x40, (byte)0xB1, (byte)0xBA, (byte)0x5E, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00,
            (byte)0x43, (byte)0x6A, (byte)0xC5, (byte)0x3C, (byte)0x43, (byte)0x6A, (byte)0x4E, (byte)0x48,
            (byte)0x43, (byte)0x6B, (byte)0xC3, (byte)0x4D, (byte)0x40, (byte)0x60, (byte)0x2B, (byte)0x9E,
            (byte)0x40, (byte)0x48, (byte)0x84, (byte)0xE0, (byte)0x40, (byte)0x80, (byte)0xE0, (byte)0xA6,
            (byte)0x44, (byte)0x05, (byte)0xE9, (byte)0x4C, (byte)0x44, (byte)0x09, (byte)0x35, (byte)0xFA,
            (byte)0x44, (byte)0x37, (byte)0xCB, (byte)0xD4, (byte)0x44, (byte)0x4C, (byte)0xA3, (byte)0x32,
            (byte)0x44, (byte)0x36, (byte)0xF7, (byte)0x7D, (byte)0x44, (byte)0x6C, (byte)0x8C, (byte)0x89,
            (byte)0x44, (byte)0x1A, (byte)0xBD, (byte)0x45, (byte)0x43, (byte)0xF2, (byte)0x13, (byte)0x14,
            (byte)0x44, (byte)0x14, (byte)0xE9, (byte)0x1E, (byte)0x3F, (byte)0x27, (byte)0x85, (byte)0xA6,
            (byte)0x3F, (byte)0x3F, (byte)0xFA, (byte)0xE8, (byte)0x3F, (byte)0x46, (byte)0xE8, (byte)0xD2,
            (byte)0x42, (byte)0x44, (byte)0x85, (byte)0xDE, (byte)0x42, (byte)0x25, (byte)0xAD, (byte)0x78,
            (byte)0x42, (byte)0x1C, (byte)0x11, (byte)0x79, (byte)0x43, (byte)0x6A, (byte)0xF2, (byte)0x45,
            (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x40, (byte)0x63, (byte)0x7B, (byte)0x43,
            (byte)0x41, (byte)0x2A, (byte)0x9C, (byte)0x72, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00,
            (byte)0x44, (byte)0xE3, (byte)0x75, (byte)0x8D, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00,
            (byte)0x45, (byte)0x1B, (byte)0x95, (byte)0xE8, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00,
            (byte)0x44, (byte)0xD4, (byte)0x57, (byte)0xF7, (byte)0x3F, (byte)0x3B, (byte)0x21, (byte)0x5B,
            (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x42, (byte)0x2C, (byte)0x23, (byte)0x94,
            (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x42, (byte)0x47, (byte)0xA3, (byte)0x61,
            (byte)0x41, (byte)0x09, (byte)0xBA, (byte)0x5E, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00,
            (byte)0x40, (byte)0xB1, (byte)0xBA, (byte)0x5E, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00,
            (byte)0x43, (byte)0x6A, (byte)0xB0, (byte)0x51, (byte)0x43, (byte)0x6A, (byte)0x50, (byte)0x88,
            (byte)0x43, (byte)0x6B, (byte)0xC3, (byte)0xAF, (byte)0x40, (byte)0x5F, (byte)0xDE, (byte)0xF1,
            (byte)0x40, (byte)0x48, (byte)0xC3, (byte)0x38, (byte)0x40, (byte)0x81, (byte)0x43, (byte)0x2D,
            (byte)0x44, (byte)0x05, (byte)0x64, (byte)0x2A, (byte)0x44, (byte)0x09, (byte)0xA2, (byte)0xFB,
            (byte)0x44, (byte)0x37, (byte)0xE5, (byte)0x2E, (byte)0x44, (byte)0x4C, (byte)0x80, (byte)0x7F,
            (byte)0x44, (byte)0x37, (byte)0x6A, (byte)0xC9, (byte)0x44, (byte)0x6D, (byte)0x7F, (byte)0x18,
            (byte)0x44, (byte)0x1B, (byte)0x02, (byte)0x54, (byte)0x43, (byte)0xF3, (byte)0x74, (byte)0x3A,
            (byte)0x44, (byte)0x15, (byte)0x6A, (byte)0x7E, (byte)0x3F, (byte)0x27, (byte)0x1B, (byte)0xF0,
            (byte)0x3F, (byte)0x3F, (byte)0xFD, (byte)0x92, (byte)0x3F, (byte)0x46, (byte)0x5E, (byte)0xE7,
            (byte)0x42, (byte)0x45, (byte)0x02, (byte)0xEA, (byte)0x42, (byte)0x25, (byte)0xA9, (byte)0xDD,
            (byte)0x42, (byte)0x1C, (byte)0xD5, (byte)0x39, (byte)0x43, (byte)0x6A, (byte)0xEF, (byte)0x0B,
            (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x40, (byte)0x63, (byte)0xE5, (byte)0xFD,
            (byte)0x41, (byte)0x2A, (byte)0xEC, (byte)0x7E, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00,
            (byte)0x44, (byte)0xE3, (byte)0x73, (byte)0xB7, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00,
            (byte)0x45, (byte)0x1B, (byte)0xDD, (byte)0x57, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00,
            (byte)0x44, (byte)0xD5, (byte)0x2B, (byte)0x11, (byte)0x3F, (byte)0x3A, (byte)0xCA, (byte)0x16,
            (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x42, (byte)0x2C, (byte)0x95, (byte)0xF5,
            (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x42, (byte)0x47, (byte)0x95, (byte)0xAA,
            (byte)0x41, (byte)0x09, (byte)0xBA, (byte)0x5E, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00,
            (byte)0x40, (byte)0xB1, (byte)0xBA, (byte)0x5E, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00,
            (byte)0x43, (byte)0x6A, (byte)0xBF, (byte)0x3A, (byte)0x43, (byte)0x6A, (byte)0x68, (byte)0x8C,
            (byte)0x43, (byte)0x6B, (byte)0xD6, (byte)0x89, (byte)0x40, (byte)0x60, (byte)0x03, (byte)0x6E,
            (byte)0x40, (byte)0x48, (byte)0x58, (byte)0xC6, (byte)0x40, (byte)0x80, (byte)0xE4, (byte)0x87,
            (byte)0x44, (byte)0x05, (byte)0xBE, (byte)0xBA, (byte)0x44, (byte)0x09, (byte)0x3C, (byte)0x5B,
            (byte)0x44, (byte)0x37, (byte)0xD4, (byte)0x7B, (byte)0x44, (byte)0x4C, (byte)0x74, (byte)0x2C,
            (byte)0x44, (byte)0x36, (byte)0xE1, (byte)0x1B, (byte)0x44, (byte)0x6C, (byte)0xA5, (byte)0xF8,
            (byte)0x44, (byte)0x1A, (byte)0xA3, (byte)0xEC, (byte)0x43, (byte)0xF1, (byte)0xC0, (byte)0xE8,
            (byte)0x44, (byte)0x15, (byte)0x06, (byte)0xD7, (byte)0x3F, (byte)0x27, (byte)0x76, (byte)0xE0,
            (byte)0x3F, (byte)0x40, (byte)0x1B, (byte)0x54, (byte)0x3F, (byte)0x46, (byte)0xDC, (byte)0xCD,
            (byte)0x42, (byte)0x44, (byte)0x97, (byte)0x5B, (byte)0x42, (byte)0x25, (byte)0x2E, (byte)0x7B,
            (byte)0x42, (byte)0x1C, (byte)0xBD, (byte)0x08, (byte)0x43, (byte)0x6A, (byte)0xEF, (byte)0xE4,
            (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x40, (byte)0x63, (byte)0x7E, (byte)0x99,
            (byte)0x41, (byte)0x2A, (byte)0x9E, (byte)0xF3, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00,
            (byte)0x44, (byte)0xE3, (byte)0x71, (byte)0x23, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00,
            (byte)0x45, (byte)0x1B, (byte)0xC6, (byte)0x24, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00,
            (byte)0x44, (byte)0xD4, (byte)0xE9, (byte)0xF2, (byte)0x3F, (byte)0x3A, (byte)0xE3, (byte)0xC9,
            (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x42, (byte)0x2C, (byte)0x74, (byte)0x4D,
            (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x42, (byte)0x47, (byte)0xA4, (byte)0x3C,
            (byte)0x41, (byte)0x09, (byte)0xBA, (byte)0x5E, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00,
            (byte)0x40, (byte)0xB1, (byte)0xBA, (byte)0x5E, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00,
            (byte)0x43, (byte)0x6A, (byte)0x9F, (byte)0xBD, (byte)0x43, (byte)0x6A, (byte)0x6D, (byte)0x8D,
            (byte)0x43, (byte)0x6B, (byte)0xCF, (byte)0x97, (byte)0x40, (byte)0x5F, (byte)0xC3, (byte)0x5E,
            (byte)0x40, (byte)0x49, (byte)0x18, (byte)0xB6, (byte)0x40, (byte)0x81, (byte)0x26, (byte)0xC7,
            (byte)0x44, (byte)0x05, (byte)0x60, (byte)0x0F, (byte)0x44, (byte)0x09, (byte)0xFA, (byte)0x7B,
            (byte)0x44, (byte)0x37, (byte)0x72, (byte)0x67, (byte)0x44, (byte)0x4C, (byte)0x13, (byte)0xE1,
            (byte)0x44, (byte)0x37, (byte)0x95, (byte)0x68, (byte)0x44, (byte)0x6D, (byte)0x12, (byte)0xE2,
            (byte)0x44, (byte)0x1A, (byte)0x76, (byte)0x77, (byte)0x43, (byte)0xF2, (byte)0x32, (byte)0x8C,
            (byte)0x44, (byte)0x16, (byte)0x2B, (byte)0xAD, (byte)0x3F, (byte)0x27, (byte)0x4F, (byte)0x24,
            (byte)0x3F, (byte)0x40, (byte)0x67, (byte)0xC7, (byte)0x3F, (byte)0x46, (byte)0x17, (byte)0x89,
            (byte)0x42, (byte)0x44, (byte)0xC6, (byte)0x60, (byte)0x42, (byte)0x25, (byte)0x19, (byte)0xE9,
            (byte)0x42, (byte)0x1D, (byte)0x3A, (byte)0x33, (byte)0x43, (byte)0x6A, (byte)0xF4, (byte)0x4B,
            (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x40, (byte)0x63, (byte)0xD6, (byte)0x10,
            (byte)0x41, (byte)0x2A, (byte)0xE0, (byte)0x8C, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00,
            (byte)0x44, (byte)0xE3, (byte)0xD8, (byte)0xA2, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00,
            (byte)0x45, (byte)0x1B, (byte)0xD0, (byte)0xA3, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00,
            (byte)0x44, (byte)0xD4, (byte)0x99, (byte)0xF6, (byte)0x3F, (byte)0x3B, (byte)0x2C, (byte)0x36,
            (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x42, (byte)0x2C, (byte)0x15, (byte)0x56,
            (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x42, (byte)0x47, (byte)0xC6, (byte)0x1B,
            (byte)0x41, (byte)0x09, (byte)0xBA, (byte)0x5E, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00,
            (byte)0x40, (byte)0xB1, (byte)0xBA, (byte)0x5E, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00,
        };

        return bytes;
    }

}
