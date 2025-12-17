package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Outbox: ImageVector
    get() {
        if (_Outbox != null) return _Outbox!!
        
        _Outbox = ImageVector.Builder(
            name = "outbox",
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
                        moveTo(9.21f, 11f)
                        horizontalLineTo(11f)
                        verticalLineToRelative(2f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(1.79f)
                        curveToRelative(0.45f, 0f, 0.67f, -0.54f, 0.35f, -0.85f)
                        lineToRelative(-2.79f, -2.79f)
                        curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0f)
                        lineToRelative(-2.79f, 2.79f)
                        curveTo(8.54f, 10.46f, 8.76f, 11f, 9.21f, 11f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19f, 3f)
                        horizontalLineTo(5f)
                        curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                        verticalLineToRelative(14f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(14f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(5f)
                        curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                        close()
                        moveTo(19f, 14f)
                        horizontalLineToRelative(-3.02f)
                        curveToRelative(-0.63f, 0f, -1.22f, 0.3f, -1.6f, 0.8f)
                        curveTo(13.84f, 15.53f, 12.98f, 16f, 12f, 16f)
                        reflectiveCurveToRelative(-1.84f, -0.47f, -2.38f, -1.2f)
                        curveTo(9.24f, 14.3f, 8.65f, 14f, 8.02f, 14f)
                        horizontalLineTo(5f)
                        verticalLineTo(5f)
                        horizontalLineToRelative(14f)
                        verticalLineTo(14f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Outbox!!
    }

private var _Outbox: ImageVector? = null

