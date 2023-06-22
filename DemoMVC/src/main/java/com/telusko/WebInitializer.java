package com.telusko;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	// link to TluskoConfig

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		// jika kondisi getServletMappings memenuhi, akan mengembalikan kelas
		// 	TeluskoConfig untuk memanggil halaman yang di inginkan
		return new Class[] { TeluskoConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		// '/' menerima semua request, jadi harus melewati ini terlebih dahulu
		// jika ingin menambahkan alamat, tambahkan di return { "/","..." }
		return new String[] { "/" };
	}

}
