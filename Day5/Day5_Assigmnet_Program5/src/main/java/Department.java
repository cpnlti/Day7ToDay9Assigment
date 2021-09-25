
public class Department {
    int id;
    String d_name,d_head, d_unitno;
    public Department() {
    	
    }
    
    public Department(int id, String d_name,String d_head, String d_unitno)
    {
        this.id = id;
        this.d_name = d_name;
        this.d_head = d_head;
        this.d_unitno = d_unitno;
    }
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getD_name() {
		return d_name;
	}

	public void setD_name(String d_name) {
		this.d_name = d_name;
	}

	public String getD_head() {
		return d_head;
	}

	public void setD_head(String d_head) {
		this.d_head = d_head;
	}

	public String getD_unitno() {
		return d_unitno;
	}

	public void setD_unitno(String d_unitno) {
		this.d_unitno = d_unitno;
	}

	public String showd()
    {
        return "Department::"+id+" "+d_name+" "+d_head+" "+d_unitno;
    }
}
