package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Folder_open: ImageVector
    get() {
        if (_Folder_open != null) return _Folder_open!!
        
        _Folder_open = ImageVector.Builder(
            name = "folder_open",
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
                moveTo(22f, 6f)
                horizontalLineTo(12f)
                lineToRelative(-2f, -2f)
                horizontalLineTo(2f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(20f)
                verticalLineTo(6f)
                close()
                moveToRelative(-2f, 12f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(10f)
                close()
            }
        }.build()
        
        return _Folder_open!!
    }

private var _Folder_open: ImageVector? = null

