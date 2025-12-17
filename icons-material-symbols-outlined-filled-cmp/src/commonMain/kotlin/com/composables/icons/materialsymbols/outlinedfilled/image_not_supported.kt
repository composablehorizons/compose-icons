package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Image_not_supported: ImageVector
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
                horizontalLineTo(5f)
                quadToRelative(-0.825f, 0f, -1.413f, -0.587f)
                quadTo(3f, 19.825f, 3f, 19f)
                verticalLineTo(5.825f)
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
                horizontalLineTo(19f)
                quadToRelative(0.825f, 0f, 1.413f, 0.587f)
                quadTo(21f, 4.175f, 21f, 5f)
                close()
            }
        }.build()
        
        return _Image_not_supported!!
    }

private var _Image_not_supported: ImageVector? = null

