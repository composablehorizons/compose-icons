package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Delete_sweep: ImageVector
    get() {
        if (_Delete_sweep != null) return _Delete_sweep!!
        
        _Delete_sweep = ImageVector.Builder(
            name = "delete_sweep",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 16f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                close()
                moveToRelative(0f, -8f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-7f)
                close()
                moveToRelative(0f, 4f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(3f, 18f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(6f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(8f)
                horizontalLineTo(3f)
                verticalLineToRelative(10f)
                close()
                moveTo(14f, 5f)
                horizontalLineToRelative(-3f)
                lineToRelative(-1f, -1f)
                horizontalLineTo(6f)
                lineTo(5f, 5f)
                horizontalLineTo(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(12f)
                close()
            }
        }.build()
        
        return _Delete_sweep!!
    }

private var _Delete_sweep: ImageVector? = null

