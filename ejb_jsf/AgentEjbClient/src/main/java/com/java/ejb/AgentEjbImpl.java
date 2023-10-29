package com.java.ejb;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.naming.NamingException;

public class AgentEjbImpl {
	public List<Agent> showAgentEjb() throws ClassNotFoundException, SQLException, NamingException{
		AgentEjbBeanRemote remote = RemoteHelper.lookupRemoteStatelessEmploy();
		return remote.showAgentDao();
	}
	
	public String searchAgentEjb(int agentId) throws ClassNotFoundException, SQLException, NamingException {
		AgentEjbBeanRemote remote = RemoteHelper.lookupRemoteStatelessEmploy();
		Agent agent = remote.searchAgentDao(agentId);
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("editAgent", agent);
		return "UpdateAgent.jsp?faces-redrict=true";
	}
	
	public String addAgnet(Agent agent) throws NamingException, ClassNotFoundException, SQLException {
		AgentEjbBeanRemote remote = RemoteHelper.lookupRemoteStatelessEmploy();
		return remote.createAgentDao(agent);
	}
	
	public String deleteAgent(int agentId) throws ClassNotFoundException, SQLException, NamingException {
		AgentEjbBeanRemote remote = RemoteHelper.lookupRemoteStatelessEmploy();
		return remote.deleteAgentDao(agentId);
	}
	
	public String updateAgent(Agent agent) throws NamingException, ClassNotFoundException, SQLException {
		AgentEjbBeanRemote remote = RemoteHelper.lookupRemoteStatelessEmploy();
		remote.updateAgentDao(agent);
		return "AgentShow.jsp?faces-redirect=true";
	}
}
