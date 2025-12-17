package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Moon_stars: ImageVector
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
                moveToRelative(0f, -80f)
                quadToRelative(88f, 0f, 163f, -44f)
                reflectiveQuadToRelative(118f, -121f)
                quadToRelative(-86f, -8f, -163f, -43.5f)
                reflectiveQuadTo(463f, 495f)
                quadToRelative(-61f, -61f, -97f, -138f)
                reflectiveQuadToRelative(-43f, -163f)
                quadToRelative(-77f, 43f, -120.5f, 118.5f)
                reflectiveQuadTo(159f, 476f)
                quadToRelative(0f, 135f, 94.5f, 229.5f)
                reflectiveQuadTo(483f, 800f)
                close()
                moveToRelative(-20f, -305f)
                close()
            }
        }.build()
        
        return _Moon_stars!!
    }

private var _Moon_stars: ImageVector? = null

