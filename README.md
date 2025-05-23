# java-class-4

📄 스마트 캠퍼스 네비게이션 & 정보 제공 시스템


✅ 프로그램 설명
이 프로그램은 QR 코드를 통해 해당 건물의 정보, 강의 시간표, 식당 메뉴 등을 제공한다.
또한 캠퍼스를 순환하는 셔틀버스의 노선 및 출발 시간, 혼잡도 정보를 안내하고 택시 승하차 추천 지점도 표시한다. 
학생들의 이동 효율성을 높이고, 시간 낭비를 줄이기 위한 스마트 캠퍼스 솔루션이다.

✅ 사용자 정의
대학 캠퍼스를 이용하는 학생, 교직원, 방문객
특히 신입생, 외부 방문자, 셔틀 이용이 잦은 학생들

✅ 필요성
넓고 복잡한 캠퍼스에서 건물 정보나 수업 위치를 찾기 어려운 경우가 많다.
셔틀버스의 위치나 도착 시간을 몰라 불필요하게 기다리는 일이 발생한다.
효율적인 이동 경로 안내와 정보 제공 시스템의 부재로 시간과 에너지가 낭비된다.

✅ 사용자가 이 프로그램을 사용해야 하는 이유는?
QR 코드 스캔 한 번으로 건물 정보, 시간표, 식당 메뉴 등을 바로 확인 가능
셔틀 도착 시간, 혼잡도, 노선 확인을 통해 이동 계획을 세우기 쉬움
택시 이용 시 승하차 추천 지점 안내로 편리하고 안전한 이동 가능
캠퍼스를 더 효율적으로 활용할 수 있는 스마트한 생활 도우미 역할

✅ 개발 방법
QR 코드 및 건물 정보 제공 : Java Swing으로 GUI 제작
셔틀버스 시간표 제공 : Java I/O로 읽어와 화면에 표시
택시 승하차 위치 안내 : Swing을 이용해 출력

✅ 전체 동작 과정
사용자가 프로그램 실행
메뉴에서 기능 선택 (QR 정보 보기 / 셔틀 시간표 보기)
QR 코드 입력 또는 셔틀 정류장 선택
해당 기능 결과 출력 (정보, 시간표, 추천 위치 등)

✅ 동작 과정 설명
QR 코드 선택 시: 사용자 입력 또는 QR 이미지 인식 → 건물 정보 출력
셔틀 기능 선택 시: 정류장 정보 및 시간표 로드 → 사용자 위치 기준 시간 안내
택시 기능: 지도 상 안전하고 효율적인 승하차 구역 표시

✅ 개발 프로그램의 이점
직관적인 UI와 간단한 조작으로 누구나 쉽게 사용 가능
캠퍼스 내부 시설에 대한 정보 접근성 향상
대기 시간 최소화, 경로 최적화로 사용자 만족도 상승

✅ 사용자는 누구인가?
대학생 (특히 신입생)
교직원 및 외부 방문객
캠퍼스 셔틀/택시를 자주 이용하는 모든 사용자

✅ 그 사용자가 얻을 수 있는 이점은?
건물 정보, 수업 위치 등 정확하고 빠른 정보 제공
셔틀 이용 시 시간 절약 + 혼잡도 회피 가능
빠르고 안전한 이동으로 효율적인 시간 활용 가능
캠퍼스를 처음 방문하는 사람도 길 잃을 걱정 없이 이용 가능