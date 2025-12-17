package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Shopping_cart_off: ImageVector
    get() {
        if (_Shopping_cart_off != null) return _Shopping_cart_off!!
        
        _Shopping_cart_off = ImageVector.Builder(
            name = "shopping_cart_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(633f, 520f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(69f)
                lineToRelative(110f, -200f)
                horizontalLineTo(353f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(525f)
                quadToRelative(23f, 0f, 35.5f, 19.5f)
                reflectiveQuadToRelative(0.5f, 42.5f)
                lineTo(692f, 478f)
                quadToRelative(-11f, 20f, -28.5f, 31f)
                reflectiveQuadTo(633f, 520f)
                close()
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
                moveToRelative(512f, 24f)
                lineTo(566f, 680f)
                horizontalLineTo(304f)
                quadToRelative(-44f, 0f, -67f, -37.5f)
                reflectiveQuadToRelative(-3f, -78.5f)
                lineToRelative(42f, -86f)
                lineToRelative(-72f, -162f)
                lineTo(56f, 168f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(736f, 736f)
                quadToRelative(11f, 11f, 11.5f, 27.5f)
                reflectiveQuadTo(848f, 904f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                close()
                moveTo(486f, 600f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(-62f)
                lineToRelative(-40f, 80f)
                horizontalLineToRelative(182f)
                close()
                moveToRelative(136f, -160f)
                horizontalLineToRelative(-69f)
                horizontalLineToRelative(69f)
                close()
                moveToRelative(58f, 440f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(600f, 800f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(680f, 720f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 800f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(680f, 880f)
                close()
            }
        }.build()
        
        return _Shopping_cart_off!!
    }

private var _Shopping_cart_off: ImageVector? = null

