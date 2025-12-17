package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Bookmark_remove: ImageVector
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
                curveToRelative(-0.64f, 0.13f, -1.32f, 0.14f, -2.02f, 0f)
                curveToRelative(-1.91f, -0.38f, -3.47f, -1.92f, -3.87f, -3.83f)
                curveTo(12.79f, 5.54f, 13.18f, 4.1f, 14f, 3f)
                lineTo(5f, 3f)
                verticalLineToRelative(18f)
                lineToRelative(7f, -3f)
                lineToRelative(7f, 3f)
                verticalLineTo(10.9f)
                close()
            }
        }.build()
        
        return _Bookmark_remove!!
    }

private var _Bookmark_remove: ImageVector? = null

