package com.Springregister1.demo.Model;

import jakarta.persistence.Column;

public class UserModel {
	
	
	    private Long id;
	    private String name;
        private String email;
	    private String password;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public UserModel(Long id, String name, String email, String password) {
		
			this.id = id;
			this.name = name;
			this.email = email;
			this.password = password;
		}
		public UserModel() {
			
		}
		@Override
		public String toString() {
			return "UserModel [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + "]";
		}
	    
	    

}
