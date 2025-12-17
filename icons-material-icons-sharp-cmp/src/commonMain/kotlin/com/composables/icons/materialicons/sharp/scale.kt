package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Scale: ImageVector
    get() {
        if (_Scale != null) return _Scale!!
        
        _Scale = ImageVector.Builder(
            name = "scale",
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
                    moveTo(14f, 11f)
                    verticalLineTo(8f)
                    curveToRelative(4.56f, -0.58f, 8f, -3.1f, 8f, -6f)
                    horizontalLineTo(2f)
                    curveToRelative(0f, 2.9f, 3.44f, 5.42f, 8f, 6f)
                    lineToRelative(0f, 3f)
                    curveToRelative(-3.68f, 0.73f, -8f, 3.61f, -8f, 11f)
                    horizontalLineToRelative(6f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(4.13f)
                    curveToRelative(0.93f, -6.83f, 6.65f, -7.2f, 7.87f, -7.2f)
                    reflectiveCurveToRelative(6.94f, 0.37f, 7.87f, 7.2f)
                    horizontalLineTo(16f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(6f)
                    curveTo(22f, 14.61f, 17.68f, 11.73f, 14f, 11f)
                    close()
                    moveTo(12f, 22f)
                    curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                    curveToRelative(0f, -0.55f, 0.22f, -1.05f, 0.59f, -1.41f)
                    curveTo(11.39f, 17.79f, 16f, 16f, 16f, 16f)
                    reflectiveCurveToRelative(-1.79f, 4.61f, -2.59f, 5.41f)
                    curveTo(13.05f, 21.78f, 12.55f, 22f, 12f, 22f)
                    close()
                }
            }
        }.build()
        
        return _Scale!!
    }

private var _Scale: ImageVector? = null

