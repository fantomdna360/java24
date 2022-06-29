package part2;

//byte -> short -> int -> long
//int -> double
//short -> float -> double
//char -> int

import java.util.Arrays;

public class ReplacementType {

    //Базовый тип	    Замещающий класс
    //boolean	        Boolean
    //byte	            Byte
    //char	            Character
    //short	            Short
    //int	            Integer
    //long	            Long
    //float	            Float
    //double	        Double

    //INTEGER
    int x = 12;
    Integer iInt = new Integer(21584);
    //SHORT
    short sh1 = 4;
    Short ssh2 = new Short(Short.MIN_VALUE);
    //LONG
    Long lLongValue = new Long(Long.MAX_VALUE);
    //FLOAT
    Float flFloatValue = new Float(526e-3F);
    //DOUBLE
    Double dblDoubleValue = new Double(526E-3D);
    //BOOLEAN
    boolean b1 = true;
    Boolean b2 = Boolean.TRUE;
    //BYTE
    byte bt1 = 2;
    byte bt2 = (byte) 4;
    Byte bbt2 = new Byte(Byte.MAX_VALUE);
    Byte bbt3 = bbt2.byteValue();
    Byte bbt4 = new Byte((byte) 25);
    Byte bbt5 = new Byte("25");
    //CHARACTER
    char ch1 = 'a';
    Character cch2 = new Character('*');
    char ch2 = cch2.charValue();

    public static void main(String[] args) {
        System.out.println("Byte.MAX_VALUE = " + Byte.MAX_VALUE);
        System.out.println("Character.MAX_RADIX = " + Character.MAX_RADIX);
        System.out.println("Short.MAX_VALUE = " + Short.MAX_VALUE);
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Long.MAX_VALUE = " + Long.MAX_VALUE);
        System.out.println("Float.MAX_VALUE = " + Float.MAX_VALUE);
        System.out.println("Double.MAX_VALUE = " + Double.MAX_VALUE);

    }


}
