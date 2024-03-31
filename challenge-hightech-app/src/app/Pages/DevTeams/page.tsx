'use client'
import Image from "next/image";
import Link from "next/link";
import "./DevTeams.css"


export default function DevTeams() {
  return (
    <>
      <h1 className="DevTeams_title">Dev Teams</h1>

      <section className="cardGrid">
        <div className="card">
          <Image className="imgUser" src={"/assets/Luccas.svg"} alt={"Imagem do Luccas"} width={150} height={150}/>
          <h1>Luccas Silva</h1>
          <h2>RM: 552890</h2>
        </div>

        <div className="card">
          <Image className="imgUser" src={"/assets/Bruno.svg"} alt={"Imagem do Bruno"} width={150} height={150}/>
          <h1>Bruno Burian</h1>
          <h2>RM: 552863</h2>
        </div>
        
        <div className="card">
          <Image className="imgUser" src={"/assets/Nathalia.svg"} alt={"Imagem do Nathalia"} width={150} height={150}/>
          <h1>Nathalia Freire</h1>
          <h2>RM: 553233</h2>
        </div>
      </section>
    </>
  );
}
