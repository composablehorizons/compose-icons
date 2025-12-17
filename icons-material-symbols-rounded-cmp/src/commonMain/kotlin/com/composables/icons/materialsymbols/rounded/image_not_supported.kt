package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Image_not_supported: ImageVector
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
                moveTo(5f, 21f)
                quadToRelative(-0.825f, 0f, -1.413f, -0.587f)
                quadTo(3f, 19.825f, 3f, 19f)
                verticalLineTo(5.825f)
                lineTo(1.4f, 4.2f)
                quadToRelative(-0.275f, -0.275f, -0.287f, -0.688f)
                quadTo(1.1f, 3.1f, 1.4f, 2.8f)
                quadToRelative(0.275f, -0.275f, 0.7f, -0.275f)
                quadToRelative(0.425f, 0f, 0.7f, 0.275f)
                lineToRelative(18.4f, 18.4f)
                quadToRelative(0.3f, 0.3f, 0.288f, 0.7f)
                quadToRelative(-0.013f, 0.4f, -0.313f, 0.7f)
                quadToRelative(-0.3f, 0.275f, -0.7f, 0.287f)
                quadToRelative(-0.4f, 0.013f, -0.7f, -0.287f)
                lineToRelative(-1.6f, -1.6f)
                close()
                moveToRelative(0f, -2f)
                horizontalLineToRelative(11.175f)
                lineToRelative(-2f, -2f)
                horizontalLineTo(7f)
                quadToRelative(-0.3f, 0f, -0.45f, -0.275f)
                quadToRelative(-0.15f, -0.275f, 0.05f, -0.525f)
                lineToRelative(2f, -2.65f)
                quadToRelative(0.15f, -0.2f, 0.4f, -0.2f)
                reflectiveQuadToRelative(0.4f, 0.2f)
                lineToRelative(1.6f, 2.175f)
                lineToRelative(0.85f, -1.05f)
                lineTo(5f, 7.825f)
                verticalLineTo(19f)
                close()
                moveToRelative(16f, -0.825f)
                lineToRelative(-2f, -2f)
                verticalLineTo(5f)
                horizontalLineTo(7.825f)
                lineToRelative(-2f, -2f)
                horizontalLineTo(19f)
                quadToRelative(0.825f, 0f, 1.413f, 0.587f)
                quadTo(21f, 4.175f, 21f, 5f)
                close()
                moveToRelative(-7.525f, -7.525f)
                close()
                moveTo(10.6f, 13.425f)
                close()
            }
        }.build()
        
        return _Image_not_supported!!
    }

private var _Image_not_supported: ImageVector? = null

