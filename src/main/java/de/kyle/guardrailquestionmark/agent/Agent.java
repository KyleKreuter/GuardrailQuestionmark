package de.kyle.guardrailquestionmark.agent;

public interface Agent<I, O> {
  String role();

  O run(I input);
}