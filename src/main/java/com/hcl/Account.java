package com.hcl;

public interface Account  {
	public abstract void debit(double amt, User user);
	public abstract void credit(double amt,User user);
	public abstract void checkbalance(User user);

}
