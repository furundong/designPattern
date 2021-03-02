package cn.designPattern.dp.structure._2_Decorator.example55;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {

    //InputStream in    //这里我可以关联, 也可以不关联, 因为父类已经有了这个in
    protected LowerCaseInputStream(InputStream in) {
        super(in);
    }

    public int read() throws IOException {
        int read = super.read();
        return read == -1 ? read : Character.toLowerCase((char)read);
    }

    public int read(byte[] b, int offset , int len) throws IOException {
        int read = super.read(b, offset, len);
        for (int i = offset; i < offset+read ; i++) {
            b[i] = (byte) Character.toLowerCase((char)b[i]);
        }
        return read;
    }
}

/*

public class LowerCaseInputStream extends InputStream {

    //InputStream in    //这里我可以关联, 也可以不关联, 因为我不需要用到这个in
    InputStream in;
    protected LowerCaseInputStream(InputStream in) {
        this.in = in;
    }

    public int read() throws IOException {
        int read = in.read();
        return read == -1 ? read : Character.toLowerCase((char)read);
    }

    public int read(byte[] b, int offset , int len) throws IOException {
        int read = in.read(b, offset, len);
        for (int i = offset; i < offset+read ; i++) {
            b[i] = (byte) Character.toLowerCase((char)b[i]);
        }
        return read;
    }
}

 */
