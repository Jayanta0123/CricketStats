package com.stats.cric.multithread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

class PlayerBattingStat {
	private int totMatches, totInnings, notOuts, runsScored, highestScore, ballsFaced, hundreds, doubleHundreds, fifties, fours, sixes;
	private float battingAvg, battingStrikeRate;
	PlayerBattingStat(int totMatches, int totInnings, int notOuts, int runsScored, int highestScore, float battingAvg,
			int ballsFaced, float battingStrikeRate, int hundreds, int doubleHundreds, int fifties, int fours, int sixes) {
		this.totMatches = totMatches; this.totInnings = totInnings; this.notOuts = notOuts; 
		this.runsScored = runsScored; this.highestScore = highestScore; this.ballsFaced = ballsFaced;
		this.hundreds = hundreds; this.doubleHundreds = doubleHundreds; this.fifties = fifties;
		this.fours = fours; this.sixes = sixes; 
		this.battingAvg = battingAvg; this.battingStrikeRate = battingStrikeRate;
	}
	PlayerBattingStat() {	}
	public int getTotMatches() { return totMatches;}
	public void setTotMatches(int totMatches) {	this.totMatches = totMatches;	}
	public int getTotInnings() {return totInnings;	}
	public void setTotInnings(int totInnings) {		this.totInnings = totInnings;	}
	public int getNotOuts() {	return notOuts;	}
	public void setNotOuts(int notOuts) {	this.notOuts = notOuts;	}
	public int getRunsScored() {return runsScored;	}
	public void setRunsScored(int runsScored) {	this.runsScored = runsScored;}
	public int getHighestScore() {	return highestScore;}
	public void setHighestScore(int highestScore) {this.highestScore = highestScore;}
	public int getBallsFaced() {return ballsFaced;	}
	public void setBallsFaced(int ballsFaced) {	this.ballsFaced = ballsFaced;}
	public int getHundreds() {	return hundreds;}
	public void setHundreds(int hundreds) {	this.hundreds = hundreds;	}
	public int getDoubleHundreds() {return doubleHundreds;	}
	public void setDoubleHundreds(int doubleHundreds) {	this.doubleHundreds = doubleHundreds;	}
	public int getFifties() {return fifties;	}
	public void setFifties(int fifties) {this.fifties = fifties;}
	public int getFours() {	return fours;}
	public void setFours(int fours) {this.fours = fours;}
	public int getSixes() {	return sixes;}
	public void setSixes(int sixes) {this.sixes = sixes;}
	public float getBattingAvg() {return battingAvg;}
	public void setBattingAvg(float battingAvg) {	this.battingAvg = battingAvg;	}
	public float getBattingStrikeRate() {	return battingStrikeRate;	}
	public void setBattingStrikeRate(float battingStrikeRate) {	this.battingStrikeRate = battingStrikeRate; }
	@Override
	public String toString() {
		return "PlayerBattingStat [totMatches=" + totMatches + ", totInnings=" + totInnings + ", notOuts=" + notOuts
				+ ", runsScored=" + runsScored + ", highestScore=" + highestScore + ", ballsFaced=" + ballsFaced
				+ ", hundreds=" + hundreds + ", doubleHundreds=" + doubleHundreds + ", fifties=" + fifties + ", fours="
				+ fours + ", sixes=" + sixes + ", battingAvg=" + battingAvg + ", battingStrikeRate=" + battingStrikeRate
				+ "]";
	}
}

class PlayerBowlingStat {
	private int totMatches, totInnings, ballsBowled, runsGiven, wickets, fiveWickets, tenWickets;
	private float bowlingEconomyRate, bowlingAvg, bowlingStrikeRate;
	private String bestBowlingInn, bestBowlingMatch;
	PlayerBowlingStat(int totMatches, int totInnings, int ballsBowled, int runsGiven, int wickets,
			String bestBowlingInn, String bestBowlingMatch,
			float bowlingEconomyRate, float bowlingAvg, float bowlingStrikeRate, int fiveWickets, int tenWickets) {
		this.totMatches = totMatches; this.totInnings = totInnings; this.ballsBowled = ballsBowled;
		this.runsGiven = runsGiven; this.wickets = wickets; this.fiveWickets = fiveWickets; this.tenWickets = tenWickets;
		this.bowlingEconomyRate = bowlingEconomyRate; this.bowlingAvg = bowlingAvg; this.bowlingStrikeRate = bowlingStrikeRate;
		this.bestBowlingInn = bestBowlingInn;
		this.bestBowlingMatch = bestBowlingMatch;
	}
	PlayerBowlingStat() {	}
	public int getTotMatches() {return totMatches;	}
	public void setTotMatches(int totMatches) {	this.totMatches = totMatches;}
	public int getTotInnings() {return totInnings;}
	public void setTotInnings(int totInnings) {	this.totInnings = totInnings;	}
	public int getBallsBowled() {	return ballsBowled;	}
	public void setBallsBowled(int ballsBowled) {	this.ballsBowled = ballsBowled;	}
	public int getRunsGiven() {	return runsGiven;	}
	public void setRunsGiven(int runsGiven) {	this.runsGiven = runsGiven;	}
	public int getWickets() {	return wickets;	}
	public void setWickets(int wickets) {this.wickets = wickets;	}
	public int getFiveWickets() {return fiveWickets;	}
	public void setFiveWickets(int fiveWickets) {	this.fiveWickets = fiveWickets;	}
	public int getTenWickets() { return tenWickets;	}
	public void setTenWickets(int tenWickets) {	this.tenWickets = tenWickets;	}
	public float getBowlingEconomyRate() {	return bowlingEconomyRate;	}
	public void setBowlingEconomyRate(float bowlingEconomyRate) {	this.bowlingEconomyRate = bowlingEconomyRate;	}
	public float getBowlingAvg() {	return bowlingAvg;	}
	public void setBowlingAvg(float bowlingAvg) {	this.bowlingAvg = bowlingAvg;	}
	public float getBowlingStrikeRate() {	return bowlingStrikeRate;	}
	public void setBowlingStrikeRate(float bowlingStrikeRate) {	this.bowlingStrikeRate = bowlingStrikeRate;	}
	public String getBestBowlingInn() {	return bestBowlingInn;	}
	public void setBestBowlingInn(String bestBowlingInn) {	this.bestBowlingInn = bestBowlingInn;	}
	public String getBestBowlingMatch() {	return bestBowlingMatch;	}
	public void setBestBowlingMatch(String bestBowlingMatch) {	this.bestBowlingMatch = bestBowlingMatch;	}
	@Override
	public String toString() {
		return "PlayerBowlingStat [totMatches=" + totMatches + ", totInnings=" + totInnings + ", ballsBowled="
				+ ballsBowled + ", runsGiven=" + runsGiven + ", wickets=" + wickets + ", fiveWickets=" + fiveWickets
				+ ", tenWickets=" + tenWickets + ", bowlingEconomyRate=" + bowlingEconomyRate + ", bowlingAvg="
				+ bowlingAvg + ", bowlingStrikeRate=" + bowlingStrikeRate + ", bestBowlingInn=" + bestBowlingInn
				+ ", bestBowlingMatch=" + bestBowlingMatch + "]";
	}
}

