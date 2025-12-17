package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Photo_camera_back: ImageVector
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(16.83f, 5f)
                    lineTo(15f, 3f)
                    horizontalLineTo(9f)
                    lineTo(7.17f, 5f)
                    horizontalLineTo(2f)
                    verticalLineToRelative(16f)
                    horizontalLineToRelative(20f)
                    verticalLineTo(5f)
                    horizontalLineTo(16.83f)
                    close()
                    moveTo(6f, 17f)
                    lineToRelative(3f, -4f)
                    lineToRelative(2.25f, 3f)
                    lineToRelative(3f, -4f)
                    lineTo(18f, 17f)
                    horizontalLineTo(6f)
                    close()
                }
            }
        }.build()
        
        return _Photo_camera_back!!
    }

private var _Photo_camera_back: ImageVector? = null

