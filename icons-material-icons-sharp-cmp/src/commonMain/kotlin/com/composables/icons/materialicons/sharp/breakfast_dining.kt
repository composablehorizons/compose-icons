package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Breakfast_dining: ImageVector
    get() {
        if (_Breakfast_dining != null) return _Breakfast_dining!!
        
        _Breakfast_dining = ImageVector.Builder(
            name = "breakfast_dining",
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
                    moveTo(17.85f, 3f)
                    lineTo(6.14f, 3f)
                    curveTo(4.15f, 3f, 2.36f, 4.39f, 2.05f, 6.36f)
                    curveTo(1.78f, 8.11f, 2.64f, 9.65f, 4f, 10.45f)
                    verticalLineTo(21f)
                    horizontalLineToRelative(16f)
                    verticalLineTo(10.45f)
                    curveToRelative(1.36f, -0.79f, 2.23f, -2.36f, 1.95f, -4.11f)
                    curveTo(21.63f, 4.38f, 19.83f, 3f, 17.85f, 3f)
                    close()
                    moveTo(16.41f, 13f)
                    lineTo(12f, 17.42f)
                    lineTo(7.59f, 13f)
                    lineTo(12f, 8.59f)
                    lineTo(16.41f, 13f)
                    close()
                }
            }
        }.build()
        
        return _Breakfast_dining!!
    }

private var _Breakfast_dining: ImageVector? = null

