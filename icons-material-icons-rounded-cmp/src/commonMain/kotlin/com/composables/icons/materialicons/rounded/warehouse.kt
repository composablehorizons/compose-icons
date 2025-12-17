package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Warehouse: ImageVector
    get() {
        if (_Warehouse != null) return _Warehouse!!
        
        _Warehouse = ImageVector.Builder(
            name = "warehouse",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(22f, 19f)
                    verticalLineTo(8.35f)
                    curveToRelative(0f, -0.82f, -0.5f, -1.55f, -1.26f, -1.86f)
                    lineToRelative(-8f, -3.2f)
                    curveToRelative(-0.48f, -0.19f, -1.01f, -0.19f, -1.49f, 0f)
                    lineToRelative(-8f, 3.2f)
                    curveTo(2.5f, 6.8f, 2f, 7.54f, 2f, 8.35f)
                    verticalLineTo(19f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(3f)
                    verticalLineToRelative(-9f)
                    horizontalLineToRelative(10f)
                    verticalLineToRelative(9f)
                    horizontalLineToRelative(3f)
                    curveTo(21.1f, 21f, 22f, 20.1f, 22f, 19f)
                    close()
                    moveTo(11f, 19f)
                    horizontalLineTo(9f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(19f)
                    close()
                    moveTo(13f, 16f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(16f)
                    close()
                    moveTo(15f, 19f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(19f)
                    close()
                }
            }
        }.build()
        
        return _Warehouse!!
    }

private var _Warehouse: ImageVector? = null

