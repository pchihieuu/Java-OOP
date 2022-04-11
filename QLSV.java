package Buoi6_ThayHuy;
import java.util.ArrayList;

public class QLSV {
    /**
     * Bài thu hoạch tuần 8, bài 1
     * Pre:Phan Chí Hiếu
     * G-mail:hieup3611@gmail.com
     * @param args
     */
    public static void main(String[] args) {
        try {
            int chon=0;
            ArrayList<SinhVien> svList = new ArrayList<SinhVien>();
    
            do {
                
                System.out.println("***********************************************************************");
                System.out.println("***                       QUẢN LÝ SINH VIÊN                         ***");
                System.out.println("***               1-Nạp dữ liệu cho danh sách                       ***");
                System.out.println("***               2-Tìm sinh viên theo mã sinh viên                 ***");
                System.out.println("***               3-Xóa một sinh viên đã có trong danh sách        ***");
                System.out.println("***               4-Sửa thông tin của sinh viên                    ***");
                System.out.println("***               5-Danh sách sinh viên học lại                     ***");
                System.out.println("***               6-Danh sách sinh viên được cấp học bổng           ***");
                System.out.println("***               7-In danh sách sinh vien đã nhập                  ***");
                System.out.println("***               8-Thoát                                          ***");
                System.out.println("***********************************************************************");
                chon=Brand.toInt("Hay chon chuc nang sau...[1-8] :");
                switch(chon) {
                case 1:
                	int luachon=0;
                    do {
                        System.out.println("***********************************************");
                        System.out.println("***      NHẬP THÔNG TIN SINH VIÊN MỚI       ***");
                        System.out.println("***      1. Thêm sinh viên vào danh sách    ***");
                        System.out.println("***      2. Back to the main program        ***");
                        luachon=Brand.toInt("Chọn các lựa chon sau...[1-2] :");
                        switch(luachon) {
                        case 1:
                            SinhVien a = new SinhVien();
                            a.nhapDl();
                            svList.add(a);
                        case 2:
                            break;
                        default:
                            System.out.println("Không có lựa chọn!!!");
                        }
                    }while(luachon!=2);
                    break;
                
                        
                case 2:
                	 if (svList.size() > 0) {
                         System.out.println("Nhập mã sinh viên cần tìm: ");
                         int id = Brand.toInt(" ");
                         SinhVien st = checkStudent(id, svList);
                         if (st != null) {
                             System.out.println(st.thongTin());
                             
                         } else {
                             System.out.println("Không tìm thấy mã sinh viên tương ứng");
                         }
                     
                     }
                     break;
                case 3:
                	 if (svList.size() > 0) {
                         System.out.println("Nhập mã sinh viên cần xóa: ");
                         int id = Brand.toInt(" ");
                         SinhVien st = checkStudent(id, svList);
                         if (st != null) {
                             svList.remove(st);
                             System.out.println("Xóa sinh vien thành công");
                         }else{
                             System.out.println("Không tìm thấy mã sinh viên tương ứng... xóa thất bại");
                         }
                     
                     }
                     break;
                case 4:
                	 if (svList.size() > 0) {
                         System.out.println("Nhập maSV muốn sửa: ");
                        int id =Brand.toInt(" ");
                         SinhVien st = checkStudent(id, svList);
                         if (st != null) {
                             
                             st.setMaSv(Brand.toInt("Nhập masv:"));
                            
                             st.setHoTen(Brand.inputString("Nhập Họ Tên:"));
                            
                             st.setGioiTinh(Brand.inputString("Nhập giới tính [Nam-Nu] ").equalsIgnoreCase("Nam"));
                            
                             st.setSoDt(Brand.inputString("Nhập số điện thoại: "));
                             
                             st.setDiemTk(Brand.inputDouble("Nhập điểm  TK: "));
                             System.out.println("Sửa thông tin thành công");


                         }else{
                             System.out.println("Không tìm thấy mã sinh viên tương ứng ");
                         }
                     
                     }
                     break;
                case 5:
                	System.out.println("Danh sách các bạn thi lại: ");
                    for(var st: svList){
                        if(st.getDiemTk() < 4){
                            System.out.println(st.thongTin());
                        }else
                        	System.out.println("Không có sinh viên nào thi lại");
                    }
                    break;
                case 6:
                	System.out.println("Danh sách các bạn được học bổng: ");
                    for(var st: svList){
                        if(st.getDiemTk() >= 7){
                            System.out.println(st.thongTin());
                        }
                    }
                    break;
                case 7:
                	 if(svList.isEmpty()) 
                     System.out.println("Chưa có sinh viên nào !!.");
                       
                 else {
                     System.out.println("Danh sách sinh viên đã được nhập");
                     System.out.println("-------------------------------------------------------------------------------------------------------");				
                     System.out.println("| Ma SV |  Ho Ten             | Gioi tinh | So Dt        |  Diem TK   |  Xep Loai   |  Xet Yeu Cau    |");
                     System.out.println("|-------|---------------------|-----------|--------------|------------|-------------|-----------------|");
                     for(SinhVien i : svList)
                         System.out.println(i.thongTin());
                 }
                  break;
                case 8:
                	break;
                default:
                	System.out.println("Nhập sai chức năng trong MENU.Mời bạn nhập lại!!");
                
            }
            
        } while(chon!=8);
            System.out.println("Xin Chào Và Hẹn Gặp Lại");
      
        }catch (Exception e) {
            e.printStackTrace();
    }
    

	}
	public static SinhVien checkStudent(int id, ArrayList<SinhVien> svList) {
	    for (var s : svList) 
	        if (s.getMaSv() == id) {
	            return s;
	        }
	    
	    return null;
	}

        
    }
    

