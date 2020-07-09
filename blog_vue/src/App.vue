<template>
  <v-app>
    <core-header />
    <router-view />
  </v-app>
</template>

<script>
export default {
  name: "App",
  components: {
    "core-header": () => import("./components/core/header")
  },
  data: () => ({
    //
  })
};
</script>
