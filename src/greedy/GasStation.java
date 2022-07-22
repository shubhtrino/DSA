package greedy;

public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int totalGas =0;
        int totalCost = 0;
        for(int i=0;i<gas.length;i++){
            totalGas+=gas[i];
            totalCost+=cost[i];
        }

        if(totalGas<totalCost){
            return -1;
        }
        int start=0;
        int rGas =0;

        for(int i=0;i<gas.length;i++){
            rGas+=gas[i]-cost[i];
            if(rGas<0){
                start=i+1;
                rGas=0;
            }
        }

        return start;

    }

    public static void main(String[] args) {
        GasStation gasStation= new GasStation();
        gasStation.canCompleteCircuit(new int[] {1,2,3,4,5}, new int[] {3,4,5,1,2});
    }
}
