% Class preamble and base class
\NeedsTeXFormat{LaTeX2e}
\ProvidesClass{assignment}[2025/01/01 Assignment template]
\LoadClass[11pt]{extarticle}

% Package inclusions
\RequirePackage[margin=1in]{geometry}     % Set page layout
\RequirePackage{amsmath, amsthm, amssymb} % Math packages
\RequirePackage{physics}                  % Physics package for advanced math formatting
\let\abs\undefined
\let\bra\undefined
\let\ket\undefined
\let\braket\undefined
\RequirePackage{mathtools}                % Enhancements to amsmath
\RequirePackage[hyperindex,breaklinks]{hyperref} % Hyperlink support
\RequirePackage{subfiles}                 % Support for handling subfiles
\RequirePackage[round, authoryear]{natbib}% Bibliography management

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

% Hyperref setup
\hypersetup{
    colorlinks=true,
    linkcolor=blue,
    filecolor=magenta,      
    urlcolor=cyan,
}

% Custom commands
\newcommand{\courseinfo}[4]{%
    \def\coursecode{#1} % Course name
    \def\coursename{#2} % Course name
    \def\assignment{#3} % Assignment title
    \def\duedate{#4} % Due date
}

\newcommand{\displayheader}{%
    \noindent
    \begin{minipage}{0.32\textwidth}
        \begin{flushleft}
            \coursecode

            \coursename
        \end{flushleft}
    \end{minipage}%
    \hfill
    \begin{minipage}{0.32\textwidth}
        \begin{center}
            {\Large \assignment} % Center-justified
        \end{center}
    \end{minipage}%
    \hfill
    \begin{minipage}{0.32\textwidth}
        \begin{flushright}
            \duedate % Right-justified
        \end{flushright}
    \end{minipage}
}

% Custom environments for exercises and solutions
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

\endinput
