package repository;

import entity.Team;

public class TeamRepository {
	public static Team getMITeamDetails() {
		Team team = new Team();
		team.setId(101);
		team.setTeamName("Mumbai Indians");
		team.setCaptainName("Hardik Pandya");
		team.setCoachName("jayWardhan");
		team.setQualified(false);
		team.setnRR(2.3f);
		return team;
	}
	
	// Add similar methods for remaining 9 teams
}