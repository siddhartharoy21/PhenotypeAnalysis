package com.phenotypeAnalysis.app.util;
//package hibernate.com.DemoHib;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.util.HashSet;
//import java.util.Iterator;
//import java.util.Set;
//
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//
//public class ReadTreatment {
//
//	File src= new File("C:\\Users\\SIDDU\\Desktop\\LEMNATEC_RAE_WHEAT Phenotyping Results.xlsx");
//	HSSFWorkbook workbook = new HSSFWorkbook();
//	FileInputStream fis= new FileInputStream(src);
//	XSSFWorkbook wb=new XSSFWorkbook(fis);
//	XSSFSheet sheet1=wb.getSheetAt(0);
//	XSSFRow row1 = sheet1.getRow(3);
//	Iterator rows=sheet1.rowIterator();
//	int noRows = 0;
//	int noColumns = sheet1.getRow(0).getPhysicalNumberOfCells();
//
//	while( rows.hasNext() ) {
//        XSSFRow row = (XSSFRow) rows.next();
//        noRows++;
//    }
//
//
//	//System.out.println("Data from Excel is "+data0);
//	System.out.println("Number of columns "+noRows);
//	Set<Treatment> s = new HashSet<Treatment>();
//	int count =0;
//	for(int i=1; i<=noRows; i++)
//	{
//		count++;
//		//for(int j=0; j<=noColumns;j++)
//		//{
//			if(sheet1.getRow(i)!=null){
//			String plantName=sheet1.getRow(i).getCell(0).getStringCellValue();
//			Treatment t = new Treatment();
//			t.setTreatment_Type("greenhouse");
//			t.set
//			p.setPlant_Name(
//			s.add(p);
//			}
//		//}
//	}
//	Iterator it = s.iterator();
//	int count1=0;
//	Configuration con= new Configuration().configure().addAnnotatedClass(Plant.class);
//    SessionFactory sf= con.buildSessionFactory();
//    Session s1= sf.openSession();
//
//    Transaction tx = s1.beginTransaction();
//	while(it.hasNext())
//	{
//		count1++;
//		Plant p  = (Plant)it.next();
//        s1.saveOrUpdate(p);
//	}
//	tx.commit();
//}
//}
