package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.File_upload: ImageVector
    get() {
        if (_File_upload != null) return _File_upload!!
        
        _File_upload = ImageVector.Builder(
            name = "file_upload",
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
                moveTo(9f, 16f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(4f)
                lineToRelative(-7f, -7f)
                lineToRelative(-7f, 7f)
                horizontalLineToRelative(4f)
                close()
                moveToRelative(-4f, 2f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                horizontalLineTo(5f)
                close()
            }
        }.build()
        
        return _File_upload!!
    }

private var _File_upload: ImageVector? = null

