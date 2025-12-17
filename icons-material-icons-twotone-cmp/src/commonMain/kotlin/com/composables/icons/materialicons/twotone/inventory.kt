package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Inventory: ImageVector
    get() {
        if (_Inventory != null) return _Inventory!!
        
        _Inventory = ImageVector.Builder(
            name = "inventory",
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
                        moveTo(21f, 11.5f)
                        lineToRelative(1.5f, 1.5f)
                        lineToRelative(-6.99f, 7f)
                        lineTo(11f, 15.5f)
                        lineToRelative(1.5f, -1.5f)
                        lineToRelative(3.01f, 3f)
                        lineTo(21f, 11.5f)
                        close()
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(17f, 5f)
                            lineTo(17f, 8f)
                            lineTo(7f, 8f)
                            lineTo(7f, 5f)
                            lineTo(5f, 5f)
                            lineTo(5f, 19f)
                            lineTo(11.68f, 19f)
                            lineTo(8.17f, 15.5f)
                            lineTo(12.5f, 11.17f)
                            lineTo(15.51f, 14.17f)
                            lineTo(19f, 10.67f)
                            lineTo(19f, 5f)
                            close()
                        }
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(5f, 19f)
                            verticalLineTo(5f)
                            horizontalLineToRelative(2f)
                            verticalLineToRelative(3f)
                            horizontalLineToRelative(10f)
                            verticalLineTo(5f)
                            horizontalLineToRelative(2f)
                            verticalLineToRelative(5.67f)
                            lineToRelative(2f, -2f)
                            lineToRelative(0f, 0f)
                            verticalLineTo(5f)
                            curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                            horizontalLineToRelative(-4.18f)
                            curveTo(14.4f, 1.84f, 13.3f, 1f, 12f, 1f)
                            reflectiveCurveTo(9.6f, 1.84f, 9.18f, 3f)
                            horizontalLineTo(5f)
                            curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                            verticalLineToRelative(14f)
                            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                            horizontalLineToRelative(8.68f)
                            lineToRelative(-2f, -2f)
                            horizontalLineTo(5f)
                            close()
                            moveTo(12f, 3f)
                            curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                            reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                            reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                            reflectiveCurveTo(11.45f, 3f, 12f, 3f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Inventory!!
    }

private var _Inventory: ImageVector? = null

