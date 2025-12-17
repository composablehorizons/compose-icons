package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Monitor_heart: ImageVector
    get() {
        if (_Monitor_heart != null) return _Monitor_heart!!
        
        _Monitor_heart = ImageVector.Builder(
            name = "monitor_heart",
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
                        moveTo(15.11f, 12.45f)
                        lineTo(14f, 10.24f)
                        lineToRelative(-3.11f, 6.21f)
                        curveTo(10.73f, 16.79f, 10.38f, 17f, 10f, 17f)
                        reflectiveCurveToRelative(-0.73f, -0.21f, -0.89f, -0.55f)
                        lineTo(7.38f, 13f)
                        horizontalLineTo(2f)
                        verticalLineToRelative(7f)
                        horizontalLineToRelative(20f)
                        verticalLineToRelative(-7f)
                        horizontalLineToRelative(-6f)
                        curveTo(15.62f, 13f, 15.27f, 12.79f, 15.11f, 12.45f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(22f, 4f)
                        horizontalLineTo(2f)
                        verticalLineToRelative(7f)
                        horizontalLineToRelative(6f)
                        curveToRelative(0.38f, 0f, 0.73f, 0.21f, 0.89f, 0.55f)
                        lineTo(10f, 13.76f)
                        lineToRelative(3.11f, -6.21f)
                        curveToRelative(0.37f, -0.74f, 1.42f, -0.74f, 1.79f, 0f)
                        lineTo(16.62f, 11f)
                        horizontalLineTo(22f)
                        verticalLineTo(4f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Monitor_heart!!
    }

private var _Monitor_heart: ImageVector? = null

