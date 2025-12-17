package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Home_repair_service: ImageVector
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
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20f, 8f)
                        horizontalLineToRelative(-3f)
                        verticalLineTo(6f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        horizontalLineTo(9f)
                        curveTo(7.9f, 4f, 7f, 4.9f, 7f, 6f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(4f)
                        curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                        verticalLineToRelative(4f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(8f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(-4f)
                        curveTo(22f, 8.9f, 21.1f, 8f, 20f, 8f)
                        close()
                        moveTo(15f, 8f)
                        horizontalLineTo(9f)
                        verticalLineTo(6f)
                        horizontalLineToRelative(6f)
                        verticalLineTo(8f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Home_repair_service!!
    }

private var _Home_repair_service: ImageVector? = null

