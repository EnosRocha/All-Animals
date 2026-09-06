import { createRouter, createWebHistory } from 'vue-router'

import Head from '@/components/Head.vue'
import Login from '@/components/Login.vue'


const routes = [
  { path: '/', component: Head },
  { path: '/login', component: Login },
]

export const router = createRouter({
  history: createWebHistory(),
  routes,
})