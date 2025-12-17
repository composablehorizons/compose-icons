package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Push_pin: ImageVector
    get() {
        if (_Push_pin != null) return _Push_pin!!
        
        _Push_pin = ImageVector.Builder(
            name = "push_pin",
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
                        moveTo(14f, 4f)
                        horizontalLineToRelative(-4f)
                        verticalLineToRelative(5f)
                        curveToRelative(0f, 1.1f, -0.35f, 2.14f, -1f, 3f)
                        horizontalLineToRelative(6f)
                        curveToRelative(-0.63f, -0.84f, -1f, -1.88f, -1f, -3f)
                        verticalLineTo(4f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19f, 12f)
                        curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                        verticalLineTo(4f)
                        lineToRelative(1f, 0f)
                        curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                        horizontalLineTo(7f)
                        curveTo(6.45f, 2f, 6f, 2.45f, 6f, 3f)
                        reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                        curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
                        lineToRelative(1f, 0f)
                        verticalLineToRelative(5f)
                        curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(5.97f)
                        verticalLineToRelative(7f)
                        lineToRelative(1f, 1f)
                        lineToRelative(1f, -1f)
                        verticalLineToRelative(-7f)
                        horizontalLineTo(19f)
                        lineTo(19f, 12f)
                        curveTo(19f, 12f, 19f, 12f, 19f, 12f)
                        close()
                        moveTo(9f, 12f)
                        curveToRelative(0.65f, -0.86f, 1f, -1.9f, 1f, -3f)
                        verticalLineTo(4f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(5f)
                        curveToRelative(0f, 1.12f, 0.37f, 2.16f, 1f, 3f)
                        horizontalLineTo(9f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Push_pin!!
    }

private var _Push_pin: ImageVector? = null

