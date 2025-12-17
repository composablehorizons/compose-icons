package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Outbox: ImageVector
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
                        moveTo(11f, 9.83f)
                        lineTo(11f, 14f)
                        lineTo(13f, 14f)
                        lineTo(13f, 9.83f)
                        lineTo(14.59f, 11.41f)
                        lineTo(16f, 10f)
                        lineTo(12f, 6f)
                        lineTo(8f, 10f)
                        lineTo(9.41f, 11.41f)
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
                        moveTo(19f, 19f)
                        horizontalLineTo(5f)
                        verticalLineToRelative(-3f)
                        horizontalLineToRelative(3.02f)
                        curveToRelative(0.91f, 1.21f, 2.35f, 2f, 3.98f, 2f)
                        reflectiveCurveToRelative(3.06f, -0.79f, 3.98f, -2f)
                        horizontalLineTo(19f)
                        verticalLineTo(19f)
                        close()
                        moveTo(19f, 14f)
                        horizontalLineToRelative(-4.18f)
                        curveToRelative(-0.41f, 1.16f, -1.51f, 2f, -2.82f, 2f)
                        reflectiveCurveToRelative(-2.4f, -0.84f, -2.82f, -2f)
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

