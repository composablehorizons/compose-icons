package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Key: ImageVector
    get() {
        if (_Key != null) return _Key!!
        
        _Key = ImageVector.Builder(
            name = "key",
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
                    moveTo(21f, 10f)
                    horizontalLineToRelative(-8.35f)
                    curveTo(11.83f, 7.67f, 9.61f, 6f, 7f, 6f)
                    curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                    reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                    curveToRelative(2.61f, 0f, 4.83f, -1.67f, 5.65f, -4f)
                    horizontalLineTo(13f)
                    lineToRelative(2f, 2f)
                    lineToRelative(2f, -2f)
                    lineToRelative(2f, 2f)
                    lineToRelative(4f, -4.04f)
                    lineTo(21f, 10f)
                    close()
                    moveTo(7f, 15f)
                    curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                    curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                    reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                    curveTo(10f, 13.65f, 8.65f, 15f, 7f, 15f)
                    close()
                }
            }
        }.build()
        
        return _Key!!
    }

private var _Key: ImageVector? = null

