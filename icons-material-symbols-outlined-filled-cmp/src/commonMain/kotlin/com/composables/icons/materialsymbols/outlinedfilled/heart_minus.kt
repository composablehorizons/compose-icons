package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Heart_minus: ImageVector
    get() {
        if (_Heart_minus != null) return _Heart_minus!!
        
        _Heart_minus = ImageVector.Builder(
            name = "heart_minus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(600f, 560f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(80f)
                horizontalLineTo(600f)
                close()
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
                quadToRelative(-18f, -7f, -36f, -10.5f)
                reflectiveQuadToRelative(-35f, -3.5f)
                quadToRelative(-101f, 0f, -172f, 70.5f)
                reflectiveQuadTo(520f, 520f)
                quadToRelative(0f, 52f, 21f, 98.5f)
                reflectiveQuadToRelative(59f, 79.5f)
                quadToRelative(-19f, 17f, -49.5f, 43.5f)
                reflectiveQuadTo(498f, 788f)
                lineToRelative(-58f, 52f)
                close()
            }
        }.build()
        
        return _Heart_minus!!
    }

private var _Heart_minus: ImageVector? = null

