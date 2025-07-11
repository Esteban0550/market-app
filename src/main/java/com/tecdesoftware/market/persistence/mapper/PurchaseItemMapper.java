package com.tecdesoftware.market.persistence.mapper;

import com.tecdesoftware.market.domain.PurchaseItem;
import com.tecdesoftware.market.persistence.entity.CompraProducto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PurchaseItemMapper {

    @Mapping(source = "id.idProducto", target = "productId")
    @Mapping(source = "cantidad", target = "quantity")
    @Mapping(source = "estado", target = "active")
    PurchaseItem toPurchaseItem(CompraProducto producto);

    @Mapping(target = "id.idCompra", ignore = true) // No viene desde PurchaseItem
    @Mapping(target = "id.idProducto", source = "productId")
    @Mapping(source = "quantity", target = "cantidad")
    @Mapping(source = "active", target = "estado")
    CompraProducto toCompraProducto(PurchaseItem item);
}
