package org.nexusflow.core.cqrs.command;

non-sealed interface NoReturnCommandHandlerInternal<T extends Record> extends NoReturnCommandHandler<T> {
    Runnable handle(T command);
}