package Sec10;

import java.util.Collection;
import java.util.Collections;

public class MainGenerics {

    public static void main(String[] args) {

        League<Team<SoccerPlayer>> soccerLeague = new League<>("Campeonato Brasileiro");

        Team<SoccerPlayer> corinthians = new Team<>("Corinthians");
        SoccerPlayer sam = new SoccerPlayer("Sam");
        corinthians.addPlayer(sam);

        Team<SoccerPlayer> saoPaulo = new Team<>("Sao Paulo");
        SoccerPlayer rai = new SoccerPlayer("rai");
        saoPaulo.addPlayer(rai);

        Team<SoccerPlayer> palmeiras = new Team<>("Palmeiras nao tem mundial");
        SoccerPlayer dudu = new SoccerPlayer("Dudu");
        palmeiras.addPlayer(dudu);

        Team<SoccerPlayer> santos = new Team<>("Santos");
        SoccerPlayer robinho = new SoccerPlayer("Robinho");
        corinthians.addPlayer(robinho);


        soccerLeague.addTeam(corinthians);
        soccerLeague.addTeam(palmeiras);
        soccerLeague.addTeam(santos);
        soccerLeague.addTeam(saoPaulo);


        corinthians.checkResult(palmeiras, 5, 2);
        corinthians.checkResult(santos, 2, 0);
        corinthians.checkResult(saoPaulo, 2, 0);


        soccerLeague.SortTeams();



    }
}
