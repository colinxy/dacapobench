package org.dacapo.analysis.util.events;

import org.dacapo.analysis.util.CSVInputStream.CSVException;

public interface EventErrorListener {
	
	public void handle(EventParseException e) throws EventParseException;
	
	public void handle(CSVException e) throws CSVException;
}
