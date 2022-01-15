package com.hai.iostream.exercise;


/**
 * @author hai
 * @date 2022/1/15
 * version 1.0
 */

// 模拟处理流（包装流）

public class Buffered_Reader {
    private Reader_ reader_;

    public Buffered_Reader (Reader_ reader_) {
        this.reader_ = reader_;
    }

    public void readfile () {
        this.reader_.readFile();
    }

    public void readStringFile() {
        this.reader_.readStringFile();
    }
}
