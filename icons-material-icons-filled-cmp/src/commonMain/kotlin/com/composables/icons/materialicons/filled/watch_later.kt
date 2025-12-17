package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Watch_later: ImageVector
    get() {
        if (_Watch_later != null) return _Watch_later!!
        
        _Watch_later = ImageVector.Builder(
            name = "watch_later",
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
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(12f, 2f)
                            curveTo(6.5f, 2f, 2f, 6.5f, 2f, 12f)
                            reflectiveCurveToRelative(4.5f, 10f, 10f, 10f)
                            reflectiveCurveToRelative(10f, -4.5f, 10f, -10f)
                            reflectiveCurveTo(17.5f, 2f, 12f, 2f)
                            close()
                            moveTo(16.2f, 16.2f)
                            lineTo(11f, 13f)
                            verticalLineTo(7f)
                            horizontalLineToRelative(1.5f)
                            verticalLineToRelative(5.2f)
                            lineToRelative(4.5f, 2.7f)
                            lineTo(16.2f, 16.2f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Watch_later!!
    }

private var _Watch_later: ImageVector? = null

