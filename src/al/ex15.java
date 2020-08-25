package al;

import java.io.*;
import java.util.*;

public class ex15 {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while (true) {
			boolean isVPS = true;
			String str = bf.readLine();

			if (str.charAt(0) == '.') {
				break;
			}

			Stack<Character> s = new Stack<>();

			for (char ch : str.toCharArray()) {
				if (ch == '(' || ch == '[') {
					s.push(ch);
				} else if (ch == ')') {
					if (s.isEmpty() || s.peek() == '[') {
						isVPS = false;
						break;
					} else if (s.peek() == '(') {
						s.pop();
					}
				} else if (ch == ']') {
					if (s.isEmpty() || s.peek() == '(') {
						isVPS = false;
						break;
					} else if (s.peek() == '[') {
						s.pop();
					}
				}
			}

			if (isVPS && s.isEmpty()) {
				bw.write("yes" + "\n");
			} else {
				bw.write("no" + "\n");
			}

		} // while

		bw.close();

	}

}
