package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Flourescent: ImageVector
    get() {
        if (_Flourescent != null) return _Flourescent!!
        
        _Flourescent = ImageVector.Builder(
            name = "flourescent",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 15.05f)
                verticalLineTo(9.05f)
                horizontalLineTo(19f)
                verticalLineTo(15.05f)
                close()
                moveTo(11f, 5f)
                verticalLineTo(2f)
                horizontalLineTo(13f)
                verticalLineTo(5f)
                close()
                moveTo(18.7f, 7.8f)
                lineTo(17.3f, 6.4f)
                lineTo(19.1f, 4.6f)
                lineTo(20.5f, 6f)
                close()
                moveTo(11f, 22f)
                verticalLineTo(19f)
                horizontalLineTo(13f)
                verticalLineTo(22f)
                close()
                moveTo(19.1f, 19.5f)
                lineTo(17.3f, 17.7f)
                lineTo(18.7f, 16.3f)
                lineTo(20.5f, 18.1f)
                close()
                moveTo(5.3f, 7.8f)
                lineTo(3.5f, 6f)
                lineTo(4.9f, 4.6f)
                lineTo(6.7f, 6.4f)
                close()
                moveTo(4.9f, 19.5f)
                lineTo(3.5f, 18.1f)
                lineTo(5.3f, 16.3f)
                lineTo(6.7f, 17.7f)
                close()
                moveTo(7f, 13.05f)
                horizontalLineTo(17f)
                verticalLineTo(11.05f)
                horizontalLineTo(7f)
                close()
                moveTo(7f, 13.05f)
                verticalLineTo(11.05f)
                verticalLineTo(13.05f)
                close()
            }
        }.build()
        
        return _Flourescent!!
    }

private var _Flourescent: ImageVector? = null

