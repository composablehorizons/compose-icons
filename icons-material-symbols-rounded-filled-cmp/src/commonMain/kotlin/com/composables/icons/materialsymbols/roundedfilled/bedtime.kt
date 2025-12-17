package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Bedtime: ImageVector
    get() {
        if (_Bedtime != null) return _Bedtime!!
        
        _Bedtime = ImageVector.Builder(
            name = "bedtime",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(524f, 920f)
                quadToRelative(-84f, 0f, -157.5f, -32f)
                reflectiveQuadToRelative(-128f, -86.5f)
                quadTo(184f, 747f, 152f, 673.5f)
                reflectiveQuadTo(120f, 516f)
                quadToRelative(0f, -128f, 72f, -232f)
                reflectiveQuadToRelative(193f, -146f)
                quadToRelative(22f, -8f, 41f, 5.5f)
                reflectiveQuadToRelative(18f, 36.5f)
                quadToRelative(-3f, 85f, 27f, 162f)
                reflectiveQuadToRelative(90f, 137f)
                quadToRelative(60f, 60f, 137f, 90f)
                reflectiveQuadToRelative(162f, 27f)
                quadToRelative(26f, -1f, 38.5f, 17.5f)
                reflectiveQuadTo(903f, 655f)
                quadToRelative(-44f, 120f, -147.5f, 192.5f)
                reflectiveQuadTo(524f, 920f)
                close()
            }
        }.build()
        
        return _Bedtime!!
    }

private var _Bedtime: ImageVector? = null

