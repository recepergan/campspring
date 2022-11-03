package kodlama.io.rentACar.business.abstracts;

import java.util.List;

import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;

public interface BrandService {
	
	List<GetAllBrandsResponse> findAll();
	//response olmasının sebebi dataları versene diyor ama biz ona listofbrand veriyoruz.
	//return ediyoruz. bu bizim ona yanıtımız
	//son kullanıcıdan data alıyorsam onlar request ben veriyorsam response
	void add(CreateBrandRequest createBrandRequest);
	
	
	

}
