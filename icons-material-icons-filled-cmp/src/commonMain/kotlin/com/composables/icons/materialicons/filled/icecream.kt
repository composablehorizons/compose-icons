package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Icecream: ImageVector
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(8.79f, 12.4f)
                    lineToRelative(3.26f, 6.22f)
                    lineToRelative(3.17f, -6.21f)
                    curveToRelative(-0.11f, -0.08f, -0.21f, -0.16f, -0.3f, -0.25f)
                    curveTo(14.08f, 12.69f, 13.07f, 13f, 12f, 13f)
                    reflectiveCurveToRelative(-2.08f, -0.31f, -2.92f, -0.84f)
                    curveTo(8.99f, 12.25f, 8.89f, 12.33f, 8.79f, 12.4f)
                    close()
                    moveTo(6.83f, 12.99f)
                    curveTo(5.25f, 12.9f, 4f, 11.6f, 4f, 10f)
                    curveToRelative(0f, -1.49f, 1.09f, -2.73f, 2.52f, -2.96f)
                    curveTo(6.75f, 4.22f, 9.12f, 2f, 12f, 2f)
                    reflectiveCurveToRelative(5.25f, 2.22f, 5.48f, 5.04f)
                    curveTo(18.91f, 7.27f, 20f, 8.51f, 20f, 10f)
                    curveToRelative(0f, 1.59f, -1.24f, 2.9f, -2.81f, 2.99f)
                    lineTo(12.07f, 23f)
                    lineTo(6.83f, 12.99f)
                    close()
                }
            }
        }.build()
        
        return _Icecream!!
    }

private var _Icecream: ImageVector? = null

