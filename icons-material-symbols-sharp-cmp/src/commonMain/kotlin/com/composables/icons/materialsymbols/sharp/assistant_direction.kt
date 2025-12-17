package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Assistant_direction: ImageVector
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
                moveToRelative(0f, -440f)
                close()
                moveToRelative(-2f, 334f)
                lineToRelative(335f, -335f)
                lineToRelative(-335f, -335f)
                lineToRelative(-335f, 335f)
                lineToRelative(335f, 335f)
                close()
                moveTo(319f, 599f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(206f)
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
                moveToRelative(161f, 241f)
                quadToRelative(151f, 0f, 255.5f, -104.5f)
                reflectiveQuadTo(840f, 480f)
                quadToRelative(0f, -151f, -104.5f, -255.5f)
                reflectiveQuadTo(480f, 120f)
                quadToRelative(-151f, 0f, -255.5f, 104.5f)
                reflectiveQuadTo(120f, 480f)
                quadToRelative(0f, 151f, 104.5f, 255.5f)
                reflectiveQuadTo(480f, 840f)
                close()
            }
        }.build()
        
        return _Assistant_direction!!
    }

private var _Assistant_direction: ImageVector? = null

