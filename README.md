# 1. 프로젝트 명 : STS19_REST
# 2. 프로젝트에 사용된 기술소개
* JAVA 
  * 기본분법, 객체지향 프로그래밍, 다형성, Collection, Exception, Inner class, Stream

* ORACLE & JDBC
  * DML, DDL, DCL, 단일행/그룹함수, Join, SubQuery, 트랜젝션 처리
  
* SPRING
  * Spring Framework
    * Dependency Injection, Autowire, RestController
  * SPRING MVC
    * Spring MVC Model, 
  
* AJAX
  
* Jackson, COS 라이브러리 활용
  
*  Tomcat서버 구축

# 3. 프로젝트 셋업에 관한 절차
### 1. 환경설정
1. eclipse 환경설정
   * window > preferences
     * General
       * workspace - utf-8
       * file assosiations > *sql > dbeaver(Default)
       * file assosiations > *xml > xml Editor(Default)
     * CSS, HTML, JSP Files
       * UTF-8
     * HTML, JSP Files > Editor
       * Templates
            ```
            <!DOCTYPE html>
            <html lang="ko">
            <head>
            <meta charset="${encoding}">
            <title>Insert title here</title>
            </head>
            <body>
            ${cursor}
            </body>
            </html>
            ```

2. tomcat 서버 설정
    * Server Locations
      * Use Tomcat installation (takes control of Tomcat installation)
    * Server Options
      *  Publish module contexts to separate XML files
      *  Modules auto reload by default

3. Oracle
   * oracle XE  /  SID
   * ID : scott**
   * pw : tiger**<br>
---
강사님!! 
전반기 정말정말 수고하셨습니다.<br>
매일 더욱 성장하겠습니다<br>
후반기도 잘부탁드립니다:)<br>
