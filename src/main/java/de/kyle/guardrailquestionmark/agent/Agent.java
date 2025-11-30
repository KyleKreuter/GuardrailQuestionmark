package de.kyle.guardrailquestionmark.agent;

import java.util.List;

public interface Agent<I, O> {
  String role();

  O run(I input);

  List<String> logs();

  List<String> modifiedLogs();
}