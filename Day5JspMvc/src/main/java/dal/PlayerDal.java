package dal;

import java.sql.SQLException;
import java.util.List;

import bol.Player;

public interface PlayerDal {
	
	List<Player> getAllPlayers() throws SQLException;

}
