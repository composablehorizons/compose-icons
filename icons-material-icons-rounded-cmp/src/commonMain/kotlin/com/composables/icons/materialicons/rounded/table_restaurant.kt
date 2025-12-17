package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Table_restaurant: ImageVector
    get() {
        if (_Table_restaurant != null) return _Table_restaurant!!
        
        _Table_restaurant = ImageVector.Builder(
            name = "table_restaurant",
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
                        moveTo(21.96f, 9.73f)
                        lineToRelative(-1.43f, -5f)
                        curveTo(20.41f, 4.3f, 20.02f, 4f, 19.57f, 4f)
                        horizontalLineTo(4.43f)
                        curveTo(3.98f, 4f, 3.59f, 4.3f, 3.47f, 4.73f)
                        lineToRelative(-1.43f, 5f)
                        curveTo(1.86f, 10.36f, 2.34f, 11f, 3f, 11f)
                        horizontalLineToRelative(2.2f)
                        lineToRelative(-1.05f, 7.88f)
                        curveTo(4.07f, 19.47f, 4.53f, 20f, 5.13f, 20f)
                        horizontalLineToRelative(0f)
                        curveToRelative(0.5f, 0f, 0.92f, -0.37f, 0.98f, -0.86f)
                        lineTo(6.67f, 15f)
                        horizontalLineToRelative(10.67f)
                        lineToRelative(0.55f, 4.14f)
                        curveToRelative(0.07f, 0.49f, 0.49f, 0.86f, 0.98f, 0.86f)
                        horizontalLineToRelative(0f)
                        curveToRelative(0.6f, 0f, 1.06f, -0.53f, 0.98f, -1.12f)
                        lineTo(18.8f, 11f)
                        horizontalLineTo(21f)
                        curveTo(21.66f, 11f, 22.14f, 10.36f, 21.96f, 9.73f)
                        close()
                        moveTo(6.93f, 13f)
                        lineToRelative(0.27f, -2f)
                        horizontalLineToRelative(9.6f)
                        lineToRelative(0.27f, 2f)
                        horizontalLineTo(6.93f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Table_restaurant!!
    }

private var _Table_restaurant: ImageVector? = null

