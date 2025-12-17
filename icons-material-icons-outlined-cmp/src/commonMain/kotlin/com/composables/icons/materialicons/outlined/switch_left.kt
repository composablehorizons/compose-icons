package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Switch_left: ImageVector
    get() {
        if (_Switch_left != null) return _Switch_left!!
        
        _Switch_left = ImageVector.Builder(
            name = "switch_left",
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
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.5f, 8.62f)
                verticalLineToRelative(6.76f)
                lineTo(5.12f, 12f)
                lineTo(8.5f, 8.62f)
                moveTo(10f, 5f)
                lineToRelative(-7f, 7f)
                lineToRelative(7f, 7f)
                verticalLineTo(5f)
                lineTo(10f, 5f)
                close()
                moveTo(14f, 5f)
                verticalLineToRelative(14f)
                lineToRelative(7f, -7f)
                lineTo(14f, 5f)
                close()
            }
        }.build()
        
        return _Switch_left!!
    }

private var _Switch_left: ImageVector? = null

