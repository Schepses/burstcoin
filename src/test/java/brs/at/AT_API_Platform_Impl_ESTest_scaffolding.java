/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Nov 21 20:45:05 GMT 2017
 */

package brs.at;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class AT_API_Platform_Impl_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "brs.at.AT_API_Platform_Impl"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.timezone", "Europe/Berlin"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AT_API_Platform_Impl_ESTest_scaffolding.class.getClassLoader() ,
      "com.codahale.metrics.MetricRegistry$MetricBuilder$2",
      "com.codahale.metrics.MetricRegistry$MetricBuilder$1",
      "brs.at.AT_API_Impl",
      "brs.BlockImpl",
      "com.codahale.metrics.MetricRegistry$MetricBuilder",
      "com.codahale.metrics.MetricRegistry$MetricBuilder$4",
      "com.codahale.metrics.MetricRegistry$MetricBuilder$3",
      "brs.at.AT_API_Helper",
      "com.codahale.metrics.MetricSet",
      "com.codahale.metrics.Reservoir",
      "brs.at.AT_API_Platform_Impl",
      "brs.Generator",
      "brs.Generator$GeneratorState",
      "brs.crypto.Crypto",
      "brs.BlockchainProcessor$TransactionNotAcceptedException",
      "org.bouncycastle.crypto.CipherParameters",
      "brs.db.store.Dbs",
      "brs.util.Time",
      "com.codahale.metrics.Metric",
      "org.bouncycastle.crypto.BlockCipher",
      "brs.db.store.Stores",
      "brs.BurstException$NotValidException",
      "brs.BurstException",
      "brs.at.AT_Machine_State",
      "brs.at.AT_Constants",
      "brs.at.AT_API",
      "brs.util.Time$EpochTime",
      "brs.Account",
      "brs.BlockchainImpl",
      "brs.Generator$Event",
      "brs.at.AT_Transaction",
      "brs.Blockchain",
      "brs.util.Listener",
      "org.bouncycastle.crypto.CryptoException",
      "brs.Burst",
      "brs.TransactionProcessor",
      "org.bouncycastle.crypto.InvalidCipherTextException",
      "brs.util.Observable",
      "brs.db.BurstIterator",
      "brs.crypto.ReedSolomon$DecodeException",
      "brs.BlockchainProcessor$BlockOutOfOrderException",
      "brs.Block",
      "brs.util.Listeners",
      "brs.BlockchainProcessor",
      "brs.Account$DoubleSpendingException",
      "com.codahale.metrics.MetricRegistry",
      "brs.util.ThreadPool$2",
      "brs.util.ThreadPool$1",
      "brs.Transaction",
      "brs.GeneratorImpl",
      "brs.Account$Event",
      "brs.BurstException$ValidationException",
      "brs.util.ThreadPool",
      "brs.BlockchainProcessor$BlockNotAcceptedException",
      "brs.GeneratorImpl$1",
      "brs.crypto.Crypto$1"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AT_API_Platform_Impl_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "brs.at.AT_API_Platform_Impl",
      "brs.util.ThreadPool",
      "brs.GeneratorImpl",
      "brs.Burst",
      "brs.BlockchainImpl",
      "brs.at.AT_Constants",
      "brs.crypto.Crypto",
      "brs.at.AT_Transaction"
    );
  }
}
