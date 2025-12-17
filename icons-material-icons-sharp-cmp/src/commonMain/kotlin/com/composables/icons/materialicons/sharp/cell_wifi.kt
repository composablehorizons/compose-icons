package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Cell_wifi: ImageVector
    get() {
        if (_Cell_wifi != null) return _Cell_wifi!!
        
        _Cell_wifi = ImageVector.Builder(
            name = "cell_wifi",
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
                    moveTo(6f, 22f)
                    horizontalLineToRelative(16f)
                    verticalLineTo(5.97f)
                    lineTo(6f, 22f)
                    close()
                    moveTo(20f, 20f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-7.22f)
                    lineToRelative(2f, -2f)
                    verticalLineTo(20f)
                    close()
                    moveTo(5.22f, 7.22f)
                    lineTo(3.93f, 5.93f)
                    curveToRelative(3.9f, -3.91f, 10.24f, -3.91f, 14.15f, 0f)
                    lineToRelative(-1.29f, 1.29f)
                    curveTo(13.6f, 4.03f, 8.41f, 4.03f, 5.22f, 7.22f)
                    close()
                    moveTo(12.93f, 11.07f)
                    lineTo(11f, 13f)
                    lineToRelative(-1.93f, -1.93f)
                    curveTo(10.14f, 10.01f, 11.86f, 10.01f, 12.93f, 11.07f)
                    close()
                    moveTo(14.22f, 9.79f)
                    curveToRelative(-1.78f, -1.77f, -4.66f, -1.77f, -6.43f, 0f)
                    lineTo(6.5f, 8.5f)
                    curveToRelative(2.48f, -2.48f, 6.52f, -2.48f, 9f, 0f)
                    lineTo(14.22f, 9.79f)
                    close()
                }
            }
        }.build()
        
        return _Cell_wifi!!
    }

private var _Cell_wifi: ImageVector? = null

