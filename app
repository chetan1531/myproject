import React from 'react'
import Base from './Components/Base'
import {BrowserRouter,Routes,Route} from 'react-router-dom'
import Home from './Pages/Home'
import Signup from './Pages/Signup'
import Login from './Pages/Login'
import About from './Pages/About'
import CustomNavbar from './Components/CustomNavbar';
import Services from './Pages/Services'
import 'bootstrap/dist/css/bootstrap.min.css';
export default function App() {
  return (
    
    <BrowserRouter>
   
      <Routes>
        <Route path="/" element={<Home></Home>}/>
        <Route path="/login" element={<Login></Login>}/>
        <Route path="/signup" element={<Signup></Signup>}/>
        <Route path="/about" element={<About></About>}/>
        <Route path="/services" element={<Services></Services>}/>

      </Routes>
    </BrowserRouter>
  )
}
