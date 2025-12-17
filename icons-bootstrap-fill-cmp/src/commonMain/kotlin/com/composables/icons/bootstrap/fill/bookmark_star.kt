package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.BookmarkStar: ImageVector
    get() {
        if (_BookmarkStar != null) return _BookmarkStar!!
        
        _BookmarkStar = ImageVector.Builder(
            name = "bookmark-star",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 15.5f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(13.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.74f, 0.439f)
                lineTo(8f, 13.069f)
                lineToRelative(-5.26f, 2.87f)
                arcTo(0.5f, 0.5f, 0f, false, true, 2f, 15.5f)
                moveTo(8.16f, 4.1f)
                arcToRelative(0.178f, 0.178f, 0f, false, false, -0.32f, 0f)
                lineToRelative(-0.634f, 1.285f)
                arcToRelative(0.18f, 0.18f, 0f, false, true, -0.134f, 0.098f)
                lineToRelative(-1.42f, 0.206f)
                arcToRelative(0.178f, 0.178f, 0f, false, false, -0.098f, 0.303f)
                lineTo(6.58f, 6.993f)
                curveToRelative(0.042f, 0.041f, 0.061f, 0.1f, 0.051f, 0.158f)
                lineTo(6.39f, 8.565f)
                arcToRelative(0.178f, 0.178f, 0f, false, false, 0.258f, 0.187f)
                lineToRelative(1.27f, -0.668f)
                arcToRelative(0.18f, 0.18f, 0f, false, true, 0.165f, 0f)
                lineToRelative(1.27f, 0.668f)
                arcToRelative(0.178f, 0.178f, 0f, false, false, 0.257f, -0.187f)
                lineTo(9.368f, 7.15f)
                arcToRelative(0.18f, 0.18f, 0f, false, true, 0.05f, -0.158f)
                lineToRelative(1.028f, -1.001f)
                arcToRelative(0.178f, 0.178f, 0f, false, false, -0.098f, -0.303f)
                lineToRelative(-1.42f, -0.206f)
                arcToRelative(0.18f, 0.18f, 0f, false, true, -0.134f, -0.098f)
                close()
            }
        }.build()
        
        return _BookmarkStar!!
    }

private var _BookmarkStar: ImageVector? = null

