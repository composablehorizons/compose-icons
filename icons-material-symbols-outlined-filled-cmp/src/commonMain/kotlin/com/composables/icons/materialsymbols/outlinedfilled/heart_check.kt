package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Heart_check: ImageVector
    get() {
        if (_Heart_check != null) return _Heart_check!!
        
        _Heart_check = ImageVector.Builder(
            name = "heart_check",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 840f)
                lineTo(313f, 726f)
                quadToRelative(-72f, -65f, -123.5f, -116f)
                reflectiveQuadToRelative(-85f, -96f)
                quadToRelative(-33.5f, -45f, -49f, -87f)
                reflectiveQuadTo(40f, 339f)
                quadToRelative(0f, -94f, 63f, -156.5f)
                reflectiveQuadTo(260f, 120f)
                quadToRelative(52f, 0f, 99f, 21.5f)
                reflectiveQuadToRelative(81f, 61.5f)
                quadToRelative(34f, -40f, 81f, -61.5f)
                reflectiveQuadToRelative(99f, -21.5f)
                quadToRelative(85f, 0f, 142.5f, 51.5f)
                reflectiveQuadTo(834f, 292f)
                quadToRelative(-20f, -8f, -42f, -10f)
                reflectiveQuadToRelative(-45f, -2f)
                quadToRelative(-85f, 0f, -156f, 68.5f)
                reflectiveQuadTo(520f, 520f)
                quadToRelative(0f, 48f, 21f, 97.5f)
                reflectiveQuadToRelative(59f, 80.5f)
                quadToRelative(-19f, 17f, -49.5f, 43.5f)
                reflectiveQuadTo(498f, 788f)
                lineToRelative(-58f, 52f)
                close()
                moveToRelative(278f, -193f)
                lineTo(604f, 534f)
                lineToRelative(57f, -56f)
                lineToRelative(57f, 56f)
                lineToRelative(141f, -141f)
                lineToRelative(57f, 56f)
                lineToRelative(-198f, 198f)
                close()
            }
        }.build()
        
        return _Heart_check!!
    }

private var _Heart_check: ImageVector? = null

