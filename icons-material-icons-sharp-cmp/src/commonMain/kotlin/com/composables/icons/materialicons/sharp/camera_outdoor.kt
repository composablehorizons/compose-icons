package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Camera_outdoor: ImageVector
    get() {
        if (_Camera_outdoor != null) return _Camera_outdoor!!
        
        _Camera_outdoor = ImageVector.Builder(
            name = "camera_outdoor",
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
                    moveTo(18f, 14f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(-6f)
                    verticalLineToRelative(6f)
                    horizontalLineToRelative(6f)
                    verticalLineToRelative(-2f)
                    lineToRelative(2f, 1.06f)
                    verticalLineToRelative(-4.12f)
                    lineTo(18f, 14f)
                    close()
                    moveTo(12f, 3f)
                    lineTo(4f, 9f)
                    verticalLineToRelative(12f)
                    horizontalLineToRelative(16f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(6f)
                    verticalLineToRelative(-9f)
                    lineToRelative(6f, -4.5f)
                    lineToRelative(6f, 4.5f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(9f)
                    lineTo(12f, 3f)
                    close()
                }
            }
        }.build()
        
        return _Camera_outdoor!!
    }

private var _Camera_outdoor: ImageVector? = null

