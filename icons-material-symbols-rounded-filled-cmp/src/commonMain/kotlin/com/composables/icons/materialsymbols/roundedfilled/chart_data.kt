package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Chart_data: ImageVector
    get() {
        if (_Chart_data != null) return _Chart_data!!
        
        _Chart_data = ImageVector.Builder(
            name = "chart_data",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(418f, 519f)
                lineToRelative(52f, 52f)
                quadToRelative(11f, 11f, 28f, 11f)
                reflectiveQuadToRelative(28f, -11f)
                lineToRelative(114f, -114f)
                verticalLineToRelative(24f)
                quadToRelative(0f, 17f, 11.5f, 28f)
                reflectiveQuadToRelative(28.5f, 11f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(720f, 480f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(680f, 320f)
                horizontalLineTo(559f)
                quadToRelative(-17f, 0f, -28f, 11.5f)
                reflectiveQuadTo(520f, 360f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(560f, 400f)
                horizontalLineToRelative(23f)
                lineToRelative(-85f, 86f)
                lineToRelative(-52f, -52f)
                quadToRelative(-11f, -12f, -28f, -12f)
                reflectiveQuadToRelative(-28f, 12f)
                lineTo(268f, 556f)
                quadToRelative(-12f, 11f, -12f, 28f)
                reflectiveQuadToRelative(12f, 28f)
                quadToRelative(11f, 12f, 28f, 12f)
                reflectiveQuadToRelative(28f, -12f)
                lineToRelative(94f, -93f)
                close()
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
            }
        }.build()
        
        return _Chart_data!!
    }

private var _Chart_data: ImageVector? = null

