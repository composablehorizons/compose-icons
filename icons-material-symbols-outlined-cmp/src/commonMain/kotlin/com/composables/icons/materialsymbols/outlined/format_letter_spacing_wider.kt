package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Format_letter_spacing_wider: ImageVector
    get() {
        if (_Format_letter_spacing_wider != null) return _Format_letter_spacing_wider!!
        
        _Format_letter_spacing_wider = ImageVector.Builder(
            name = "format_letter_spacing_wider",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(640f)
                horizontalLineTo(80f)
                close()
                moveToRelative(720f, 0f)
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
        
        return _Format_letter_spacing_wider!!
    }

private var _Format_letter_spacing_wider: ImageVector? = null

