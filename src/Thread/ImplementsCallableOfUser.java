package Thread;

import Map.Entity.User;

import java.util.concurrent.Callable;

public class ImplementsCallableOfUser implements Callable<User> {

	private User user;

	public ImplementsCallableOfUser(User user) {
		this.user = user;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public User call() throws Exception {
		System.out.println(Thread.currentThread().getName()+"\t coming in");
		user.setId(1);
		user.setAge(user.getAge()+1);
		user.setName("余江");
		return new User(1,"余江",27);
	}
}
