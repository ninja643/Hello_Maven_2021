package rs.ac.ni.pmf.oop3;

import java.io.IOException;
import lombok.extern.slf4j.Slf4j;
//import java.util.logging.*;

@Slf4j
public class DemoMaven
{
	//	private static final Logger logger = LoggerFactory.getLogger(DemoMaven.class);

	//	private static void configureLogger(final Logger logger) throws IOException
	//	{
	//		logger.setLevel(Level.ALL);
	//
	//		final Handler consoleHandler = new ConsoleHandler();
	//		consoleHandler.setLevel(Level.FINER);
	//		logger.addHandler(consoleHandler);
	//
	//		final Handler fileHandler = new FileHandler("circles.log", true);
	//		fileHandler.setLevel(Level.WARNING);
	//		fileHandler.setFormatter(new SimpleFormatter());
	//		logger.addHandler(fileHandler);
	//
	//		final Handler fileHandler2 = new FileHandler("custom%g.log", 10 * 1024, 5);
	//		fileHandler2.setLevel(Level.FINEST);
	//
	//		fileHandler2.setFilter(new Filter()
	//		{
	//			@Override
	//			public boolean isLoggable(LogRecord record)
	//			{
	//				return record.getMessage().contains("even");
	//			}
	//		});
	//
	//		fileHandler2.setFormatter(new Formatter()
	//		{
	//			@Override
	//			public String format(LogRecord record)
	//			{
	//				return record.getLoggerName() + ": " + record.getMessage() + "\n";
	//			}
	//		});
	//
	//		logger.addHandler(fileHandler2);
	//	}
	//
	//	private static void configureFromResources()
	//	{
	//		final String propertiesPath = DemoMaven.class.getClassLoader()
	//			.getResource("logging.properties")
	//			.getFile();
	//		System.setProperty("java.util.logging.config.file", propertiesPath);
	//	}

	public static void main(String[] args) throws IOException, BadCircleException
	{
		//	configureLogger(logger);
		//	configureFromResources();

		//		final Logger logger = Logger.getLogger("MyLogger");

		//		logger.warning("Hello Maven!!");
		log.warn("Hello Maven!!");

		for (int i = 0; i < 10; ++i)
		{
			final Circle circle = new Circle(0.0, 0.0, i * 2.0);
			if (i % 2 == 0)
			{
				//				logger.fine("Generated even circle: " + circle.toString());
				log.debug(
					"Generated even circle with coordinates ({}, {}) and radius {}",
					circle.getX(),
					circle.getY(),
					circle.getR());
			}
			else
			{
				//				logger.fine("Generated odd circle: " + circle.toString());
				log.debug("Generated odd circle: {}", circle);
			}
		}

		log.info("Finished!!");
	}
}
