package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Insert_drive_file: ImageVector
    get() {
        if (_Insert_drive_file != null) return _Insert_drive_file!!
        
        _Insert_drive_file = ImageVector.Builder(
            name = "insert_drive_file",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.01f, 2f)
                lineTo(4f, 22f)
                horizontalLineToRelative(16f)
                verticalLineTo(8f)
                lineToRelative(-6f, -6f)
                horizontalLineTo(4.01f)
                close()
                moveTo(13f, 9f)
                verticalLineTo(3.5f)
                lineTo(18.5f, 9f)
                horizontalLineTo(13f)
                close()
            }
        }.build()
        
        return _Insert_drive_file!!
    }

private var _Insert_drive_file: ImageVector? = null

