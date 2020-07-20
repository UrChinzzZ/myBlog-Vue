<template>
  <div>
    <v-app-bar app flat>
      <v-app-bar-nav-icon class="hidden-md-and-up" @click="toggleDrawer" />

      <v-container class="mx-auto py-0">
        <v-row align="center">
          <v-img
            :src="require('@/assets/logo.png')"
            class="mr-5"
            contain
            height="48"
            width="48"
            max-width="48"
            @click="$vuetify.goTo(0)"
          />

          <v-btn
            v-for="(link, i) in links"
            :key="i"
            v-bind="link"
            class="hidden-sm-and-down"
            text
            @click="onClick($event, link)"
            >{{ link.text }}</v-btn
          >

          <v-spacer />

          <v-text-field
            append-icon="mdi-magnify"
            flat
            hide-details
            solo-inverted
            style="max-width: 300px;"
          />
        </v-row>
      </v-container>
    </v-app-bar>
    <div class="header-image" :style="{ backgroundImage: `url(${img})` }">
      <div class="scene">
        <div>
          <span id="luke"></span>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
// Utilities
import { mapGetters, mapMutations } from "vuex";
import { Typeit } from "../../utils/TheaterJS/plug";
export default {
  name: "CoreAppBar",
  data() {
    return {
      img: require("@/assets/urchin/4.jpg")
    };
  },
  computed: {
    ...mapGetters(["links"])
  },
  methods: {
    ...mapMutations(["toggleDrawer"]),
    onClick(e, item) {
      e.stopPropagation();
      if (item.to || !item.href) return;

      this.$vuetify.goTo(item.href.endsWith("!") ? 0 : item.href);
    }
  },
  mounted() {
    //页面元素加载完成
    // console.log('是否是慧慧',this.$store.state.themeObj.user_start);
    // var that = this;
    var timer = setTimeout(function() {
      // Typeit(that.$store.state.themeObj.user_start, "#luke"); //打字机效果
      Typeit("", "#luke"); //打字机效果
      clearTimeout(timer);
    }, 500);
  }
};
</script>
<style scoped>
@font-face {
  font-family: "Sigmar One";
  src: url("../../utils/font/co3DmWZ8kjZuErj9Ta3do6Tppg.woff2");
}
.header-image {
  height: 650px;
  position: relative;
  width: 100%;
  background-size: cover;
  background-position: center 50%;
  background-repeat: no-repeat;
  margin-bottom: 90px;
}
.scene {
  width: 100%;
  height: 300px;
  text-align: center;
  font-size: 100px;
  font-weight: 200;
  color: #fff;
  position: absolute;
  left: 0;
  top: 160px;
  font-family: "Sigmar One", Arial;
  text-shadow: 0 2px 2px #47456d;
}
.scene span {
  text-shadow: 1px 1px 0 #ff3f1a, -1px -1px 0 #00a7e0;
}
</style>
