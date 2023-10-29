package com.java.ejb;

import java.sql.SQLException;
import java.util.List;

import javax.ejb.Remote;

@Remote
public interface AgentEjbBeanRemote {
	List<Agent> showAgentDao() throws ClassNotFoundException, SQLException;
	String createAgentDao(Agent agent) throws ClassNotFoundException, SQLException;
	Agent searchAgentDao(int agentId) throws ClassNotFoundException, SQLException;
	String deleteAgentDao(int empno) throws ClassNotFoundException, SQLException;
	String updateAgentDao(Agent agent) throws ClassNotFoundException, SQLException;
}
