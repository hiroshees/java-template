package chapter02;

import static java.lang.Math.PI; // static importが下にある（Googleでは上が標準）

import java.util.ArrayList;
import java.util.List;

/** Eclipseスタイルのテストクラスです。 * 空行が多く、インデントが深めです。 */
public class EclipseStyleDemo {

    // 1行に複数の変数宣言（GoogleではNG）
    private int x = 0;
    private int y = 0;
    private int z = 0;

    // C言語風の配列宣言（GoogleではNG）
    private String[] names;

    public static void main(String args[]) {
        List<String> list = new ArrayList<>();

        list.add("Item 1");

        // インデントが4スペース
        if (list.size() > 0) {
            // 波括弧が次の行にあるスタイル（設定によりますが、Eclipseでよく見かけます）
            System.out.println("List is not empty");
        } else {
            System.out.println("List is empty");
        }
    }

    // 引数の間にスペースがない
    public double calculateArea(double radius) {

        return PI * radius * radius;
    }

    public void setValue() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }
}
