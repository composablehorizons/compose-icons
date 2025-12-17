package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Mic_off: ImageVector
    get() {
        if (_Mic_off != null) return _Mic_off!!
        
        _Mic_off = ImageVector.Builder(
            name = "mic_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(672f, 583f)
                quadToRelative(-14f, -8f, -18f, -24.5f)
                reflectiveQuadToRelative(4f, -30.5f)
                quadToRelative(7f, -11f, 11.5f, -23.5f)
                reflectiveQuadTo(676f, 479f)
                quadToRelative(4f, -17f, 15.5f, -28f)
                reflectiveQuadToRelative(28.5f, -11f)
                quadToRelative(17f, 0f, 28f, 12f)
                reflectiveQuadToRelative(9f, 29f)
                quadToRelative(-3f, 23f, -10.5f, 45f)
                reflectiveQuadTo(727f, 568f)
                quadToRelative(-8f, 14f, -24.5f, 18.5f)
                reflectiveQuadTo(672f, 583f)
                close()
                moveTo(532f, 418f)
                lineTo(383f, 269f)
                quadToRelative(-11f, -11f, -17f, -25.5f)
                reflectiveQuadToRelative(-6f, -30.5f)
                verticalLineToRelative(-13f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                verticalLineToRelative(189f)
                quadToRelative(0f, 27f, -24.5f, 37.5f)
                reflectiveQuadTo(532f, 418f)
                close()
                moveToRelative(-92f, 382f)
                verticalLineToRelative(-84f)
                quadToRelative(-92f, -12f, -157.5f, -77f)
                reflectiveQuadTo(203f, 481f)
                quadToRelative(-2f, -17f, 9f, -29f)
                reflectiveQuadToRelative(28f, -12f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(284f, 480f)
                quadToRelative(14f, 70f, 69.5f, 115f)
                reflectiveQuadTo(480f, 640f)
                quadToRelative(34f, 0f, 64.5f, -10.5f)
                reflectiveQuadTo(600f, 600f)
                lineToRelative(57f, 57f)
                quadToRelative(-29f, 23f, -63.5f, 38.5f)
                reflectiveQuadTo(520f, 716f)
                verticalLineToRelative(84f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 800f)
                close()
                moveToRelative(324f, 76f)
                lineTo(84f, 196f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(680f, 680f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                close()
            }
        }.build()
        
        return _Mic_off!!
    }

private var _Mic_off: ImageVector? = null

