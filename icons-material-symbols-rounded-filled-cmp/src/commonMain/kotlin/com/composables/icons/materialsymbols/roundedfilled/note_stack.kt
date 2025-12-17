package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Note_stack: ImageVector
    get() {
        if (_Note_stack != null) return _Note_stack!!
        
        _Note_stack = ImageVector.Builder(
            name = "note_stack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 800f)
                verticalLineToRelative(-441f)
                quadToRelative(0f, -33f, 24f, -56f)
                reflectiveQuadToRelative(57f, -23f)
                horizontalLineToRelative(439f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 360f)
                verticalLineToRelative(287f)
                quadToRelative(0f, 16f, -6f, 30.5f)
                reflectiveQuadTo(857f, 703f)
                lineTo(703f, 857f)
                quadToRelative(-11f, 11f, -25.5f, 17f)
                reflectiveQuadTo(647f, 880f)
                horizontalLineTo(360f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(280f, 800f)
                close()
                moveTo(81f, 250f)
                quadToRelative(-6f, -33f, 13f, -59.5f)
                reflectiveQuadToRelative(52f, -32.5f)
                lineToRelative(434f, -77f)
                quadToRelative(33f, -6f, 59.5f, 13f)
                reflectiveQuadToRelative(32.5f, 52f)
                lineToRelative(10f, 54f)
                horizontalLineTo(360f)
                quadToRelative(-66f, 0f, -113f, 47f)
                reflectiveQuadToRelative(-47f, 113f)
                verticalLineToRelative(382f)
                quadToRelative(-16f, -9f, -27.5f, -24f)
                reflectiveQuadTo(158f, 684f)
                lineTo(81f, 250f)
                close()
                moveToRelative(719f, 390f)
                horizontalLineTo(680f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(640f, 680f)
                verticalLineToRelative(120f)
                lineToRelative(160f, -160f)
                close()
            }
        }.build()
        
        return _Note_stack!!
    }

private var _Note_stack: ImageVector? = null

