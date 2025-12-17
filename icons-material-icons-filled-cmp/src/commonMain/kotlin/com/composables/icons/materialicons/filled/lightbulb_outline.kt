package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Lightbulb_outline: ImageVector
    get() {
        if (_Lightbulb_outline != null) return _Lightbulb_outline!!
        
        _Lightbulb_outline = ImageVector.Builder(
            name = "lightbulb_outline",
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
                            moveTo(9f, 21f)
                            curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                            horizontalLineToRelative(4f)
                            curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                            verticalLineToRelative(-1f)
                            horizontalLineTo(9f)
                            verticalLineTo(21f)
                            close()
                            moveTo(12f, 2f)
                            curveTo(8.14f, 2f, 5f, 5.14f, 5f, 9f)
                            curveToRelative(0f, 2.38f, 1.19f, 4.47f, 3f, 5.74f)
                            verticalLineTo(17f)
                            curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                            horizontalLineToRelative(6f)
                            curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                            verticalLineToRelative(-2.26f)
                            curveToRelative(1.81f, -1.27f, 3f, -3.36f, 3f, -5.74f)
                            curveTo(19f, 5.14f, 15.86f, 2f, 12f, 2f)
                            close()
                            moveTo(14f, 13.7f)
                            verticalLineTo(16f)
                            horizontalLineToRelative(-4f)
                            verticalLineToRelative(-2.3f)
                            curveTo(8.48f, 12.63f, 7f, 11.53f, 7f, 9f)
                            curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                            reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                            curveTo(17f, 11.49f, 15.49f, 12.65f, 14f, 13.7f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Lightbulb_outline!!
    }

private var _Lightbulb_outline: ImageVector? = null

