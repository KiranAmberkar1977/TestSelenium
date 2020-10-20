package MyExample;

public class MyFinalVar {
	final public int myvar;
	
	MyFinalVar() {
		this(10);
	}
	
	MyFinalVar(int var) {
		this.myvar = var;
	}
	
	public static void main(String[] args) {
		
		final int USERS_PER_COMMUNITY = 4;
		final int FILECNT_PROBATION = 10;
		final int FILECNT_SPIKE_FACTOR = 8;
		final int SUPRESSION_PERIOD_CNT = 5;
		
		// TODO Auto-generated method stub
		MyFinalVar i = new MyFinalVar();
		System.out.println("Value of myvar is" + i.myvar);
		
		i = new MyFinalVar(20);
		System.out.println("Value of myvar is" + i.myvar);
		
		int spike_iterations = 8;
		int prob_cnt, u_cnt, f_cnt;
		String myuser, mount_file, firstuser;
		int file_size = 1024, spike_cnt, spike_iter_cnt, FILECNT_SPIKE;
		int myf_cnt, counter=0;
		
		// Step 2: Generate spike data for first user of community for suppression period
				for (spike_iter_cnt = 1; spike_iter_cnt <= spike_iterations; spike_iter_cnt++) {
						for (spike_cnt = 1; spike_cnt <= SUPRESSION_PERIOD_CNT; spike_cnt++) {
							for (u_cnt = 1; u_cnt <= USERS_PER_COMMUNITY; u_cnt++) { 			// Consider Community_1 member users only for now.
								myuser = "QAuser" + u_cnt;
								firstuser = "QAuser1";
								if (myuser.equals(firstuser) && spike_cnt <= 2) {
									FILECNT_SPIKE = (FILECNT_PROBATION * FILECNT_SPIKE_FACTOR * spike_cnt * spike_iter_cnt);
								} else {
									FILECNT_SPIKE = FILECNT_PROBATION;
								}
								for (f_cnt = 1; f_cnt <= FILECNT_SPIKE; f_cnt++) {
									//mount_file = share_Path + "/csfile_" + f_cnt;
									myf_cnt = f_cnt % 10;
									mount_file = "csFile_" + myf_cnt; // For SMB2.
									System.out.println("Value of myuser: " + myuser + "FILECNT_SPIKE is: " + FILECNT_SPIKE + "myf_cnt is: " + myf_cnt + "and mount_file is: " + mount_file);
									//accessEvents(myuser, mount_file, file_size, "WRITE", false);
									counter++;
								}
						}
						System.out.println("Value of spike_cnt is: " + spike_cnt);	
							
						try {
							Thread.sleep(5000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				System.out.println("Value of spike_iter_cnt is: " + spike_iter_cnt);
			}
			System.out.println("Total events pumped is: " + counter);	
		} 
}
