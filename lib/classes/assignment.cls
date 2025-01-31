% -------------------------------------------------------------
%  Class declaration and base class
% -------------------------------------------------------------
\NeedsTeXFormat{LaTeX2e}
\ProvidesClass{assignment}[2025/01/01 Assignment template]
\LoadClass[11pt]{extarticle}

% -------------------------------------------------------------
%  Encoding, fonts, and language
% -------------------------------------------------------------
\RequirePackage[T1]{fontenc}
\RequirePackage{lmodern}

\RequirePackage[english]{babel}

% -------------------------------------------------------------
%  Micro-typography and layout
% -------------------------------------------------------------
\RequirePackage{microtype}

\RequirePackage[margin=1in]{geometry}

% -------------------------------------------------------------
%  Mathematics packages
% -------------------------------------------------------------
\RequirePackage{amsmath,amssymb,amsthm}
\RequirePackage{mathtools}

\RequirePackage{physics}
\let\abs\undefined
\let\bra\undefined
\let\ket\undefined
\let\braket\undefined

\RequirePackage{bm}
\RequirePackage{wasysym}

% -------------------------------------------------------------
%  Additional common packages (optional but recommended)
% -------------------------------------------------------------
\RequirePackage{graphicx}

\RequirePackage{xcolor}

\RequirePackage{enumitem}

\RequirePackage{booktabs}

\RequirePackage{siunitx}

\RequirePackage{listings}

\RequirePackage{caption}

% -------------------------------------------------------------
%  Siunitx setup
% -------------------------------------------------------------
\DeclareSIUnit\au{AU}

\newcommand*{\ra}[2][]{{
    \ang[
        angle-symbol-degree=\textsuperscript{h},
        angle-symbol-minute=\textsuperscript{m},
        angle-symbol-second=\textsuperscript{s},
        #1]{#2}%
}}

% -------------------------------------------------------------
%  Subfiles support
% -------------------------------------------------------------
\RequirePackage{subfiles}

% -------------------------------------------------------------
%  Bibliography management
% -------------------------------------------------------------
\RequirePackage[round,authoryear]{natbib}

% -------------------------------------------------------------
%  Hyperref setup
% -------------------------------------------------------------
\RequirePackage[hyperindex,breaklinks]{hyperref}
\hypersetup{
    colorlinks   = true,
    linkcolor    = blue,
    filecolor    = magenta,
    urlcolor     = cyan,
}

% -------------------------------------------------------------
%  Custom math delimiters and related macros
% -------------------------------------------------------------
\DeclarePairedDelimiter{\abs}{\lvert}{\rvert}
\DeclarePairedDelimiter{\paren}{\lparen}{\rparen}
\DeclarePairedDelimiter{\sparen}{\lbrack}{\rbrack}
\DeclarePairedDelimiter{\cparen}{\{}{\}}
\DeclarePairedDelimiter{\aparen}{\langle}{\rangle}
\DeclarePairedDelimiterX{\setmid}[2]{\{}{\}}{#1\,\delimsize\vert\,\mathopen{}#2}
\DeclarePairedDelimiter{\bra}{\langle}{\rvert}
\DeclarePairedDelimiter{\ket}{\lvert}{\rangle}
\DeclarePairedDelimiterX{\braket}[2]{\langle}{\rangle}{#1\,\delimsize\vert\,\mathopen{}#2}

\makeatletter
    \let\oldabs\abs
    \def \abs {\@ifstar{\oldabs}{\oldabs*}}

    \let\oldparen\paren
    \def \paren {\@ifstar{\oldparen}{\oldparen*}}

    \let\oldsparen\sparen
    \def \sparen {\@ifstar{\oldsparen}{\oldsparen*}}

    \let\oldcparen\cparen
    \def \cparen {\@ifstar{\oldcparen}{\oldcparen*}}

    \let\oldaparen\aparen
    \def \aparen {\@ifstar{\oldaparen}{\oldaparen*}}

    \let\oldsetmid\setmid
    \def \setmid {\@ifstar{\oldsetmid}{\oldsetmid*}}

    \let\oldbra\bra
    \def \bra {\@ifstar{\oldbra}{\oldbra*}}

    \let\oldket\ket
    \def \ket {\@ifstar{\oldket}{\oldket*}}

    \let\oldbraket\braket
    \def \braket {\@ifstar{\oldbraket}{\oldbraket*}}
\makeatother

% -------------------------------------------------------------
%  Custom commands
% -------------------------------------------------------------
\newcommand{\courseinfo}[4]{%
    \def\coursecode{#1} % Course code
    \def\coursename{#2} % Course name
    \def\assignment{#3} % Assignment title
    \def\duedate{#4}    % Due date
}

\newcommand{\displayheader}{%
    \noindent
    \begin{minipage}{0.32\textwidth}
        \begin{flushleft}
            \coursecode \\
            \coursename
        \end{flushleft}
    \end{minipage}%
    \hfill
    \begin{minipage}{0.32\textwidth}
        \begin{center}
            {\Large \assignment}
        \end{center}
    \end{minipage}%
    \hfill
    \begin{minipage}{0.32\textwidth}
        \begin{flushright}
            \duedate
        \end{flushright}
    \end{minipage}
}

% -------------------------------------------------------------
%  Environments
% -------------------------------------------------------------
\newenvironment{ex}[2][Exercise]{%
    \begin{trivlist}
    \item[\hskip \labelsep {\bfseries #1}\hskip \labelsep {\bfseries #2.}]%
}{%
    \end{trivlist}%
}

\newenvironment{q}[2][Question]{%
    \begin{trivlist}
    \item[\hskip \labelsep {\bfseries #1}\hskip \labelsep {\bfseries #2.}]%
}{%
    \end{trivlist}%
}

\newenvironment{sol}[1][Solution]{%
    \begin{trivlist}
    \item[\hskip \labelsep {\bfseries #1:}]%
}{%
    \end{trivlist}%
}

\newenvironment{notes}[1][Notes]{%
    \begin{trivlist}
    \item[\hskip \labelsep {\itshape #1:}]
    \itshape
}{%
    \end{trivlist}%
}

\endinput
