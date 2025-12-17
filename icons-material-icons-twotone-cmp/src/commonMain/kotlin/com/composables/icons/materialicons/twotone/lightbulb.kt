package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Lightbulb: ImageVector
    get() {
        if (_Lightbulb != null) return _Lightbulb!!
        
        _Lightbulb = ImageVector.Builder(
            name = "lightbulb",
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
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 4f)
                        curveTo(8.97f, 4f, 6.5f, 6.47f, 6.5f, 9.5f)
                        curveToRelative(0f, 2.47f, 1.49f, 3.89f, 2.35f, 4.5f)
                        horizontalLineToRelative(6.3f)
                        curveToRelative(0.86f, -0.61f, 2.35f, -2.03f, 2.35f, -4.5f)
                        curveTo(17.5f, 6.47f, 15.03f, 4f, 12f, 4f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 22f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        horizontalLineToRelative(-4f)
                        curveTo(10f, 21.1f, 10.9f, 22f, 12f, 22f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(8f, 17f)
                        horizontalLineTo(16f)
                        verticalLineTo(19f)
                        horizontalLineTo(8f)
                        verticalLineTo(17f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 2f)
                        curveTo(7.86f, 2f, 4.5f, 5.36f, 4.5f, 9.5f)
                        curveToRelative(0f, 3.82f, 2.66f, 5.86f, 3.77f, 6.5f)
                        horizontalLineToRelative(7.46f)
                        curveToRelative(1.11f, -0.64f, 3.77f, -2.68f, 3.77f, -6.5f)
                        curveTo(19.5f, 5.36f, 16.14f, 2f, 12f, 2f)
                        close()
                        moveTo(15.15f, 14f)
                        horizontalLineToRelative(-6.3f)
                        curveTo(7.99f, 13.39f, 6.5f, 11.97f, 6.5f, 9.5f)
                        curveTo(6.5f, 6.47f, 8.97f, 4f, 12f, 4f)
                        reflectiveCurveToRelative(5.5f, 2.47f, 5.5f, 5.5f)
                        curveTo(17.5f, 11.97f, 16.01f, 13.39f, 15.15f, 14f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Lightbulb!!
    }

private var _Lightbulb: ImageVector? = null

