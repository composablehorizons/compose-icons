package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Image_not_supported: ImageVector
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
                    moveTo(21.19f, 21.19f)
                    lineToRelative(-0.78f, -0.78f)
                    lineTo(18f, 18f)
                    lineToRelative(-4.59f, -4.59f)
                    lineTo(3.59f, 3.59f)
                    verticalLineToRelative(0f)
                    lineTo(2.81f, 2.81f)
                    curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                    curveTo(1f, 3.2f, 1f, 3.83f, 1.39f, 4.22f)
                    lineTo(3f, 5.83f)
                    verticalLineTo(19f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(13.17f)
                    lineToRelative(1.61f, 1.61f)
                    curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                    curveTo(21.58f, 22.22f, 21.58f, 21.58f, 21.19f, 21.19f)
                    close()
                    moveTo(6.02f, 18f)
                    curveToRelative(-0.42f, 0f, -0.65f, -0.48f, -0.39f, -0.81f)
                    lineToRelative(2.49f, -3.2f)
                    curveToRelative(0.2f, -0.25f, 0.58f, -0.26f, 0.78f, -0.01f)
                    lineToRelative(2.1f, 2.53f)
                    lineTo(12.17f, 15f)
                    lineToRelative(3f, 3f)
                    horizontalLineTo(6.02f)
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

