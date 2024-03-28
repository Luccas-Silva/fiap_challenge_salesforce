'use client'
import Image from "next/image";
import "./page.css";

export default function Home() {
  return (
    <>
      <section className="Home_section">
        <div className="Home_text">
          <h1>Entregue sucesso agora com o Salesforce Customer 360.</h1>
          <p>Analisamos minuciosamente uma ampla gama de tópicos na vastidão da Internet, com o objetivo de identificar tendências em ascensão.</p>
        </div>
        <Image src={"/assets/landing page 1.svg"} alt="" width={100} height={100} />
      </section>

      <section className="Home_section">
        <Image src={"/assets/landing page 2.svg"} alt="" width={100} height={100} />
        <div className="Home_text">
          <h1>O que há de novo na Salesforce?</h1>
          <p>Conheça o Salesforce Starter, o pacote de CRM simples e poderoso, projetado para expandir sua pequena empresa. Encontre uma solução de IA adaptada às suas necessidades de negócios e impulsione o crescimento da sua empresa.</p>
        </div>
      </section>

      <section className="Home_section">
        <div className="Home_text">
          <h1>Experimente o Salesforce Starter Suite gratuitamente.</h1>
          <p>Reúna marketing, vendas e atendimento em um único aplicativo. Experimente o Salesforce Starter Suite hoje mesmo. Não há nada para instalar. Não é necessário cartão de crédito.</p>
        </div>
        <Image src={"/assets/landing page 3.svg"} alt="" width={100} height={100} />
      </section>

      <section className="Home_section">
        <Image src={"/assets/landing page 4.svg"} alt="" width={100} height={100} />
        <div className="Home_text">
          <h1>Veja como os clientes da Salesforce se tornam empresas clientes.</h1>
          <p>Saiba como o Salesforce ajuda você a trabalhar de maneira mais inteligente e a crescer com mais rapidez.</p>
        </div>
      </section>

      <section className="Home_section">
        <div className="Home_text">
          <h1>Encontre inovações para qualquer setor de indústria.</h1>
          <p>Seja qual for a sua indústria, oferecemos soluções para modernizar o seu negócio, economizar tempo e reduzir custos.</p>
        </div>
        <Image src={"/assets/landing page 5.svg"} alt="" width={100} height={100} />
      </section>

      <section className="Home_section">
        <Image src={"/assets/landing page 6.svg"} alt="" width={100} height={100} />
        <div className="Home_text">
          <h1>O que é CRM?</h1>
          <p>Aprenda tudo sobre o CRM, como unificar todas as suas equipes e como impulsionar o crescimento e a produtividade em toda a sua empresa.</p>
        </div>
      </section>
      
      <section className="Home_section">
        <div className="Home_text">
          <h1>Aprenda habilidades valiosas gratuitamente com o Trailhead.</h1>
          <p>Siga os caminhos de aprendizado guiados e aprenda na prática as habilidades interpessoais, digitais e do Salesforce de qualquer lugar.</p>
        </div>
        <Image src={"/assets/landing page 7.svg"} alt="" width={100} height={100} />
      </section>

    </>
  );
}
