package io.alfredux.java.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {

  private ThreadPool() {

  }

  public static ExecutorService of(int numThreads) {
    if (numThreads <= 0)
      throw new IllegalArgumentException("thread pool should have more than " + numThreads + "threads");
    return Executors.newFixedThreadPool(numThreads);
  }

}
