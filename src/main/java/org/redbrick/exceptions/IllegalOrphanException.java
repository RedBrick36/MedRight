package org.redbrick.exceptions;

import java.util.*;

public class IllegalOrphanException extends Exception {

private static final long serialVersionUID = 1L;
private final List<String> messages;

public IllegalOrphanException (List<String> messages) {
  super (( messages != null && messages.size () > 0 ? messages.get (0) : null ));
  this.messages = ( messages != null ) ? messages : new ArrayList<> ();
}

public List<String> getMessages () {
  return Collections.unmodifiableList (this.messages);
}
}
