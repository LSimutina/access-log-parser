public class Exception {
    int length;

    public Exception(int length) {
        this.length = length;
    }

    public void exception(int length){
        if (length > 1024) throw new RuntimeException("Строка должна быть не больше 1024 символов");
    }
}
