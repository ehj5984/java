public class DupArray {
 
    public static void main(String[] args) {
 
        String ARR_MUSIC_FIVE = "과일`사과|야채`상추|과일`바나나|과일`키위|야채`치커리";
        
        String[][] dupArray = getConvertDupArray(ARR_MUSIC_FIVE);
 
        for(int i=0; i<dupArray.length; i++){ //1차 배열 길이만큼 돌린다.
 
            for(int j=0; j<dupArray[i].length; j++) { //1차 배열 안에 들어있는 2차 배열의 길이만큼 돌린다.
 
                System.out.print(dupArray[i][j]+" "); //개행 없이 배열 출력
 
            }
 
            System.out.println(""); //개행 추가
 
        }
    }
 
    public static String[][] getConvertDupArray(String str){
        
        String[] Array1D = str.split("\\|"); // |구분자로 잘라서 1차 배열로 만든다.
        // [과일`사과, 야채`상추, 과일`바나나, 과일`키위, 야채`치커리]
 
        String[][] Array2D = new String[Array1D.length][]; //위에서 나눈 사이즈로 2차 배열을 생성한다.
 
        for(int i=0;i<Array1D.length;i++) {
 
            Array2D[i] = Array1D[i].split("`"); //1차 배열에 `구분자로 자른 값을 배열로 만들어 넣는다.            
 
        }
 
        return Array2D; //[ [과일, 사과], [야채, 상추], [과일, 바나나], [과일, 키위], [야채, 치커리] ]
 
    }
 
}
