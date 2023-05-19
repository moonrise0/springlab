<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<aside id="colorlib-hero">
  <div class="flexslider">
    <ul class="slides">
      <li style="background-image: url(images/img_bg_1.jpg);">
        <div class="overlay"></div>
        <div class="container-fluid">
          <div class="row">
            <div class="col-sm-6 offset-sm-3 text-center slider-text">
              <div class="slider-text-inner">
                <div class="desc">
                  <h1 class="head-1">Men's</h1>
                  <h2 class="head-2">Shoes</h2>
                  <h2 class="head-3">Collection</h2>
                  <p class="category"><span>New trending shoes</span></p>
                  <p><a href="#" class="btn btn-primary">Shop Collection</a></p>
                </div>
              </div>
            </div>
          </div>
        </div>
      </li>
      <li style="background-image: url(images/img_bg_2.jpg);">
        <div class="overlay"></div>
        <div class="container-fluid">
          <div class="row">
            <div class="col-sm-6 offset-sm-3 text-center slider-text">
              <div class="slider-text-inner">
                <div class="desc">
                  <h1 class="head-1">Huge</h1>
                  <h2 class="head-2">Sale</h2>
                  <h2 class="head-3"><strong class="font-weight-bold">50%</strong> Off</h2>
                  <p class="category"><span>Big sale sandals</span></p>
                  <p><a href="#" class="btn btn-primary">Shop Collection</a></p>
                </div>
              </div>
            </div>
          </div>
        </div>
      </li>
      <li style="background-image: url(images/img_bg_3.jpg);">
        <div class="overlay"></div>
        <div class="container-fluid">
          <div class="row">
            <div class="col-sm-6 offset-sm-3 text-center slider-text">
              <div class="slider-text-inner">
                <div class="desc">
                  <h1 class="head-1">New</h1>
                  <h2 class="head-2">Arrival</h2>
                  <h2 class="head-3">up to <strong class="font-weight-bold">30%</strong> off</h2>
                  <p class="category"><span>New stylish shoes for men</span></p>
                  <p><a href="#" class="btn btn-primary">Shop Collection</a></p>
                </div>
              </div>
            </div>
          </div>
        </div>
      </li>
    </ul>
  </div>
</aside>




<div class="colorlib-intro">
  <div class="container">
    <div class="row">
      <div>
        <h3> ================미니 프로젝트 구성도 ==============</h3>

        <img src="/structure.jpg" style="width : 90%">
        <p>
        <h3> ================고객의 입장에서 ==============</h3>
        <h5>  <b>$Part 1> 회원가입 파트 : 목적 -> 세션(회원가입) </b> </h5>
        <h5> * 가정 : 신생 쇼핑몰에서 물건을 구매하고자 하는 신규고객 </h5>
        (1) 비즈니스 프로세스 계층화 : 회원가입 하기 전에는 Cart 에 담고 결제되는 것이 불가능. <br>
        (2) ajax 비동기통신 : 중복된 DB의 데이터 체크 - ID 체크
        <hr>
        <h5> <b>$Part 2>  장바구니 + 결제 파트 : 목적 -> 오라클 쿼리문 연습 :  장바구니 와 결제까지 이어짐. </b></h5>
        <h5> * 가정 : 장바구니에 3개의 품목을 담았지만 한달 뒤에 고민하다가 하나는 취소하고 결제한 고객 </h5>
        (1) 오라클 DB 장바구니 원장 추가 : 로그아웃을 해도 장바구니에 남아있음 <br>
        (2) 실제 결제 프로세스
        <h5> * 가정 : 원하는 상품 분류만 보기를 원하는 고객 </h5>
        (3) 검색 기능 : 홈페이지 우측 상단 검색란으로 원하는 상품명 검색 가능
        <hr>
        <h5> <b>$Part 3>  부가기능 : 목적 -> 차트활용 및 지도 API 활용 </b></h5>
        <h5> * 가정 : 상품별 가격대를 한 눈에 보고 비교 후 구매를 원하는 고객 </h5>
        (1) Hichart Template : About tab 에서 DB내에 있는 상품 id별 가격 정보 불러와서 차트로 구현
        <h5> * 가정 :쇼핑몰 위치를 확인하고 싶어하는 고객 </h5>
        (2) 지도api 를 활용하여, 쇼핑몰 위치 지도로 구현
        <hr>
        <h5> <b>$Part 4>  리뷰기능 : 목적 -> 리뷰 데이터  </b></h5>
        <h5> * 가정 : 다른 사람의 후기를 보고 구매하기를 원하는 고객 </h5>
        (1) 상품별 상세정보 확인 화면에서 리뷰 작성 기능 구현
        <hr>
        <h3> ================경영자의 입장에서 ==============</h3>
        <h5> <b>$Part 5>  Item 파트 : 목적 -> 로그 기록 확인  </b> </h5>
        <h5> * 가정 : 얼마나 판매가 실시간으로 되고 있는지 로그로 확인하고 싶은 관리자  </h5>
        (1) liveChart : 로그를 통해 실시간 판매량을 차트로 확인하고 싶음.  <br>
        (2) 재고관리 : 재고 가격 및 세부정보 등을 관리할 수 있음.
        <hr>
        <h5> <b>$Part 6>  Customer 파트 : 목적 -> 오라클 DB 쿼리문 연습 </b> </h5>
        <h5> * 가정 : 직원이 실수로 데이터를 삭제한 경우 </h5>
        (1) isHidden 칼럼 추가 : 악성 고객의 리뷰를 삭제하고 되돌릴 수 있는 시스템. <br>
        (2) Crypt DB 추가 : 비밀번호 암호화 + 고객 데이터 원장 접근 수업 중 배운 고객의 데이터 관리 접근
        <hr>
        <h5> <b>$Part 7>  Sales 파트 - 재무 시스템(가제) : 목적 -> 외부 API 연결  </b></h5>
        <h5> * 가정 : 홍길동 CFO가 당사의 재무 정보 및 시장 정보를 실시간으로 확인하고 매매체결을 하고자 함. </h5>
        (1) WebSocket : 업비트 가상화폐 거래소 데이터를 실시간으로 업데이트 받음. 스크립트에서 요청. <br>
        (2) AJAX 비동기요청 + Get 방식 요청 API<br> ***** ex) 금융감독원 DART 공시정보 / 수출입은행 환율 API / Alpha Vantage 미국 상장주식 API <br>
        (3) AJAX 비동기요청 + Post 방식 요청 API <br> ***** ex) Chat GPT API
        </p>
      </div>
    </div>
  </div>
