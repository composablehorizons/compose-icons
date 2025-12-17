package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Monitor_weight: ImageVector
    get() {
        if (_Monitor_weight != null) return _Monitor_weight!!
        
        _Monitor_weight = ImageVector.Builder(
            name = "monitor_weight",
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
                        moveTo(21f, 3f)
                        horizontalLineTo(3f)
                        verticalLineToRelative(18f)
                        horizontalLineToRelative(18f)
                        verticalLineTo(3f)
                        close()
                        moveTo(14.2f, 11.2f)
                        curveToRelative(-3.23f, 2.43f, -6.84f, -1.18f, -4.4f, -4.41f)
                        curveTo(13.03f, 4.37f, 16.63f, 7.98f, 14.2f, 11.2f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10f, 8.5f)
                        horizontalLineTo(11f)
                        verticalLineTo(9.5f)
                        horizontalLineTo(10f)
                        verticalLineTo(8.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(11.5f, 8.5f)
                        horizontalLineTo(12.5f)
                        verticalLineTo(9.5f)
                        horizontalLineTo(11.5f)
                        verticalLineTo(8.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(13f, 8.5f)
                        horizontalLineTo(14f)
                        verticalLineTo(9.5f)
                        horizontalLineTo(13f)
                        verticalLineTo(8.5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Monitor_weight!!
    }

private var _Monitor_weight: ImageVector? = null

