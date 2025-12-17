package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Warehouse: ImageVector
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
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(20f, 8.35f)
                    verticalLineTo(19f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-8f)
                    horizontalLineTo(6f)
                    verticalLineToRelative(8f)
                    horizontalLineTo(4f)
                    verticalLineTo(8.35f)
                    lineToRelative(8f, -3.2f)
                    lineTo(20f, 8.35f)
                    close()
                    moveTo(22f, 21f)
                    verticalLineTo(7f)
                    lineTo(12f, 3f)
                    lineTo(2f, 7f)
                    verticalLineToRelative(14f)
                    horizontalLineToRelative(6f)
                    verticalLineToRelative(-8f)
                    horizontalLineToRelative(8f)
                    verticalLineToRelative(8f)
                    horizontalLineTo(22f)
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

