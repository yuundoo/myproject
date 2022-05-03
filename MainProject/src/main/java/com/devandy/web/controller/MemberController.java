package com.devandy.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.devandy.web.service.BuyerServiceImpl;
import com.devandy.web.service.CompanyServiceImpl;
import com.devandy.web.service.InfoServiceImpl;
import com.devandy.web.service.ProductServiceImpl;
import com.devandy.web.vo.BuyerVO;
import com.devandy.web.vo.CompanyVO;
import com.devandy.web.vo.InfoVO;
import com.devandy.web.vo.ProductVO;

@RestController
public class MemberController {
	
	@Autowired
	ProductServiceImpl productService;
	@Autowired
	BuyerServiceImpl buyerService;
	@Autowired
	InfoServiceImpl infoService;
	@Autowired
	CompanyServiceImpl companyService;
	
	@GetMapping("/product/all")
	public List<ProductVO> selectAllMembers(){
		return productService.selectAllProduct();
	}
	
	@GetMapping("/buyer/all")
	public List<BuyerVO> selectAllBuyers() {
		return buyerService.selectAllBuyer();
		
	}
	
	@GetMapping("/info/all")
	public List<InfoVO> selectAllInfos(){
		return infoService.selectAllInfo();
	}
	
	@GetMapping("/company/all")
	public List<CompanyVO> selectAllCompanys(){
		return companyService.selectAllCompany();
	}
	
	@PostMapping("/product/new")
	public List<ProductVO> insertProduct(@RequestBody ProductVO product){
		productService.insertProduct(product);
		return productService.selectAllProduct();
	}

	@PutMapping("/product/{id}")
	public List<ProductVO> updateProduct(@PathVariable int id, @RequestBody ProductVO product){
		productService.updateProduct(id, product);
		return productService.selectAllProduct();
	}
	
	@PostMapping("/buyer/new")
	public List<BuyerVO> insertBuyer(@RequestBody BuyerVO buyer){
		buyerService.insertBuyer(buyer);
		return buyerService.selectAllBuyer();
	}

	@PutMapping("/buyer/{id}")
	public List<BuyerVO> updateBuyer(@PathVariable int id, @RequestBody BuyerVO buyer){
		buyerService.updateBuyer(id, buyer);
		return buyerService.selectAllBuyer();
	}
	
	@PostMapping("/info/new")
	public List<InfoVO> insertInfo(@RequestBody InfoVO info){
		infoService.insertInfo(info);
		return infoService.selectAllInfo();
	}

	@PutMapping("/info/{id}")
	public List<InfoVO> updateInfo(@PathVariable int id, @RequestBody InfoVO info){
		infoService.updateInfo(id, info);
		return infoService.selectAllInfo();
	}
	
	@PostMapping("/company/new")
	public List<CompanyVO> insertCompany(@RequestBody CompanyVO company){
		companyService.insertCompany(company);
		return companyService.selectAllCompany();
	}

	@PutMapping("/company/{id}")
	public List<CompanyVO> updateCompany(@PathVariable int id, @RequestBody CompanyVO company){
		companyService.updateCompany(id, company);
		return companyService.selectAllCompany();
	}

	
}
