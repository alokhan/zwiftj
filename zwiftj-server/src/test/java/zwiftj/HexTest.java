package zwiftj;

import com.google.protobuf.InvalidProtocolBufferException;
import org.bouncycastle.util.encoders.Hex;
import org.junit.Test;
import zwiftj.api.model.TcpNodeMsgs;

public class HexTest {
    @Test
    public void test() throws InvalidProtocolBufferException {
        byte[] byteArray = new byte[]{0, 11, 0, 16, 1, 24, 0, 104, 0, 120, 87, 63, -35};
        byte[] byteArrayWithoutLength = new byte[]{ 16, 1, 24, 0, 104, 0};

        System.out.println(Hex.toHexString(byteArray));
        System.out.println(Hex.toHexString(byteArrayWithoutLength));

        TcpNodeMsgs.TCPHello.parseFrom(byteArrayWithoutLength);
    }
}
