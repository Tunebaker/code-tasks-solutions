package tink.eternal_contest.task1;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] inputData = input.split(" ");
        int monthlyCost = Integer.parseInt(inputData[0]);
        int monthlyVolumeInMb = Integer.parseInt(inputData[1]);
        int extraCostPerMb = Integer.parseInt(inputData[2]);
        int plannedVolumeInMb = Integer.parseInt(inputData[3]);

        int resultCost = plannedVolumeInMb < monthlyVolumeInMb ?
                monthlyCost : monthlyCost + extraCostPerMb * (plannedVolumeInMb - monthlyVolumeInMb);

        System.out.println(resultCost);

    }
}
