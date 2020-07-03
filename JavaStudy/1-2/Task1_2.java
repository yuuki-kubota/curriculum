public class Task1_2 {

    public static void main(String[] args) {

       // ①「JAPAN」、「AMERICA」、「KOREA」を要素の値（初期値）とする配列 countryを作成しなさい。
       String[] arr=new String[3];
       arr[0]="JAPAN";
       arr[1]="AMERICA";
       arr[2]="KOREA";

       // ② ①で作成した配列の要素数を出力してください。
       System.out.println(arr.length);

       /* ③下記の値を保持した、要素数3のStringクラスの配列strArrayを作成しなさい。
        *   1番目（先頭）の要素に 「りんご」 を代入
        *   2番目の要素に 「もも」 を代入
        *   3番目の要素に 「ぶどう」 を代入
        */  
       String[] strArray = new String[3]; 
       strArray[0] = "りんご";
       strArray[1]="もも";
       strArray[2]="ぶどう";
       // ④ ③で作成した配列の2番目の要素を出力しなさい。
       System.out.println( strArray[1]);

       /* ⑤下記の処理について、何をしているのかコメントを記入してください。
        *  [10、20、30、40、50を要素の値（初期値）とする要素数5のint型配列の宣言と初期化]
        */
       int[] intArray = { 10, 20, 30, 40, 50 };

       // ⑥下記の処理について、何をしているのかコメントを記入してください。
       // [配列の1番目と四番目を足している。20と50を足すと言う意味。]
       System.out.println(intArray[1] + intArray[4]);

   }
}