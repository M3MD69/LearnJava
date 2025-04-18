package _1_learn._1_9_network._1_9_8_protocols._1_9_8_1_file_transfer_protocol._1_9_8_1_1_simple.server;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(final String[] ARGUMENTS) throws IOException {
        final ServerSocket SERVER_SOCKET = new ServerSocket(1424);
        final Socket SOCKET = SERVER_SOCKET.accept();
        final InputStream INPUT = SOCKET.getInputStream();
        final OutputStream OUTPUT = new FileOutputStream("src/_1_learn/_1_9_network/_1_9_8_protocols/_1_9_8_1_file_transfer_protocol/_1_9_8_1_1_simple/server/Data.txt");
        final byte[] DATA_OF_FILE_AS_BYTE = new byte[20 * 1024]; // 20 Kilobyte
        int numberOfLine;
        while ((numberOfLine = INPUT.read(DATA_OF_FILE_AS_BYTE)) > 0)
            OUTPUT.write(
                    DATA_OF_FILE_AS_BYTE,
                    0,
                    numberOfLine
            );
        OUTPUT.flush();
        INPUT.close();
        SOCKET.close();
        SERVER_SOCKET.close();
    }
}