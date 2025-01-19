% Class preamble and base class
\NeedsTeXFormat{LaTeX2e}
\ProvidesClass{assignment}[2025/01/01 Assignment template]
\LoadClass[11pt]{extarticle}

% Package inclusions
\RequirePackage[margin=1in]{geometry}     % Set page layout
\RequirePackage{amsmath, amsthm, amssymb} % Math packages
\RequirePackage{physics}                  % Physics package for advanced math formatting
\RequirePackage{mathtools}                % Enhancements to amsmath
\RequirePackage[hyperindex,breaklinks]{hyperref} % Hyperlink support
\RequirePackage{subfiles}                 % Support for handling subfiles
\RequirePackage[round, authoryear]{natbib}% Bibliography management

% Hyperref setup
\hypersetup{
    colorlinks=true,
    linkcolor=blue,
    filecolor=magenta,      
    urlcolor=cyan,
}

% Custom commands
\newcommand{\courseinfo}[3]{%
    \def\@course{#1} % Course name
    \def\@assignment{#2} % Assignment title
    \def\@duedate{#3} % Due date
}

\newcommand{\displayheader}{%
    \noindent
    \begin{minipage}{0.32\textwidth}
        \begin{flushleft}
            \@course % Left-justified
        \end{flushleft}
    \end{minipage}%
    \hfill
    \begin{minipage}{0.32\textwidth}
        \begin{center}
            {\Large \@assignment} % Center-justified
        \end{center}
    \end{minipage}%
    \hfill
    \begin{minipage}{0.32\textwidth}
        \begin{flushright}
            \@duedate % Right-justified
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
