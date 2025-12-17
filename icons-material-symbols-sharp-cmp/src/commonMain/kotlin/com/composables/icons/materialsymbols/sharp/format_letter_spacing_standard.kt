package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Format_letter_spacing_standard: ImageVector
    get() {
        if (_Format_letter_spacing_standard != null) return _Format_letter_spacing_standard!!
        
        _Format_letter_spacing_standard = ImageVector.Builder(
            name = "format_letter_spacing_standard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(560f, 0f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(294f, 680f)
                lineToRelative(150f, -400f)
                horizontalLineToRelative(72f)
                lineToRelative(150f, 400f)
                horizontalLineToRelative(-69f)
                lineToRelative(-36f, -102f)
                horizontalLineTo(399f)
                lineToRelative(-36f, 102f)
                horizontalLineToRelative(-69f)
                close()
                moveToRelative(126f, -160f)
                horizontalLineToRelative(120f)
                lineToRelative(-58f, -166f)
                horizontalLineToRelative(-4f)
                lineToRelative(-58f, 166f)
                close()
            }
        }.build()
        
        return _Format_letter_spacing_standard!!
    }

private var _Format_letter_spacing_standard: ImageVector? = null

