package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Ad_units: ImageVector
    get() {
        if (_Ad_units != null) return _Ad_units!!
        
        _Ad_units = ImageVector.Builder(
            name = "ad_units",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(7f, 3f)
                    horizontalLineTo(17f)
                    verticalLineTo(4f)
                    horizontalLineTo(7f)
                    verticalLineTo(3f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(7f, 20f)
                    horizontalLineTo(17f)
                    verticalLineTo(21f)
                    horizontalLineTo(7f)
                    verticalLineTo(20f)
                    close()
                }
                group {
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(17f, 1f)
                            horizontalLineTo(7f)
                            curveTo(5.9f, 1f, 5f, 1.9f, 5f, 3f)
                            verticalLineToRelative(18f)
                            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                            horizontalLineToRelative(10f)
                            curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                            verticalLineTo(3f)
                            curveTo(19f, 1.9f, 18.1f, 1f, 17f, 1f)
                            lineTo(17f, 1f)
                            close()
                            moveTo(7f, 4f)
                            verticalLineTo(3f)
                            horizontalLineToRelative(10f)
                            verticalLineToRelative(1f)
                            horizontalLineTo(7f)
                            lineTo(7f, 4f)
                            close()
                            moveTo(7f, 18f)
                            verticalLineTo(6f)
                            horizontalLineToRelative(10f)
                            verticalLineToRelative(12f)
                            horizontalLineTo(7f)
                            lineTo(7f, 18f)
                            close()
                            moveTo(7f, 21f)
                            verticalLineToRelative(-1f)
                            horizontalLineToRelative(10f)
                            verticalLineToRelative(1f)
                            horizontalLineTo(7f)
                            lineTo(7f, 21f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(16f, 7f)
                            lineTo(8f, 7f)
                            lineTo(8f, 9f)
                            lineTo(16f, 9f)
                            lineTo(16f, 7f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Ad_units!!
    }

private var _Ad_units: ImageVector? = null

