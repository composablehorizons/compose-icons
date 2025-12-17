package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Table_restaurant: ImageVector
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
                        lineTo(4f, 20f)
                        horizontalLineToRelative(2f)
                        lineToRelative(0.67f, -5f)
                        horizontalLineToRelative(10.67f)
                        lineTo(18f, 20f)
                        horizontalLineToRelative(2f)
                        lineToRelative(-1.2f, -9f)
                        horizontalLineTo(21f)
                        curveTo(21.66f, 11f, 22.14f, 10.36f, 21.96f, 9.73f)
                        close()
                        moveTo(6.93f, 13f)
                        lineToRelative(0.27f, -2f)
                        horizontalLineToRelative(9.6f)
                        lineToRelative(0.27f, 2f)
                        horizontalLineTo(6.93f)
                        close()
                        moveTo(4.33f, 9f)
                        lineToRelative(0.86f, -3f)
                        horizontalLineToRelative(13.63f)
                        lineToRelative(0.86f, 3f)
                        horizontalLineTo(4.33f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Table_restaurant!!
    }

private var _Table_restaurant: ImageVector? = null

