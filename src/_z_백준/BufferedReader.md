✅ BufferedReader와 자주 쓰는 기법들 모음
1️⃣ readLine() + split(" ")
가장 기본적이고 자주 쓰는 패턴

java
코드 복사
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String[] input = br.readLine().split(" ");

int a = Integer.parseInt(input[0]);
int b = Integer.parseInt(input[1]);
공백으로 구분된 정수, 문자열 처리 시 유용

배열로 받아서 여러 값 처리하기 좋음

2️⃣ StringTokenizer로 공백 기준 빠른 파싱
split(" ")보다 빠르고 안정적임

java
코드 복사
import java.util.StringTokenizer;

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
StringTokenizer st = new StringTokenizer(br.readLine());

int a = Integer.parseInt(st.nextToken());
int b = Integer.parseInt(st.nextToken());
속도 면에서 split()보다 좋음

공백이 여러 개일 때도 안정적

st.hasMoreTokens()로 반복 사용도 가능

3️⃣ StringBuilder와 함께 빠른 출력 처리
java
코드 복사
StringBuilder sb = new StringBuilder();

for (int i = 0; i < n; i++) {
    sb.append(i).append("\n");
}

System.out.print(sb);
System.out.println()을 반복하면 느림

StringBuilder로 모아서 한 번에 출력하면 훨씬 빠름

4️⃣ readLine()을 이용한 EOF 입력 처리
java
코드 복사
String line;
while ((line = br.readLine()) != null) {
// null이 되면 EOF
    String[] parts = line.split(" ");
// 처리...
}
백준 10951 같은 문제에 필수

테스트할 땐 Ctrl+D (Unix) 또는 Ctrl+Z (Windows)로 EOF 입력

5️⃣ 한 줄에 정수 여러 개 입력 (동적 개수)
java
코드 복사
StringTokenizer st = new StringTokenizer(br.readLine());

while (st.hasMoreTokens()) {
int x = Integer.parseInt(st.nextToken());
    // 처리...
}
입력 개수가 고정되지 않았을 때 유용

예: 1 2 3 4 5 → 개수 몰라도 다 읽을 수 있음

🎁 예제 정리

상황	추천 방식
고정된 개수의 입력 (A B)	
readLine() + split() 또는 StringTokenizer
정수 한 줄에 여러 개	
StringTokenizer + while (hasMoreTokens)
입력이 많음	
BufferedReader + StringBuilder
입력이 끝날 시점 모름	
while ((line = br.readLine()) != null)

📦 Tip: 꼭 외우자!
java
코드 복사
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
StringTokenizer st = new StringTokenizer(br.readLine());
int a = Integer.parseInt(st.nextToken());