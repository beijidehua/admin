package tech.wetech.admin3.sys.event;

import tech.wetech.admin3.common.DomainEvent;
import tech.wetech.admin3.sys.model.User;

/**
 * @author cjbi
 */
public record UserDeleted(User user) implements DomainEvent {
}
