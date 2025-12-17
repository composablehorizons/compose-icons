package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Assistant_direction: ImageVector
    get() {
        if (_Assistant_direction != null) return _Assistant_direction!!
        
        _Assistant_direction = ImageVector.Builder(
            name = "assistant_direction",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 920f)
                quadToRelative(-91f, 0f, -171.5f, -34.5f)
                reflectiveQuadToRelative(-140f, -94f)
                quadToRelative(-59.5f, -59.5f, -94f, -140f)
                reflectiveQuadTo(40f, 480f)
                quadToRelative(0f, -92f, 34.5f, -172f)
                reflectiveQuadToRelative(94f, -139.5f)
                quadToRelative(59.5f, -59.5f, 140f, -94f)
                reflectiveQuadTo(480f, 40f)
                quadToRelative(92f, 0f, 172f, 34.5f)
                reflectiveQuadToRelative(139.5f, 94f)
                quadTo(851f, 228f, 885.5f, 308f)
                reflectiveQuadTo(920f, 480f)
                quadToRelative(0f, 91f, -34.5f, 171.5f)
                reflectiveQuadToRelative(-94f, 140f)
                quadTo(732f, 851f, 652f, 885.5f)
                reflectiveQuadTo(480f, 920f)
                close()
                moveToRelative(-25f, -129f)
                quadToRelative(10f, 10f, 23f, 10f)
                reflectiveQuadToRelative(23f, -10f)
                lineToRelative(288f, -288f)
                quadToRelative(10f, -10f, 10f, -24f)
                reflectiveQuadToRelative(-10f, -24f)
                lineTo(501f, 167f)
                quadToRelative(-10f, -10f, -23f, -10f)
                reflectiveQuadToRelative(-23f, 10f)
                lineTo(167f, 455f)
                quadToRelative(-10f, 10f, -10f, 24f)
                reflectiveQuadToRelative(10f, 24f)
                lineToRelative(288f, 288f)
                close()
                moveTo(319f, 599f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -18f, 11f, -29f)
                reflectiveQuadToRelative(29f, -11f)
                horizontalLineToRelative(166f)
                lineToRelative(-42f, -44f)
                lineToRelative(56f, -56f)
                lineToRelative(140f, 140f)
                lineToRelative(-140f, 140f)
                lineToRelative(-56f, -56f)
                lineToRelative(42f, -44f)
                horizontalLineTo(399f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Assistant_direction!!
    }

private var _Assistant_direction: ImageVector? = null

