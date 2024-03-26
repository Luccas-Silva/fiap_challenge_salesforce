'use client'


import Card from "@/app/Components/Card_Produtos/page";
import Image from "next/image";
import "./Produtos.css"

export default function Produtos() {
  return (
    <>
      <div className="Produtos_title">
        <h1>Produtos Salesforce</h1>
        <p>Descubra mais sobre todas as nossas edições e preços abaixo. Clique na solução que deseja explorar:</p>
      </div>
      <section className="cardGrid">
        <Card/>
      </section>
      
    </>
  );
}
