package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Store_mall_directory: ImageVector
    get() {
        if (_Store_mall_directory != null) return _Store_mall_directory!!
        
        _Store_mall_directory = ImageVector.Builder(
            name = "store_mall_directory",
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
                moveTo(18.36f, 9f)
                lineToRelative(0.6f, 3f)
                horizontalLineTo(5.04f)
                lineToRelative(0.6f, -3f)
                horizontalLineToRelative(12.72f)
                moveTo(20f, 4f)
                horizontalLineTo(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(16f)
                verticalLineTo(4f)
                close()
                moveToRelative(0f, 3f)
                horizontalLineTo(4f)
                lineToRelative(-1f, 5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2f)
                lineToRelative(-1f, -5f)
                close()
                moveTo(6f, 18f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(4f)
                horizontalLineTo(6f)
                close()
            }
        }.build()
        
        return _Store_mall_directory!!
    }

private var _Store_mall_directory: ImageVector? = null

