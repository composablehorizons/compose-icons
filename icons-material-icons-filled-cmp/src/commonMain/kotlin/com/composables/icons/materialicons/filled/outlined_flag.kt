package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Outlined_flag: ImageVector
    get() {
        if (_Outlined_flag != null) return _Outlined_flag!!
        
        _Outlined_flag = ImageVector.Builder(
            name = "outlined_flag",
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
                moveTo(14f, 6f)
                lineToRelative(-1f, -2f)
                horizontalLineTo(5f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(5f)
                lineToRelative(1f, 2f)
                horizontalLineToRelative(7f)
                verticalLineTo(6f)
                horizontalLineToRelative(-6f)
                close()
                moveToRelative(4f, 8f)
                horizontalLineToRelative(-4f)
                lineToRelative(-1f, -2f)
                horizontalLineTo(7f)
                verticalLineTo(6f)
                horizontalLineToRelative(5f)
                lineToRelative(1f, 2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(6f)
                close()
            }
        }.build()
        
        return _Outlined_flag!!
    }

private var _Outlined_flag: ImageVector? = null

