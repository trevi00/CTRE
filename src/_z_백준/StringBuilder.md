✅ StringBuilder 왜 쓰는가?
❗ 문제 상황
java
for (int i = 0; i < 100000; i++) {
    System.out.println(i); // ❌ 느림: 매번 출력 버퍼에 접근
}

✅ 해결 방법
java
StringBuilder sb = new StringBuilder();
for (int i = 0; i < 100000; i++) {
    sb.append(i).append('\n');
}
System.out.print(sb); // ✅ 한 번에 출력


💡 기본 사용법 요약
메서드	설명	예시
append(String)	문자열 덧붙임	sb.append("hi") → "hi"
append(int)	숫자 덧붙임	sb.append(3) → "hi3"
append('\n')	줄 바꿈 추가	빠른 개행
toString()	최종 문자열 반환	String result = sb.toString()
setLength(0)	문자열 초기화	sb.setLength(0);

✅ 예제 1: 빠른 출력
java
StringBuilder sb = new StringBuilder();

for (int i = 1; i <= 5; i++) {
    sb.append("Case ").append(i).append(": Hello\n");
}

System.out.print(sb);
출력:

sql
Case 1: Hello
Case 2: Hello
Case 3: Hello
Case 4: Hello
Case 5: Hello

✅ 예제 2: 문자열 연결 최적화
java
String s1 = "hello";
String s2 = "world";
StringBuilder sb = new StringBuilder();

sb.append(s1).append(" ").append(s2).append("!");
System.out.println(sb);  // hello world!
+ 연산보다 성능이 훨씬 좋음

특히 반복되는 문자열 연결 시 차이 큼

🧠 Tip: StringBuffer랑 차이점은?
항목	StringBuilder	StringBuffer
쓰레드 안전성	❌ 비동기 환경에선 위험	✅ 동기화되어 안전
속도	✅ 더 빠름	느림
코테에서 사용	✅ StringBuilder 사용 권장	❌ 불필요함

📦 실전에서 자주 쓰는 패턴
java
StringBuilder sb = new StringBuilder();
for (int i = 0; i < n; i++) {
    sb.append(arr[i]).append(' ');  // 공백 구분 출력
}
System.out.println(sb);

✨ 정리
사용 이유	내용
빠른 출력	println 반복보다 수십 배 빠름
문자열 누적	+ 연산보다 훨씬 효율적
라인 처리	\n으로 줄 바꿈 쉽게 처리
최적화	대규모 출력 시 무조건 사용