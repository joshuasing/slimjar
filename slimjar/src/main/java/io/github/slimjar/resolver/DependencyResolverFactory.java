package io.github.slimjar.resolver;

import io.github.slimjar.resolver.data.Repository;
import io.github.slimjar.resolver.enquirer.RepositoryEnquirerFactory;

import java.util.Collection;

public interface DependencyResolverFactory {
    DependencyResolver create(final Collection<Repository> repositories, final RepositoryEnquirerFactory enquirerFactory);
}