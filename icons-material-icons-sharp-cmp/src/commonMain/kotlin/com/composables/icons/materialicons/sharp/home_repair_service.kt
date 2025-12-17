package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Home_repair_service: ImageVector
    get() {
        if (_Home_repair_service != null) return _Home_repair_service!!
        
        _Home_repair_service = ImageVector.Builder(
            name = "home_repair_service",
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
                            moveTo(18f, 16f)
                            lineTo(16f, 16f)
                            lineTo(16f, 15f)
                            lineTo(8f, 15f)
                            lineTo(8f, 16f)
                            lineTo(6f, 16f)
                            lineTo(6f, 15f)
                            lineTo(2f, 15f)
                            lineTo(2f, 20f)
                            lineTo(22f, 20f)
                            lineTo(22f, 15f)
                            lineTo(18f, 15f)
                            close()
                        }
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17f, 8f)
                        verticalLineTo(4f)
                        horizontalLineTo(7f)
                        verticalLineToRelative(4f)
                        horizontalLineTo(2f)
                        verticalLineToRelative(6f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(8f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(4f)
                        verticalLineTo(8f)
                        horizontalLineTo(17f)
                        close()
                        moveTo(9f, 6f)
                        horizontalLineToRelative(6f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(9f)
                        verticalLineTo(6f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Home_repair_service!!
    }

private var _Home_repair_service: ImageVector? = null

