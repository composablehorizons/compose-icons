package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Stars_2: ImageVector
    get() {
        if (_Stars_2 != null) return _Stars_2!!
        
        _Stars_2 = ImageVector.Builder(
            name = "stars_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 691f)
                lineTo(314f, 791f)
                quadToRelative(-11f, 7f, -23f, 6f)
                reflectiveQuadToRelative(-21f, -8f)
                quadToRelative(-9f, -7f, -14f, -17.5f)
                reflectiveQuadToRelative(-2f, -23.5f)
                lineToRelative(44f, -189f)
                lineToRelative(-147f, -127f)
                quadToRelative(-10f, -9f, -12.5f, -20.5f)
                reflectiveQuadTo(140f, 389f)
                quadToRelative(4f, -11f, 12f, -18f)
                reflectiveQuadToRelative(22f, -9f)
                lineToRelative(194f, -17f)
                lineToRelative(75f, -178f)
                quadToRelative(5f, -12f, 15.5f, -18f)
                reflectiveQuadToRelative(21.5f, -6f)
                quadToRelative(11f, 0f, 21.5f, 6f)
                reflectiveQuadToRelative(15.5f, 18f)
                lineToRelative(75f, 178f)
                lineToRelative(194f, 17f)
                quadToRelative(14f, 2f, 22f, 9f)
                reflectiveQuadToRelative(12f, 18f)
                quadToRelative(4f, 11f, 1.5f, 22.5f)
                reflectiveQuadTo(809f, 432f)
                lineTo(662f, 559f)
                lineToRelative(44f, 189f)
                quadToRelative(3f, 13f, -2f, 23.5f)
                reflectiveQuadTo(690f, 789f)
                quadToRelative(-9f, 7f, -21f, 8f)
                reflectiveQuadToRelative(-23f, -6f)
                lineTo(480f, 691f)
                close()
                moveToRelative(290f, -458f)
                lineToRelative(-60f, 35f)
                quadToRelative(-6f, 3f, -11.5f, -0.5f)
                reflectiveQuadTo(695f, 257f)
                lineToRelative(16f, -66f)
                lineToRelative(-53f, -44f)
                quadToRelative(-5f, -5f, -3f, -10.5f)
                reflectiveQuadToRelative(9f, -6.5f)
                lineToRelative(70f, -6f)
                lineToRelative(27f, -63f)
                quadToRelative(2f, -6f, 9f, -6f)
                reflectiveQuadToRelative(9f, 6f)
                lineToRelative(27f, 63f)
                lineToRelative(70f, 6f)
                quadToRelative(7f, 1f, 9f, 6.5f)
                reflectiveQuadToRelative(-3f, 10.5f)
                lineToRelative(-53f, 44f)
                lineToRelative(16f, 66f)
                quadToRelative(2f, 7f, -3.5f, 10.5f)
                reflectiveQuadToRelative(-11.5f, 0.5f)
                lineToRelative(-60f, -35f)
                close()
            }
        }.build()
        
        return _Stars_2!!
    }

private var _Stars_2: ImageVector? = null

