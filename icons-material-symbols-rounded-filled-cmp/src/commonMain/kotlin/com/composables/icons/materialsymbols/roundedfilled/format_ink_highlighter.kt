package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Format_ink_highlighter: ImageVector
    get() {
        if (_Format_ink_highlighter != null) return _Format_ink_highlighter!!
        
        _Format_ink_highlighter = ImageVector.Builder(
            name = "format_ink_highlighter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
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
                moveToRelative(264f, -640f)
                lineToRelative(216f, 217f)
                lineToRelative(-160f, 160f)
                quadToRelative(-24f, 24f, -56.5f, 24f)
                reflectiveQuadTo(367f, 697f)
                lineToRelative(-5f, 4f)
                quadToRelative(-11f, 9f, -24f, 14f)
                reflectiveQuadToRelative(-27f, 5f)
                horizontalLineTo(189f)
                quadToRelative(-14f, 0f, -19.5f, -12f)
                reflectiveQuadToRelative(4.5f, -22f)
                lineToRelative(92f, -91f)
                quadToRelative(-24f, -24f, -25f, -57.5f)
                reflectiveQuadToRelative(23f, -57.5f)
                lineToRelative(160f, -160f)
                close()
                moveToRelative(56f, -57f)
                lineToRelative(160f, -159f)
                quadToRelative(24f, -24f, 56.5f, -24f)
                reflectiveQuadToRelative(56.5f, 24f)
                lineToRelative(104f, 103f)
                quadToRelative(24f, 24f, 24f, 56.5f)
                reflectiveQuadTo(857f, 320f)
                lineTo(697f, 480f)
                lineTo(480f, 263f)
                close()
            }
        }.build()
        
        return _Format_ink_highlighter!!
    }

private var _Format_ink_highlighter: ImageVector? = null

