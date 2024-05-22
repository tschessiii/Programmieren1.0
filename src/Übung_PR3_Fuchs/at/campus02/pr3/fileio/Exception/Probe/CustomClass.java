package Übung_PR3_Fuchs.at.campus02.pr3.fileio.Exception.Probe;

import java.io.IOException;

public class CustomClass {
    public CustomClass() throws IOException {
        throw new IOException("This is an IOException from CustomClass constructor");
    }
}

