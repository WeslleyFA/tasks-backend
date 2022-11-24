package br.ce.wcaquino.taskbackend.utils;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Test;

public class DateUtilsTest {
	
	@Test
	public void retornaTrueDataPosterior() {
		LocalDate dataPosterior = LocalDate.of(2050,10,01);
		Assert.assertTrue(DateUtils.isEqualOrFutureDate(dataPosterior));	
	}
	
	@Test
	public void retornaFalseDataAnterior() {
		LocalDate dataAnterior = LocalDate.of(2010,10,01);
		Assert.assertFalse(DateUtils.isEqualOrFutureDate(dataAnterior));	
	}
	
	@Test
	public void retornaTrueDataAtual() {
		LocalDate dataAtual = LocalDate.now();
		Assert.assertTrue(DateUtils.isEqualOrFutureDate(dataAtual));	
	}

}
