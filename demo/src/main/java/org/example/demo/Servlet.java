package org.example.demo;
/*
    == 서블릿 ==

    1.서블릿에 대한 정의
    : Java EE (Enterprise Edition)의 일부
    : 웹서버에서 실행되는 java 프로그램
    - 클라이이언트의 '요청'을 처리하고 그 결과를 웹 브라우저에 '응답'하는 역항

    2. 서블릿의 작동 구조
    : Apache Tomcat과 같은 Setcvlet Container에서 실행

    cf) Setcvlet Container
        : 클라이언트로 부터 HTTP요청을 받아 Servlet에 전달하고
            , Servlet에서 응답을 처리한 후 다시 클라이언트로 응답을 변환하는 역할

    : 서블릿 라이플사이클
    - init(): 서블릿이 처음 호출될 때 실행, 초기화 작업을 담당
    - service(): 클라이언트에게 요청이 있을 때 마다 호출
                    ,doGet(), doPost() 등과 같은  HTTP 메서드에 따라 요청을 처리
    - destroy(): 서블릿이 종료될 때 호출되어 리소스를 정리

    : HTTP 요청 & 응답 처리
    - HttpServletRequest와 HttpServletResponse 객체를 사용하여 처리

    3. 서블릿 개발의 특징
    - 핸들러 관리
        : 각각의 요청을 처리하는 메서드를 직접 정의
        : HTTP 요청을 수동으로 처리하고 응답을 작성

    - 매핑 설정
        : 서블릿 매핑을 web.xml과 같은 배포 기술자나 어노테이션을 통해 설정

    cf) jsp (java server page)
        : HTML 코드 내에 JAVA 코드를 작성
        : <% 소스코드 %> | <%= 소스코드 =%>
 */
public class Servlet {
}