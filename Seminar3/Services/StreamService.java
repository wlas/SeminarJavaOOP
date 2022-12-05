package Services;

import data.Stream;

public class StreamService extends StreamComparator {

    public Stream[] streamArray;

    public StreamService(Stream[] stream) {
        streamArray = stream;
    }

    public void sortStreams() {
        int minInd = 0;
        for (int i = 0; i < streamArray.length - 1; i++) {
            for (int j = i + 1; j < streamArray.length; j++) {
                if (compareStreams(streamArray[(minInd)], streamArray[(j)])) {
                    minInd = j;
                }
            }
            var temp = streamArray[(minInd)];
            streamArray[minInd] = streamArray[i];
            streamArray[i] = temp;
        }
    }

    @Override
    public String toString() {
        StringBuilder streams = new StringBuilder();

        for (Stream stream : streamArray) {
            streams.append(stream.toString());
        }
        return streams.toString();
    }
}
