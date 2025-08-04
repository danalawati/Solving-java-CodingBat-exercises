public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
  if (!isAsleep) {
    if (isMorning && !isMom) {
      return false;
    }
    return true;
  }
  return false;
}
