package com.mrsnor.imageserver.service;

import java.util.List;

import com.mrsnor.imageserver.models.Image;
import com.mrsnor.imageserver.payload.ImageResponse;

public interface ImageService {

	public Image save(Image image);

	public Image findByFileName(String fileName);

	public Image findByUuid(String uuid);
	
	public List<ImageResponse> findAllImageResponse();

}
