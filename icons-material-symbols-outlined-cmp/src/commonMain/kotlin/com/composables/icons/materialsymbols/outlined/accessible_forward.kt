package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Accessible_forward: ImageVector
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
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(320f, 480f)
                verticalLineToRelative(80f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(320f, 880f)
                close()
                moveToRelative(360f, -40f)
                verticalLineToRelative(-200f)
                horizontalLineTo(440f)
                quadToRelative(-44f, 0f, -68f, -37.5f)
                reflectiveQuadToRelative(-6f, -78.5f)
                lineToRelative(74f, -164f)
                horizontalLineToRelative(-91f)
                lineToRelative(-24f, 62f)
                lineToRelative(-77f, -22f)
                lineToRelative(28f, -72f)
                quadToRelative(9f, -23f, 29.5f, -35.5f)
                reflectiveQuadTo(350f, 280f)
                horizontalLineToRelative(208f)
                quadToRelative(45f, 0f, 68.5f, 36.5f)
                reflectiveQuadTo(632f, 394f)
                lineToRelative(-66f, 146f)
                horizontalLineToRelative(114f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 620f)
                verticalLineToRelative(220f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-40f, -580f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(560f, 180f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(640f, 100f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(720f, 180f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(640f, 260f)
                close()
            }
        }.build()
        
        return _Accessible_forward!!
    }

private var _Accessible_forward: ImageVector? = null

