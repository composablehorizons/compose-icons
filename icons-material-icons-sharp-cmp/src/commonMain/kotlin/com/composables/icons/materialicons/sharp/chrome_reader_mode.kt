package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Chrome_reader_mode: ImageVector
    get() {
        if (_Chrome_reader_mode != null) return _Chrome_reader_mode!!
        
        _Chrome_reader_mode = ImageVector.Builder(
            name = "chrome_reader_mode",
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
                moveTo(13f, 12f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-7f)
                verticalLineTo(12f)
                close()
                moveToRelative(0f, -2.5f)
                horizontalLineToRelative(7f)
                verticalLineTo(11f)
                horizontalLineToRelative(-7f)
                verticalLineTo(9.5f)
                close()
                moveToRelative(0f, 5f)
                horizontalLineToRelative(7f)
                verticalLineTo(16f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(23f, 4f)
                horizontalLineTo(1f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(22f)
                verticalLineTo(4f)
                close()
                moveToRelative(-2f, 15f)
                horizontalLineToRelative(-9f)
                verticalLineTo(6f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(13f)
                close()
            }
        }.build()
        
        return _Chrome_reader_mode!!
    }

private var _Chrome_reader_mode: ImageVector? = null

