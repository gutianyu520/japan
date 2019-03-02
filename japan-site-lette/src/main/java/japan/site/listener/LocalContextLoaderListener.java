package japan.site.listener;

import javax.servlet.ServletContextEvent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.ContextLoaderListener;

public class LocalContextLoaderListener extends ContextLoaderListener {
	private static final Logger logger = LoggerFactory.getLogger(LocalContextLoaderListener.class);
	@Override
	public void contextInitialized(ServletContextEvent event) {
		logger.info("自定义监听器正在进行初始化。。。");
		// TODO Auto-generated method stub
		super.contextInitialized(event);
	}

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		// TODO Auto-generated method stub
		super.contextDestroyed(event);
	}

}
