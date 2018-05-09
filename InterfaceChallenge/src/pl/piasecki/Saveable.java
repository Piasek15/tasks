package pl.piasecki;

import java.util.List;

/**
 * Created by Patrick on 08 maj 2018
 */
public interface Saveable {
    List<String> write();
    void read(List<String> savedValues);
}
