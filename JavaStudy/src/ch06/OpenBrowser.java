package ch06;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class OpenBrowser {
	public static void open(String url) {
		// 브라우저 띄우는 코드 작성
		// shift + ctrl + o (임포트 안 된것들 모두 임포트)
		try {
			Desktop.getDesktop().browse(
					new URI(url));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}

	}
	
	public static void main(String[] args) {
		open("http:ggoreb.com/ai");
	}
}
