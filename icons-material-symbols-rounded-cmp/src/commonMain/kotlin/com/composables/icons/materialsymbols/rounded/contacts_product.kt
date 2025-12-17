package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Contacts_product: ImageVector
    get() {
        if (_Contacts_product != null) return _Contacts_product!!
        
        _Contacts_product = ImageVector.Builder(
            name = "contacts_product",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(185f, 880f)
                quadToRelative(-17f, 0f, -29.5f, -12.5f)
                reflectiveQuadTo(143f, 838f)
                verticalLineToRelative(-105f)
                quadToRelative(0f, -90f, 56f, -159f)
                reflectiveQuadToRelative(144f, -88f)
                quadToRelative(-40f, 28f, -62f, 70.5f)
                reflectiveQuadTo(259f, 648f)
                verticalLineToRelative(190f)
                quadToRelative(0f, 11f, 3f, 22f)
                reflectiveQuadToRelative(10f, 20f)
                horizontalLineToRelative(-87f)
                close()
                moveToRelative(147f, 0f)
                quadToRelative(-17f, 0f, -29.5f, -12.5f)
                reflectiveQuadTo(290f, 838f)
                verticalLineToRelative(-190f)
                quadToRelative(0f, -70f, 49.5f, -119f)
                reflectiveQuadTo(459f, 480f)
                horizontalLineToRelative(189f)
                quadToRelative(70f, 0f, 119f, 49f)
                reflectiveQuadToRelative(49f, 119f)
                verticalLineToRelative(64f)
                quadToRelative(0f, 70f, -49f, 119f)
                reflectiveQuadTo(648f, 880f)
                horizontalLineTo(332f)
                close()
                moveToRelative(148f, -484f)
                quadToRelative(-66f, 0f, -112f, -46f)
                reflectiveQuadToRelative(-46f, -112f)
                quadToRelative(0f, -66f, 46f, -112f)
                reflectiveQuadToRelative(112f, -46f)
                quadToRelative(66f, 0f, 112f, 46f)
                reflectiveQuadToRelative(46f, 112f)
                quadToRelative(0f, 66f, -46f, 112f)
                reflectiveQuadToRelative(-112f, 46f)
                close()
            }
        }.build()
        
        return _Contacts_product!!
    }

private var _Contacts_product: ImageVector? = null

