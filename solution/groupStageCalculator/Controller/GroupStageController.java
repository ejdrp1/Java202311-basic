package groupStageCalculator.Controller;

import groupStageCalculator.View.GroupStageView;
import groupStageCalculator.Model.TeamMatchRecord;

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
        }
//        정보 입력이 모두 끝난 시점
//        for (int i = 0; i < 4; i++) {
//            System.out.println("groupA.get(" + i + ") : " + groupA.get(i));
//        }

        GroupStageView.successRegisterTeamInfo(); // 정보 등록 완료 msg
        groupStageFinallyResult(groupA, teamMatchRecord);
    }

    private void groupStageFinallyResult(List<TeamMatchRecord> groupA, TeamMatchRecord teamMatchRecord) {
        int[] eachPointResultArr = new int[4];
        Map<TeamMatchRecord, Integer> matchingPoint = new HashMap<>();

        GroupStageView.groupStageFinallyResultInfo(); // 최종 결과 msg

//        버블 정렬 시작 (승점 내림차순)
        for (int i = 0; i < 4; i++) {
            eachPointResultArr[i] = groupA.get(i).getPoint();
            teamMatchRecord.eachTeamsPoints(eachPointResultArr, groupA);
        }

//
        for (int i = 0; i < eachPointResultArr.length; i++) {
            for (int j = 0; j < eachPointResultArr.length; j++) {
                teamMatchRecord.eachTeamEnteredPoint(eachPointResultArr, groupA, matchingPoint);
            }
        }
        teamMatchRecord.outputGroupAData(groupA, matchingPoint);

        for (int i = 0; i < groupA.size(); i++) {
            GroupStageView.endGroupStageProgressInfo(groupA, i);
        }

    }











}
