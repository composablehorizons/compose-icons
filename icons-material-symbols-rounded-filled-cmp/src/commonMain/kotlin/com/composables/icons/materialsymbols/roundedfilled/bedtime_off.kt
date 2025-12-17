package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Bedtime_off: ImageVector
    get() {
        if (_Bedtime_off != null) return _Bedtime_off!!
        
        _Bedtime_off = ImageVector.Builder(
            name = "bedtime_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(563f, 396f)
                quadToRelative(60f, 60f, 137f, 90f)
                reflectiveQuadToRelative(162f, 27f)
                quadToRelative(23f, -1f, 37.5f, 15.5f)
                reflectiveQuadTo(907f, 565f)
                quadToRelative(-11f, 33f, -28f, 64f)
                reflectiveQuadToRelative(-39f, 59f)
                quadToRelative(-13f, 16f, -33.5f, 16.5f)
                reflectiveQuadTo(771f, 690f)
                lineTo(270f, 189f)
                quadToRelative(-14f, -14f, -14f, -34f)
                reflectiveQuadToRelative(16f, -34f)
                quadToRelative(25f, -22f, 53.5f, -38f)
                reflectiveQuadToRelative(61.5f, -28f)
                quadToRelative(22f, -8f, 40.5f, 5.5f)
                reflectiveQuadTo(445f, 97f)
                quadToRelative(-3f, 85f, 27.5f, 162f)
                reflectiveQuadTo(563f, 396f)
                close()
                moveTo(748f, 894f)
                lineToRelative(-81f, -80f)
                quadToRelative(-35f, 13f, -70.5f, 19.5f)
                reflectiveQuadTo(524f, 840f)
                quadToRelative(-84f, 0f, -157.5f, -32f)
                reflectiveQuadToRelative(-128f, -86.5f)
                quadTo(184f, 667f, 152f, 593.5f)
                reflectiveQuadTo(120f, 436f)
                quadToRelative(0f, -37f, 6.5f, -72.5f)
                reflectiveQuadTo(146f, 293f)
                lineToRelative(-78f, -78f)
                quadToRelative(-12f, -12f, -12f, -29f)
                reflectiveQuadToRelative(12f, -29f)
                quadToRelative(12f, -12f, 29f, -12f)
                reflectiveQuadToRelative(29f, 12f)
                lineToRelative(678f, 680f)
                quadToRelative(11f, 12f, 11f, 28.5f)
                reflectiveQuadTo(804f, 893f)
                quadToRelative(-11f, 11f, -28f, 11.5f)
                reflectiveQuadTo(748f, 894f)
                close()
            }
        }.build()
        
        return _Bedtime_off!!
    }

private var _Bedtime_off: ImageVector? = null

