# SCG_ProductManagement
SCG Intiatives Spring Boot - Product Manage Services

Spring Boot - Product CRUD operations with Mongo DB.

Controllers:
Host: localhost
Port:8050
Context-Path: /api
1./createProduct
2./getAllProducts
3./getProduct/{productId}
4./getProductsByType/{type}
5./getProductBySKU/{sku}
6./updateProduct/{productId}
7./deleteProduct/{productId}

Swagger -> http://localhost:8050/api/swagger-ui.html

CREATE PRODUCT JSON->

{
	"productId":"1",
	"name":"John Players",
	"type":"Shirt",
	"description":"Formal Shirts",
	"price":1234.56,
	"weight":"30 gm",
	"variant":[
	{
		"sku":"1A",
		"displayName":"John Players's Slim Fit Shirt",
		"material":"washable",
		"size":40,
		"color":"Blue"
	},
	{
		"sku":"1B",
		"displayName":"John Players's Slim Fit Shirt",
		"material":"washable",
		"size":42,
		"color":"Black"
	}
	]
}

