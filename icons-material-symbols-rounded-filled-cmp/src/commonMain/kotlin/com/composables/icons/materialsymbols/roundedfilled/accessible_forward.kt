package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Accessible_forward: ImageVector
    get() {
        if (_Accessible_forward != null) return _Accessible_forward!!
        
        _Accessible_forward = ImageVector.Builder(
            name = "accessible_forward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 880f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(120f, 680f)
                quadToRelative(0f, -69f, 43f, -123f)
                reflectiveQuadToRelative(110f, -71f)
                quadToRelative(16f, -4f, 30f, 4.5f)
                reflectiveQuadToRelative(18f, 24.5f)
                quadToRelative(4f, 16f, -4.5f, 30f)
                reflectiveQuadTo(292f, 563f)
                quadToRelative(-41f, 10f, -66.5f, 42.5f)
                reflectiveQuadTo(200f, 680f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                quadToRelative(41f, 0f, 73f, -25f)
                reflectiveQuadToRelative(43f, -64f)
                quadToRelative(5f, -16f, 19f, -24.5f)
                reflectiveQuadToRelative(30f, -3.5f)
                quadToRelative(16f, 5f, 24.5f, 19f)
                reflectiveQuadToRelative(3.5f, 30f)
                quadToRelative(-18f, 66f, -71.5f, 107f)
                reflectiveQuadTo(320f, 880f)
                close()
                moveToRelative(320f, -620f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(560f, 180f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(640f, 100f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(720f, 180f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(640f, 260f)
                close()
                moveTo(440f, 640f)
                quadToRelative(-44f, 0f, -68f, -37.5f)
                reflectiveQuadToRelative(-6f, -78.5f)
                lineToRelative(74f, -164f)
                horizontalLineToRelative(-91f)
                lineToRelative(-11f, 28f)
                quadToRelative(-5f, 14f, -19f, 21.5f)
                reflectiveQuadToRelative(-29f, 2.5f)
                quadToRelative(-17f, -5f, -25f, -20.5f)
                reflectiveQuadToRelative(-1f, -32.5f)
                lineToRelative(12f, -31f)
                quadToRelative(9f, -23f, 29.5f, -35.5f)
                reflectiveQuadTo(350f, 280f)
                horizontalLineToRelative(208f)
                quadToRelative(45f, 0f, 68.5f, 36.5f)
                reflectiveQuadTo(632f, 394f)
                lineToRelative(-66f, 146f)
                horizontalLineToRelative(114f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 620f)
                verticalLineToRelative(180f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(720f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(680f, 800f)
                verticalLineToRelative(-160f)
                horizontalLineTo(440f)
                close()
            }
        }.build()
        
        return _Accessible_forward!!
    }

private var _Accessible_forward: ImageVector? = null

