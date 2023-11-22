package groupStageCalculator;


import java.util.*;

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
        List<TeamMatchRecord> groupA = new ArrayList<>();
        TeamMatchRecord teamMatchRecord = null;

        for (int i = 0; i < 4; i++) {
            GroupStageView.repeatIntroTeamDataInfo();

            String inputTeamInfo = scanner.next();
            String[] inputTeamInfoArr = inputTeamInfo.split(",");

            teamMatchRecord = new TeamMatchRecord();
            teamMatchRecord.setTeamName(inputTeamInfoArr[0]);
            teamMatchRecord.setMatchesNum(Integer.parseInt(inputTeamInfoArr[1]));
            teamMatchRecord.setWinMatches(Integer.parseInt(inputTeamInfoArr[2]));
            teamMatchRecord.setDrawMatches(Integer.parseInt(inputTeamInfoArr[3]));
            teamMatchRecord.setLoseMatches(Integer.parseInt(inputTeamInfoArr[4]));
            teamMatchRecord.setScorePoint(Integer.parseInt(inputTeamInfoArr[5]));
            teamMatchRecord.setLosePoint(Integer.parseInt(inputTeamInfoArr[6]));
            teamMatchRecord.sumDifferenceBetweenGainsAndLosses(
                    Integer.parseInt(inputTeamInfoArr[5]),
                    Integer.parseInt(inputTeamInfoArr[6])
            );
            teamMatchRecord.pointCalculator(
                    Integer.parseInt(inputTeamInfoArr[2]),
                    Integer.parseInt(inputTeamInfoArr[3]),
                    Integer.parseInt(inputTeamInfoArr[4])
            );

            groupA.add(teamMatchRecord);
            int[] eachTeamsPointArr = {groupA.get(i).getPoint()};
            teamMatchRecord.eachTeamsPoints(eachTeamsPointArr, groupA);
        }
//        정보 입력이 모두 끝난 시점
//        승점 비교하여 순위 재배열 해야함


//        버블 정렬로 인한 오른차순 완료


        GroupStageView.successRegisterTeamInfo(); // 정보 등록 완료 msg
        groupStageFinallyResult(groupA);
    }

    private void groupStageFinallyResult(List<TeamMatchRecord> groupA) {
        GroupStageView.groupStageFinallyResultInfo(); // 최종 결과 msg


        GroupStageView.endGroupStageProgressInfo(groupA);
    }


}
