package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Screenshot: ImageVector
    get() {
        if (_Screenshot != null) return _Screenshot!!
        
        _Screenshot = ImageVector.Builder(
            name = "screenshot",
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
                        moveTo(17f, 1.01f)
                        lineTo(7f, 1f)
                        curveTo(5.9f, 1f, 5f, 1.9f, 5f, 3f)
                        verticalLineToRelative(18f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(10f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(3f)
                        curveTo(19f, 1.9f, 18.1f, 1.01f, 17f, 1.01f)
                        close()
                        moveTo(17f, 18f)
                        horizontalLineTo(7f)
                        verticalLineTo(6f)
                        horizontalLineToRelative(10f)
                        verticalLineTo(18f)
                        close()
                        moveTo(9.5f, 8.5f)
                        horizontalLineToRelative(1.75f)
                        curveTo(11.66f, 8.5f, 12f, 8.16f, 12f, 7.75f)
                        verticalLineToRelative(0f)
                        curveTo(12f, 7.34f, 11.66f, 7f, 11.25f, 7f)
                        horizontalLineToRelative(-2.5f)
                        curveTo(8.34f, 7f, 8f, 7.34f, 8f, 7.75f)
                        verticalLineToRelative(2.5f)
                        curveTo(8f, 10.66f, 8.34f, 11f, 8.75f, 11f)
                        horizontalLineToRelative(0f)
                        curveToRelative(0.41f, 0f, 0.75f, -0.34f, 0.75f, -0.75f)
                        verticalLineTo(8.5f)
                        close()
                        moveTo(12.75f, 17f)
                        horizontalLineToRelative(2.5f)
                        curveToRelative(0.41f, 0f, 0.75f, -0.34f, 0.75f, -0.75f)
                        verticalLineToRelative(-2.5f)
                        curveToRelative(0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f)
                        horizontalLineToRelative(0f)
                        curveToRelative(-0.41f, 0f, -0.75f, 0.34f, -0.75f, 0.75f)
                        verticalLineToRelative(1.75f)
                        horizontalLineToRelative(-1.75f)
                        curveToRelative(-0.41f, 0f, -0.75f, 0.34f, -0.75f, 0.75f)
                        lineToRelative(0f, 0f)
                        curveTo(12f, 16.66f, 12.34f, 17f, 12.75f, 17f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Screenshot!!
    }

private var _Screenshot: ImageVector? = null

