package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Image_not_supported: ImageVector
    get() {
        if (_Image_not_supported != null) return _Image_not_supported!!
        
        _Image_not_supported = ImageVector.Builder(
            name = "image_not_supported",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20.475f, 23.3f)
                lineToRelative(-2.3f, -2.3f)
                horizontalLineTo(3f)
                verticalLineTo(5.8f)
                lineTo(0.7f, 3.5f)
                lineToRelative(1.4f, -1.4f)
                lineToRelative(19.8f, 19.8f)
                close()
                moveTo(6f, 17f)
                horizontalLineToRelative(8.175f)
                lineToRelative(-2.325f, -2.325f)
                lineToRelative(-0.85f, 1.05f)
                lineTo(9f, 13f)
                close()
                moveToRelative(15f, 1.175f)
                lineTo(5.825f, 3f)
                horizontalLineTo(21f)
                close()
            }
        }.build()
        
        return _Image_not_supported!!
    }

private var _Image_not_supported: ImageVector? = null

