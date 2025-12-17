package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Inventory: ImageVector
    get() {
        if (_Inventory != null) return _Inventory!!
        
        _Inventory = ImageVector.Builder(
            name = "inventory",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20f, 2f)
                horizontalLineTo(4f)
                curveToRelative(-1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(3.01f)
                curveToRelative(0f, 0.72f, 0.43f, 1.34f, 1f, 1.69f)
                verticalLineTo(20f)
                curveToRelative(0f, 1.1f, 1.1f, 2f, 2f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(0.9f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(8.7f)
                curveToRelative(0.57f, -0.35f, 1f, -0.97f, 1f, -1.69f)
                verticalLineTo(4f)
                curveToRelative(0f, -1.1f, -1f, -2f, -2f, -2f)
                close()
                moveToRelative(-5f, 12f)
                horizontalLineTo(9f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(5f, -7f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                lineToRelative(16f, -0.02f)
                verticalLineTo(7f)
                close()
            }
        }.build()
        
        return _Inventory!!
    }

private var _Inventory: ImageVector? = null

