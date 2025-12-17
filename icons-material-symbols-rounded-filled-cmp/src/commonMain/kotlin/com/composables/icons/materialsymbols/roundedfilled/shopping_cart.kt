package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Shopping_cart: ImageVector
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
                moveTo(208f, 160f)
                horizontalLineToRelative(590f)
                quadToRelative(23f, 0f, 35f, 20.5f)
                reflectiveQuadToRelative(1f, 41.5f)
                lineTo(692f, 478f)
                quadToRelative(-11f, 20f, -29.5f, 31f)
                reflectiveQuadTo(622f, 520f)
                horizontalLineTo(324f)
                lineToRelative(-44f, 80f)
                horizontalLineToRelative(440f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(760f, 640f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(720f, 680f)
                horizontalLineTo(280f)
                quadToRelative(-45f, 0f, -68f, -39.5f)
                reflectiveQuadToRelative(-2f, -78.5f)
                lineToRelative(54f, -98f)
                lineToRelative(-144f, -304f)
                horizontalLineTo(80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(40f, 120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(80f, 80f)
                horizontalLineToRelative(65f)
                quadToRelative(11f, 0f, 21f, 6f)
                reflectiveQuadToRelative(15f, 17f)
                lineToRelative(27f, 57f)
                close()
            }
        }.build()
        
        return _Shopping_cart!!
    }

private var _Shopping_cart: ImageVector? = null

