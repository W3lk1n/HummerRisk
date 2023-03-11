import Vue from "vue";
import VueRouter from 'vue-router';
import RouterSidebar from "./RouterSidebar";
import axios from "axios";
import Setting from "@/business/components/settings/router";
import Account from "@/business/components/account/router";
import Server from "@/business/components/server/router";
import Image from "@/business/components/image/router";
import Vuln from "@/business/components/vuln/router";
import Rule from "@/business/components/rule/router";
import Resource from "@/business/components/resource/router";
import Dashboard from "@/business/components/dashboard/router";
import Task from "@/business/components/task/router";
import TaskReport from "@/business/components/taskReport/router";
import Oss from "@/business/components/oss/router";
import Report from "@/business/components/report/router";
import K8s from "@/business/components/k8s/router";
import K8sSituation from "@/business/components/k8sSituation/router";
import CloudSituation from "@/business/components/cloudSituation/router";
import Code from "@/business/components/code/router";
import Sbom from "@/business/components/sbom/router";
import Log from "@/business/components/event/router";
import Config from "@/business/components/config/router";
import Fs from "@/business/components/fs/router";
import {getToken} from '@/common/js/auth';

Vue.use(VueRouter);
/* eslint-disable */
const router = new VueRouter({
  routes: [
    {path: "/", redirect: '/dashboard/panel'},
    {path: "/login", redirect: '@/login/login'},
    {
      path: "/sidebar",
      components: {
        sidebar: RouterSidebar
      }
    },
    Setting,
    Account,
    Server,
    Image,
    Vuln,
    Rule,
    Resource,
    Task,
    TaskReport,
    Oss,
    Dashboard,
    Report,
    K8s,
    K8sSituation,
    CloudSituation,
    Code,
    Sbom,
    Log,
    Config,
    Fs,
  ]
});

router.beforeEach((to, from, next) => {
  //解决localStorage清空，cookie没失效导致的卡死问题
  let token = getToken();
  if (!token) {
    console.log(723)
    window.location.href = "/login";
    next();
  } else {
    next();
  }
});

export default router;
