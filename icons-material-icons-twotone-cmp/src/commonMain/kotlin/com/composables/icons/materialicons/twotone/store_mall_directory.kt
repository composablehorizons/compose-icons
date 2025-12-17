package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Store_mall_directory: ImageVector
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
                moveTo(5.64f, 9f)
                lineToRelative(-0.6f, 3f)
                horizontalLineToRelative(13.92f)
                lineToRelative(-0.6f, -3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 7f)
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
                horizontalLineTo(4f)
                close()
                moveToRelative(8f, 11f)
                horizontalLineTo(6f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(4f)
                close()
                moveToRelative(-6.96f, -6f)
                lineToRelative(0.6f, -3f)
                horizontalLineToRelative(12.72f)
                lineToRelative(0.6f, 3f)
                horizontalLineTo(5.04f)
                close()
                moveTo(4f, 4f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(2f)
                horizontalLineTo(4f)
                close()
            }
        }.build()
        
        return _Store_mall_directory!!
    }

private var _Store_mall_directory: ImageVector? = null

