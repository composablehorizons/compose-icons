package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.No_photography: ImageVector
    get() {
        if (_No_photography != null) return _No_photography!!
        
        _No_photography = ImageVector.Builder(
            name = "no_photography",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(791f, 903f)
                lineToRelative(-64f, -63f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 760f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 200f)
                horizontalLineToRelative(41f)
                verticalLineToRelative(114f)
                lineTo(55f, 168f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadTo(55f, 111f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(736f, 736f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(791f, 903f)
                close()
                moveToRelative(64f, -198f)
                quadToRelative(-11f, 5f, -22f, 3f)
                reflectiveQuadToRelative(-21f, -12f)
                lineTo(659f, 543f)
                quadToRelative(5f, -42f, -8.5f, -81.5f)
                reflectiveQuadTo(607f, 392f)
                quadToRelative(-29f, -29f, -68.5f, -42.5f)
                reflectiveQuadTo(457f, 341f)
                lineTo(327f, 212f)
                quadToRelative(-6f, -6f, -8.5f, -13f)
                reflectiveQuadToRelative(-2.5f, -15f)
                quadToRelative(0f, -8f, 2.5f, -14.5f)
                reflectiveQuadTo(326f, 157f)
                lineToRelative(10f, -11f)
                quadToRelative(11f, -12f, 26.5f, -19f)
                reflectiveQuadToRelative(32.5f, -7f)
                horizontalLineToRelative(170f)
                quadToRelative(17f, 0f, 32.5f, 7f)
                reflectiveQuadToRelative(26.5f, 19f)
                lineToRelative(50f, 54f)
                horizontalLineToRelative(126f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 280f)
                verticalLineToRelative(388f)
                quadToRelative(0f, 14f, -7f, 23f)
                reflectiveQuadToRelative(-18f, 14f)
                close()
                moveToRelative(-375f, -5f)
                quadToRelative(23f, 0f, 44.5f, -5f)
                reflectiveQuadToRelative(41.5f, -16f)
                lineTo(321f, 434f)
                quadToRelative(-11f, 20f, -16f, 41.5f)
                reflectiveQuadToRelative(-5f, 44.5f)
                quadToRelative(0f, 75f, 52.5f, 127.5f)
                reflectiveQuadTo(480f, 700f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(-42f, 0f, -71f, -29f)
                reflectiveQuadToRelative(-29f, -71f)
                quadToRelative(0f, -20f, 7.5f, -38.5f)
                reflectiveQuadTo(409f, 449f)
                lineToRelative(142f, 142f)
                quadToRelative(-14f, 14f, -32.5f, 21.5f)
                reflectiveQuadTo(480f, 620f)
                close()
            }
        }.build()
        
        return _No_photography!!
    }

private var _No_photography: ImageVector? = null

