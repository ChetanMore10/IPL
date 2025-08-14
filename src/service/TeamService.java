package service;

import entity.Team;
import repository.TeamRepository;

public class TeamService {
	public void printTeamDetails() {
		Team team = TeamRepository.getMITeamDetails();
		System.out.println("Team ID : "+team.getId());
		System.out.println("Team Name : "+team.getTeamName());
		System.out.println("Team Captain : "+team.getCaptainName());
		System.out.println("Team Coach : "+team.getCoachName());
		System.out.println("Team Net Run Rate : "+team.getnRR());
		System.out.println("Team Qualifiead Or Not : "+team.isQualified());
		
	}
}
