package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Format_color_fill: ImageVector
    get() {
        if (_Format_color_fill != null) return _Format_color_fill!!
        
        _Format_color_fill = ImageVector.Builder(
            name = "format_color_fill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(332f, 28f)
                lineToRelative(315f, 315f)
                quadToRelative(23f, 23f, 23f, 57f)
                reflectiveQuadToRelative(-23f, 57f)
                lineTo(457f, 647f)
                quadToRelative(-23f, 23f, -57f, 23f)
                reflectiveQuadToRelative(-57f, -23f)
                lineTo(153f, 457f)
                quadToRelative(-23f, -23f, -23f, -57f)
                reflectiveQuadToRelative(23f, -57f)
                lineToRelative(190f, -191f)
                lineToRelative(-68f, -68f)
                quadToRelative(-12f, -12f, -11.5f, -28f)
                reflectiveQuadToRelative(12.5f, -28f)
                quadToRelative(12f, -11f, 28f, -11.5f)
                reflectiveQuadToRelative(28f, 11.5f)
                close()
                moveToRelative(68f, 181f)
                lineTo(209f, 400f)
                horizontalLineToRelative(382f)
                lineTo(400f, 209f)
                close()
                moveToRelative(360f, 471f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(680f, 600f)
                quadToRelative(0f, -21f, 12.5f, -45f)
                reflectiveQuadToRelative(27.5f, -45f)
                quadToRelative(9f, -12f, 19f, -25f)
                reflectiveQuadToRelative(21f, -25f)
                quadToRelative(11f, 12f, 21f, 25f)
                reflectiveQuadToRelative(19f, 25f)
                quadToRelative(15f, 21f, 27.5f, 45f)
                reflectiveQuadToRelative(12.5f, 45f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 680f)
                close()
                moveTo(160f, 960f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 880f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 800f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 880f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 960f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Format_color_fill!!
    }

private var _Format_color_fill: ImageVector? = null

