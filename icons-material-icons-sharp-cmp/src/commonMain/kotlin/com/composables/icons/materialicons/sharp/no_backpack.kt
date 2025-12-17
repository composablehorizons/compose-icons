package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.No_backpack: ImageVector
    get() {
        if (_No_backpack != null) return _No_backpack!!
        
        _No_backpack = ImageVector.Builder(
            name = "no_backpack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
            group {
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(21.19f, 21.19f)
                        lineTo(2.81f, 2.81f)
                        lineTo(1.39f, 4.22f)
                        lineToRelative(2.76f, 2.76f)
                        curveTo(4.06f, 7.31f, 4f, 7.64f, 4f, 8f)
                        verticalLineToRelative(14f)
                        horizontalLineToRelative(15.17f)
                        lineToRelative(0.61f, 0.61f)
                        lineTo(21.19f, 21.19f)
                        close()
                        moveTo(6f, 14f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(3.17f)
                        lineToRelative(2f, 2f)
                        horizontalLineTo(6f)
                        close()
                        moveTo(6.98f, 4.15f)
                        curveToRelative(0.01f, 0f, 0.01f, -0.01f, 0.02f, -0.01f)
                        verticalLineTo(2f)
                        horizontalLineToRelative(3f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(4f)
                        verticalLineTo(2f)
                        horizontalLineToRelative(3f)
                        verticalLineToRelative(2.14f)
                        curveToRelative(1.72f, 0.45f, 3f, 2f, 3f, 3.86f)
                        verticalLineToRelative(9.17f)
                        lineToRelative(-2f, -2f)
                        verticalLineTo(12f)
                        horizontalLineToRelative(-3.17f)
                        lineTo(6.98f, 4.15f)
                        close()
                    }
                }
            }
        }.build()
        
        return _No_backpack!!
    }

private var _No_backpack: ImageVector? = null

