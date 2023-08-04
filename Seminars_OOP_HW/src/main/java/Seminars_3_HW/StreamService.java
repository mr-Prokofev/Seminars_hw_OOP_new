package gb.hw.education.seminars3;

import java.util.Collections;
import java.util.List;

public class StreamService implements IStreamService {
   @Override
   public void sortByGroupCount(List<IStream> stream){
       StreamComparator comparator = new StreamComparator();
       Collections.sort(stream, comparator);
    }
}
