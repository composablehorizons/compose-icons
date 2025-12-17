package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Outbox: ImageVector
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
                        moveTo(11f, 14f)
                        lineTo(13f, 14f)
                        lineTo(13f, 11f)
                        lineTo(16f, 11f)
                        lineTo(12f, 7f)
                        lineTo(8f, 11f)
                        lineTo(11f, 11f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(3f, 3f)
                        verticalLineToRelative(18f)
                        horizontalLineToRelative(18f)
                        verticalLineTo(3f)
                        horizontalLineTo(3f)
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

