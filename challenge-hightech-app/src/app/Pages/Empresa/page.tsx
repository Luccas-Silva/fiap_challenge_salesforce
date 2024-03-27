'use client'
import Card from "@/app/Components/Card_Empresa/page";
import Image from "next/image";
import "./Empresa.css"

export default function Empresa() {
  return (
    <>
      <div className="Empresa_title">
        <h1>Conheça nossa história</h1>
        <p>Nós acreditamos na construção dos relacionamentos, não só entre as empresas e seus clientes, mas entre nossas comunidades globais.</p>
      </div>

      <section className="cardGrid">
        <Card/>
      </section>
    </>
  );
}
