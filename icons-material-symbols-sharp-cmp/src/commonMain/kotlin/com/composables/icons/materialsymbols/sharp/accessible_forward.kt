package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Accessible_forward: ImageVector
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
                horizontalLineTo(376f)
                lineToRelative(-37f, -56f)
                lineToRelative(101f, -224f)
                horizontalLineToRelative(-91f)
                lineToRelative(-24f, 62f)
                lineToRelative(-77f, -22f)
                lineToRelative(47f, -120f)
                horizontalLineToRelative(263f)
                quadToRelative(45f, 0f, 68.5f, 36.5f)
                reflectiveQuadTo(632f, 394f)
                lineToRelative(-66f, 146f)
                horizontalLineToRelative(194f)
                verticalLineToRelative(300f)
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

