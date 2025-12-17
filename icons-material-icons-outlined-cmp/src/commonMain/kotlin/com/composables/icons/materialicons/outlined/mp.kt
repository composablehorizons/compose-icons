package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Mp: ImageVector
    get() {
        if (_Mp != null) return _Mp!!
        
        _Mp = ImageVector.Builder(
            name = "mp",
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
                        moveTo(17f, 9f)
                        horizontalLineToRelative(-3.5f)
                        verticalLineToRelative(6f)
                        horizontalLineTo(15f)
                        verticalLineToRelative(-1.5f)
                        horizontalLineToRelative(2f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineTo(10f)
                        curveTo(18f, 9.45f, 17.55f, 9f, 17f, 9f)
                        close()
                        moveTo(16.5f, 12f)
                        horizontalLineTo(15f)
                        verticalLineToRelative(-1.5f)
                        horizontalLineToRelative(1.5f)
                        verticalLineTo(12f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(11.5f, 9f)
                        horizontalLineTo(7f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        verticalLineToRelative(5f)
                        horizontalLineToRelative(1.5f)
                        verticalLineToRelative(-4.5f)
                        horizontalLineToRelative(1f)
                        verticalLineToRelative(3f)
                        horizontalLineTo(10f)
                        verticalLineToRelative(-3f)
                        horizontalLineToRelative(1f)
                        verticalLineTo(15f)
                        horizontalLineToRelative(1.5f)
                        verticalLineToRelative(-5f)
                        curveTo(12.5f, 9.45f, 12.05f, 9f, 11.5f, 9f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19f, 3f)
                        horizontalLineTo(5f)
                        curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                        verticalLineTo(19f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineTo(19f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(5f)
                        curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                        close()
                        moveTo(5f, 19f)
                        lineTo(5f, 5f)
                        horizontalLineToRelative(14f)
                        lineToRelative(0f, 14f)
                        lineTo(5f, 19f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Mp!!
    }

private var _Mp: ImageVector? = null

