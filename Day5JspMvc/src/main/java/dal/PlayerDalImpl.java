package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import static utils.DbUtils.getCn;



import bol.Player;

public class PlayerDalImpl  implements PlayerDal{
	
	private Connection cn;
	private PreparedStatement pst1;
	
	//Constructor of PlayerDalImpl...
	
	public PlayerDalImpl() {
		
		//Connection is establishred....
		cn=getCn();
		
		//Query is written...
			try {
				pst1=cn.prepareStatement("select * from player_info");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

	@Override
	public List<Player> getAllPlayers() throws SQLException {
		List<Player> player=new ArrayList<Player>();
		
		return null;
	}

}
