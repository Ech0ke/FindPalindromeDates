package com.java;

public class Utils {
    public static String printBonusDatesBetween(int fromYear, int toYear) {
        // initiate result variable
        StringBuilder result = new StringBuilder();
        // loop through all dates in given years
        for (int year = fromYear; year <= toYear; year++) {
            for (int month = 1; month <= 12; month++) {
                for (int day = 1; day <= 31; day++) {
                    // check if date exists in current year and month looped through
                    if (isValidDate(year, month, day)) {
                        String dateStr = String.format("%04d%02d%02d", year, month, day);
                        String reverseDateStr = new StringBuilder(dateStr).reverse().toString();
                        // compare if original date is the same as reversed date. If true, append original date to result adding new line at the end
                        if (dateStr.equals(reverseDateStr)) {
                            result.append(String.format("%04d-%02d-%02d\n", year, month, day));
                        }
                    }
                }
            }
        }

        return result.toString();
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            return false;
        }

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return day <= 30;
        } else if (month == 2) {
            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                return day <= 29;
            } else {
                return day <= 28;
            }
        }

        return true;
    }
}
