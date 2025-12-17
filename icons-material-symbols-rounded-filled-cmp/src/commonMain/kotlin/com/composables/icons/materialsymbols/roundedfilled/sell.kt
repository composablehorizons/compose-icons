package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Sell: ImageVector
    get() {
        if (_Sell != null) return _Sell!!
        
        _Sell = ImageVector.Builder(
            name = "sell",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(856f, 570f)
                lineTo(570f, 856f)
                quadToRelative(-12f, 12f, -27f, 18f)
                reflectiveQuadToRelative(-30f, 6f)
                quadToRelative(-15f, 0f, -30f, -6f)
                reflectiveQuadToRelative(-27f, -18f)
                lineTo(103f, 503f)
                quadToRelative(-11f, -11f, -17f, -25.5f)
                reflectiveQuadTo(80f, 447f)
                verticalLineToRelative(-287f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 80f)
                horizontalLineToRelative(287f)
                quadToRelative(16f, 0f, 31f, 6.5f)
                reflectiveQuadToRelative(26f, 17.5f)
                lineToRelative(352f, 353f)
                quadToRelative(12f, 12f, 17.5f, 27f)
                reflectiveQuadToRelative(5.5f, 30f)
                quadToRelative(0f, 15f, -5.5f, 29.5f)
                reflectiveQuadTo(856f, 570f)
                close()
                moveTo(260f, 320f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(320f, 260f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(260f, 200f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(200f, 260f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(260f, 320f)
                close()
            }
        }.build()
        
        return _Sell!!
    }

private var _Sell: ImageVector? = null

