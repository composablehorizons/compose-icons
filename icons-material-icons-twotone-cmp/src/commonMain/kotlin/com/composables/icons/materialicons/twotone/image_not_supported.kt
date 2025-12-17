package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Image_not_supported: ImageVector
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
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(7.83f, 5f)
                        horizontalLineTo(19f)
                        verticalLineToRelative(11.17f)
                        lineTo(7.83f, 5f)
                        close()
                        moveTo(16.17f, 19f)
                        lineToRelative(-2f, -2f)
                        horizontalLineTo(6f)
                        lineToRelative(3f, -4f)
                        lineToRelative(2f, 2.72f)
                        lineToRelative(0.84f, -1.05f)
                        lineTo(5f, 7.83f)
                        verticalLineTo(19f)
                        horizontalLineTo(16.17f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(5.83f, 3f)
                        horizontalLineTo(19f)
                        curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                        verticalLineToRelative(13.17f)
                        lineToRelative(-2f, -2f)
                        verticalLineTo(5f)
                        horizontalLineTo(7.83f)
                        lineTo(5.83f, 3f)
                        close()
                        moveTo(20.49f, 23.31f)
                        lineTo(18.17f, 21f)
                        horizontalLineTo(5f)
                        curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                        verticalLineTo(5.83f)
                        lineTo(0.69f, 3.51f)
                        lineTo(2.1f, 2.1f)
                        lineToRelative(1.49f, 1.49f)
                        lineTo(5f, 5f)
                        lineToRelative(8.11f, 8.11f)
                        lineToRelative(2.69f, 2.69f)
                        lineTo(19f, 19f)
                        lineToRelative(1.41f, 1.41f)
                        lineToRelative(1.49f, 1.49f)
                        lineTo(20.49f, 23.31f)
                        close()
                        moveTo(16.17f, 19f)
                        lineToRelative(-2f, -2f)
                        horizontalLineTo(6f)
                        lineToRelative(3f, -4f)
                        lineToRelative(2f, 2.72f)
                        lineToRelative(0.84f, -1.05f)
                        lineTo(5f, 7.83f)
                        verticalLineTo(19f)
                        horizontalLineTo(16.17f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Image_not_supported!!
    }

private var _Image_not_supported: ImageVector? = null

