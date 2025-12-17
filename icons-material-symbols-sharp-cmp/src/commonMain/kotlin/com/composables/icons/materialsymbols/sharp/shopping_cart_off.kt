package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Shopping_cart_off: ImageVector
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
                horizontalLineToRelative(595f)
                lineTo(669f, 520f)
                horizontalLineToRelative(-36f)
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
                moveToRelative(540f, 52f)
                lineTo(566f, 680f)
                horizontalLineTo(177f)
                lineToRelative(99f, -202f)
                lineToRelative(-72f, -162f)
                lineTo(28f, 140f)
                lineToRelative(56f, -56f)
                lineTo(876f, 876f)
                lineToRelative(-56f, 56f)
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

