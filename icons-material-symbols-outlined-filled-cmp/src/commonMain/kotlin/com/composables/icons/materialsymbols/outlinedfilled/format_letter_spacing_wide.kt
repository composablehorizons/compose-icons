package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Format_letter_spacing_wide: ImageVector
    get() {
        if (_Format_letter_spacing_wide != null) return _Format_letter_spacing_wide!!
        
        _Format_letter_spacing_wide = ImageVector.Builder(
            name = "format_letter_spacing_wide",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(640f, 0f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(294f, 680f)
                lineToRelative(150f, -400f)
                horizontalLineToRelative(72f)
                lineToRelative(150f, 400f)
                horizontalLineToRelative(-70f)
                lineToRelative(-34f, -102f)
                horizontalLineTo(400f)
                lineToRelative(-36f, 102f)
                horizontalLineToRelative(-70f)
                close()
                moveToRelative(126f, -160f)
                horizontalLineToRelative(120f)
                lineToRelative(-58f, -166f)
                lineToRelative(-62f, 166f)
                close()
            }
        }.build()
        
        return _Format_letter_spacing_wide!!
    }

private var _Format_letter_spacing_wide: ImageVector? = null

