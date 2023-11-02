package codeWars;

public class RomanNumerals {

    public static String toRoman(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("I");
        }
        sb = new StringBuilder(sb.toString().replace("IIIII", "V"));
        sb = new StringBuilder(sb.toString().replace("IIII", "IV"));
        sb = new StringBuilder(sb.toString().replace("VV", "X"));
        sb = new StringBuilder(sb.toString().replace("VIV", "IX"));
        sb = new StringBuilder(sb.toString().replace("XXXXX", "L"));
        sb = new StringBuilder(sb.toString().replace("XXXX", "XL"));
        sb = new StringBuilder(sb.toString().replace("LL", "C"));
        sb = new StringBuilder(sb.toString().replace("LXL", "XC"));
        sb = new StringBuilder(sb.toString().replace("CCCCC", "D"));
        sb = new StringBuilder(sb.toString().replace("CCCC", "CD"));
        sb = new StringBuilder(sb.toString().replace("DD", "M"));
        sb = new StringBuilder(sb.toString().replace("DCD", "CM"));
        return String.valueOf(sb);
    }

    public static int fromRoman(String romanNumeral) {
        StringBuilder sb = new StringBuilder(romanNumeral);
        sb = new StringBuilder(sb.toString().replace("CM", "DCD"));
        sb = new StringBuilder(sb.toString().replace("M", "DD"));
        sb = new StringBuilder(sb.toString().replace("CD", "CCCC"));
        sb = new StringBuilder(sb.toString().replace("D", "CCCCC"));
        sb = new StringBuilder(sb.toString().replace("XC", "LXL"));
        sb = new StringBuilder(sb.toString().replace("C", "LL"));
        sb = new StringBuilder(sb.toString().replace("XL", "XXXX"));
        sb = new StringBuilder(sb.toString().replace("L", "XXXXX"));
        sb = new StringBuilder(sb.toString().replace("IX", "VIV"));
        sb = new StringBuilder(sb.toString().replace("X", "VV"));
        sb = new StringBuilder(sb.toString().replace("IV", "IIII"));
        sb = new StringBuilder(sb.toString().replace("V", "IIIII"));
        return sb.length();
    }
}

/*
I	1
IV	4
V	5
X	10
L	50
C	100
D	500
M	1000
* */