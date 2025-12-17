package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Heart_broken: ImageVector
    get() {
        if (_Heart_broken != null) return _Heart_broken!!
        
        _Heart_broken = ImageVector.Builder(
            name = "heart_broken",
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
                    moveTo(16.5f, 3f)
                    curveToRelative(-0.96f, 0f, -1.9f, 0.25f, -2.73f, 0.69f)
                    lineTo(12f, 9f)
                    horizontalLineToRelative(3f)
                    lineToRelative(-3f, 10f)
                    lineToRelative(1f, -9f)
                    horizontalLineToRelative(-3f)
                    lineToRelative(1.54f, -5.39f)
                    curveTo(10.47f, 3.61f, 9.01f, 3f, 7.5f, 3f)
                    curveTo(4.42f, 3f, 2f, 5.42f, 2f, 8.5f)
                    curveToRelative(0f, 4.13f, 4.16f, 7.18f, 10f, 12.5f)
                    curveToRelative(5.47f, -4.94f, 10f, -8.26f, 10f, -12.5f)
                    curveTo(22f, 5.42f, 19.58f, 3f, 16.5f, 3f)
                    close()
                }
            }
        }.build()
        
        return _Heart_broken!!
    }

private var _Heart_broken: ImageVector? = null

