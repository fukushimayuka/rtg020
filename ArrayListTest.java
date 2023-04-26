import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Comparator;

class ArrayListTest {
    public static void main(String[] args) {
        
        //ArrayList生成
        List<String> ls = new ArrayList<>();

        //末尾に要素を追加
        ls.add("サーバサイドエンジニア");
        ls.add("Webフロントエンドエンジニア");
        ls.add("技術統括マネージャー");
        ls.add("アシスタントエンジニア");
        ls.add("みならいエンジニア");
        ls.add("AWSエンジニア");
        ls.add("わかてエンジニア");

        //位置を指定して要素を追加
        ls.add(0, "モバイルエンジニア");

        String separator = System.getProperty("line.separator");
        //0番目取得
        System.out.println("0番目の要素は" + ls.get(0) + separator);

        //ArrayListをループして出力
        System.out.println("---------要素を全表示---------");
        for (var val:ls) {
            System.out.println(val);
        }

        //ArrayListから1番地の要素を削除
        ls.remove(1);
        System.out.println();

        //再度ArrayListを全ループ
        System.out.println("---------1番地の要素を削除---------");
        for (var val: ls) {
            System.out.println(val);
        }

        //コンソール表示を改行
        System.out.println();

        //昇順ソート
        List<String> ls2 = ls.stream().sorted().collect(Collectors.toList());
        System.out.println("---------文字の昇順にソート---------");
        // 文字の昇順にすると
        // ① アルファベット
        // ② ひらがな
        // ③ カタカナ
        // ④ 漢字
        // の順で50音ソートされる。
        for (var val: ls2) {
            System.out.println(val);
        }

        //降順ソート
        // List<String> ls3 = ls.stream().sorted().collect(Comparator.reverseOrder());
        List<String> ls3 = ls.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("---------文字の降順にソート---------");
        for (var val: ls3) {
            System.out.println(val);
        }

        //コンソール表示を改行
        System.out.println();

        //リストを空にする。
        ls.clear();
        if(ls.isEmpty()) {
            System.out.println("リストは空っぽです");
        } else {
            System.out.println("リスト型は空っぽではありません");
        }
    }
}