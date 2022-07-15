package singleton;

// 디자인패턴 중 Singleton pattern
public class SocketClient {

    // 자기 자신을 객체로 가지고 있어야 하는 Singleton pattern
    private static SocketClient socketClient = null;

    // private 기본생성자 막기
    private SocketClient() {

    }

    public static SocketClient getInstance() {

        if (socketClient == null) {
            socketClient = new SocketClient();
        }
        return socketClient;
    }

    public void connect() {
        System.out.println("connect");
    }
}
