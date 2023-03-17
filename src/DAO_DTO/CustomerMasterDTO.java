package DAO_DTO;



	import java.io.Serializable;
	import java.util.Objects;

	//Serializable - way to send objects over the network
	//Because we cant send the objects through the network,so we are sending ...like a recipe to create that object
	public class  CustomerMasterDTO implements Comparable<CustomerMasterDTO>,Serializable{

		public CustomerMasterDTO(int customerid, String customername, String customeradderss) {
			super();
			this.customerid = customerid;
			this.customername = customername;
			this.customeradderss = customeradderss;
		}

		private int customerid;
		private String customername;
		private String customeradderss;
		
		public CustomerMasterDTO() {
			// TODO Auto-generated constructor stub
		}

		@Override
		public int compareTo(CustomerMasterDTO o) {
			// TODO Auto-generated method stub
			return 0;
		}

		public int getCustomerid() {
			return customerid;
		}

		public void setCustomerid(int customerid) {
			this.customerid = customerid;
		}

		public String getCustomername() {
			return customername;
		}

		public void setCustomername(String customername) {
			this.customername = customername;
		}

		public String getCustomeradderss() {
			return customeradderss;
		}

		public void setCustomeradderss(String customeradderss) {
			this.customeradderss = customeradderss;
		}

		@Override
		public int hashCode() {
			return Objects.hash(customeradderss, customerid, customername);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			CustomerMasterDTO other = (CustomerMasterDTO) obj;
			return Objects.equals(customeradderss, other.customeradderss) && customerid == other.customerid
					&& Objects.equals(customername, other.customername);
		}

		@Override
		public String toString() {
			return "CustomerMasterDTO [customerid=" + customerid + ", customername=" + customername
					+ ", customeradderss=" + customeradderss + "]";
		}
		
		
		

}
