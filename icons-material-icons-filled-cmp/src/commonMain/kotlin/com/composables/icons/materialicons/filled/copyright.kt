package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Copyright: ImageVector
    get() {
        if (_Copyright != null) return _Copyright!!
        
        _Copyright = ImageVector.Builder(
            name = "copyright",
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
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(11.88f, 9.14f)
                            curveToRelative(1.28f, 0.06f, 1.61f, 1.15f, 1.63f, 1.66f)
                            horizontalLineToRelative(1.79f)
                            curveToRelative(-0.08f, -1.98f, -1.49f, -3.19f, -3.45f, -3.19f)
                            curveTo(9.64f, 7.61f, 8f, 9f, 8f, 12.14f)
                            curveToRelative(0f, 1.94f, 0.93f, 4.24f, 3.84f, 4.24f)
                            curveToRelative(2.22f, 0f, 3.41f, -1.65f, 3.44f, -2.95f)
                            horizontalLineToRelative(-1.79f)
                            curveToRelative(-0.03f, 0.59f, -0.45f, 1.38f, -1.63f, 1.44f)
                            curveTo(10.55f, 14.83f, 10f, 13.81f, 10f, 12.14f)
                            curveTo(10f, 9.25f, 11.28f, 9.16f, 11.88f, 9.14f)
                            close()
                            moveTo(12f, 2f)
                            curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                            reflectiveCurveToRelative(4.48f, 10f, 10f, 10f)
                            reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                            reflectiveCurveTo(17.52f, 2f, 12f, 2f)
                            close()
                            moveTo(12f, 20f)
                            curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                            reflectiveCurveToRelative(3.59f, -8f, 8f, -8f)
                            reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                            reflectiveCurveTo(16.41f, 20f, 12f, 20f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Copyright!!
    }

private var _Copyright: ImageVector? = null

