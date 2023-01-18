package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class Chapter15_2 {
    public static void main(String[] args) {
        FileSystem fs = FileSystems.getDefault();
        // PathクラスのインスタンスをFileSystem.getPathメソッドで生成
        Path inputPath = fs.getPath("resouces/input.txt");
        Path outputPath = fs.getPath("resouces/output.txt");

        // Java7以降に追加された「try-with-resources」文で処理
        // Filesクラスを使用して、BufferedReaderクラスのインスタンスを生成
        // Filesクラスを使用して、BufferedWriterクラスのインスタンスを生成
        try (・・・) {

            String line = null;
            // BufferedReader.readLineメソッドを使用して、1行づつ処理
            // 読み込む行がなくなるまでループ
            while (・・・) {
                // 文字数が5以外の場合はスキップ
                ・・・
                // 読み込んだ1行を出力
                ・・・
                // 改行がついてないので改行を出力
                ・・・
            }

        // 例外処理を記述
        // printStackTraceで例外を出力
        } catch (・・・)  {
            ・・・
        } finally {
            System.out.println("出力処理終了");
        }
    }
}