<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv='X-UA-Compatible' content='IE=edge'>
<title> 전체 목록 </title>
 <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='${pageContext.request.contextPath}/resources/list.css'>
</head>
<body>
  <section class="wrap">
        <table>
            <thead>
                <tr>
                    <th>idx</th><th>이름</th><th>중간점수</th><th>기말점수</th><th>생성일</th>
                </tr>
            </thead>
            <tbody>
            	${list }
            </tbody>
        </table>
        <a href = "/project0521" style = "margin-top: 50px;"> 홈으로 </a>
    </section>
</body>
</html>

