
package oodj_assignment;

import java.io.IOException;
import java.util.ArrayList;


public interface Record {
    public void add() throws IOException;
    public void edit(String newData) throws IOException;
    public void remove() throws IOException;
    public ArrayList<String[]> view() throws IOException;
    public ArrayList<String[]> view(String filter) throws IOException;
}
