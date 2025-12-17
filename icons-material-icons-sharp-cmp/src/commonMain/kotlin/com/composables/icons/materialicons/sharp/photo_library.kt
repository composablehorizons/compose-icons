package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Photo_library: ImageVector
    get() {
        if (_Photo_library != null) return _Photo_library!!
        
        _Photo_library = ImageVector.Builder(
            name = "photo_library",
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
                moveTo(22f, 18f)
                verticalLineTo(2f)
                horizontalLineTo(6f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(16f)
                close()
                moveToRelative(-11f, -6f)
                lineToRelative(2.03f, 2.71f)
                lineTo(16f, 11f)
                lineToRelative(4f, 5f)
                horizontalLineTo(8f)
                lineToRelative(3f, -4f)
                close()
                moveTo(2f, 6f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-2f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                horizontalLineTo(2f)
                close()
            }
        }.build()
        
        return _Photo_library!!
    }

private var _Photo_library: ImageVector? = null

