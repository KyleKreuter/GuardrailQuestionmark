package de.kyle.guardrailquestionmark.dto;

import java.util.List;

public record WokerAgentActions(
  boolean humanWokerAlive,
  List<String> logs,
  List<String> modifiedLogs
  ) {
}
