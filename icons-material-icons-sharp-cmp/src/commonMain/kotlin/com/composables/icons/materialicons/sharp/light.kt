package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Light: ImageVector
    get() {
        if (_Light != null) return _Light!!
        
        _Light = ImageVector.Builder(
            name = "light",
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
                    moveTo(13f, 6.06f)
                    verticalLineTo(3f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(3.06f)
                    curveTo(5.87f, 6.63f, 2.03f, 11.51f, 3.22f, 17f)
                    lineTo(8f, 17f)
                    curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                    reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                    lineToRelative(4.78f, 0f)
                    curveTo(21.97f, 11.51f, 18.13f, 6.63f, 13f, 6.06f)
                    close()
                    moveTo(12f, 15f)
                    horizontalLineTo(5f)
                    curveToRelative(0f, -3.86f, 3.14f, -7f, 7f, -7f)
                    reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                    horizontalLineTo(12f)
                    close()
                }
            }
        }.build()
        
        return _Light!!
    }

private var _Light: ImageVector? = null

