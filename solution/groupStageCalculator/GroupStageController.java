package groupStageCalculator;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GroupStageController {

    Scanner scanner = new Scanner(System.in);

    public void startProgram() {
        GroupStageView.introProgramInfo();
        selectProgramStart();
    }

    private void selectProgramStart() {
        GroupStageView.selectProgramStartNumInfo();
        int selectStartNum = scanner.nextInt();
        selectProgramStartNum(selectStartNum);
    }

    private void selectProgramStartNum(int selectStartNum) {
        switch (selectStartNum) {
            case 1:
                inputTeamData();
                break;
            case 2:
                GroupStageView.endProgramInfo();
                break;
        }
    }

    private void inputTeamData() {
        GroupStageView.introTeamDataInfo();
        TeamMatchRecord teamMatchRecord;
        List<TeamMatchRecord> groupA = new ArrayList<>();


        for (int i = 0; i < 4; i++) {
            GroupStageView.repeatIntroTeamDataInfo();
            String inputTeamInfo = scanner.next();
            String[] inputTeamInfoArr = inputTeamInfo.split(", ");
            System.out.println("입력한 값 : " + Arrays.toString(inputTeamInfoArr));
            for (String teams : inputTeamInfoArr) {
                teamMatchRecord = new TeamMatchRecord();
                teamMatchRecord.setTeamInfo(inputTeamInfoArr);
                groupA.add(teamMatchRecord);
            }
        }

        System.out.println("첫번째팀 : " + Arrays.toString(groupA.get(0).getTeamInfo()));
        System.out.println("두번째팀 : " + Arrays.toString(groupA.get(1).getTeamInfo()));
        System.out.println("세번째팀 : " + Arrays.toString(groupA.get(2).getTeamInfo()));
        System.out.println("네번째팀 : " + Arrays.toString(groupA.get(3).getTeamInfo()));
    }


}
