요리 추천
이전다음
문제
손님이 좋아하는 식재료와, 식재료 선호도를 입력하면, 그에 맞는 요리를 추천해주는 알고리즘을 개발하려고 한다.

아래표는 5종류의 요리에 많이 사용하는 식재료 5개에 요리 점수를 부여한 표이다.



예를 들어, 요리1은 soybean에 3점을 부여했지만, 요리2는 soybean에 2점을 부여했다.

요리3, 4, 5는 soybean에 0점을 부여했다.

위와 같은 요리 점수 표 scores와 요리에 사용되는 식재료의 정보 ingredients, 식재료의 선호도 preference가 주어진다.

요리에 사용되는 식재료의 식재료선호도 * 요리점수의 총합이 가장 높은 요리를 출력하는 프로그램을 작성하시오. 총합이 같은 요리가 여러개일 경우, 요리의 번호가 더 작은 요리를 출력한다.

입력
다섯 줄에 걸쳐 scores가 주어진다. scores는 문제 설명에 적힌 것과 동일한 표로, 요리 번호와 그 요리의 5, 4, 3, 2, 1점짜리 재료의 이름이 공백으로 구분되어 주어진다.

여섯번째 줄에 식재료의 수 N이 주어진다. N은 1 이상 9 이하의 정수다.

일곱번째 줄에 각 식재료의 이름이 공백으로 구분되어 주어진다. 식재료의 이름은 “carrot”, “cucumber”, “radish”, “flour”, “garlic”, “pepper”, “soybean”, “onion”, “sugar” 중 하나로, 중복되지 않는다.

여덟번째 줄에 각 식재료의 개수가 공백으로 구분되어 주어진다. 각 식재료의 수는 1 이상 10 이하의 정수다.



출력
점수 총합이 가장 높은 요리의 번호를 출력한다.

예제 입력
copy1 carrot cucumber soybean pepper garlic
2 cucumber carrot pepper soybean flour
3 radish flour pepper carrot cucumber
4 carrot cucumber pepper onion sugar
5 flour garlic cucumber radish carrot
3
pepper flour soybean
7 5 5
예제 출력
copy3
문항 정보
[Line] 2021 상반기 기출유사 - 4문항 中 1번  