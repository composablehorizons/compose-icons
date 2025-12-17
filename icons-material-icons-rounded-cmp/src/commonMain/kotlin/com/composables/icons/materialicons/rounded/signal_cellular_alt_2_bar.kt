package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Signal_cellular_alt_2_bar: ImageVector
    get() {
        if (_Signal_cellular_alt_2_bar != null) return _Signal_cellular_alt_2_bar!!
        
        _Signal_cellular_alt_2_bar = ImageVector.Builder(
            name = "signal_cellular_alt_2_bar",
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
                        moveTo(6.5f, 20f)
                        curveTo(5.67f, 20f, 5f, 19.33f, 5f, 18.5f)
                        verticalLineToRelative(-3f)
                        curveTo(5f, 14.67f, 5.67f, 14f, 6.5f, 14f)
                        reflectiveCurveTo(8f, 14.67f, 8f, 15.5f)
                        verticalLineToRelative(3f)
                        curveTo(8f, 19.33f, 7.33f, 20f, 6.5f, 20f)
                        close()
                        moveTo(12.5f, 20f)
                        curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                        verticalLineToRelative(-8f)
                        curveTo(11f, 9.67f, 11.67f, 9f, 12.5f, 9f)
                        reflectiveCurveTo(14f, 9.67f, 14f, 10.5f)
                        verticalLineToRelative(8f)
                        curveTo(14f, 19.33f, 13.33f, 20f, 12.5f, 20f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Signal_cellular_alt_2_bar!!
    }

private var _Signal_cellular_alt_2_bar: ImageVector? = null

