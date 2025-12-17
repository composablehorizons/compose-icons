package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Thumb_up_off: ImageVector
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
                moveTo(7f, 21f)
                verticalLineTo(8f)
                lineToRelative(7f, -7f)
                lineToRelative(1.85f, 1.85f)
                lineTo(14.55f, 8f)
                horizontalLineTo(23f)
                verticalLineToRelative(4.4f)
                lineTo(19.35f, 21f)
                close()
                moveToRelative(2f, -2f)
                horizontalLineToRelative(9f)
                lineToRelative(3f, -7f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-9f)
                lineToRelative(1.35f, -5.5f)
                lineTo(9f, 8.85f)
                close()
                moveTo(9f, 8.85f)
                verticalLineTo(19f)
                close()
                moveTo(7f, 8f)
                verticalLineToRelative(2f)
                horizontalLineTo(4f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineTo(2f)
                verticalLineTo(8f)
                close()
            }
        }.build()
        
        return _Thumb_up_off!!
    }

private var _Thumb_up_off: ImageVector? = null

