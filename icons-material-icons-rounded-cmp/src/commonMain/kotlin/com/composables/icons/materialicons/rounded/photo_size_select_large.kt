package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Photo_size_select_large: ImageVector
    get() {
        if (_Photo_size_select_large != null) return _Photo_size_select_large!!
        
        _Photo_size_select_large = ImageVector.Builder(
            name = "photo_size_select_large",
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
                moveTo(21f, 15f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                close()
                moveToRelative(0f, -4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                close()
                moveToRelative(2f, 8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                curveToRelative(1f, 0f, 2f, -1f, 2f, -2f)
                close()
                moveTo(13f, 3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineTo(3f)
                close()
                moveToRelative(8f, 4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineTo(7f)
                close()
                moveToRelative(0f, -4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -1f, -1f, -2f, -2f, -2f)
                close()
                moveTo(1f, 7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineTo(1f)
                verticalLineTo(7f)
                close()
                moveToRelative(16f, -4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineTo(3f)
                close()
                moveToRelative(0f, 16f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(3f, 3f)
                curveTo(2f, 3f, 1f, 4f, 1f, 5f)
                horizontalLineToRelative(2f)
                verticalLineTo(3f)
                close()
                moveToRelative(6f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineTo(9f)
                verticalLineTo(3f)
                close()
                moveTo(5f, 3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineTo(5f)
                verticalLineTo(3f)
                close()
                moveToRelative(-4f, 8f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineTo(1f)
                close()
                moveToRelative(2.63f, 7.19f)
                lineToRelative(1.49f, -1.91f)
                curveToRelative(0.2f, -0.25f, 0.57f, -0.26f, 0.78f, -0.01f)
                lineToRelative(1.39f, 1.67f)
                lineToRelative(2.1f, -2.7f)
                curveToRelative(0.2f, -0.26f, 0.6f, -0.26f, 0.79f, 0.01f)
                lineToRelative(2.22f, 2.96f)
                curveToRelative(0.25f, 0.33f, 0.01f, 0.8f, -0.4f, 0.8f)
                horizontalLineTo(4.02f)
                curveToRelative(-0.41f, -0.01f, -0.65f, -0.49f, -0.39f, -0.82f)
                close()
            }
        }.build()
        
        return _Photo_size_select_large!!
    }

private var _Photo_size_select_large: ImageVector? = null

