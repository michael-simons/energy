/*
 * Energy readers and parsers toolkit
 * Copyright (C) 2019-2019 Niels Basjes
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

package nl.basjes.energy;

public class Utils {

    public static long waitTillNextTimeModulo(long moduloMs) {
        long now       = System.currentTimeMillis();
        long refreshAt = (Math.floorDiv(now, moduloMs) + 1) * moduloMs;

        while (now < refreshAt) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                // Ignore
            }
            now = System.currentTimeMillis();
        }
        return refreshAt;
    }

}
