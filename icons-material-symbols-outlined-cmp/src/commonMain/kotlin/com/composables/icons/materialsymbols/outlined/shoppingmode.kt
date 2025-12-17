package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Shoppingmode: ImageVector
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
                moveTo(446f, 880f)
                quadToRelative(-15f, 0f, -30f, -6f)
                reflectiveQuadToRelative(-27f, -18f)
                lineTo(103f, 570f)
                quadToRelative(-12f, -12f, -17.5f, -26.5f)
                reflectiveQuadTo(80f, 514f)
                quadToRelative(0f, -15f, 5.5f, -30f)
                reflectiveQuadToRelative(17.5f, -27f)
                lineToRelative(352f, -353f)
                quadToRelative(11f, -11f, 26f, -17.5f)
                reflectiveQuadToRelative(31f, -6.5f)
                horizontalLineToRelative(287f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(879f, 160f)
                verticalLineToRelative(287f)
                quadToRelative(0f, 16f, -6f, 30.5f)
                reflectiveQuadTo(856f, 503f)
                lineTo(503f, 856f)
                quadToRelative(-12f, 12f, -27f, 18f)
                reflectiveQuadToRelative(-30f, 6f)
                close()
                moveToRelative(0f, -80f)
                lineToRelative(353f, -354f)
                verticalLineToRelative(-286f)
                horizontalLineTo(513f)
                lineTo(160f, 514f)
                lineToRelative(286f, 286f)
                close()
                moveToRelative(253f, -480f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(759f, 260f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(699f, 200f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(639f, 260f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(699f, 320f)
                close()
                moveTo(480f, 480f)
                close()
            }
        }.build()
        
        return _Shoppingmode!!
    }

private var _Shoppingmode: ImageVector? = null

