package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Bookmark_added: ImageVector
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
                moveTo(5f, 5f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                lineToRelative(7f, 0f)
                curveToRelative(-0.63f, 0.84f, -1f, 1.87f, -1f, 3f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                curveToRelative(0.34f, 0f, 0.68f, -0.03f, 1f, -0.1f)
                verticalLineToRelative(8.58f)
                curveToRelative(0f, 0.72f, -0.73f, 1.2f, -1.39f, 0.92f)
                lineTo(12f, 18f)
                lineToRelative(-5.61f, 2.4f)
                curveTo(5.73f, 20.69f, 5f, 20.2f, 5f, 19.48f)
                verticalLineTo(5f)
                close()
                moveTo(22.07f, 3.34f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(-3.54f, 3.54f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                lineToRelative(-1.41f, -1.41f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(2.83f, -2.83f)
                curveTo(21.05f, 2.95f, 21.68f, 2.95f, 22.07f, 3.34f)
                close()
            }
        }.build()
        
        return _Bookmark_added!!
    }

private var _Bookmark_added: ImageVector? = null

