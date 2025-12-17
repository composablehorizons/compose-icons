package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Insert_photo: ImageVector
    get() {
        if (_Insert_photo != null) return _Insert_photo!!
        
        _Insert_photo = ImageVector.Builder(
            name = "insert_photo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21f, 21f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(18f)
                close()
                moveTo(8.5f, 13.5f)
                lineToRelative(2.5f, 3.01f)
                lineTo(14.5f, 12f)
                lineToRelative(4.5f, 6f)
                horizontalLineTo(5f)
                lineToRelative(3.5f, -4.5f)
                close()
            }
        }.build()
        
        return _Insert_photo!!
    }

private var _Insert_photo: ImageVector? = null

