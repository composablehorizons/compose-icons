package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Sound_detection_glass_break: ImageVector
    get() {
        if (_Sound_detection_glass_break != null) return _Sound_detection_glass_break!!
        
        _Sound_detection_glass_break = ImageVector.Builder(
            name = "sound_detection_glass_break",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
                moveToRelative(180f, -428f)
                quadToRelative(15f, 0f, 30f, 6f)
                reflectiveQuadToRelative(27f, 18f)
                lineToRelative(103f, 103f)
                lineToRelative(220f, -247f)
                verticalLineToRelative(-92f)
                horizontalLineTo(200f)
                verticalLineToRelative(360f)
                lineToRelative(123f, -124f)
                quadToRelative(12f, -12f, 26.5f, -18f)
                reflectiveQuadToRelative(30.5f, -6f)
                close()
                moveToRelative(157f, 210f)
                quadToRelative(-15f, 0f, -30f, -5.5f)
                reflectiveQuadTo(480f, 599f)
                lineTo(380f, 499f)
                lineTo(200f, 680f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-348f)
                lineTo(596f, 596f)
                quadToRelative(-12f, 14f, -27f, 20f)
                reflectiveQuadToRelative(-32f, 6f)
                close()
            }
        }.build()
        
        return _Sound_detection_glass_break!!
    }

private var _Sound_detection_glass_break: ImageVector? = null