class PlayerSummary {
	private PlayerBattingStat testBatSummary, odiBatSummary, t20iBatSummary, iplBatSummary;
	private PlayerBowlingStat testBowlSummary, odiBowlSummary, t20iBowlSummary, iplBowlSummary;
	private String playerName;
	private int cricbuzzId;
	private boolean isProfileValid;
	public PlayerSummary(PlayerBattingStat testBatSummary, PlayerBattingStat odiBatSummary, PlayerBattingStat t20iBatSummary, 
			PlayerBattingStat iplBatSummary, PlayerBowlingStat testBowlSummary, PlayerBowlingStat odiBowlSummary,
			PlayerBowlingStat t20iBowlSummary, PlayerBowlingStat iplBowlSummary,
			String playerName, int cricbuzzId, boolean isProfileValid) {
		this.testBatSummary = testBatSummary; this.odiBatSummary = odiBatSummary; this.iplBatSummary = iplBatSummary;
		this.testBowlSummary = testBowlSummary; this.odiBowlSummary = odiBowlSummary; this.iplBowlSummary = iplBowlSummary;
		this.t20iBatSummary = t20iBatSummary; this.t20iBowlSummary = t20iBowlSummary;
		this.playerName = playerName; this.cricbuzzId = cricbuzzId; this.isProfileValid = isProfileValid;
	}
	PlayerSummary() {	}
	
	public boolean isProfileValid() { 	return isProfileValid;	}
	public void setProfileValid(boolean isProfileValid) {	this.isProfileValid = isProfileValid;	}
	public PlayerBattingStat getTestBatSummary() {	return testBatSummary;	}
	public void setTestBatSummary(PlayerBattingStat testBatSummary) {	this.testBatSummary = testBatSummary;	}
	public PlayerBattingStat getOdiBatSummary() {	return odiBatSummary;	}
	public void setOdiBatSummary(PlayerBattingStat odiBatSummary) {	this.odiBatSummary = odiBatSummary;	}
	public PlayerBattingStat getT20iBatSummary() {	return t20iBatSummary;	}
	public void setT20iBatSummary(PlayerBattingStat t20iBatSummary) {	this.t20iBatSummary = t20iBatSummary;	}
	public PlayerBattingStat getIplBatSummary() {	return iplBatSummary;	}
	public void setIplBatSummary(PlayerBattingStat iplBatSummary) {	this.iplBatSummary = iplBatSummary;	}
	public PlayerBowlingStat getTestBowlSummary() {	return testBowlSummary;	}
	public void setTestBowlSummary(PlayerBowlingStat testBowlSummary) {	this.testBowlSummary = testBowlSummary;	}
	public PlayerBowlingStat getOdiBowlSummary() {	return odiBowlSummary;	}
	public void setOdiBowlSummary(PlayerBowlingStat odiBowlSummary) {	this.odiBowlSummary = odiBowlSummary;	}
	public PlayerBowlingStat getT20iBowlSummary() {	return t20iBowlSummary;	}
	public void setT20iBowlSummary(PlayerBowlingStat t20iBowlSummary) {	this.t20iBowlSummary = t20iBowlSummary;	}
	public PlayerBowlingStat getIplBowlSummary() {	return iplBowlSummary;	}
	public void setIplBowlSummary(PlayerBowlingStat iplBowlSummary) {	this.iplBowlSummary = iplBowlSummary;	}
	public String getPlayerName() {	return playerName;	}
	public void setPlayerName(String playerName) {	this.playerName = playerName;	}
	public int getCricbuzzId() { return cricbuzzId;	}
	public void setCricbuzzId(int cricbuzzId) {	this.cricbuzzId = cricbuzzId;}
	
	@Override
	public String toString() {
		return "PlayerSummary [testBatSummary=" + testBatSummary + ", odiBatSummary=" + odiBatSummary
				+ ", t20iBatSummary=" + t20iBatSummary + ", iplBatSummary=" + iplBatSummary + ", testBowlSummary="
				+ testBowlSummary + ", odiBowlSummary=" + odiBowlSummary + ", t20iBowlSummary=" + t20iBowlSummary
				+ ", iplBowlSummary=" + iplBowlSummary + ", playerName=" + playerName + ", cricbuzzId=" + cricbuzzId 
				+ ", isProfileValid=" + isProfileValid + "]\n";
	}
}

class SortByHighestT20BattingAvg implements Comparator<PlayerSummary> {
	@Override
	public int compare(PlayerSummary arg0, PlayerSummary arg1) {
		if(arg0.getT20iBatSummary()==null && arg1.getT20iBatSummary()!=null) return -1;
		if(arg0.getT20iBatSummary()==null && arg1.getT20iBatSummary()==null) return 0;
		if(arg0.getT20iBatSummary()!=null && arg1.getT20iBatSummary()==null) return 1;
		
		return  (arg1.getT20iBatSummary().getBattingAvg() < arg0.getT20iBatSummary().getBattingAvg()) ? -1 :
				(arg1.getT20iBatSummary().getBattingAvg() > arg0.getT20iBatSummary().getBattingAvg()) ? 1 :
				0 ;
	}
}

class SortByMostIPLRunsScored implements Comparator<PlayerSummary> {
	@Override
	public int compare(PlayerSummary arg0, PlayerSummary arg1) {
		if(arg0.getIplBatSummary()==null && arg1.getIplBatSummary()!=null) return -1;
		if(arg0.getIplBatSummary()==null && arg1.getIplBatSummary()==null) return 0;
		if(arg0.getIplBatSummary()!=null && arg1.getIplBatSummary()==null) return 1;
		
		return (int) (arg1.getIplBatSummary().getRunsScored() - arg0.getIplBatSummary().getRunsScored());
	}
}

class SortByMostODIRuns implements Comparator<PlayerSummary> {
	@Override
	public int compare(PlayerSummary arg0, PlayerSummary arg1) {
		if(arg0.getOdiBatSummary()==null && arg1.getOdiBatSummary()!=null) return -1;
		if(arg0.getOdiBatSummary()==null && arg1.getOdiBatSummary()==null) return 0;
		if(arg0.getOdiBatSummary()!=null && arg1.getOdiBatSummary()==null) return 1;
		return (int) (arg1.getOdiBatSummary().getRunsScored() - arg0.getOdiBatSummary().getRunsScored());
	}
}
	
class SortByMostTestCenturies implements Comparator<PlayerSummary> {
	@Override
	public int compare(PlayerSummary arg0, PlayerSummary arg1) {
		if(arg0.getTestBatSummary()==null && arg1.getTestBatSummary()!=null) return -1;
		if(arg0.getTestBatSummary()==null && arg1.getTestBatSummary()==null) return 0;
		if(arg0.getTestBatSummary()!=null && arg1.getTestBatSummary()==null) return 1;		
		return (int) (arg1.getTestBatSummary().getHundreds() - arg0.getTestBatSummary().getHundreds()) ; 
	}
}

