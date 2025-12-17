package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Tour: ImageVector
    get() {
        if (_Tour != null) return _Tour!!
        
        _Tour = ImageVector.Builder(
            name = "tour",
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
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(7f, 12f)
                        lineTo(7f, 6f)
                        lineTo(18.05f, 6f)
                        lineTo(16.85f, 9f)
                        lineTo(18.05f, 12f)
                        close()
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(21f, 4f)
                            horizontalLineToRelative(-8f)
                            horizontalLineToRelative(-1f)
                            horizontalLineTo(7f)
                            verticalLineTo(2f)
                            horizontalLineTo(5f)
                            verticalLineToRelative(2f)
                            verticalLineToRelative(10f)
                            verticalLineToRelative(8f)
                            horizontalLineToRelative(2f)
                            verticalLineToRelative(-8f)
                            horizontalLineToRelative(4f)
                            horizontalLineToRelative(1f)
                            horizontalLineToRelative(9f)
                            lineToRelative(-2f, -5f)
                            lineTo(21f, 4f)
                            close()
                            moveTo(7f, 12f)
                            verticalLineTo(6f)
                            horizontalLineToRelative(11.05f)
                            lineToRelative(-1.2f, 3f)
                            lineToRelative(1.2f, 3f)
                            horizontalLineTo(7f)
                            close()
                            moveTo(14f, 9f)
                            curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                            reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                            reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                            reflectiveCurveTo(14f, 7.9f, 14f, 9f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Tour!!
    }

private var _Tour: ImageVector? = null

