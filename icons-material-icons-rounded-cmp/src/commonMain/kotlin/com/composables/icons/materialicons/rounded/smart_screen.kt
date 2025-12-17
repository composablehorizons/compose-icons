package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Smart_screen: ImageVector
    get() {
        if (_Smart_screen != null) return _Smart_screen!!
        
        _Smart_screen = ImageVector.Builder(
            name = "smart_screen",
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
                        moveTo(21f, 5f)
                        horizontalLineTo(3f)
                        curveTo(1.9f, 5f, 1f, 5.9f, 1f, 7f)
                        verticalLineToRelative(10f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(18f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(7f)
                        curveTo(23f, 5.9f, 22.1f, 5f, 21f, 5f)
                        close()
                        moveTo(18f, 7f)
                        verticalLineToRelative(10f)
                        horizontalLineTo(6f)
                        verticalLineTo(7f)
                        horizontalLineTo(18f)
                        close()
                        moveTo(14f, 12f)
                        curveToRelative(0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f)
                        reflectiveCurveTo(12.5f, 11.59f, 12.5f, 12f)
                        reflectiveCurveToRelative(0.34f, 0.75f, 0.75f, 0.75f)
                        reflectiveCurveTo(14f, 12.41f, 14f, 12f)
                        close()
                        moveTo(9f, 12f)
                        curveToRelative(0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f)
                        reflectiveCurveTo(7.5f, 11.59f, 7.5f, 12f)
                        reflectiveCurveToRelative(0.34f, 0.75f, 0.75f, 0.75f)
                        reflectiveCurveTo(9f, 12.41f, 9f, 12f)
                        close()
                        moveTo(16.5f, 12f)
                        curveToRelative(0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f)
                        reflectiveCurveTo(15f, 11.59f, 15f, 12f)
                        reflectiveCurveToRelative(0.34f, 0.75f, 0.75f, 0.75f)
                        reflectiveCurveTo(16.5f, 12.41f, 16.5f, 12f)
                        close()
                        moveTo(11.5f, 12f)
                        curveToRelative(0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f)
                        reflectiveCurveTo(10f, 11.59f, 10f, 12f)
                        reflectiveCurveToRelative(0.34f, 0.75f, 0.75f, 0.75f)
                        reflectiveCurveTo(11.5f, 12.41f, 11.5f, 12f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Smart_screen!!
    }

private var _Smart_screen: ImageVector? = null