class SortByMostODIWickets implements Comparator<PlayerSummary> {
	@Override
	public int compare(PlayerSummary arg0, PlayerSummary arg1) {
		if(arg0.getOdiBowlSummary()==null && arg1.getOdiBowlSummary()!=null) return -1;
		if(arg0.getOdiBowlSummary()==null && arg1.getOdiBowlSummary()==null) return 0;
		if(arg0.getOdiBowlSummary()!=null && arg1.getOdiBowlSummary()==null) return 1;		
		return (int) (arg1.getOdiBowlSummary().getWickets() - arg0.getOdiBowlSummary().getWickets()) ; 
	}
}

class SortByMostIPLWickets implements Comparator<PlayerSummary> {
	@Override
	public int compare(PlayerSummary arg0, PlayerSummary arg1) {
		if(arg0.getIplBowlSummary()==null && arg1.getIplBowlSummary()!=null) return -1;
		if(arg0.getIplBowlSummary()==null && arg1.getIplBowlSummary()==null) return 0;
		if(arg0.getIplBowlSummary()!=null && arg1.getIplBowlSummary()==null) return 1;		
		return (int) (arg1.getIplBowlSummary().getWickets() - arg0.getIplBowlSummary().getWickets()) ; 
	}
}

class SortByMostTestWickets implements Comparator<PlayerSummary> {
	@Override
	public int compare(PlayerSummary arg0, PlayerSummary arg1) {
		if(arg0.getTestBowlSummary()==null && arg1.getTestBowlSummary()!=null) return -1;
		if(arg0.getTestBowlSummary()==null && arg1.getTestBowlSummary()==null) return 0;
		if(arg0.getTestBowlSummary()!=null && arg1.getTestBowlSummary()==null) return 1;		
		return (int) (arg1.getTestBowlSummary().getWickets() - arg0.getTestBowlSummary().getWickets()) ; 
	}
}

class ReadProfileThread implements Runnable {
	private int start, end;
 	private String[] cricketProfiles;
	List<PlayerSummary> cricketersListPartial;
	ReadProfileThread(String[] cricketProfiles, int start, int end) {
		this.start = start; this.end = end;
		this.cricketProfiles = cricketProfiles;
	}
	@Override
	public void run() {
		long startTime = System.currentTimeMillis();
		cricketersListPartial = MultiThreadedStats.readURLsAndBuildPlayersList(cricketProfiles, start, end);
		long endTime = System.currentTimeMillis();
		System.out.println("Time to build the players-list = " + (endTime-startTime) + " ms, thread = \"" + Thread.currentThread().getName() + "\", start-id = " + start + ", end-id = " + end);
	}
}

public class MultiThreadedStats {
	public static void main (String[] args) {
		String[] cricketProfiles = new String[15000];
		String cricBuzzProfileString = "https://www.cricbuzz.com/profiles/";
		for(int i=0; i<15000; i++) {
			cricketProfiles[i] = cricBuzzProfileString + (25+i);
		}
		List<PlayerSummary> cricketersList;
		long startTime = System.currentTimeMillis();
		
		ReadProfileThread[] profile = new ReadProfileThread[100];
		Thread[] thread = new Thread[100];
		
		for(int idx=0; idx<100; idx++) {
			profile[idx] = new ReadProfileThread(cricketProfiles, 0+150*idx, 149+150*idx);
			thread[idx] = new Thread(profile[idx], "thread-"+idx);
		}
		for(int idx=0; idx<100; idx++)
			thread[idx].start();
		try {
			for(int idx=0; idx<100; idx++) {				
				thread[idx].join();
			}
		}catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		cricketersList = profile[0].cricketersListPartial;
		for(int idx=1; idx<100; idx++)
			cricketersList.addAll(profile[idx].cricketersListPartial);
		
		long endTime = System.currentTimeMillis();
		System.out.println("\nTotal time taken (to build the list) = " + (endTime-startTime) + " ms\n");

		startTime = System.currentTimeMillis();
//		printRecordList(cricketersList);
		printSomeStats(cricketersList);
		endTime = System.currentTimeMillis();
		System.out.println("\nTotal time taken (to print data and stats) = " + (endTime-startTime) + " ms\n");
		System.out.println("\n *** Out of " + cricketProfiles.length + " cricket-profile URLS, " + 
				cricketersList.stream().map(cr -> cr.isProfileValid()).count() 
			+ " have genuine data for cricketer. ***\n");
	}
	
