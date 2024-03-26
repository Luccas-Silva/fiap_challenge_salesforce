'use client'
import Image from "next/image";
import dados from "./Dados_CP.json";
import "./Card.css"

interface Dados {
  name : string;
  src : string;
  alt : string;
  text : string;
}

export default function Card() {
  return (
    <>
      {
        dados.map((info : Dados) =>(
          <div className="card">
            <Image  src={info.src} alt={info.alt} width={100} height={100}/>
            <h1>{info.name}</h1>
            <p>{info.text}</p>
          </div>
        ))
      }
    </>
  );
}
