import java.util.Arrays;

public enum EnumClass {
    NORTH(),
    SOUTH(),
    EAST(),
    WEST();

    public static void main(String[] args) {
       EnumClass man = EnumClass.SOUTH;
        System.out.println(man);
        }
    }


