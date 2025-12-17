package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Bookmark_added: ImageVector
    get() {
        if (_Bookmark_added != null) return _Bookmark_added!!
        
        _Bookmark_added = ImageVector.Builder(
            name = "bookmark_added",
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
                moveTo(19f, 21f)
                lineToRelative(-7f, -3f)
                lineToRelative(-7f, 3f)
                verticalLineTo(3f)
                horizontalLineToRelative(9f)
                curveToRelative(-0.63f, 0.84f, -1f, 1.87f, -1f, 3f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                curveToRelative(0.34f, 0f, 0.68f, -0.03f, 1f, -0.1f)
                verticalLineTo(21f)
                close()
                moveTo(17.83f, 9f)
                lineTo(15f, 6.17f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(3.54f, -3.54f)
                lineToRelative(1.41f, 1.41f)
                lineTo(17.83f, 9f)
                close()
            }
        }.build()
        
        return _Bookmark_added!!
    }

private var _Bookmark_added: ImageVector? = null