</div>
<div class="colorlib-product">
  <div class="container-fluid">
    <div class="row">
      <div class="col-sm-6 text-center">
        <div class="featured">
          <a href="#" class="featured-img" style="background-image: url(images/men.jpg);"></a>
          <div class="desc">
            <h2><a href="#">Shop Men's Collection</a></h2>
          </div>
        </div>
      </div>
      <div class="col-sm-6 text-center">
        <div class="featured">
          <a href="#" class="featured-img" style="background-image: url(images/women.jpg);"></a>
          <div class="desc">
            <h2><a href="#">Shop Women's Collection</a></h2>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>

<div class="colorlib-product">
  <div class="container">
    <div class="row">
      <div class="col-sm-8 offset-sm-2 text-center colorlib-heading">
        <h2>Best Sellers</h2>
      </div>
    </div>
    <div class="row row-pb-md">
      <div class="col-lg-3 mb-4 text-center">
        <div class="product-entry border">
          <a href="#" class="prod-img">
            <img src="images/item-1.jpg" class="img-fluid" alt="Free html5 bootstrap 4 template">
          </a>
          <div class="desc">
            <h2><a href="#">Women's Boots Shoes Maca</a></h2>
            <span class="price">$139.00</span>
          </div>
        </div>
      </div>
      <div class="col-lg-3 mb-4 text-center">
        <div class="product-entry border">
          <a href="#" class="prod-img">
            <img src="images/item-2.jpg" class="img-fluid" alt="Free html5 bootstrap 4 template">
          </a>
          <div class="desc">
            <h2><a href="#">Women's Minam Meaghan</a></h2>
            <span class="price">$139.00</span>
          </div>
        </div>
      </div>
      <div class="col-lg-3 mb-4 text-center">
        <div class="product-entry border">
          <a href="#" class="prod-img">
            <img src="images/item-3.jpg" class="img-fluid" alt="Free html5 bootstrap 4 template">
          </a>
          <div class="desc">
            <h2><a href="#">Men's Taja Commissioner</a></h2>
            <span class="price">$139.00</span>
          </div>
        </div>
      </div>
      <div class="col-lg-3 mb-4 text-center">
        <div class="product-entry border">
          <a href="#" class="prod-img">
            <img src="images/item-4.jpg" class="img-fluid" alt="Free html5 bootstrap 4 template">
          </a>
          <div class="desc">
            <h2><a href="#">Russ Men's Sneakers</a></h2>
            <span class="price">$139.00</span>
          </div>
        </div>
      </div>
      <div class="w-100"></div>
      <div class="col-lg-3 mb-4 text-center">
        <div class="product-entry border">
          <a href="#" class="prod-img">
            <img src="images/item-5.jpg" class="img-fluid" alt="Free html5 bootstrap 4 template">
          </a>
          <div class="desc">
            <h2><a href="#">Women's Boots Shoes Maca</a></h2>
            <span class="price">$139.00</span>
          </div>
        </div>
      </div>
      <div class="col-lg-3 mb-4 text-center">
        <div class="product-entry border">
          <a href="#" class="prod-img">
            <img src="images/item-6.jpg" class="img-fluid" alt="Free html5 bootstrap 4 template">
          </a>
          <div class="desc">
            <h2><a href="#">Women's Boots Shoes Maca</a></h2>
            <span class="price">$139.00</span>
          </div>
        </div>
      </div>
      <div class="col-lg-3 mb-4 text-center">
        <div class="product-entry border">
          <a href="#" class="prod-img">
            <img src="images/item-7.jpg" class="img-fluid" alt="Free html5 bootstrap 4 template">
          </a>
          <div class="desc">
            <h2><a href="#">Women's Boots Shoes Maca</a></h2>
            <span class="price">$139.00</span>
          </div>
        </div>
      </div>
      <div class="col-lg-3 mb-4 text-center">
        <div class="product-entry border">
          <a href="#" class="prod-img">
            <img src="images/item-8.jpg" class="img-fluid" alt="Free html5 bootstrap 4 template">
          </a>
          <div class="desc">
            <h2><a href="#">Women's Boots Shoes Maca</a></h2>
            <span class="price">$139.00</span>
          </div>
        </div>
      </div>
      <div class="w-100"></div>
      <div class="col-lg-3 mb-4 text-center">
        <div class="product-entry border">
          <a href="#" class="prod-img">
            <img src="images/item-9.jpg" class="img-fluid" alt="Free html5 bootstrap 4 template">
          </a>
          <div class="desc">
            <h2><a href="#">Women's Boots Shoes Maca</a></h2>
            <span class="price">$139.00</span>
          </div>
        </div>
      </div>
      <div class="col-lg-3 mb-4 text-center">
        <div class="product-entry border">
          <a href="#" class="prod-img">
            <img src="images/item-10.jpg" class="img-fluid" alt="Free html5 bootstrap 4 template">
          </a>
          <div class="desc">
            <h2><a href="#">Women's Boots Shoes Maca</a></h2>
            <span class="price">$139.00</span>
          </div>
        </div>
      </div>
      <div class="col-lg-3 mb-4 text-center">
        <div class="product-entry border">
          <a href="#" class="prod-img">
            <img src="images/item-11.jpg" class="img-fluid" alt="Free html5 bootstrap 4 template">
          </a>
          <div class="desc">
            <h2><a href="#">Women's Boots Shoes Maca</a></h2>
            <span class="price">$139.00</span>
          </div>
        </div>
      </div>
      <div class="col-lg-3 mb-4 text-center">
        <div class="product-entry border">
          <a href="#" class="prod-img">
            <img src="images/item-12.jpg" class="img-fluid" alt="Free html5 bootstrap 4 template">
          </a>
          <div class="desc">
            <h2><a href="#">Women's Boots Shoes Maca</a></h2>
            <span class="price">$139.00</span>
          </div>
        </div>
      </div>
      <div class="w-100"></div>
      <div class="col-lg-3 mb-4 text-center">
        <div class="product-entry border">
          <a href="#" class="prod-img">
            <img src="images/item-13.jpg" class="img-fluid" alt="Free html5 bootstrap 4 template">
          </a>
          <div class="desc">
            <h2><a href="#">Women's Boots Shoes Maca</a></h2>
            <span class="price">$139.00</span>
          </div>
        </div>
      </div>
      <div class="col-lg-3 mb-4 text-center">
        <div class="product-entry border">
          <a href="#" class="prod-img">
            <img src="images/item-14.jpg" class="img-fluid" alt="Free html5 bootstrap 4 template">
          </a>
          <div class="desc">
            <h2><a href="#">Women's Boots Shoes Maca</a></h2>
            <span class="price">$139.00</span>
          </div>
        </div>
      </div>
      <div class="col-lg-3 mb-4 text-center">
        <div class="product-entry border">
          <a href="#" class="prod-img">
            <img src="images/item-15.jpg" class="img-fluid" alt="Free html5 bootstrap 4 template">
          </a>
          <div class="desc">
            <h2><a href="#">Women's Boots Shoes Maca</a></h2>
            <span class="price">$139.00</span>
          </div>
        </div>
      </div>
      <div class="col-lg-3 mb-4 text-center">
        <div class="product-entry border">
          <a href="#" class="prod-img">
            <img src="images/item-16.jpg" class="img-fluid" alt="Free html5 bootstrap 4 template">
          </a>
          <div class="desc">
            <h2><a href="#">Women's Boots Shoes Maca</a></h2>
            <span class="price">$139.00</span>
          </div>
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col-md-12 text-center">
        <p><a href="#" class="btn btn-primary btn-lg">Shop All Products</a></p>
      </div>
    </div>
  </div>
</div>








</div>

