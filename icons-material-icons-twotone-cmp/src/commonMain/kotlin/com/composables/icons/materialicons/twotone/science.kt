package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Science: ImageVector
    get() {
        if (_Science != null) return _Science!!
        
        _Science = ImageVector.Builder(
            name = "science",
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
            }
            group {
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(13f, 6f)
                        lineTo(11f, 6f)
                        lineTo(11f, 11.33f)
                        lineTo(6f, 18f)
                        lineTo(18f, 18f)
                        lineTo(13f, 11.33f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20.8f, 18.4f)
                        lineTo(15f, 10.67f)
                        verticalLineTo(6.5f)
                        lineToRelative(1.35f, -1.69f)
                        curveTo(16.61f, 4.48f, 16.38f, 4f, 15.96f, 4f)
                        horizontalLineTo(8.04f)
                        curveTo(7.62f, 4f, 7.39f, 4.48f, 7.65f, 4.81f)
                        lineTo(9f, 6.5f)
                        verticalLineToRelative(4.17f)
                        lineTo(3.2f, 18.4f)
                        curveTo(2.71f, 19.06f, 3.18f, 20f, 4f, 20f)
                        horizontalLineToRelative(16f)
                        curveTo(20.82f, 20f, 21.29f, 19.06f, 20.8f, 18.4f)
                        close()
                        moveTo(6f, 18f)
                        lineToRelative(5f, -6.67f)
                        verticalLineTo(6f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(5.33f)
                        lineTo(18f, 18f)
                        horizontalLineTo(6f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Science!!
    }

private var _Science: ImageVector? = null

