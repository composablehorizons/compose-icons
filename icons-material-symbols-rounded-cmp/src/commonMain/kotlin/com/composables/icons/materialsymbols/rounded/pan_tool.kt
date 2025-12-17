package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Pan_tool: ImageVector
    get() {
        if (_Pan_tool != null) return _Pan_tool!!
        
        _Pan_tool = ImageVector.Builder(
            name = "pan_tool",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(402f, 920f)
                quadToRelative(-30f, 0f, -56f, -13.5f)
                reflectiveQuadTo(303f, 868f)
                lineTo(67f, 522f)
                quadToRelative(-8f, -12f, -7f, -26f)
                reflectiveQuadToRelative(12f, -24f)
                quadToRelative(19f, -19f, 45f, -22f)
                reflectiveQuadToRelative(47f, 12f)
                lineToRelative(116f, 81f)
                verticalLineToRelative(-383f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(320f, 120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(360f, 160f)
                verticalLineToRelative(460f)
                quadToRelative(0f, 24f, -21.5f, 35.5f)
                reflectiveQuadTo(297f, 653f)
                lineToRelative(-85f, -60f)
                lineToRelative(157f, 229f)
                quadToRelative(5f, 8f, 14f, 13f)
                reflectiveQuadToRelative(19f, 5f)
                horizontalLineToRelative(278f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(760f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(800f, 160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadTo(680f, 920f)
                horizontalLineTo(402f)
                close()
                moveToRelative(78f, -880f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 80f)
                verticalLineToRelative(360f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 480f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 440f)
                verticalLineToRelative(-360f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 40f)
                close()
                moveToRelative(160f, 40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(680f, 120f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(640f, 480f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(600f, 440f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 80f)
                close()
                moveTo(486f, 660f)
                close()
            }
        }.build()
        
        return _Pan_tool!!
    }

private var _Pan_tool: ImageVector? = null

