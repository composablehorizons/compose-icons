package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Sleep_score: ImageVector
    get() {
        if (_Sleep_score != null) return _Sleep_score!!
        
        _Sleep_score = ImageVector.Builder(
            name = "sleep_score",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(600f, 80f)
                quadToRelative(117f, 0f, 198.5f, 81.5f)
                reflectiveQuadTo(880f, 360f)
                horizontalLineToRelative(-80f)
                quadToRelative(0f, -40f, -14.5f, -74.5f)
                reflectiveQuadTo(746f, 224f)
                lineToRelative(-55f, 93f)
                quadToRelative(-10f, 16f, -21.5f, 35f)
                reflectiveQuadTo(645f, 385f)
                quadToRelative(-14f, 15f, -35f, 15f)
                reflectiveQuadToRelative(-36f, -14f)
                quadToRelative(-15f, -14f, -15f, -35f)
                reflectiveQuadToRelative(15f, -36f)
                quadToRelative(14f, -14f, 33.5f, -25f)
                reflectiveQuadToRelative(35.5f, -21f)
                lineToRelative(93f, -55f)
                quadToRelative(-27f, -25f, -61.5f, -39.5f)
                reflectiveQuadTo(600f, 160f)
                verticalLineToRelative(-80f)
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
        
        return _Sleep_score!!
    }

private var _Sleep_score: ImageVector? = null

