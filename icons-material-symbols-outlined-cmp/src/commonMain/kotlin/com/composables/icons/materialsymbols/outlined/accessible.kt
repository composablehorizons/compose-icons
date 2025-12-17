package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Accessible: ImageVector
    get() {
        if (_Accessible != null) return _Accessible!!
        
        _Accessible = ImageVector.Builder(
            name = "accessible",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 240f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 160f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 240f)
                close()
                moveTo(680f, 880f)
                verticalLineToRelative(-200f)
                horizontalLineTo(480f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 600f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(24f, 0f, 41.5f, 10.5f)
                reflectiveQuadTo(559f, 324f)
                quadToRelative(55f, 66f, 99.5f, 90.5f)
                reflectiveQuadTo(760f, 440f)
                verticalLineToRelative(80f)
                quadToRelative(-53f, 0f, -107f, -23f)
                reflectiveQuadToRelative(-93f, -55f)
                verticalLineToRelative(138f)
                horizontalLineToRelative(120f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 660f)
                verticalLineToRelative(220f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-280f, 0f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(200f, 680f)
                quadToRelative(0f, -72f, 45.5f, -127f)
                reflectiveQuadTo(360f, 484f)
                verticalLineToRelative(82f)
                quadToRelative(-35f, 14f, -57.5f, 44.5f)
                reflectiveQuadTo(280f, 680f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                quadToRelative(39f, 0f, 69.5f, -22.5f)
                reflectiveQuadTo(514f, 720f)
                horizontalLineToRelative(82f)
                quadToRelative(-14f, 69f, -69f, 114.5f)
                reflectiveQuadTo(400f, 880f)
                close()
            }
        }.build()
        
        return _Accessible!!
    }

private var _Accessible: ImageVector? = null

