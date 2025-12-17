package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Photo_camera_back: ImageVector
    get() {
        if (_Photo_camera_back != null) return _Photo_camera_back!!
        
        _Photo_camera_back = ImageVector.Builder(
            name = "photo_camera_back",
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
                        moveTo(20f, 5f)
                        horizontalLineToRelative(-3.17f)
                        lineTo(15f, 3f)
                        horizontalLineTo(9f)
                        lineTo(7.17f, 5f)
                        horizontalLineTo(4f)
                        curveTo(2.9f, 5f, 2f, 5.9f, 2f, 7f)
                        verticalLineToRelative(12f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(16f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(7f)
                        curveTo(22f, 5.9f, 21.1f, 5f, 20f, 5f)
                        close()
                        moveTo(20f, 19f)
                        horizontalLineTo(4f)
                        verticalLineTo(7f)
                        horizontalLineToRelative(4.05f)
                        lineToRelative(1.83f, -2f)
                        horizontalLineToRelative(4.24f)
                        lineToRelative(1.83f, 2f)
                        horizontalLineTo(20f)
                        verticalLineTo(19f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(11.25f, 16f)
                        lineTo(9f, 13f)
                        lineTo(6f, 17f)
                        lineTo(18f, 17f)
                        lineTo(14.25f, 12f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Photo_camera_back!!
    }

private var _Photo_camera_back: ImageVector? = null

