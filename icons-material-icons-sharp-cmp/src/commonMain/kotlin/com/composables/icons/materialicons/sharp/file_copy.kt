package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.File_copy: ImageVector
    get() {
        if (_File_copy != null) return _File_copy!!
        
        _File_copy = ImageVector.Builder(
            name = "file_copy",
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
                moveTo(16f, 1f)
                horizontalLineTo(2f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(2f)
                verticalLineTo(3f)
                horizontalLineToRelative(12f)
                verticalLineTo(1f)
                close()
                moveToRelative(-1f, 4f)
                lineToRelative(6f, 6f)
                verticalLineToRelative(12f)
                horizontalLineTo(6f)
                verticalLineTo(5f)
                horizontalLineToRelative(9f)
                close()
                moveToRelative(-1f, 7f)
                horizontalLineToRelative(5.5f)
                lineTo(14f, 6.5f)
                verticalLineTo(12f)
                close()
            }
        }.build()
        
        return _File_copy!!
    }

private var _File_copy: ImageVector? = null

