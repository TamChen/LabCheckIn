package interceptor;
import java.util.*;

import com.labcheckin.entity.User;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
@SuppressWarnings("serial")
public class UserLoginCheck extends AbstractInterceptor{
	@SuppressWarnings("unchecked")
	public String intercept(ActionInvocation ai) throws Exception {
		Map session = ai.getInvocationContext().getSession();
		User user = (User)session.get("loginUser");
		if(user != null){
			return ai.invoke();
		}else{
			return "login";
		}
	}
}
