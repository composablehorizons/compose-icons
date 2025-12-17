package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Speed_2x: ImageVector
    get() {
        if (_Speed_2x != null) return _Speed_2x!!
        
        _Speed_2x = ImageVector.Builder(
            name = "speed_2x",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 680f)
                horizontalLineTo(280f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 600f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(280f, 440f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineTo(240f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(200f, 320f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(240f, 280f)
                horizontalLineToRelative(120f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(440f, 360f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(360f, 520f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(440f, 640f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(400f, 680f)
                close()
                moveToRelative(240f, -133f)
                lineToRelative(-70f, 116f)
                quadToRelative(-5f, 8f, -12.5f, 12.5f)
                reflectiveQuadTo(541f, 680f)
                quadToRelative(-20f, 0f, -30.5f, -17.5f)
                reflectiveQuadToRelative(0.5f, -34.5f)
                lineToRelative(89f, -148f)
                lineToRelative(-89f, -148f)
                quadToRelative(-11f, -17f, -0.5f, -34.5f)
                reflectiveQuadTo(541f, 280f)
                quadToRelative(9f, 0f, 16.5f, 4.5f)
                reflectiveQuadTo(570f, 297f)
                lineToRelative(70f, 116f)
                lineToRelative(70f, -116f)
                quadToRelative(5f, -8f, 12.5f, -12.5f)
                reflectiveQuadTo(739f, 280f)
                quadToRelative(20f, 0f, 30.5f, 17.5f)
                reflectiveQuadTo(769f, 332f)
                lineToRelative(-89f, 148f)
                lineToRelative(89f, 148f)
                quadToRelative(11f, 17f, 0.5f, 34.5f)
                reflectiveQuadTo(739f, 680f)
                quadToRelative(-9f, 0f, -16.5f, -4.5f)
                reflectiveQuadTo(710f, 663f)
                lineToRelative(-70f, -116f)
                close()
            }
        }.build()
        
        return _Speed_2x!!
    }

private var _Speed_2x: ImageVector? = null

