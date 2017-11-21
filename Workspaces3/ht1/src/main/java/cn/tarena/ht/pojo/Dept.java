package cn.tarena.ht.pojo;

public class Dept extends BaseEntity{
	private String deptId;
	private String parentId;
	private String deptName;
	private Integer state;
	private Dept parentDept;
	public String getDeptId() {
		return deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public Dept getParentDept() {
		return parentDept;
	}
	public void setParentDept(Dept parentDept) {
		this.parentDept = parentDept;
	}
	@Override
	public String toString() {
		return "Dept [deptId=" + deptId + ", parentId=" + parentId + ", deptName=" + deptName + ", state=" + state
				+ ", parentDept=" + parentDept + "]";
	}
	

}
