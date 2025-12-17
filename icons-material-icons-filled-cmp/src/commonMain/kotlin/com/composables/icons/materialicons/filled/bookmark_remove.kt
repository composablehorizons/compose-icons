package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Bookmark_remove: ImageVector
    get() {
        if (_Bookmark_remove != null) return _Bookmark_remove!!
        
        _Bookmark_remove = ImageVector.Builder(
            name = "bookmark_remove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21f, 7f)
                horizontalLineToRelative(-6f)
                verticalLineTo(5f)
                horizontalLineToRelative(6f)
                verticalLineTo(7f)
                close()
                moveTo(19f, 10.9f)
                curveToRelative(-0.32f, 0.07f, -0.66f, 0.1f, -1f, 0.1f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                curveToRelative(0f, -1.13f, 0.37f, -2.16f, 1f, -3f)
                lineTo(7f, 3f)
                curveTo(5.9f, 3f, 5f, 3.9f, 5f, 5f)
                verticalLineToRelative(16f)
                lineToRelative(7f, -3f)
                lineToRelative(7f, 3f)
                verticalLineTo(10.9f)
                close()
            }
        }.build()
        
        return _Bookmark_remove!!
    }

private var _Bookmark_remove: ImageVector? = null

