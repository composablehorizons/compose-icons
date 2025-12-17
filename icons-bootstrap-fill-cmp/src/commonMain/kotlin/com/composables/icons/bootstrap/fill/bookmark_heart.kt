package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.BookmarkHeart: ImageVector
    get() {
        if (_BookmarkHeart != null) return _BookmarkHeart!!
        
        _BookmarkHeart = ImageVector.Builder(
            name = "bookmark-heart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 15.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.74f, 0.439f)
                lineTo(8f, 13.069f)
                lineToRelative(5.26f, 2.87f)
                arcTo(0.5f, 0.5f, 0f, false, false, 14f, 15.5f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                close()
                moveTo(8f, 4.41f)
                curveToRelative(1.387f, -1.425f, 4.854f, 1.07f, 0f, 4.277f)
                curveTo(3.146f, 5.48f, 6.613f, 2.986f, 8f, 4.412f)
                close()
            }
        }.build()
        
        return _BookmarkHeart!!
    }

private var _BookmarkHeart: ImageVector? = null

