import type { Metadata } from "next";
import "./globals.css";
import Header from "./Components/Header/page";
import Footer from "./Components/Footer/page";

export const metadata: Metadata = {
  title: "SalesForce x HighTech",
  description: "SalesForce x HighTech fiap challenge project",
};

export default function RootLayout({
  children,
}: Readonly<{
  children: React.ReactNode;
}>) {
  return (
    <html lang="pt-br">
      <body>
        <Header/>
        {children}
        <Footer/>
      </body>
    </html>
  );
}
