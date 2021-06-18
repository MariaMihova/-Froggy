import java.awt.font.FontRenderContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lake implements Iterable<Integer> {
    private List<Integer> lake;

    public Lake() {
        this.lake = new ArrayList<>();
    }

    public List<Integer> add(int number) {
        this.lake.add(number);
        return this.lake;
    }


    public Iterator<Integer> iterator() {
        return new Iterator<Integer>(){
            private int index = 0;
            private int lastEven = lake.size() % 2==0 ? lake.size()-2 : lake.size()-1;
            @Override
            public boolean hasNext() {
                return index< lake.size();
            }

            @Override
            public Integer next() {

                if(index == lastEven){
                  int element = lake.get(index);
                    index =1;
                    return element;
                }else{
                   int  element = lake.get(index);
                    index +=2;
                    return element;
                }
            }

        };

    }
}
