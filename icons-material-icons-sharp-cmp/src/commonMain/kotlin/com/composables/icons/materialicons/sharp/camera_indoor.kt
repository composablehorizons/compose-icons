package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Camera_indoor: ImageVector
    get() {
        if (_Camera_indoor != null) return _Camera_indoor!!
        
        _Camera_indoor = ImageVector.Builder(
            name = "camera_indoor",
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
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(12f, 3f)
                    lineTo(4f, 9f)
                    verticalLineToRelative(12f)
                    horizontalLineToRelative(16f)
                    verticalLineTo(9f)
                    lineTo(12f, 3f)
                    close()
                    moveTo(16f, 16.06f)
                    lineTo(14f, 15f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(8f)
                    verticalLineToRelative(-6f)
                    horizontalLineToRelative(6f)
                    verticalLineToRelative(2f)
                    lineToRelative(2f, -1.06f)
                    verticalLineTo(16.06f)
                    close()
                }
            }
        }.build()
        
        return _Camera_indoor!!
    }

private var _Camera_indoor: ImageVector? = null

