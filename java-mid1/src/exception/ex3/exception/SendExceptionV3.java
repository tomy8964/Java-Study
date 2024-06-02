package exception.ex3.exception;

public class SendExceptionV3 extends NetworkClientExceptionV3 {
    private final String sendData;

    public SendExceptionV3(String address, String message) {
        super(message);
        this.sendData = address;
    }

    public String getSendData() {
        return sendData;
    }
}