	static List<PlayerSummary> readURLsAndBuildPlayersList(String[] cricketProfiles, int start, int end) {
		List<Integer> testNumbers = new ArrayList<>();
		List<Integer> odiNumbers = new ArrayList<>();
		List<Integer> t20iNumbers = new ArrayList<>();
		List<Integer> iplNumbers = new ArrayList<>();
		List<PlayerSummary> cricketersList = new ArrayList<>();
		
		for (int i=start; i<=end; i++) {
			try {

				BufferedReader buffer = new BufferedReader(new InputStreamReader(new URL(cricketProfiles[i]).openStream()));
				String inputLine;
				testNumbers.removeAll(testNumbers); odiNumbers.removeAll(odiNumbers);
				t20iNumbers.removeAll(t20iNumbers); iplNumbers.removeAll(iplNumbers);
				String playerName="";
				
				int posStartGlobal=0;
				int posEndGlobal=0;
				int posCareerInfoGlobal=0;
				
				while ((inputLine=buffer.readLine()) != null) {
					String[] words = inputLine.split("[ !<>=\"/,.]");
					int posStart = 0; int posEnd = 0; 						
					int posCareerInfo = 0;

					String matchType="";
					for(int x=0; x<words.length; x++) {
						if(words[x].isEmpty() || words[x] == null || words[x].equals("")) continue; 
//						System.out.print(x + "->" + words[x] + " ");
						if(words[x].equals("strong") && (words[x+2].equals("strong") || words[x+3].equals("strong"))){
							if(words[x+1].equals("Test")) {
								posStart = x;
								matchType = "Test";
/*								System.out.println("In Test profile " + i + ", start-pos = " + posStart);
								System.out.println("End pos = " + posEnd);	*/
							}
							else if(words[x+1].equals("ODI")){
								posStart = x;
								matchType = "ODI";
/*								System.out.println("In ODI profile " + i + ", start-pos = " + posStart);					
								System.out.println("End pos = " + posEnd);	*/
							}
							else if(words[x+1].equals("T20I")){
								posStart = x;
								matchType = "T20I";
/*								System.out.println("In T20I profile " + i + ", start-pos = " + posStart);					
								System.out.println("End pos = " + posEnd); */
							}
							else if(words[x+1].equals("IPL")){
								posStart = x;
								matchType = "IPL";
/*								System.out.println("In IPL profile " + i + ", start-pos = " + posStart);					
								System.out.println("End pos = " + posEnd);*/
							}
						}
						
						if(words[x].equals("tbody") && words[x+4].equals("table") && 
								(words[x+7].equals("div") || words[x+8].equals("div")) ){
							posEnd = x;
						}

						if( words[x].equals("cb-font-40")){
							playerName = words[x+1] + " "+ words[x+2];
							if(!words[x+3].equals("h1"))
								playerName += (" " + words[x+3]);
							if(!words[x+4].equals("h1"))
								playerName += (" " + words[x+4]);
						}
						
						if (words[x].equals("Career") && words[x+1].equals("Information") && posStart>0) {
							posCareerInfo = x;
						}											
/*						if(i+25 == 201) {
							System.out.print(" ** " + x + " -> " + words[x] + "\t");
						}
*/				
						posStartGlobal = posStart; posEndGlobal = posEnd; posCareerInfoGlobal = posCareerInfo;
						
						if(StringUtils.isNumeric(words[x]) && x>posStart && posStart>0 && words[x].length()<10 &&
								posEnd>=0 && posStart>posEnd &&
								posStart > posCareerInfo) {
							if(matchType.equals("Test")) testNumbers.add(Integer.parseInt(words[x]));
							else if(matchType.equals("ODI")) odiNumbers.add(Integer.parseInt(words[x]));
							else if(matchType.equals("T20I")) t20iNumbers.add(Integer.parseInt(words[x]));
							else if(matchType.equals("IPL")) iplNumbers.add(Integer.parseInt(words[x]));
						}else if(words[x].equals("-") && x>posStart && posStart>0 && words[x].length()<10 &&
								posEnd>=0 && posStart>posEnd &&
								posStart > posCareerInfo) {
							if(matchType.equals("Test")) testNumbers.add(0);
							else if(matchType.equals("ODI")) odiNumbers.add(0);
							else if(matchType.equals("T20I")) t20iNumbers.add(0);
							else if(matchType.equals("IPL")) iplNumbers.add(0);							
						}
					}
				}
				int cricketProfileId = (i+25);

				/*if(cricketProfileId >=1025 && cricketProfileId <=1049) {
					System.out.println("\n\n******");
					System.out.println("For " + playerName + ", Id = " + cricketProfileId + ", numbers are");
					System.out.println(testNumbers); System.out.println(odiNumbers);
					System.out.println(iplNumbers); System.out.println(t20iNumbers);
					System.out.println("PosStart = " + posStartGlobal + ", posEnd = " + posEndGlobal + ", posCareer = " + posCareerInfoGlobal);
				}*/

				PlayerSummary playerSummary = buildPlayerObject(testNumbers, odiNumbers, t20iNumbers, iplNumbers, playerName, cricketProfileId,
						(!playerName.equals("") && !playerName.isEmpty())	
						);
				cricketersList.add(playerSummary);
				buffer.close();
			} catch(NumberFormatException e) {
				e.printStackTrace();
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		//printRecord(testNumbers, odiNumbers, t20iNumbers, iplNumbers);
		return cricketersList;
	};
	
	private static boolean isValidTestPlayer(PlayerSummary playerSummary) {
		if(playerSummary.getPlayerName() == null || playerSummary.getPlayerName().isEmpty())
			return false;
		if( playerSummary.getTestBatSummary() == null && playerSummary.getTestBowlSummary() == null)
			return false;
		return true;
	}
	
	private static boolean isValidOdiPlayer(PlayerSummary playerSummary) {
		if(playerSummary.getPlayerName() == null || playerSummary.getPlayerName().isEmpty())
			return false;
		if( playerSummary.getOdiBatSummary() == null && playerSummary.getOdiBowlSummary() == null)
			return false;
		return true;
	}

	private static boolean isValidT20iPlayer(PlayerSummary playerSummary) {
		if(playerSummary.getPlayerName() == null || playerSummary.getPlayerName().isEmpty())
			return false;
		if( playerSummary.getT20iBatSummary() == null && playerSummary.getT20iBowlSummary() == null)
			return false;
		return true;
	}
	
	private static boolean isValidIPLPlayer(PlayerSummary playerSummary) {
		if(playerSummary.getPlayerName() == null || playerSummary.getPlayerName().isEmpty())
			return false;
		if( playerSummary.getIplBatSummary() == null && playerSummary.getIplBowlSummary() == null)
			return false;
		return true;
	}

	private static void printSomeStats(List<PlayerSummary> cricketersList) {
		
		System.out.println("\n **** Most Test Centuries ****\n");
		Collections.sort(cricketersList, new SortByMostTestCenturies());
		System.out.println(String.format("%25s", "Player Name") + String.format("%15s", "No of 100s" ) + 
				String.format("%15s", "No of 200s" ) + String.format("%12s", "No of 50s" ) + 
				String.format("%15s", "Highest Score" ) + String.format("%14s", "Batting S.R." ) + 
				String.format("%10s", "Tests") + String.format("%10s", "Innings") + 
				String.format("%15s", "Total Runs") + String.format("%15s", "Batting Avg") + String.format("%12s", "Profile-ID"));
		for(PlayerSummary playerSummary : cricketersList) {
			if(isValidTestPlayer(playerSummary) && hasBattingStatistics(playerSummary, "TEST") && hasAtleastTenCenturiesInTESTAndODI(playerSummary, "TEST"))
				System.out.println(String.format("%25s", playerSummary.getPlayerName()) + 
						String.format("%15s", playerSummary.getTestBatSummary().getHundreds()) +
						String.format("%15s", playerSummary.getTestBatSummary().getDoubleHundreds()) + 
						String.format("%12s", playerSummary.getTestBatSummary().getFifties()) + 
						String.format("%15s", playerSummary.getTestBatSummary().getHighestScore()) + 
						String.format("%14s", playerSummary.getTestBatSummary().getBattingStrikeRate()) + 
						String.format("%10s", playerSummary.getTestBatSummary().getTotMatches()) +
						String.format("%10s", playerSummary.getTestBatSummary().getTotInnings()) + 
						String.format("%15s", playerSummary.getTestBatSummary().getRunsScored()) +
						String.format("%15s", playerSummary.getTestBatSummary().getBattingAvg()) +
						String.format("%12s", playerSummary.getCricbuzzId()));
		}

		System.out.println("\n **** Most Test Wickets ****\n");
		Collections.sort(cricketersList, new SortByMostTestWickets());
		System.out.println(String.format("%25s", "Player Name") + String.format("%20s", "No of Wickets") + 
				String.format("%10s", "Tests") + String.format("%10s", "Innings") +
				String.format("%16s", "Best-bowl(Inn)") + String.format("%16s", "Best-bowl(Mat)") +
				String.format("%12s", "5-Wkt-Haul") + String.format("%12s", "10-Wkt-Haul") +
				String.format("%18s", "Bowl Strike Rate") + String.format("%12s", "Bowl Avg") + String.format("%12s", "Profile-ID"));
		for(PlayerSummary playerSummary : cricketersList) {
			if(isValidTestPlayer(playerSummary) && hasBowlingStatistics(playerSummary, "TEST") && 
					hasAtLeastFiftyOrHundredWicketsInTESTAndODI(playerSummary, "TEST", 100))
				System.out.println(String.format("%25s", playerSummary.getPlayerName()) + 
						String.format("%20s", playerSummary.getTestBowlSummary().getWickets()) + 
						String.format("%10s", playerSummary.getTestBowlSummary().getTotMatches())+ 
						String.format("%10s", playerSummary.getTestBowlSummary().getTotInnings())+
						String.format("%16s", playerSummary.getTestBowlSummary().getBestBowlingInn()) + 
						String.format("%16s", playerSummary.getTestBowlSummary().getBestBowlingMatch()) +
						String.format("%12s", playerSummary.getTestBowlSummary().getFiveWickets()) + 
						String.format("%12s", playerSummary.getTestBowlSummary().getTenWickets()) +
						String.format("%18s", playerSummary.getTestBowlSummary().getBowlingStrikeRate())+
						String.format("%12s", playerSummary.getTestBowlSummary().getBowlingAvg())+
						String.format("%12s", playerSummary.getCricbuzzId()));
		}

		System.out.println("\n **** Most ODI Runs ****\n");
		Collections.sort(cricketersList, new SortByMostODIRuns());
		System.out.println(String.format("%25s", "Player Name") + String.format("%15s", "Total Runs" ) + 
				String.format("%12s", "No of ODIs") + String.format("%10s", "Innings") + 
				String.format("%12s", "No of 100s") + String.format("%12s", "No of 50s") + String.format("%15s", "Batting Avg") +
				String.format("%18s", "Hit-to-fence(4)") + String.format("%18s", "Over-the-fence(4)") +
				String.format("%18s", "Bat Strike Rate") + 
				String.format("%12s", "Profile-ID"));
		for(PlayerSummary playerSummary : cricketersList) {
			if(isValidOdiPlayer(playerSummary) && hasBattingStatistics(playerSummary, "ODI") && hasAtleastTenCenturiesInTESTAndODI(playerSummary, "ODI"))
				System.out.println(String.format("%25s", playerSummary.getPlayerName()) + 
						String.format("%15s", playerSummary.getOdiBatSummary().getRunsScored()) +
						String.format("%12s", playerSummary.getOdiBatSummary().getTotMatches()) +
						String.format("%10s", playerSummary.getOdiBatSummary().getTotInnings()) + 
						String.format("%12s", playerSummary.getOdiBatSummary().getHundreds()) +
						String.format("%12s", playerSummary.getOdiBatSummary().getFifties()) +
						String.format("%15s", playerSummary.getOdiBatSummary().getBattingAvg()) +
						String.format("%18s", playerSummary.getOdiBatSummary().getFours()) + 
						String.format("%18s", playerSummary.getOdiBatSummary().getSixes()) +
						String.format("%18s", playerSummary.getOdiBatSummary().getBattingStrikeRate()) +
						String.format("%12s", playerSummary.getCricbuzzId()));
		}

		System.out.println("\n **** Most ODI Wickets ****\n");
		Collections.sort(cricketersList, new SortByMostODIWickets());
		System.out.println(String.format("%25s", "Player Name") + String.format("%15s", "Total Wkts" ) + 
				String.format("%12s", "No of ODIs") + String.format("%10s", "Innings") + 
				String.format("%15s", "Best-Bowling") + String.format("%15s", "Bowling avg") +
				String.format("%15s", "Bowl Economy") + String.format("%12s", "5-Wkt Haul") +  
				String.format("%12s", "Profile-ID"));
		for(PlayerSummary playerSummary : cricketersList) {
			if(isValidOdiPlayer(playerSummary) && hasBowlingStatistics(playerSummary, "ODI") && 
					hasAtLeastFiftyOrHundredWicketsInTESTAndODI(playerSummary, "ODI", 100))
				System.out.println(String.format("%25s", playerSummary.getPlayerName()) + 
						String.format("%15s", playerSummary.getOdiBowlSummary().getWickets()) +
						String.format("%12s", playerSummary.getOdiBowlSummary().getTotMatches()) +
						String.format("%10s", playerSummary.getOdiBowlSummary().getTotInnings()) + 
						String.format("%15s", playerSummary.getOdiBowlSummary().getBestBowlingInn()) +
						String.format("%15s", playerSummary.getOdiBowlSummary().getBowlingAvg()) +
						String.format("%15s", playerSummary.getOdiBowlSummary().getBowlingEconomyRate()) +
						String.format("%15s", playerSummary.getOdiBowlSummary().getFiveWickets()) +
						String.format("%12s", "5-Wkt Haul") +  
						String.format("%12s", playerSummary.getCricbuzzId()));
		}
		
		System.out.println("\n **** Highest T20i Batting Average ****\n");
		Collections.sort(cricketersList, new SortByHighestT20BattingAvg());
		System.out.println(String.format("%25s", "Player Name") + String.format("%20s", "Batting Average" ) + 
				String.format("%10s", "Matches") + String.format("%10s", "Innings") + String.format("%10s", "Runs") +
				String.format("%15s", "Batting S.R.") + String.format("%10s", "Fifties") +
				String.format("%10s", "Fours") + String.format("%10s", "Sixes") + 
				String.format("%12s", "Profile-ID"));
		for(PlayerSummary playerSummary : cricketersList) {
			if(isValidT20iPlayer(playerSummary) && hasBattingStatistics(playerSummary, "T20I") && 
					hasScoredMinimumFiveHundredRuns(playerSummary, "T20I"))
				System.out.println(String.format("%25s", playerSummary.getPlayerName()) + 
						String.format("%20s", playerSummary.getT20iBatSummary().getBattingAvg()) + 
						String.format("%10s", playerSummary.getT20iBatSummary().getTotMatches()) + 
						String.format("%10s", playerSummary.getT20iBatSummary().getTotInnings()) + 
						String.format("%10s", playerSummary.getT20iBatSummary().getRunsScored()) +
						String.format("%15s", playerSummary.getT20iBatSummary().getBattingStrikeRate()) + 
						String.format("%10s", playerSummary.getT20iBatSummary().getFifties()) +
						String.format("%10s", playerSummary.getT20iBatSummary().getFours()) + 
						String.format("%10s", playerSummary.getT20iBatSummary().getSixes()) + 
						String.format("%12s", playerSummary.getCricbuzzId()));
		}

		System.out.println("\n **** IPL Stats - most runs ****\n");
		Collections.sort(cricketersList, new SortByMostIPLRunsScored());
		System.out.println(String.format("%25s", "Player Name") + String.format("%20s", "Runs in IPL" ) + 
				String.format("%10s", "Matches") + String.format("%10s", "Innings") + String.format("%15s", "Strike Rate") +
				String.format("%10s", "Sixes") + String.format("%10s", "Fours") + String.format("%10s", "Average") + 
				String.format("%15s", "Highest score") + String.format("%10s", "Fifties") +
				String.format("%15s", "IPL-Hundreds") + 
				String.format("%12s", "Profile-ID"));
		for(PlayerSummary playerSummary : cricketersList) {
			if(isValidIPLPlayer(playerSummary) && hasBattingStatistics(playerSummary, "IPL") && 
					hasScoredMinimumFiveHundredRuns(playerSummary, "IPL"))
				System.out.println(String.format("%25s", playerSummary.getPlayerName()) + 
						String.format("%20s", playerSummary.getIplBatSummary().getRunsScored()) + 
						String.format("%10s", playerSummary.getIplBatSummary().getTotMatches()) + 
						String.format("%10s", playerSummary.getIplBatSummary().getTotInnings()) + 
						String.format("%15s", playerSummary.getIplBatSummary().getBattingStrikeRate()) + 
						String.format("%10s", playerSummary.getIplBatSummary().getSixes()) + 
						String.format("%10s", playerSummary.getIplBatSummary().getFours()) + 
						String.format("%10s", playerSummary.getIplBatSummary().getBattingAvg()) +
						String.format("%15s", playerSummary.getIplBatSummary().getHighestScore()) +
						String.format("%10s", playerSummary.getIplBatSummary().getFifties()) +
						String.format("%15s", playerSummary.getIplBatSummary().getHundreds()) +
						String.format("%12s", playerSummary.getCricbuzzId()));
		}
		
		System.out.println("\n **** IPL Stats - Most Wickets ****\n");
		Collections.sort(cricketersList, new SortByMostIPLWickets());
		System.out.println(String.format("%25s", "Player Name") + String.format("%12s", "Total Wkts" ) + 
				String.format("%14s", "IPL Matches") + String.format("%10s", "Innings") + 
				String.format("%15s", "Best-Bowling") + String.format("%15s", "Economy Rate") +
				String.format("%18s", "Bowl Strike Rate") + 
				String.format("%12s", "Profile-ID"));
		for(PlayerSummary playerSummary : cricketersList) {
			if(isValidIPLPlayer(playerSummary) && hasBowlingStatistics(playerSummary, "IPL") && 
					hasAtLeastFiftyOrHundredWicketsInTESTAndODI(playerSummary, "IPL", 50))
				System.out.println(String.format("%25s", playerSummary.getPlayerName()) + 
						String.format("%12s", playerSummary.getIplBowlSummary().getWickets()) +
						String.format("%14s", playerSummary.getIplBowlSummary().getTotMatches()) +
						String.format("%10s", playerSummary.getIplBowlSummary().getTotInnings()) + 
						String.format("%15s", playerSummary.getIplBowlSummary().getBestBowlingInn()) +
						String.format("%15s", playerSummary.getIplBowlSummary().getBowlingEconomyRate()) +
						String.format("%18s", playerSummary.getIplBowlSummary().getBowlingStrikeRate()) +
						String.format("%12s", playerSummary.getCricbuzzId()));
		}

}
	
	private static boolean hasScoredMinimumFiveHundredRuns(PlayerSummary playerSummary, String matchType) {
		if(matchType.equals("TEST") && playerSummary.getTestBatSummary().getRunsScored()>=500 )
			return true;		
		if(matchType.equals("ODI") && playerSummary.getOdiBatSummary().getRunsScored()>=500 )
			return true;		
		if(matchType.equals("T20I") && playerSummary.getT20iBatSummary().getRunsScored()>=500 )
			return true;		
		if(matchType.equals("IPL") && playerSummary.getIplBatSummary().getRunsScored()>=500 )
			return true;		
		return false;
	}

	private static boolean hasAtLeastFiftyOrHundredWicketsInTESTAndODI(PlayerSummary playerSummary, String matchType, int wickets) {
		if(matchType.equals("TEST") && playerSummary.getTestBowlSummary().getWickets()>=wickets)
			return true;
		if(matchType.equals("ODI") && playerSummary.getOdiBowlSummary().getWickets()>=wickets)
			return true;
		if(matchType.equals("T20I") && playerSummary.getT20iBowlSummary().getWickets()>=wickets)
			return true;		
		if(matchType.equals("IPL") && playerSummary.getIplBowlSummary().getWickets()>=wickets)
			return true;		
		return false;
	}

	private static boolean hasAtleastTenCenturiesInTESTAndODI(PlayerSummary playerSummary, String matchType) {
		if(matchType.equals("TEST") && playerSummary.getTestBatSummary().getHundreds()>=10 )
			return true;		
		if(matchType.equals("ODI") && playerSummary.getOdiBatSummary().getHundreds()>=10 )
			return true;
		if(matchType.equals("T20I"))
			return true;		
		if(matchType.equals("IPL"))
			return true;		
		return false;
	}
	
	private static boolean hasBattingStatistics(PlayerSummary playerSummary, String matchType) {
		if(matchType.equals("TEST") && playerSummary.getTestBatSummary()!=null )
			return true;		
		if(matchType.equals("ODI") && playerSummary.getOdiBatSummary()!=null )
			return true;
		if(matchType.equals("T20I") && playerSummary.getT20iBatSummary()!=null )
			return true;
		if(matchType.equals("IPL") && playerSummary.getIplBatSummary()!=null )
			return true;		
		return false;		
	}
	
	private static boolean hasBowlingStatistics(PlayerSummary playerSummary, String matchType) {
		if(matchType.equals("TEST") && playerSummary.getTestBowlSummary()!=null )
			return true;		
		if(matchType.equals("ODI") && playerSummary.getOdiBowlSummary()!=null )
			return true;
		if(matchType.equals("T20I") && playerSummary.getT20iBowlSummary()!=null )
			return true;
		if(matchType.equals("IPL") && playerSummary.getIplBowlSummary()!=null )
			return true;		
		return false;		
	}

	private static void printRecordList(List<PlayerSummary> cricketersList) {
		for(PlayerSummary playerSummary : cricketersList) {
			System.out.println(playerSummary);
		}
	}

	private static PlayerSummary buildPlayerObject(List<Integer> testNumbers, List<Integer> odiNumbers,
			List<Integer> t20iNumbers, List<Integer> iplNumbers, String playerName, int cricbuzzId, boolean isProfileValid
			) {

		float testBatAverage = 0;
		float testStrikeRate = 0;
		float testBowlEconRate = 0;
		float testBowlAverage = 0;
		float testBowlStrikeRate = 0;
		String testBestBowlInn = "";
		String testBestBowlMatch = "";
		
		PlayerBattingStat testBattingStat=null;
		PlayerBowlingStat testBowlingStat=null;
		
		if( !testNumbers.isEmpty()) {
			if(testNumbers.get(1) !=0) {
				testBatAverage = testNumbers.get(5) + (float) testNumbers.get(6)/100;
				testStrikeRate = testNumbers.get(8) + (float) testNumbers.get(9)/100;
				testBatAverage = (testNumbers.get(6)<10)? correctAverageIfNeeded(testNumbers.get(3),(testNumbers.get(1)-testNumbers.get(2))) : testBatAverage;
				testStrikeRate = (testNumbers.get(9)<10)? correctAverageIfNeeded(testNumbers.get(3)*100,testNumbers.get(7)) : testStrikeRate;
	
				testBattingStat = new PlayerBattingStat(testNumbers.get(0), testNumbers.get(1), testNumbers.get(2), 
					testNumbers.get(3), testNumbers.get(4), testBatAverage, testNumbers.get(7), testStrikeRate, testNumbers.get(10),
					testNumbers.get(11), testNumbers.get(12), testNumbers.get(13), testNumbers.get(14));
			}else {
				testBattingStat = new PlayerBattingStat(testNumbers.get(0), 0,0, 0,0,0, 0,0,0, 0,0,0,0);
			}
			
			if(testNumbers.size()>30) {
				testBowlEconRate = testNumbers.get(24) + (float) testNumbers.get(25)/100;
				testBowlAverage = testNumbers.get(26) + (float) testNumbers.get(27)/100;
				testBowlStrikeRate = testNumbers.get(28) + (float) testNumbers.get(29)/100;
				testBowlEconRate = (testNumbers.get(25)<10)? correctAverageIfNeeded(testNumbers.get(18)*6,testNumbers.get(17)) : testBowlEconRate;
				testBowlAverage = (testNumbers.get(27)<10)? correctAverageIfNeeded(testNumbers.get(18),testNumbers.get(19)) : testBowlAverage;
				testBowlStrikeRate = (testNumbers.get(29)<10)? correctAverageIfNeeded(testNumbers.get(17),testNumbers.get(19)) : testBowlStrikeRate;

				testBestBowlInn = "" + testNumbers.get(20) + "/" + testNumbers.get(21);
				testBestBowlMatch = "" + testNumbers.get(22) + "/" + testNumbers.get(23);
				testBowlingStat = new PlayerBowlingStat(testNumbers.get(15), testNumbers.get(16), testNumbers.get(17), 
						testNumbers.get(18), testNumbers.get(19), testBestBowlInn, testBestBowlMatch, testBowlEconRate,
						testBowlAverage, testBowlStrikeRate, testNumbers.get(30), testNumbers.get(31));
			}else {
				testBowlingStat = null;
			}
		}else {
			testBattingStat = null;
			testBowlingStat = null;
		}
		
		float odiBatAverage = 0;
		float odiStrikeRate = 0;
		float odiBowlEconRate = 0;
		float odiBowlAverage = 0;
		float odiBowlStrikeRate = 0;
		String odiBestBowlInn = "";
		String odiBestBowlMatch = "";
		
		PlayerBattingStat odiBattingStat=null;
		PlayerBowlingStat odiBowlingStat=null;
		
		if( !odiNumbers.isEmpty()) {
			if(odiNumbers.get(1) !=0) {
				odiBatAverage = odiNumbers.get(5) + (float) odiNumbers.get(6)/100;
				odiStrikeRate = odiNumbers.get(8) + (float) odiNumbers.get(9)/100;
				odiBatAverage = (odiNumbers.get(6)<10)? correctAverageIfNeeded(odiNumbers.get(3),(odiNumbers.get(1)-odiNumbers.get(2))) : odiBatAverage;
				odiStrikeRate = (odiNumbers.get(9)<10)? correctAverageIfNeeded(odiNumbers.get(3)*100,odiNumbers.get(7)) : odiStrikeRate;
				odiBattingStat = new PlayerBattingStat(odiNumbers.get(0), odiNumbers.get(1), odiNumbers.get(2), 
						odiNumbers.get(3), odiNumbers.get(4), odiBatAverage, odiNumbers.get(7), odiStrikeRate, odiNumbers.get(10),
						odiNumbers.get(11), odiNumbers.get(12), odiNumbers.get(13), odiNumbers.get(14));
			}else {
				odiBattingStat = new PlayerBattingStat(odiNumbers.get(0), 0,0, 0,0,0, 0,0,0, 0,0,0,0);
			}

			if(odiNumbers.size()>30) {
				odiBowlEconRate = odiNumbers.get(24) + (float) odiNumbers.get(25)/100;
				odiBowlAverage = odiNumbers.get(26) + (float) odiNumbers.get(27)/100;
				odiBowlStrikeRate = odiNumbers.get(28) + (float) odiNumbers.get(29)/100;
				odiBowlEconRate = (odiNumbers.get(25)<10)? correctAverageIfNeeded(odiNumbers.get(18)*6,odiNumbers.get(17)) : odiBowlEconRate;
				odiBowlAverage = (odiNumbers.get(27)<10)? correctAverageIfNeeded(odiNumbers.get(18),odiNumbers.get(19)) : odiBowlAverage;
				odiBowlStrikeRate = (odiNumbers.get(29)<10)? correctAverageIfNeeded(odiNumbers.get(17),odiNumbers.get(19)) : odiBowlStrikeRate;

				odiBestBowlInn = "" + odiNumbers.get(20) + "/" + odiNumbers.get(21);
				odiBestBowlMatch = "" + odiNumbers.get(22) + "/" + odiNumbers.get(23);
				odiBowlingStat = new PlayerBowlingStat(odiNumbers.get(15), odiNumbers.get(16), odiNumbers.get(17), 
						odiNumbers.get(18), odiNumbers.get(19), odiBestBowlInn, odiBestBowlMatch, odiBowlEconRate,
						odiBowlAverage, odiBowlStrikeRate, odiNumbers.get(30), odiNumbers.get(31));
			}else {
				odiBowlingStat = null;
			}
		}else {
			odiBattingStat = null;
			odiBowlingStat = null;
		}
		
		float t20iBatAverage = 0;
		float t20iStrikeRate = 0;
		float t20iBowlEconRate = 0;
		float t20iBowlAverage = 0;
		float t20iBowlStrikeRate = 0;
		String t20iBestBowlInn = "";
		String t20iBestBowlMatch = "";
		
		PlayerBattingStat t20iBattingStat=null;
		PlayerBowlingStat t20iBowlingStat=null;
		
/*		if(cricbuzzId == 143) {
			System.out.println("\nBefore If");
			t20iNumbers.forEach(n -> System.out.print(n + " :: "));
			System.out.println();
		}*/
		
/*		System.out.println("For Cricbuzz Id " + cricbuzzId + " - " + playerName + 
				" T20iNum Array-size = " +  t20iNumbers.size() + " TestNums Array-size = " +  testNumbers.size() + 
				" ODINum Array-size = " +  odiNumbers.size() + " IPL Array-size = " +  iplNumbers.size());*/
		
		if( !t20iNumbers.isEmpty()) {
			if( t20iNumbers.get(1) !=0) {
				t20iBatAverage = t20iNumbers.get(5) + (float) t20iNumbers.get(6)/100;
				t20iStrikeRate = t20iNumbers.get(8) + (float) t20iNumbers.get(9)/100;
				t20iBatAverage = (t20iNumbers.get(6)<10)? correctAverageIfNeeded(t20iNumbers.get(3),(t20iNumbers.get(1)-t20iNumbers.get(2))) : t20iBatAverage;
				t20iStrikeRate = (t20iNumbers.get(9)<10)? correctAverageIfNeeded(t20iNumbers.get(3)*100,t20iNumbers.get(7)) : t20iStrikeRate;
	
				t20iBattingStat = new PlayerBattingStat(t20iNumbers.get(0), t20iNumbers.get(1), t20iNumbers.get(2), 
						t20iNumbers.get(3), t20iNumbers.get(4), t20iBatAverage, t20iNumbers.get(7), t20iStrikeRate, t20iNumbers.get(10),
						t20iNumbers.get(11), t20iNumbers.get(12), t20iNumbers.get(13), t20iNumbers.get(14));
			} else {
				t20iBattingStat = new PlayerBattingStat(t20iNumbers.get(0), 0,0, 0,0,0, 0,0,0, 0,0,0,0);
			}
			
			if( t20iNumbers.size()>30) {
				t20iBowlEconRate = t20iNumbers.get(24) + (float) t20iNumbers.get(25)/100;
				t20iBowlAverage = t20iNumbers.get(26) + (float) t20iNumbers.get(27)/100;
				t20iBowlStrikeRate = t20iNumbers.get(28) + (float) t20iNumbers.get(29)/100;
				t20iBowlEconRate = (t20iNumbers.get(25)<10)? correctAverageIfNeeded(t20iNumbers.get(18)*6,t20iNumbers.get(17)) : t20iBowlEconRate;
				t20iBowlAverage = (t20iNumbers.get(27)<10)? correctAverageIfNeeded(t20iNumbers.get(18),t20iNumbers.get(19)) : t20iBowlAverage;
				t20iBowlStrikeRate = (t20iNumbers.get(29)<10)? correctAverageIfNeeded(t20iNumbers.get(17),t20iNumbers.get(19)) : t20iBowlStrikeRate;

				t20iBestBowlInn = "" + t20iNumbers.get(20) + "/" + t20iNumbers.get(21);
				t20iBestBowlMatch = "" + t20iNumbers.get(22) + "/" + t20iNumbers.get(23);
				t20iBowlingStat = new PlayerBowlingStat(t20iNumbers.get(15), t20iNumbers.get(16), t20iNumbers.get(17), 
						t20iNumbers.get(18), t20iNumbers.get(19), t20iBestBowlInn, t20iBestBowlMatch, t20iBowlEconRate,
						t20iBowlAverage, t20iBowlStrikeRate, t20iNumbers.get(30), t20iNumbers.get(31));
			}else {
				t20iBowlingStat = null;
			}
		}
		else {
			t20iBattingStat = null;
			t20iBowlingStat = null;
		}

		float iplBatAverage = 0;
		float iplStrikeRate = 0;
		float iplBowlEconRate = 0;
		float iplBowlAverage = 0;
		float iplBowlStrikeRate = 0;
		String iplBestBowlInn = "";
		String iplBestBowlMatch = "";
		
		PlayerBattingStat iplBattingStat=null;
		PlayerBowlingStat iplBowlingStat=null;
		
		if( !iplNumbers.isEmpty()) {
			if( iplNumbers.get(1) !=0) {
				iplBatAverage = iplNumbers.get(5) + (float) iplNumbers.get(6)/100;
				iplStrikeRate = iplNumbers.get(8) + (float) iplNumbers.get(9)/100;
				iplBatAverage = (iplNumbers.get(6)<10)? correctAverageIfNeeded(iplNumbers.get(3),(iplNumbers.get(1)-iplNumbers.get(2))) : iplBatAverage;
				iplStrikeRate = (iplNumbers.get(9)<10)? correctAverageIfNeeded(iplNumbers.get(3)*100,iplNumbers.get(7)) : iplStrikeRate;
				iplBattingStat = new PlayerBattingStat(iplNumbers.get(0), iplNumbers.get(1), iplNumbers.get(2), 
						iplNumbers.get(3), iplNumbers.get(4), iplBatAverage, iplNumbers.get(7), iplStrikeRate, iplNumbers.get(10),
						iplNumbers.get(11), iplNumbers.get(12), iplNumbers.get(13), iplNumbers.get(14));
			}else {
				iplBattingStat = new PlayerBattingStat(iplNumbers.get(0), 0,0, 0,0,0, 0,0,0, 0,0,0,0);
			}
			
			if(iplNumbers.size()>30) {
				iplBowlEconRate = iplNumbers.get(24) + (float) iplNumbers.get(25)/100;
				iplBowlAverage = iplNumbers.get(26) + (float) iplNumbers.get(27)/100;
				iplBowlStrikeRate = iplNumbers.get(28) + (float) iplNumbers.get(29)/100;
				iplBowlEconRate = (iplNumbers.get(25)<10)? correctAverageIfNeeded(iplNumbers.get(18)*6,iplNumbers.get(17)) : iplBowlEconRate;
				iplBowlAverage = (iplNumbers.get(27)<10)? correctAverageIfNeeded(iplNumbers.get(18),iplNumbers.get(19)) : iplBowlAverage;
				iplBowlStrikeRate = (iplNumbers.get(29)<10)? correctAverageIfNeeded(iplNumbers.get(17),iplNumbers.get(19)) : iplBowlStrikeRate;

				iplBestBowlInn = "" + iplNumbers.get(20) + "/" + iplNumbers.get(21);
				iplBestBowlMatch = "" + iplNumbers.get(22) + "/" + iplNumbers.get(23);
				iplBowlingStat = new PlayerBowlingStat(iplNumbers.get(15), iplNumbers.get(16), iplNumbers.get(17), 
						iplNumbers.get(18), iplNumbers.get(19), iplBestBowlInn, iplBestBowlMatch, iplBowlEconRate,
						iplBowlAverage, iplBowlStrikeRate, iplNumbers.get(30), iplNumbers.get(31));
			}else {
				iplBowlingStat = null;
			}
		}else {
			iplBattingStat = null;
			iplBowlingStat = null;
		}
		return new PlayerSummary(testBattingStat, odiBattingStat, t20iBattingStat, iplBattingStat, 
				testBowlingStat, odiBowlingStat, t20iBowlingStat, iplBowlingStat, playerName, cricbuzzId, isProfileValid
				);
	}

	private static float correctAverageIfNeeded(Integer runs, int innings) {
		float calAverage = 0;
		calAverage = (innings != 0)?(float) runs/innings : 0;
		float calRoundedAvg = (float) (Math.round(calAverage*100.0)/100.0);
		return calRoundedAvg;
	}
/*
	private static void printRecord(List<Integer> testNumbers, List<Integer> odiNumbers, 
			List<Integer> t20iNumbers, List<Integer> iplNumbers) {

		System.out.println("****************");
		System.out.println("Test Numbers size = " + testNumbers.size());
		System.out.println("ODI Numbers size = " + odiNumbers.size());
		System.out.println("T20I Numbers size = " + t20iNumbers.size());
		System.out.println("IPL Numbers size = " + iplNumbers.size());
		System.out.println("****************");
		
		if(!testNumbers.isEmpty())
			System.out.println("\nTest Numbers");
		for(Integer num : testNumbers) 
			System.out.print(num + "\t");

		if(!odiNumbers.isEmpty())
			System.out.println("\nODI Numbers");
		for(Integer num : odiNumbers) 
			System.out.print(num + "\t");

		if(!t20iNumbers.isEmpty())
			System.out.println("\nT20I Numbers");
		for(Integer num : t20iNumbers) 
			System.out.print(num + "\t");

		if(!iplNumbers.isEmpty())
			System.out.println("\nIPL Numbers");
		for(Integer num : iplNumbers) 
			System.out.print(num + "\t");
		System.out.println();
	}*/
}
