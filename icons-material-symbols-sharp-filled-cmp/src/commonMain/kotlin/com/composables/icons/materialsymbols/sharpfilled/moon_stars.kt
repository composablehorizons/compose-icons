package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Moon_stars: ImageVector
    get() {
        if (_Moon_stars != null) return _Moon_stars!!
        
        _Moon_stars = ImageVector.Builder(
            name = "moon_stars",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(600f, 320f)
                lineTo(480f, 200f)
                lineToRelative(120f, -120f)
                lineToRelative(120f, 120f)
                lineToRelative(-120f, 120f)
                close()
                moveToRelative(200f, 120f)
                lineToRelative(-80f, -80f)
                lineToRelative(80f, -80f)
                lineToRelative(80f, 80f)
                lineToRelative(-80f, 80f)
                close()
                moveTo(483f, 880f)
                quadToRelative(-84f, 0f, -157.5f, -32f)
                reflectiveQuadToRelative(-128f, -86.5f)
                quadTo(143f, 707f, 111f, 633.5f)
                reflectiveQuadTo(79f, 476f)
                quadToRelative(0f, -146f, 93f, -257.5f)
                reflectiveQuadTo(409f, 80f)
                quadToRelative(-18f, 99f, 11f, 193.5f)
                reflectiveQuadTo(520f, 439f)
                quadToRelative(71f, 71f, 165.5f, 100f)
                reflectiveQuadTo(879f, 550f)
                quadToRelative(-26f, 144f, -138f, 237f)
                reflectiveQuadTo(483f, 880f)
                close()
            }
        }.build()
        
        return _Moon_stars!!
    }

private var _Moon_stars: ImageVector? = null

