package test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) {
		ServerSocket serverSocket = null; 
		
		try {
			// 1. server socket 생성
			serverSocket = new ServerSocket();
			
			// 2. 바인딩 - 소켓의 주소(InetSocketAddress[InetAddress(IPAdress)+port])를 binding
			serverSocket.bind(new InetSocketAddress("0.0.0.0", 5000), 10);   // (IP, port), backlog
			
			// 특정 IP를 binding 하는 것은 좋지 않음
			// IP 대역을 지정하지 않음 - 무조건 내 컴퓨터로 들어오게 끔 - port 번호만 일치 하다면
			// IPAddress: 0.0.0.0: 특정 호스트 IP를 바인딩하지 않는다. 
			// accept 처리 중에 다른 연결 요청이 들어올 경우를 대비한 공간(큐의 길이-10)
			
			// 3. Accept
			Socket socket = serverSocket.accept();  // blocking
			
			System.out.println("연결!!");   // 이 파일을 실행했을 땐 나오지 않고, 연결이 되면 바로 뜰 것 
			
		} catch (IOException e) {
			System.out.println("[server] error" + e);
		} finally {
			
			try {
				if(serverSocket != null && !serverSocket.isClosed()) {
					serverSocket.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
				
			}
		
		}
	}

}
