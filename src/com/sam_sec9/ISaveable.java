package com.sam_sec9;
import java.util.List;

public interface ISaveable {
    List<String> write();
    void read(List<String> saveValues) ;

}
