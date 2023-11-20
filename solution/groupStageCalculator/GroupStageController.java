package groupStageCalculator;

import java.util.*;

public class GroupStageController {

    Scanner scanner = new Scanner(System.in);

    public void startProgram() {
        GroupStageView.introProgramInfo();
        GroupStageView.selectStartingNumInfo();
        int selectStartNum = scanner.nextInt();
        selectStartAndEndNum(selectStartNum);
    }

    private void selectStartAndEndNum(int selectStartAndEndNum) {
        switch (selectStartAndEndNum) {
            case 1:
                inputTeamName();
                break;
            case 2:
                GroupStageView.selectProgramEnd();
                return;
        }
    }

    private void inputTeamName() {
        GroupStageView.inputTeamNameInfo();
        setGroupStageTeam();
    }

    private void setGroupStageTeam() {
        TeamMatchRecord teamMatchRecord = new TeamMatchRecord();
        String participateTeams = scanner.next();
        String[] participateTeamsArr = participateTeams.split(",");
        List<Team> groupA = new ArrayList<>(); // 조
        Team team;

        for (String teamNames : participateTeamsArr) {
            team = new Team();
            team.setTeamName(teamNames);
            groupA.add(team);
        }

        TeamIndexNum teamIndexNum = new TeamIndexNum();
        int[] teamIndex = {0, 1, 2, 3};
        teamIndexNum.setTeamIndexNum(teamIndex);


        GroupStageView.introSetGroupStageTeamInfo(groupA, teamIndex); // 조 편성 msg
        repeatGroupStageProgress(groupA, teamMatchRecord, teamIndex);
    }

    private void repeatGroupStageProgress(List<Team> groupA, TeamMatchRecord teamMatchRecord, int[] teamIndex) {
        GroupStageView.groupStageProgressInfo(groupA, teamMatchRecord); // 경기 진행 상황
        GroupStageView.introMatchesScheduleInfo(groupA); // 경기 일정 msg
        for (int i = 0; i < 6; i++) {
            groupStageProgress(groupA, teamMatchRecord, teamIndex);
        }
    }

    private void groupStageProgress(List<Team> groupA, TeamMatchRecord teamMatchRecord, int[] teamIndex) {
//        GroupStageView.nextMatchesInfo(); // 경기 진행 msg
        inputTeamScore(groupA, teamMatchRecord, teamIndex);
    }

    private void inputTeamScore(List<Team> groupA, TeamMatchRecord teamMatchRecord, int[] teamIndex) {
//      1. 팀 스코어 입력
        teamMatchRecord.incrementMatchesNum(); // 경기수 증가
//        teamIndexFirstChange(teamIndex); // 0 1 2 3 => 3 2 1 0
//        teamIndexSecondChange(teamIndex); // 3 2 1 0 => 0 2 1 3
//        teamIndexSecondChangeReverse(teamIndex); // 0 2 1 3 => 3 1 2 0


//        inputTeamScoreNum(groupA, teamMatchRecord, teamIndex); // 팀 스코어 입력


//      2. 경기 승 무 패 count 조건식 + 득실차 + 승점

//        endMatchesRound(teamMatchRecord); // 경기 종료 후
    }


    private void teamIndexSecondChangeReverse(int[] teamIndex) { // 3 1 2 0
        teamIndex[1] = 2;
        teamIndex[2] = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < teamIndex.length; i++) {
            sb.append(teamIndex[i]).append(" ");
        }
        String teamIndexStr = sb.reverse().toString();
    }

    private void teamIndexSecondChange(int[] teamIndex) { // 0 2 1 3
        teamIndex[1] = 2;
        teamIndex[2] = 1;
    }

    private void teamIndexFirstChange(int[] teamIndex) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < teamIndex.length; i++) {
            sb.append(teamIndex[i]).append(" ");
        }
        String teamIndexStr = sb.reverse().toString(); // 3 2 1 0
    }

    private void inputTeamScoreNum(List<Team> groupA, TeamMatchRecord teamMatchRecord, int[] teamIndex) {
        GroupStageView.inputFirstMatchesScoreNumInfo(groupA, teamIndex);
        String firstTeamScore = scanner.next();
        GroupStageView.inputSecondMatchesScoreNumInfo(groupA, teamIndex);
        String secondTeamScore = scanner.next();
//        teamScoreNumCalculator(firstTeamScore, secondTeamScore, teamMatchRecord, teamIndex, groupA);
    }

//    private void teamScoreNumCalculator(String firstTeamScore, String secondTeamScore, TeamMatchRecord teamMatchRecord, int[] teamIndex, List<Team> groupA) {
////        1. String => int 변환
//        int[] firstScoreNum = new int[firstTeamScore.length() - 1];
//        int[] secondScoreNum = new int[secondTeamScore.length() - 1];
////        2. 정수형 배열에 담기
//        String[] firstScoreArr = firstTeamScore.split(",");
//        String[] secondScoreArr = secondTeamScore.split(",");
//        for (int i = 0; i < firstScoreArr.length; i++) {
//            firstScoreNum[i] = Integer.parseInt(firstScoreArr[i]);
//            secondScoreNum[i] = Integer.parseInt(secondScoreArr[i]);
//        }
////        3. index 값 비교
//    }



//    private void endMatchesRound(TeamMatchRecord teamMatchRecord) {
//        teamMatchRecord.incrementMatchesNum(); // 경기수 증가
//        GroupStageView.endMatchesRoundInfo(teamMatchRecord); // 라운드 종료 msg
//    }


}
