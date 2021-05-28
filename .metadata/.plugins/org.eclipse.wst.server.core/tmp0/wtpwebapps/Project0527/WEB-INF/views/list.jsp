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
                    <th>idx</th><th>이름</th><th>성별</th><th>주소</th><th>소속부서</th>
                </tr>
            </thead>
            <tbody>
            	${list }
            </tbody>
        </table>
        <a href = "/project0527" style = "margin-top: 50px;"> 메인으로 </a>
    </section>
</body>
</html>

