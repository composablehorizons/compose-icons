package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Shoppingmode: ImageVector
    get() {
        if (_Shoppingmode != null) return _Shoppingmode!!
        
        _Shoppingmode = ImageVector.Builder(
            name = "shoppingmode",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(447f, 880f)
                quadToRelative(-15f, 0f, -30f, -6f)
                reflectiveQuadToRelative(-27f, -18f)
                lineTo(104f, 570f)
                quadToRelative(-12f, -12f, -17.5f, -26.5f)
                reflectiveQuadTo(81f, 514f)
                quadToRelative(0f, -15f, 5.5f, -30f)
                reflectiveQuadToRelative(17.5f, -27f)
                lineToRelative(352f, -353f)
                quadToRelative(11f, -11f, 26f, -17.5f)
                reflectiveQuadToRelative(31f, -6.5f)
                horizontalLineToRelative(287f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 160f)
                verticalLineToRelative(287f)
                quadToRelative(0f, 16f, -6f, 30.5f)
                reflectiveQuadTo(857f, 503f)
                lineTo(504f, 856f)
                quadToRelative(-12f, 12f, -27f, 18f)
                reflectiveQuadToRelative(-30f, 6f)
                close()
                moveToRelative(253f, -560f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(760f, 260f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(700f, 200f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(640f, 260f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(700f, 320f)
                close()
            }
        }.build()
        
        return _Shoppingmode!!
    }

private var _Shoppingmode: ImageVector? = null

