package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Note_stack_add: ImageVector
    get() {
        if (_Note_stack_add != null) return _Note_stack_add!!
        
        _Note_stack_add = ImageVector.Builder(
            name = "note_stack_add",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(540f, 740f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                horizontalLineTo(620f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(120f)
                horizontalLineTo(420f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(-260f, 60f)
                verticalLineToRelative(-441f)
                quadToRelative(0f, -33f, 24f, -56f)
                reflectiveQuadToRelative(57f, -23f)
                horizontalLineToRelative(439f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 360f)
                verticalLineToRelative(320f)
                lineTo(680f, 880f)
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
            }
        }.build()
        
        return _Note_stack_add!!
    }

private var _Note_stack_add: ImageVector? = null

