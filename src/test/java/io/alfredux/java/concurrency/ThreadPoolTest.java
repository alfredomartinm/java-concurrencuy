package io.alfredux.java.concurrency;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class ThreadPoolTest {

  @Test
  void shouldFailWhenCreatingAPoolInvalidNumberOfThreads() {
    assertThrows(IllegalArgumentException.class, () -> ThreadPool.of(0));
  }
}
