package cn.designPattern.dp.structure._8_Decorator.example2;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {
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
