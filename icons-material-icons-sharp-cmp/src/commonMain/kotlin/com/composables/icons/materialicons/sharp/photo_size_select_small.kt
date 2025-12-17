package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Photo_size_select_small: ImageVector
    get() {
        if (_Photo_size_select_small != null) return _Photo_size_select_small!!
        
        _Photo_size_select_small = ImageVector.Builder(
            name = "photo_size_select_small",
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
                moveTo(23f, 15f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                close()
                moveToRelative(0f, 4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                close()
                moveToRelative(0f, -8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                close()
                moveToRelative(-8f, -8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineTo(3f)
                close()
                moveToRelative(8f, 4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineTo(7f)
                close()
                moveTo(1f, 21f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-6f)
                horizontalLineTo(1f)
                verticalLineToRelative(6f)
                close()
                moveTo(3f, 7f)
                horizontalLineTo(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineTo(7f)
                close()
                moveToRelative(12f, 12f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                close()
                moveToRelative(4f, -16f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineTo(3f)
                close()
                moveToRelative(4f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineTo(3f)
                close()
                moveToRelative(-4f, 16f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(3f, 11f)
                horizontalLineTo(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                close()
                moveToRelative(8f, -8f)
                horizontalLineTo(9f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineTo(3f)
                close()
                moveTo(7f, 3f)
                horizontalLineTo(5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineTo(3f)
                close()
                moveTo(3f, 3f)
                horizontalLineTo(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineTo(3f)
                close()
            }
        }.build()
        
        return _Photo_size_select_small!!
    }

private var _Photo_size_select_small: ImageVector? = null

