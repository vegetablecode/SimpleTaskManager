package Model;

public class Task {

	private String note;
	private Boolean status; // 1 - done, 0 - undone
	
	public Task(String note, Boolean status) {
		this.note = note;
		this.status = status;
	}
	
	public void setNote(String note) {
		this.note = note;
	}
	
	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	public String getNote() {
		return note;
	}
	
	public Boolean getStatus() {
		return status;
	}
	
}
