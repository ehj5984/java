<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>데이터 입력</title>
 <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='${pageContext.request.contextPath}/resources/insert.css'>
</head>
<body>
	   <section class="wrap">
      <form  action="insert_action">
        <label > 이름 입력 :
            <input type="text" name="name" placeholder="이름" />
        </label>
        <label > 중간 점수 입력 :
            <input type="text" name="middleScore" placeholder="중간고사 점수" />
        </label>
        <label > 기말 점수 입력 :
            <input type="text" name="finalScore" placeholder="기말고사 점수" />
        </label>
        <input type="submit"  value="입력 완료"/>
      </form>

    </section>
</body>
</html>