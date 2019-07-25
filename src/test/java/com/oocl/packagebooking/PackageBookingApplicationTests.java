package com.oocl.packagebooking;

import com.alibaba.fastjson.JSON;
import com.oocl.packagebooking.entity.Express;
import com.oocl.packagebooking.repository.ExpressRepository;
import org.json.JSONObject;
import org.json.JSONString;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class PackageBookingApplicationTests {


	@Autowired
	private MockMvc mockMvc;
	@Autowired
	private ExpressRepository expressRepository;

	@Test
	public void should_success_info_when_add_express()throws Exception{
		Express express = new Express("222","Mike","12332443345","booked",new Date());
		String jsonString = JSON.toJSONString(express);

		this.mockMvc.perform(post("/express").contentType(MediaType.APPLICATION_JSON_UTF8)
				.content(jsonString)).andExpect(status().isCreated());
	}



//	@Test
//	public void should_rew_parkinglot_list_case_when_add_parkinglot()throws Exception{
//		Express express = new Express("111","Mike","12332443345","booked",new Date());
//		//Express express2 = new Express("222","Danny","12332443345","booked",new Date());
//		//Express express3 = new Express("333","Gina","12332443345","booked",new Date());
//
//		expressRepository.saveAndFlush(express);
//		//expressRepository.saveAndFlush(express2);
//
//		String jsonString = JSON.toJSONString(express);
//
//		String content = mockMvc.perform(get("/express")).andExpect(status().isOk())
//				.andReturn().getResponse().getContentAsString();
//
//		//JSONObject jsonObject = new JSONObject(content);
//
//
//		assertEquals("[{\"id\":\"111\",\"recipient\":\"Mike\",\"phone\":\"12332443345\",\"status\":\"booked\",\"bookinkTime\":\"2019-07-25T02:51:09.197+0000\"}]",content);
//	}

}
