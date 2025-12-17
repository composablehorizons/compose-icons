package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Bedroom_child: ImageVector
    get() {
        if (_Bedroom_child != null) return _Bedroom_child!!
        
        _Bedroom_child = ImageVector.Builder(
            name = "bedroom_child",
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
                        moveTo(9f, 8.5f)
                        horizontalLineTo(15f)
                        verticalLineTo(10.5f)
                        horizontalLineTo(9f)
                        verticalLineTo(8.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(7.51f, 12f)
                        horizontalLineTo(16.51f)
                        verticalLineTo(14f)
                        horizontalLineTo(7.51f)
                        verticalLineTo(12f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(22f, 2f)
                        horizontalLineTo(2f)
                        verticalLineToRelative(20f)
                        horizontalLineToRelative(20f)
                        verticalLineTo(2f)
                        close()
                        moveTo(18f, 17f)
                        horizontalLineToRelative(-1.5f)
                        verticalLineToRelative(-1.5f)
                        horizontalLineToRelative(-9f)
                        verticalLineTo(17f)
                        horizontalLineTo(6f)
                        lineToRelative(0f, -6.32f)
                        lineToRelative(1.5f, -0.01f)
                        verticalLineTo(7f)
                        horizontalLineToRelative(9f)
                        verticalLineToRelative(3.67f)
                        lineToRelative(1.5f, 0f)
                        verticalLineTo(17f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Bedroom_child!!
    }

private var _Bedroom_child: ImageVector? = null

