package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Shopping_cart: ImageVector
    get() {
        if (_Shopping_cart != null) return _Shopping_cart!!
        
        _Shopping_cart = ImageVector.Builder(
            name = "shopping_cart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 800f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(280f, 720f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(360f, 800f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(280f, 880f)
                close()
                moveToRelative(400f, 0f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(600f, 800f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(680f, 720f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 800f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(680f, 880f)
                close()
                moveTo(246f, 240f)
                lineToRelative(96f, 200f)
                horizontalLineToRelative(280f)
                lineToRelative(110f, -200f)
                horizontalLineTo(246f)
                close()
                moveToRelative(-38f, -80f)
                horizontalLineToRelative(590f)
                quadToRelative(23f, 0f, 35f, 20.5f)
                reflectiveQuadToRelative(1f, 41.5f)
                lineTo(692f, 478f)
                quadToRelative(-11f, 20f, -29.5f, 31f)
                reflectiveQuadTo(622f, 520f)
                horizontalLineTo(324f)
                lineToRelative(-44f, 80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(80f)
                horizontalLineTo(280f)
                quadToRelative(-45f, 0f, -68f, -39.5f)
                reflectiveQuadToRelative(-2f, -78.5f)
                lineToRelative(54f, -98f)
                lineToRelative(-144f, -304f)
                horizontalLineTo(40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(130f)
                lineToRelative(38f, 80f)
                close()
                moveToRelative(134f, 280f)
                horizontalLineToRelative(280f)
                horizontalLineToRelative(-280f)
                close()
            }
        }.build()
        
        return _Shopping_cart!!
    }

private var _Shopping_cart: ImageVector? = null

