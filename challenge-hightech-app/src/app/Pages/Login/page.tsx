'use client'
import Image from "next/image";
import Link from "next/link";
import "./Login.css"


export default function Login() {
  return (
    <>
      <Image src="/assets/salesforce_negativa.svg" width={250} height={250} alt="Logo da Sales Force"/>
      <h1>Login</h1>
      
      <p>Não é um cliente?</p>
      <button className="login">
        <Link href={"/Pages/Cadastro"} >Cadastrar-se</Link>
      </button> 
    </>
  );
}
