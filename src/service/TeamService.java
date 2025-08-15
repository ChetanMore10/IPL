package service;

import java.util.Scanner;

import repository.TeamRepository;

public class TeamService {

	public void selectOptions() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to IPL portal ");
		System.out.println("Please select following options - ");
		System.out.println("1. Get All Team Details");
		System.out.println("2. Get team details by short name");

		int input = sc.nextInt();
		System.err.println("You have selected option : " + input);
		int code = 0;

		switch (input) {
		// get All team details
		case 1: {
			System.out.println(TeamRepository.getMITeamDetails());
			System.out.println(TeamRepository.getRCBTeamDetails());
			System.out.println(TeamRepository.getRRTeamDetails());
			System.out.println(TeamRepository.getCSKTeamDetails());
			System.out.println(TeamRepository.getDCTeamDetails());
			System.out.println(TeamRepository.getKKRTeamDetails());
			System.out.println(TeamRepository.getLSGTeamDetails());
			System.out.println(TeamRepository.getGTTeamDetails());
			System.out.println(TeamRepository.getPKTeamDetails());
			System.out.println(TeamRepository.getSRHTeamDetails());

			// call all remaining 8 team methods here

			break;
		}
		// get team details by short Name
		case 2: {
			System.out.println("Please enter your fav team's short name : ");
			sc.nextLine();
			String teamShortName = sc.nextLine();

			System.out.println("Entered team short name is  : " + teamShortName);
			if (teamShortName.matches("\\d+")) {
				code = Integer.parseInt(teamShortName);
			}

			if (teamShortName.equalsIgnoreCase("mi") || code == 101) {
				System.out.println(TeamRepository.getMITeamDetails());
				
			} else if (teamShortName.equalsIgnoreCase("rcb") || code == 102) {
				System.out.println(TeamRepository.getRCBTeamDetails());
				
			} else if (teamShortName.equalsIgnoreCase("rr") || code == 103) {
				System.out.println(TeamRepository.getRRTeamDetails());
				
			} else if (teamShortName.equalsIgnoreCase("csk") || code == 104) {
				System.out.println(TeamRepository.getCSKTeamDetails());
				
			} else if (teamShortName.equalsIgnoreCase("dc") || code == 105) {
				System.out.println(TeamRepository.getDCTeamDetails());
				
			} else if (teamShortName.equalsIgnoreCase("kkr") || code == 106) {
				System.out.println(TeamRepository.getKKRTeamDetails());
				
			} else if (teamShortName.equalsIgnoreCase("lsg") || code == 107) {
				System.out.println(TeamRepository.getLSGTeamDetails());
				
			} else if (teamShortName.equalsIgnoreCase("gt") || code == 108) {
				System.out.println(TeamRepository.getGTTeamDetails());
				
			} else if (teamShortName.equalsIgnoreCase("pk") || code == 109) {
				System.out.println(TeamRepository.getPKTeamDetails());
				
			} else if (teamShortName.equalsIgnoreCase("srh") || code == 110) {
				System.out.println(TeamRepository.getSRHTeamDetails());
			} 
		}

		default:
			throw new IllegalArgumentException("Invalid Team " + input);
		}
	}

}