package com.trabalho.biblioteca.validadores;
//package com.stefanini.hackathon2.validadores;
//
//import javax.faces.component.UIComponent;
//import javax.faces.context.FacesContext;
//import javax.faces.convert.Converter;
//import javax.faces.convert.ConverterException;
//
//public class CpfConverter implements Converter {
//	public Object getAsObject(FacesContext context, UIComponent component, String value) throws ConverterException {
//
//		String cpf = value;
//		if (value != null && !value.equals(""))
//			cpf = value.replaceAll("\\.", "").replaceAll("\\-", "");
//
//		return cpf;
//	}
//
//	public String getAsString(FacesContext context, UIComponent component, Object value) throws ConverterException {
//
//		String cpf = (String) value;
//		if (cpf != null && cpf.length() == 11)
//			cpf = cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-"
//					+ cpf.substring(9, 11);
//
//		return cpf;
//	}
//}