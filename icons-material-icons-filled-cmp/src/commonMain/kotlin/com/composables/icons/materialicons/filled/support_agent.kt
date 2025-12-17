package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Support_agent: ImageVector
    get() {
        if (_Support_agent != null) return _Support_agent!!
        
        _Support_agent = ImageVector.Builder(
            name = "support_agent",
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
                        moveTo(21f, 12.22f)
                        curveTo(21f, 6.73f, 16.74f, 3f, 12f, 3f)
                        curveToRelative(-4.69f, 0f, -9f, 3.65f, -9f, 9.28f)
                        curveTo(2.4f, 12.62f, 2f, 13.26f, 2f, 14f)
                        verticalLineToRelative(2f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(1f)
                        verticalLineToRelative(-6.1f)
                        curveToRelative(0f, -3.87f, 3.13f, -7f, 7f, -7f)
                        reflectiveCurveToRelative(7f, 3.13f, 7f, 7f)
                        verticalLineTo(19f)
                        horizontalLineToRelative(-8f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(8f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineToRelative(-1.22f)
                        curveToRelative(0.59f, -0.31f, 1f, -0.92f, 1f, -1.64f)
                        verticalLineToRelative(-2.3f)
                        curveTo(22f, 13.14f, 21.59f, 12.53f, 21f, 12.22f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10f, 13f)
                        arcTo(1f, 1f, 0f, false, true, 9f, 14f)
                        arcTo(1f, 1f, 0f, false, true, 8f, 13f)
                        arcTo(1f, 1f, 0f, false, true, 10f, 13f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16f, 13f)
                        arcTo(1f, 1f, 0f, false, true, 15f, 14f)
                        arcTo(1f, 1f, 0f, false, true, 14f, 13f)
                        arcTo(1f, 1f, 0f, false, true, 16f, 13f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18f, 11.03f)
                        curveTo(17.52f, 8.18f, 15.04f, 6f, 12.05f, 6f)
                        curveToRelative(-3.03f, 0f, -6.29f, 2.51f, -6.03f, 6.45f)
                        curveToRelative(2.47f, -1.01f, 4.33f, -3.21f, 4.86f, -5.89f)
                        curveTo(12.19f, 9.19f, 14.88f, 11f, 18f, 11.03f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Support_agent!!
    }

private var _Support_agent: ImageVector? = null

