package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Ink_eraser_off: ImageVector
    get() {
        if (_Ink_eraser_off != null) return _Ink_eraser_off!!
        
        _Ink_eraser_off = ImageVector.Builder(
            name = "ink_eraser_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(763f, 876f)
                lineTo(602f, 716f)
                lineToRelative(-58f, 60f)
                quadToRelative(-11f, 11f, -25.5f, 17.5f)
                reflectiveQuadTo(487f, 800f)
                horizontalLineTo(223f)
                quadToRelative(-16f, 0f, -30.5f, -6f)
                reflectiveQuadTo(167f, 777f)
                lineToRelative(-62f, -62f)
                quadToRelative(-23f, -23f, -23.5f, -57f)
                reflectiveQuadToRelative(22.5f, -58f)
                lineToRelative(188f, -194f)
                lineTo(83f, 197f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadTo(83f, 140f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(680f, 680f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(763f, 876f)
                close()
                moveToRelative(116f, -477f)
                quadToRelative(0f, 16f, -5.5f, 30.5f)
                reflectiveQuadTo(856f, 456f)
                lineTo(743f, 572f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(686f, 572f)
                lineTo(432f, 318f)
                quadToRelative(-11f, -11f, -11.5f, -27.5f)
                reflectiveQuadTo(431f, 262f)
                lineToRelative(113f, -118f)
                quadToRelative(12f, -12f, 27f, -18f)
                reflectiveQuadToRelative(30f, -6f)
                quadToRelative(16f, 0f, 30.5f, 5.5f)
                reflectiveQuadTo(657f, 143f)
                lineToRelative(199f, 199f)
                quadToRelative(12f, 11f, 17.5f, 26f)
                reflectiveQuadToRelative(5.5f, 31f)
                close()
            }
        }.build()
        
        return _Ink_eraser_off!!
    }

private var _Ink_eraser_off: ImageVector? = null

