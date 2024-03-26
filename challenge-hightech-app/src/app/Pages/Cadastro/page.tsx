'use client'
import Image from "next/image";
import Link from "next/link";

export default function Cadastro() {
  return (
    <>
      <Image src="/assets/salesforce_negativa.svg" width={250} height={250} alt="Logo da Sales Force"/>
      <h1>Cadastro</h1>
      
      <button className="login">
        <Link href={"/"}>Finalizar Cadastro</Link>
      </button> 
    </>
  );
}
