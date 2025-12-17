package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Picture_in_picture_off: ImageVector
    get() {
        if (_Picture_in_picture_off != null) return _Picture_in_picture_off!!
        
        _Picture_in_picture_off = ImageVector.Builder(
            name = "picture_in_picture_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(818f, 932f)
                lineTo(686f, 800f)
                horizontalLineTo(80f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(80f)
                lineToRelative(80f, 80f)
                horizontalLineTo(126f)
                lineTo(26f, 140f)
                lineToRelative(57f, -57f)
                lineTo(875f, 875f)
                lineToRelative(-57f, 57f)
                close()
                moveToRelative(62f, -166f)
                lineTo(634f, 520f)
                horizontalLineToRelative(126f)
                verticalLineToRelative(-240f)
                horizontalLineTo(440f)
                verticalLineToRelative(46f)
                lineTo(274f, 160f)
                horizontalLineToRelative(606f)
                verticalLineToRelative(606f)
                close()
            }
        }.build()
        
        return _Picture_in_picture_off!!
    }

private var _Picture_in_picture_off: ImageVector? = null

