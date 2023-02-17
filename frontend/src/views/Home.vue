<template>
  <div style="background:#eeeeee;">
    <!--    <h1> Home</h1>-->
    <!--    <h3> Contents</h3>-->
    <Row class="user-row" style="height: 40px;margin-bottom: 10px;background-color: aquamarine;padding: 5px">
      <Col span="1" offset="21" style="background-color: rgba(225,5,56,0.15);">
        <Icon type="logo-octocat" size="25"/>
      </Col>
      <Icon type="ios-cart-outline" size="25"/>
    </Row>


    <Row type="flex" justify="center" class="code-row-bg">
      <Col span="14" style="background-color: aquamarine;">
        <Card class="Card" v-for="item in items" :key="item" @click.native="itemDetail(item)">
          <div style="text-align:center">
            <img :src="item.picture" alt="">
            <!--            <img src="../../images/logo.png">-->
            <h3>{{ item.name }}</h3>
          </div>
        </Card>
      </Col>
    </Row>

  </div>
</template>

<script>
import axios from "axios";

export default {
  name: "Home",
  data() {
    return {
      items: [ //axios
        /* {
           id: 1,
           name: "item1"
         },
         {
           id: 2,
           name: "item2"
         },
         {
           id: 3,
           name: "item3"
         },
         {
           id: 4,
           name: "item4"
         },
         {
           id: 5,
           name: "item5"
         },
         {
           id: 6,
           name: "item6"
         }*/

      ],
      currentPage: 0,
      pageSize: 15

    }
  },
  props: {},
  created: function () {
    this.getItem(0, 15);
  },
  methods: {
    itemDetail(item) {
      return this.$router.push({name: 'item', params: {itemId: item.id}});
    },
    getItem(page, size) {
      //todo get items from backend
      console.log(this)
      console.log(this.$route.query)
      console.log(window.location.href)
      // const URL = require("url");
      // const curUrl = new URL(window.location.href);
      let toUrl = 'http://localhost:8888/item?page=' + page +
          '&size=' + size;
      axios.get(toUrl).then((res) => {
        console.log(res)
        this.items = res.data.items;
      })
      /*
      setTimeout(
          ()=>{
            this.items = [
              {
                id: 1,
                name: "item1",
                picture: "images/logo.png"
              },
              {
                id: 2,
                name: "item2",
                picture: "images/logo.png"
              },
              {
                id: 3,
                name: "item3",
                picture: "images/logo.png"
              },
              {
                id: 4,
                name: "item4",
                picture: "images/logo.png"
              },
              {
                id: 5,
                name: "item5",
                picture: "images/logo.png"
              },
              {
                id: 6,
                name: "item6",
                picture: "images/logo.png"
              }
            ];
          }, 3000
      )
*/

    }
  }
}
</script>

<style scoped>
.Card {
  width: 320px;
  /*padding: 10px 10px 10px 10px;*/
  display: inline-block;
  margin: 10px 10px 10px 10px;
  border-radius: 10px;
}
</style>