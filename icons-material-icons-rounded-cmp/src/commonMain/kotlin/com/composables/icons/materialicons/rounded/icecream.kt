package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Icecream: ImageVector
    get() {
        if (_Icecream != null) return _Icecream!!
        
        _Icecream = ImageVector.Builder(
            name = "icecream",
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
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18.38f, 6.24f)
                        curveTo(17.79f, 3.24f, 15.14f, 1f, 12f, 1f)
                        reflectiveCurveTo(6.21f, 3.24f, 5.62f, 6.24f)
                        curveTo(4.08f, 6.81f, 3f, 8.29f, 3f, 10f)
                        curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                        curveToRelative(0.12f, 0f, 0.23f, -0.02f, 0.34f, -0.02f)
                        lineToRelative(3.83f, 7.31f)
                        curveToRelative(0.38f, 0.72f, 1.41f, 0.71f, 1.78f, -0.01f)
                        lineToRelative(3.73f, -7.31f)
                        curveTo(16.79f, 13.98f, 16.89f, 14f, 17f, 14f)
                        curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                        curveTo(21f, 8.29f, 19.92f, 6.81f, 18.38f, 6.24f)
                        close()
                        moveTo(12.05f, 18.63f)
                        lineToRelative(-2.73f, -5.21f)
                        curveTo(10.15f, 13.79f, 11.06f, 14f, 12f, 14f)
                        curveToRelative(0.95f, 0f, 1.88f, -0.21f, 2.72f, -0.6f)
                        lineTo(12.05f, 18.63f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Icecream!!
    }

private var _Icecream: ImageVector? = null

