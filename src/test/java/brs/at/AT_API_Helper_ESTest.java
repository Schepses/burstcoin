/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 21 21:08:39 GMT 2017
 */

package brs.at;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import brs.at.AT_API_Helper;
import java.math.BigInteger;
import java.nio.BufferOverflowException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AT_API_Helper_ESTest extends AT_API_Helper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-125);
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      byte[] byteArray1 = AT_API_Helper.getByteArray(bigInteger0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = AT_API_Helper.getByteArray((long) 558);
      byte[] byteArray1 = new byte[3];
      BigInteger bigInteger0 = AT_API_Helper.getBigInteger(byteArray0, byteArray0, byteArray1, byteArray0);
      assertEquals((short)558, bigInteger0.shortValue());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = AT_API_Helper.getByteArray((long) 558);
      byte[] byteArray1 = new byte[3];
      BigInteger bigInteger0 = AT_API_Helper.getBigInteger(byteArray1, byteArray0, byteArray0, byteArray0);
      assertArrayEquals(new byte[] {(byte)46, (byte)2, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals((short)0, bigInteger0.shortValue());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = AT_API_Helper.longToNumOfTx(0L);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = AT_API_Helper.longToNumOfTx(1L);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = AT_API_Helper.longToHeight(0L);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int int0 = AT_API_Helper.longToHeight((-326L));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      long long0 = AT_API_Helper.getLongTimestamp((byte)0, 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      long long0 = AT_API_Helper.getLongTimestamp((-605), (-2128));
      assertEquals((-2594160248912L), long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      long long0 = AT_API_Helper.getLong(byteArray0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = AT_API_Helper.getByteArray((-221L));
      BigInteger bigInteger0 = AT_API_Helper.getBigInteger(byteArray0, byteArray0, byteArray0, byteArray0);
      assertEquals((byte)35, bigInteger0.byteValue());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = new byte[2];
      byteArray1[0] = (byte) (-99);
      BigInteger bigInteger0 = AT_API_Helper.getBigInteger(byteArray0, byteArray0, byteArray0, byteArray1);
      assertEquals((byte) (-99), bigInteger0.byteValue());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        AT_API_Helper.getLong((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        AT_API_Helper.getByteArray((BigInteger) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("brs.at.AT_API_Helper", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        AT_API_Helper.getBigInteger(byteArray0, byteArray0, byteArray0, byteArray0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.HeapByteBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        AT_API_Helper.getBigInteger((byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.ByteBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      BigInteger bigInteger0 = new BigInteger(3896, mockRandom0);
      byte[] byteArray0 = AT_API_Helper.getByteArray(bigInteger0);
      assertNotNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      byte[] byteArray1 = AT_API_Helper.getByteArray(bigInteger0);
      // Undeclared exception!
      try { 
        AT_API_Helper.getLong(byteArray1);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.HeapByteBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[7] = (byte)107;
      BigInteger bigInteger0 = AT_API_Helper.getBigInteger(byteArray0, byteArray0, byteArray0, byteArray0);
      byte[] byteArray1 = AT_API_Helper.getByteArray(bigInteger0);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = AT_API_Helper.getByteArray((long) 558);
      long long0 = AT_API_Helper.getLong(byteArray0);
      assertEquals(558L, long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      long long0 = AT_API_Helper.getLongTimestamp(741, 558);
      assertEquals(3182570766894L, long0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int int0 = AT_API_Helper.longToNumOfTx((-1L));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      int int0 = AT_API_Helper.longToHeight(3182570766894L);
      assertEquals(741, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = AT_API_Helper.getByteArray((-73L));
      long long0 = AT_API_Helper.getLong(byteArray0);
      assertArrayEquals(new byte[] {(byte) (-73), (byte) (-1), (byte) (-1), (byte) (-1), (byte) (-1), (byte) (-1), (byte) (-1), (byte) (-1)}, byteArray0);
      assertEquals((-73L), long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      AT_API_Helper aT_API_Helper0 = new AT_API_Helper();
  }
}
