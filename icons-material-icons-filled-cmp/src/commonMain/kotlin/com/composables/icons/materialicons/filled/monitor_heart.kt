package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Monitor_heart: ImageVector
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
                        verticalLineToRelative(5f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(16f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineToRelative(-5f)
                        horizontalLineToRelative(-6f)
                        curveTo(15.62f, 13f, 15.27f, 12.79f, 15.11f, 12.45f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20f, 4f)
                        horizontalLineTo(4f)
                        curveTo(2.9f, 4f, 2f, 4.9f, 2f, 6f)
                        verticalLineToRelative(5f)
                        horizontalLineToRelative(6f)
                        curveToRelative(0.38f, 0f, 0.73f, 0.21f, 0.89f, 0.55f)
                        lineTo(10f, 13.76f)
                        lineToRelative(3.11f, -6.21f)
                        curveToRelative(0.34f, -0.68f, 1.45f, -0.68f, 1.79f, 0f)
                        lineTo(16.62f, 11f)
                        horizontalLineTo(22f)
                        verticalLineTo(6f)
                        curveTo(22f, 4.9f, 21.1f, 4f, 20f, 4f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Monitor_heart!!
    }

private var _Monitor_heart: ImageVector? = null

