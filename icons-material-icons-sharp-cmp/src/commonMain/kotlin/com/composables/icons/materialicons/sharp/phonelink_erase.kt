package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Phonelink_erase: ImageVector
    get() {
        if (_Phonelink_erase != null) return _Phonelink_erase!!
        
        _Phonelink_erase = ImageVector.Builder(
            name = "phonelink_erase",
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
                moveTo(13f, 8.2f)
                lineToRelative(-1f, -1f)
                lineToRelative(-4f, 4f)
                lineToRelative(-4f, -4f)
                lineToRelative(-1f, 1f)
                lineToRelative(4f, 4f)
                lineToRelative(-4f, 4f)
                lineToRelative(1f, 1f)
                lineToRelative(4f, -4f)
                lineToRelative(4f, 4f)
                lineToRelative(1f, -1f)
                lineToRelative(-4f, -4f)
                lineToRelative(4f, -4f)
                close()
                moveTo(21f, 1f)
                horizontalLineTo(7f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                verticalLineTo(4f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(16f)
                horizontalLineTo(9f)
                verticalLineToRelative(-2f)
                horizontalLineTo(7f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(14f)
                verticalLineTo(1f)
                close()
            }
        }.build()
        
        return _Phonelink_erase!!
    }

private var _Phonelink_erase: ImageVector? = null

