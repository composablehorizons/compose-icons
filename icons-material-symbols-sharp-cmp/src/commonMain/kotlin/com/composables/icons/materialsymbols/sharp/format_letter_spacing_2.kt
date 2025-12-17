package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Format_letter_spacing_2: ImageVector
    get() {
        if (_Format_letter_spacing_2 != null) return _Format_letter_spacing_2!!
        
        _Format_letter_spacing_2 = ImageVector.Builder(
            name = "format_letter_spacing_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 880f)
                lineTo(80f, 720f)
                lineToRelative(160f, -160f)
                lineToRelative(57f, 56f)
                lineToRelative(-64f, 64f)
                horizontalLineToRelative(494f)
                lineToRelative(-63f, -64f)
                lineToRelative(56f, -56f)
                lineToRelative(160f, 160f)
                lineTo(720f, 880f)
                lineToRelative(-57f, -56f)
                lineToRelative(64f, -64f)
                horizontalLineTo(233f)
                lineToRelative(63f, 64f)
                lineToRelative(-56f, 56f)
                close()
                moveToRelative(36f, -360f)
                lineToRelative(164f, -440f)
                horizontalLineToRelative(80f)
                lineToRelative(164f, 440f)
                horizontalLineToRelative(-76f)
                lineToRelative(-38f, -112f)
                horizontalLineTo(392f)
                lineToRelative(-40f, 112f)
                horizontalLineToRelative(-76f)
                close()
                moveToRelative(138f, -176f)
                horizontalLineToRelative(132f)
                lineToRelative(-64f, -182f)
                horizontalLineToRelative(-4f)
                lineToRelative(-64f, 182f)
                close()
            }
        }.build()
        
        return _Format_letter_spacing_2!!
    }

private var _Format_letter_spacing_2: ImageVector? = null

