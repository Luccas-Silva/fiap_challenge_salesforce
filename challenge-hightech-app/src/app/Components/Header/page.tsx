'use client'
import React, { useState } from "react";
import { FaBars } from "react-icons/fa";
import Link from "next/link";
import Image from "next/image";
import dados from './links.json'
import "./Header.css"


interface Dados {
  href : string;
  name : string;
}

export default function Header() {
  const [menuOpen, setMenuOpen] = useState(false);
  
  return (
    <>
      <header>
        <nav>
          <div className="logo">
            <Link href={"/"}><Image src="/assets/cloud.svg" width={10} height={10} alt="Logo da Sales Force"/></Link>
            <Link href={"/"}>SalesForce</Link>  
          </div>
          
          <ul className={menuOpen ? "open" : ""}>
            {dados.map((link:Dados) =>(
              <li><Link href={ link.href }>{ link.name }</Link></li>
            ))}
            
          </ul>

          <div className="btns">
            <div className="menu" onClick={() => setMenuOpen(!menuOpen)}>
              <span><FaBars size={35} /></span>
            </div>
            <button className="login">
              <Link href="/Pages/Login" target="_blank">Login</Link>
            </button>
          </div>
        </nav>
      </header> 
    </>
  );
}
