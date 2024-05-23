package com.acorn.racket.community.controller;

import lombok.Data;

@Data
public class CommunityDetailDTO {
	
	String board_name;
	String user_id;
	int post_id;
	String post_title;
	String post_content;
	int uppost;
	int downpost;
	String post_date;
	String post_time;
	int post_viewes;
	
}
