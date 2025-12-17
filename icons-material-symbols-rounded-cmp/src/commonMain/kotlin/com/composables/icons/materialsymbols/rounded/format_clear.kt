package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Format_clear: ImageVector
    get() {
        if (_Format_clear != null) return _Format_clear!!
        
        _Format_clear = ImageVector.Builder(
            name = "format_clear",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(528f, 414f)
                lineToRelative(-93f, -93f)
                lineToRelative(-26.5f, -26.5f)
                lineTo(382f, 268f)
                quadToRelative(-19f, -19f, -8.5f, -43.5f)
                reflectiveQuadTo(411f, 200f)
                horizontalLineToRelative(329f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(800f, 260f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(740f, 320f)
                horizontalLineTo(568f)
                lineToRelative(-40f, 94f)
                close()
                moveTo(764f, 876f)
                lineTo(460f, 572f)
                lineToRelative(-64f, 151f)
                quadToRelative(-7f, 17f, -22.5f, 27f)
                reflectiveQuadTo(340f, 760f)
                quadToRelative(-32f, 0f, -50f, -27f)
                reflectiveQuadToRelative(-5f, -57f)
                lineToRelative(83f, -196f)
                lineTo(84f, 196f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(680f, 680f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                close()
            }
        }.build()
        
        return _Format_clear!!
    }

private var _Format_clear: ImageVector? = null

