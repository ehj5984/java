<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>데이터 입력</title>
<meta name='viewport' content='width=device-width, initial-scale=1'>
<link rel='stylesheet' type='text/css' media='screen'
	href='${pageContext.request.contextPath}/resources/insert.css'>
</head>
<body>
		   <section class="wrap">
        <form action="update_action">
            <input type="text" name="idx" value="${idx }" />
            <label> 이름 입력 : 
                <input type="text" name="student_name" placeholder="이름" value="${studentName }" />
            </label>
            <label> 중간고사 점수 입력 : 
                <input type="number" name="middle_score" placeholder="점수" value="${middleScore }" />
            </label>
            <label> 기말고사 점수 입력 : 
                <input type="number" name="final_score" placeholder="점수" value="${finalScore }" />
            </label>
            <input type="submit" value="입력 완료" />
        </form>
    </section>

</body>
</html>