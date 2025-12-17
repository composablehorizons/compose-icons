package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Image_not_supported: ImageVector
    get() {
        if (_Image_not_supported != null) return _Image_not_supported!!
        
        _Image_not_supported = ImageVector.Builder(
            name = "image_not_supported",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color.Transparent)
                ) {
                    moveTo(0f, 0f)
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(21.9f, 21.9f)
                    lineToRelative(-8.49f, -8.49f)
                    lineToRelative(0f, 0f)
                    lineTo(3.59f, 3.59f)
                    lineToRelative(0f, 0f)
                    lineTo(2.1f, 2.1f)
                    lineTo(0.69f, 3.51f)
                    lineTo(3f, 5.83f)
                    verticalLineTo(19f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(13.17f)
                    lineToRelative(2.31f, 2.31f)
                    lineTo(21.9f, 21.9f)
                    close()
                    moveTo(5f, 18f)
                    lineToRelative(3.5f, -4.5f)
                    lineToRelative(2.5f, 3.01f)
                    lineTo(12.17f, 15f)
                    lineToRelative(3f, 3f)
                    horizontalLineTo(5f)
                    close()
                    moveTo(21f, 18.17f)
                    lineTo(5.83f, 3f)
                    horizontalLineTo(19f)
                    curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                    verticalLineTo(18.17f)
                    close()
                }
            }
        }.build()
        
        return _Image_not_supported!!
    }

private var _Image_not_supported: ImageVector? = null

