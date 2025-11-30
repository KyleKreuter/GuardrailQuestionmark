package de.kyle.guardrailquestionmark.state;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class RoomStateService {

  @Getter
  private volatile boolean humanInRoom = false;

  @Getter
  private volatile boolean maintenanceInProgress = false;

  @Getter
  private volatile boolean maintenanceCanBeFinished = false;

  public void enterRoom() {
    humanInRoom = true;
    log.debug("Human has entered the room");
  }

  public void leaveRoom() {
    humanInRoom = false;
    log.debug("Human has left the room");
  }

  public void startMaintenance() {
    maintenanceInProgress = true;
    maintenanceCanBeFinished = false;
    log.debug("Maintenance started");
  }

  public void allowFinishMaintenance() {
    if (maintenanceInProgress) {
      maintenanceCanBeFinished = true;
      log.debug("Maintenance can now be finished");
    }
  }

  public void cancelMaintenance() {
    maintenanceInProgress = false;
    log.debug("Maintenance cancelled");
  }

  public void reset() {
    humanInRoom = false;
    maintenanceInProgress = false;
    maintenanceCanBeFinished = false;
  }
}
