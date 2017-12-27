class DeadLock implements Runnable {
	A a = new A();
	B b = new B();

	DeadLock() {
		Thread t = new Thread(this);
		t.start();
		b.bar(a);
	}

	public void run() {
		a.foo(b);
	}

	public static void main(String arg[]) {
		new DeadLock();
	}
}

class A {
	synchronized void foo(B b) {
		System.out.println("Thread 1 entered foo() method");
		try {
			Thread.sleep(600);
		} catch (InterruptedException e) {
		}
		System.out.println("Thread 1 is trying to call b.last()");
		b.last();
	}

	synchronized void last() {
		System.out.println("Inside A, This is last() method");
	}
}

class B {
	synchronized void bar(A a) {
		System.out.println("Thread 2 entered bar() method");
		try {
			Thread.sleep(600);
		} catch (InterruptedException e) {
		}
		System.out.println("Thread 2 is trying to call b.last()");
		a.last();
	}

	synchronized void last() {
		System.out.println("Inside B, This is last() method");
	}
}