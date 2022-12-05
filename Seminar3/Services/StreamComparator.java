package Services;

import data.Stream;

public class StreamComparator {

    public static boolean compareStreams(Stream firstStream, Stream secondStream) {

        return (firstStream.studentGroups.size() > secondStream.studentGroups.size());

    }
}
