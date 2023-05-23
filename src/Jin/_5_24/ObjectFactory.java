package Jin._5_24;

public class ObjectFactory {

    private static ItemProvider itemProvider;

    public static ItemProvider getItemProvider() {///몰루~?
        if (itemProvider == null) {
            itemProvider = new ItemProvider();
        }
        return itemProvider;
    }
}

