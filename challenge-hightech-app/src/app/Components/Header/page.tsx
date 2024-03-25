'use client'
import React, { useState } from "react";
import { FaBars } from "react-icons/fa";
import Link from "next/link";
import Image from "next/image";
import "./Header.css"

export default function Header() {
  const [menuOpen, setMenuOpen] = useState(false);
  
  return (
    <>
      <header>
        <nav>
          <div className="logo">
            <a href="#"><Image src="/assets/cloud.svg" width={10} height={10} alt=""/></a> 
            <a href="#">SalesForce</a>
          </div>
          
          <ul className={menuOpen ? "open" : ""}>
            <li><a href="produtos.html" >Produtos</a></li>
            <li><a href="industrias.html" >Indústrias</a></li>
            <li><a href="aprendizado.html" >Aprendizado</a></li>
            <li><a href="suporte.html" >Suporte</a></li>
            <li><a href="empresa.html" >Empresa</a></li>
          </ul>

          <div className="btns">
            <div className="menu" onClick={() => setMenuOpen(!menuOpen)}>
              <span><FaBars size={35} /></span>
            </div>
            <button className="login">
              <a href="login.html" target="_blank">Login</a>
            </button>
          </div>
        </nav>
      </header>
      
          
    </>
  );
}
