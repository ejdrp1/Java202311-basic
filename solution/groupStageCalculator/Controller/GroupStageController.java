package groupStageCalculator.Controller;
import groupStageCalculator.View.GroupStageView;
import groupStageCalculator.Model.TeamMatchRecord;
import java.util.*;

public class GroupStageController {
    Scanner scanner = new Scanner(System.in);

    //    프로그램 시작
    public void startProgram() {
        GroupStageView.introProgramInfo();
        selectProgramStart();
    }

    //    프로그램 시작 및 종료 번호 입력
    private void selectProgramStart() {
        GroupStageView.selectProgramStartNumInfo();
        int selectStartNum = scanner.nextInt();
        selectProgramStartNum(selectStartNum);
    }

    //    1.시작 2.종료
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

    //    팀 데이터 입력
    private void inputTeamData() {
        GroupStageView.introTeamDataInfo();
        List<TeamMatchRecord> groupA = new ArrayList<>();
        TeamMatchRecord teamMatchRecord = null;

        for (int i = 0; i < 4; i++) {
            GroupStageView.repeatIntroTeamDataInfo();
            String inputTeamInfo = scanner.next();
            String[] inputTeamInfoArr = inputTeamInfo.split(",");
            teamMatchRecord = new TeamMatchRecord();
            teamMatchRecord.inputTeamDataValue(inputTeamInfoArr, teamMatchRecord, groupA);
        }

//        입력한 순서대로 list 에 저장
        GroupStageView.successRegisterTeamInfo(); // 정보 등록 완료 msg
        groupStageFinallyResult(groupA, teamMatchRecord);
    }

    //    입력 완료된 정보 분석
    private void groupStageFinallyResult(List<TeamMatchRecord> groupA, TeamMatchRecord teamMatchRecord) {
        int[] eachPointResultArr = new int[4];
        Map<TeamMatchRecord, Integer> matchingPoint = new HashMap<>();
        GroupStageView.groupStageFinallyResultInfo(); // 최종 결과 msg
//        버블 정렬 시작 (승점 내림차순)
        teamMatchRecord.sortingTeamPoints(teamMatchRecord, eachPointResultArr, groupA);
//        각 팀의 승점을 비교하여 승점순으로 재배치
        teamMatchRecord.sortingTeamAllInfo(eachPointResultArr, groupA, matchingPoint);
//        map 으로 출력
        teamMatchRecord.outputGroupAData(groupA, matchingPoint);
//        최종 결과 output
        for (int i = 0; i < groupA.size(); i++) {
            GroupStageView.endGroupStageProgressInfo(groupA, i);
        }
    }

}
