import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.util.*;

public class Test {
    private ArrayList<KeyValue> list;
    public Test()
    {
        this.list=new ArrayList<KeyValue>();
    }
    public void jar_test()
    {
        System.out.println("Jar test success!");
    }
    public String toString()
    {
        return this.list.toString();
    }
}
