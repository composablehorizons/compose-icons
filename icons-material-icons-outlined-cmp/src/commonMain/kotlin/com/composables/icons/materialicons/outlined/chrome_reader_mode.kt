package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Chrome_reader_mode: ImageVector
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
                moveTo(21f, 4f)
                horizontalLineTo(3f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(18f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(6f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(3f, 19f)
                verticalLineTo(6f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(13f)
                horizontalLineTo(3f)
                close()
                moveToRelative(18f, 0f)
                horizontalLineToRelative(-8f)
                verticalLineTo(6f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(13f)
                close()
                moveToRelative(-7f, -9.5f)
                horizontalLineToRelative(6f)
                verticalLineTo(11f)
                horizontalLineToRelative(-6f)
                close()
                moveToRelative(0f, 2.5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-6f)
                close()
                moveToRelative(0f, 2.5f)
                horizontalLineToRelative(6f)
                verticalLineTo(16f)
                horizontalLineToRelative(-6f)
                close()
            }
        }.build()
        
        return _Chrome_reader_mode!!
    }

private var _Chrome_reader_mode: ImageVector? = null

