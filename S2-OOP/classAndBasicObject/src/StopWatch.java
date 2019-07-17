import java.util.Random;

public class StopWatch {
    private long beginTime;
    private long endTime;
    private long overlapTime;

    public StopWatch() {
    }

    public long getBeginTime() {
        return beginTime;
    }

    public void setBeginTime() {
        this.beginTime = System.currentTimeMillis();
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime() {
        this.endTime = System.currentTimeMillis();
    }

    public long overlapTime(){
        return getEndTime()-getBeginTime();
    }

    public static void main(String[] args) {

        Random rd= new Random();
        StopWatch stopWatch=new StopWatch();
        stopWatch.setBeginTime();

        int[] myarray=new int[100000];
        for(int i=0; i<myarray.length;i++){
            myarray[i]= rd.nextInt(1000);
        }

        stopWatch.setEndTime();

        System.out.println(stopWatch.overlapTime());
    }
}
