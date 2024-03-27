'use client'
import Card from "@/app/Components/Card_Industrias/page";
import Image from "next/image";
import "./Industrias.css"


export default function Industrias() {
  return (
    <>
      <section className="Industrias_title">
        <div className="Industrias_text">
          <h1>Torne-se uma empresa cliente líder em seu setor.</h1>
          <p>Nossas soluções são criadas por especialistas do setor para ajuidá-lo a modernizar seus negócios , economizar tempo, reduzir custos e aproximar-se de seus clientes.</p>
        </div>
        <Image src={"/assets/Industrias.svg"} alt="" width={100} height={100}/>
      </section>
      
      <h1 className="sub_Industrias_title">Escolha sua indústria para começar :</h1>
     
      <section className="cardGrid">
        <Card/>
      </section>
    </>
  );
}
