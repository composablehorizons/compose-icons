package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Thumb_up_off: ImageVector
    get() {
        if (_Thumb_up_off != null) return _Thumb_up_off!!
        
        _Thumb_up_off = ImageVector.Builder(
            name = "thumb_up_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 21f)
                verticalLineTo(8f)
                lineToRelative(7f, -7f)
                lineToRelative(1.85f, 1.85f)
                lineTo(15.55f, 8f)
                horizontalLineTo(23f)
                verticalLineToRelative(4.4f)
                lineTo(19.35f, 21f)
                close()
                moveTo(6f, 8f)
                verticalLineToRelative(13f)
                horizontalLineTo(2f)
                verticalLineTo(8f)
                close()
            }
        }.build()
        
        return _Thumb_up_off!!
    }

private var _Thumb_up_off: ImageVector? = null

