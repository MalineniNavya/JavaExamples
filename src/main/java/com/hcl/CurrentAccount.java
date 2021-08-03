package com.hcl;

public class CurrentAccount  implements Account {

	@Override
	public void debit(double amt, User user) {
		user.setBalance( user.getBalance()-amt);

		
	}

	@Override
	public void credit(double amt, User user) {
		user.setBalance( user.getBalance()-amt);

		
	}

	@Override
	public void checkbalance(User user) {
		user.getBalance();
		
	}
	
	}


