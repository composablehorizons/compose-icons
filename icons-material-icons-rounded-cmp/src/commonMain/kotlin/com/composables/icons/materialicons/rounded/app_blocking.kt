package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.App_blocking: ImageVector
    get() {
        if (_App_blocking != null) return _App_blocking!!
        
        _App_blocking = ImageVector.Builder(
            name = "app_blocking",
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
                        moveTo(18f, 8f)
                        curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                        curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                        reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                        curveTo(22f, 9.79f, 20.21f, 8f, 18f, 8f)
                        close()
                        moveTo(15.5f, 12f)
                        curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                        curveToRelative(0.42f, 0f, 0.8f, 0.11f, 1.15f, 0.29f)
                        lineToRelative(-3.36f, 3.36f)
                        curveTo(15.61f, 12.8f, 15.5f, 12.42f, 15.5f, 12f)
                        close()
                        moveTo(18f, 14.5f)
                        curveToRelative(-0.42f, 0f, -0.8f, -0.11f, -1.15f, -0.29f)
                        lineToRelative(3.36f, -3.36f)
                        curveToRelative(0.18f, 0.35f, 0.29f, 0.73f, 0.29f, 1.15f)
                        curveTo(20.5f, 13.38f, 19.38f, 14.5f, 18f, 14.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17f, 18f)
                        horizontalLineTo(7f)
                        verticalLineTo(6f)
                        horizontalLineToRelative(10f)
                        verticalLineToRelative(1f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(6f)
                        verticalLineTo(5f)
                        verticalLineTo(3f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        horizontalLineTo(7f)
                        curveTo(5.9f, 1f, 5f, 1.9f, 5f, 3f)
                        verticalLineToRelative(18f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(10f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineToRelative(-2f)
                        verticalLineToRelative(-1f)
                        verticalLineToRelative(-1f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(18f)
                        close()
                    }
                }
            }
        }.build()
        
        return _App_blocking!!
    }

private var _App_blocking: ImageVector? = null

