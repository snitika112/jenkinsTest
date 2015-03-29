package the.bhushan;

import java.util.List;

public class Role {

	private Integer id;
	private String code;
	private String remarks;
	private String status;
	private List<String> Commands;
	
	public Role() {
		
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public List<String> getCommands() {
		return Commands;
	}

	public void setCommands(List<String> commands) {
		this.Commands = commands;
	}
}
