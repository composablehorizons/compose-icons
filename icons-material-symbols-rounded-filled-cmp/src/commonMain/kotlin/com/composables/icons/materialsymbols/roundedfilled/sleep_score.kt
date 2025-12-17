package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Sleep_score: ImageVector
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
                moveTo(840f, 360f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(796f, 320f)
                quadToRelative(-5f, -28f, -18f, -52f)
                reflectiveQuadToRelative(-32f, -44f)
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
                quadToRelative(-21f, -20f, -47f, -33f)
                reflectiveQuadToRelative(-56f, -18f)
                quadToRelative(-15f, -2f, -24f, -14.5f)
                reflectiveQuadToRelative(-9f, -28.5f)
                quadToRelative(0f, -17f, 11f, -28.5f)
                reflectiveQuadToRelative(26f, -9.5f)
                quadToRelative(92f, 12f, 158f, 76.5f)
                reflectiveQuadTo(876f, 315f)
                quadToRelative(3f, 17f, -8f, 31f)
                reflectiveQuadToRelative(-28f, 14f)
                close()
                moveTo(483f, 880f)
                quadToRelative(-84f, 0f, -157.5f, -32f)
                reflectiveQuadToRelative(-128f, -86.5f)
                quadTo(143f, 707f, 111f, 633.5f)
                reflectiveQuadTo(79f, 476f)
                quadToRelative(0f, -124f, 68.5f, -225f)
                reflectiveQuadTo(331f, 103f)
                quadToRelative(14f, -5f, 29f, -3.5f)
                reflectiveQuadToRelative(25f, 9.5f)
                quadToRelative(8f, 7f, 12.5f, 19.5f)
                reflectiveQuadTo(402f, 161f)
                quadToRelative(2f, 79f, 32f, 150.5f)
                reflectiveQuadTo(520f, 439f)
                quadToRelative(56f, 56f, 128f, 86f)
                reflectiveQuadToRelative(151f, 32f)
                quadToRelative(21f, 0f, 32f, 3.5f)
                reflectiveQuadToRelative(18f, 11.5f)
                quadToRelative(8f, 10f, 10.5f, 26f)
                reflectiveQuadToRelative(-2.5f, 29f)
                quadToRelative(-46f, 115f, -148f, 184f)
                reflectiveQuadTo(483f, 880f)
                close()
            }
        }.build()
        
        return _Sleep_score!!
    }

private var _Sleep_score: ImageVector? = null

