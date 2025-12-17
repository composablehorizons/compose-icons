package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Speed_0_5x: ImageVector
    get() {
        if (_Speed_0_5x != null) return _Speed_0_5x!!
        
        _Speed_0_5x = ImageVector.Builder(
            name = "speed_0_5x",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(680f, 547f)
                lineToRelative(-70f, 116f)
                quadToRelative(-5f, 8f, -12.5f, 12.5f)
                reflectiveQuadTo(581f, 680f)
                quadToRelative(-20f, 0f, -30.5f, -17.5f)
                reflectiveQuadToRelative(0.5f, -34.5f)
                lineToRelative(89f, -148f)
                lineToRelative(-89f, -148f)
                quadToRelative(-11f, -17f, -0.5f, -34.5f)
                reflectiveQuadTo(581f, 280f)
                quadToRelative(9f, 0f, 16.5f, 4.5f)
                reflectiveQuadTo(610f, 297f)
                lineToRelative(70f, 116f)
                lineToRelative(70f, -116f)
                quadToRelative(5f, -8f, 12.5f, -12.5f)
                reflectiveQuadTo(779f, 280f)
                quadToRelative(20f, 0f, 30.5f, 17.5f)
                reflectiveQuadTo(809f, 332f)
                lineToRelative(-89f, 148f)
                lineToRelative(89f, 148f)
                quadToRelative(11f, 17f, 0.5f, 34.5f)
                reflectiveQuadTo(779f, 680f)
                quadToRelative(-9f, 0f, -16.5f, -4.5f)
                reflectiveQuadTo(750f, 663f)
                lineToRelative(-70f, -116f)
                close()
                moveTo(400f, 680f)
                horizontalLineTo(280f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(240f, 640f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(280f, 600f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                horizontalLineTo(280f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(240f, 480f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(280f, 280f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(480f, 320f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(440f, 360f)
                horizontalLineTo(320f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(480f, 520f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(400f, 680f)
                close()
                moveToRelative(-240f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 640f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 600f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(200f, 640f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(160f, 680f)
                close()
            }
        }.build()
        
        return _Speed_0_5x!!
    }

private var _Speed_0_5x: ImageVector? = null

