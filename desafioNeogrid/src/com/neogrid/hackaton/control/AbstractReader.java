package com.neogrid.hackaton.control;

import java.io.File;

import com.neogrid.hackaton.model.Doca;

public abstract class AbstractReader {

	public abstract Object parse(File fileEntry);
	abstract void addToDoca(Object obj, Doca doca);
}
