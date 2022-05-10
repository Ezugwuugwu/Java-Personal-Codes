import java.util.UUID;

public class UuidInJava {

    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        String randomUUID = uuid.toString();
        System.out.println("the string value "+ randomUUID);
        System.out.println("the variant value "+ uuid.variant());
        System.out.println("the version value "+ uuid.version());
    }
}
