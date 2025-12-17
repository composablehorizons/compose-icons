package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Pinch: ImageVector
    get() {
        if (_Pinch != null) return _Pinch!!
        
        _Pinch = ImageVector.Builder(
            name = "pinch",
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
                    moveTo(23.18f, 15.4f)
                    lineTo(22.1f, 23f)
                    horizontalLineToRelative(-9f)
                    lineTo(8f, 17.62f)
                    lineToRelative(1.22f, -1.23f)
                    lineTo(13f, 17.24f)
                    verticalLineTo(6.5f)
                    curveTo(13f, 5.67f, 13.67f, 5f, 14.5f, 5f)
                    reflectiveCurveTo(16f, 5.67f, 16f, 6.5f)
                    verticalLineToRelative(6f)
                    horizontalLineToRelative(1.38f)
                    lineTo(23.18f, 15.4f)
                    close()
                    moveTo(6f, 2.5f)
                    verticalLineTo(1f)
                    horizontalLineToRelative(5f)
                    verticalLineToRelative(5f)
                    horizontalLineTo(9.5f)
                    verticalLineTo(3.56f)
                    lineTo(3.56f, 9.5f)
                    horizontalLineTo(6f)
                    verticalLineTo(11f)
                    horizontalLineTo(1f)
                    verticalLineTo(6f)
                    horizontalLineToRelative(1.5f)
                    verticalLineToRelative(2.44f)
                    lineTo(8.44f, 2.5f)
                    horizontalLineTo(6f)
                    close()
                }
            }
        }.build()
        
        return _Pinch!!
    }

private var _Pinch: ImageVector? = null

