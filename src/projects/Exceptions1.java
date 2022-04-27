package projects;

public class Exceptions1 {
    public static void main(String[] args) throws PanicException {
        System.out.println("Hello world");
        throw new PanicException("PANIC!");
    }
}

class PanicException extends Throwable {

    public PanicException(String s) {
        System.out.println(s);
    }
}
