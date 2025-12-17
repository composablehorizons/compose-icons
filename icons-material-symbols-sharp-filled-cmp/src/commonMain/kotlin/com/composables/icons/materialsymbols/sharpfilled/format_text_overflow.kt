package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Format_text_overflow: ImageVector
    get() {
        if (_Format_text_overflow != null) return _Format_text_overflow!!
        
        _Format_text_overflow = ImageVector.Builder(
            name = "format_text_overflow",
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
                moveToRelative(498f, -178f)
                lineToRelative(-56f, -57f)
                lineToRelative(45f, -45f)
                horizontalLineTo(320f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(327f)
                lineToRelative(-45f, -45f)
                lineToRelative(56f, -57f)
                lineToRelative(142f, 142f)
                lineToRelative(-142f, 142f)
                close()
                moveTo(480f, 800f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(0f, -440f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Format_text_overflow!!
    }

private var _Format_text_overflow: ImageVector? = null

