package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Inventory_2: ImageVector
    get() {
        if (_Inventory_2 != null) return _Inventory_2!!
        
        _Inventory_2 = ImageVector.Builder(
            name = "inventory_2",
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
                    moveTo(2f, 2f)
                    verticalLineToRelative(6.7f)
                    horizontalLineToRelative(1f)
                    verticalLineTo(22f)
                    horizontalLineToRelative(18f)
                    verticalLineTo(8.7f)
                    horizontalLineToRelative(1f)
                    verticalLineTo(2f)
                    horizontalLineTo(2f)
                    close()
                    moveTo(15f, 14f)
                    horizontalLineTo(9f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(6f)
                    verticalLineTo(14f)
                    close()
                    moveTo(20f, 7f)
                    horizontalLineTo(4f)
                    verticalLineTo(4f)
                    horizontalLineToRelative(16f)
                    verticalLineTo(7f)
                    close()
                }
            }
        }.build()
        
        return _Inventory_2!!
    }

private var _Inventory_2: ImageVector? = null

