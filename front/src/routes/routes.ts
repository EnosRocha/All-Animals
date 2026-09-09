import { createRouter, createWebHistory } from 'vue-router'

import Head from '@/components/Head.vue'
import Login from '@/components/Login.vue'
import ShowPets from '@/components/ShowPets.vue'


const routes = [
  { path: '/', component: Head },
  { path: '/login', component: Login },
  {path: '/showPets', component: ShowPets}
]

export const router = createRouter({
  history: createWebHistory(),
  routes,
})