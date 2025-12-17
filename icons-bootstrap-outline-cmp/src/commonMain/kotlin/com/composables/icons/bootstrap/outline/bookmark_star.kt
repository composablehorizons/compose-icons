package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.BookmarkStar: ImageVector
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
                moveTo(7.84f, 4.1f)
                arcToRelative(0.178f, 0.178f, 0f, false, true, 0.32f, 0f)
                lineToRelative(0.634f, 1.285f)
                arcToRelative(0.18f, 0.18f, 0f, false, false, 0.134f, 0.098f)
                lineToRelative(1.42f, 0.206f)
                curveToRelative(0.145f, 0.021f, 0.204f, 0.2f, 0.098f, 0.303f)
                lineTo(9.42f, 6.993f)
                arcToRelative(0.18f, 0.18f, 0f, false, false, -0.051f, 0.158f)
                lineToRelative(0.242f, 1.414f)
                arcToRelative(0.178f, 0.178f, 0f, false, true, -0.258f, 0.187f)
                lineToRelative(-1.27f, -0.668f)
                arcToRelative(0.18f, 0.18f, 0f, false, false, -0.165f, 0f)
                lineToRelative(-1.27f, 0.668f)
                arcToRelative(0.178f, 0.178f, 0f, false, true, -0.257f, -0.187f)
                lineToRelative(0.242f, -1.414f)
                arcToRelative(0.18f, 0.18f, 0f, false, false, -0.05f, -0.158f)
                lineToRelative(-1.03f, -1.001f)
                arcToRelative(0.178f, 0.178f, 0f, false, true, 0.098f, -0.303f)
                lineToRelative(1.42f, -0.206f)
                arcToRelative(0.18f, 0.18f, 0f, false, false, 0.134f, -0.098f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(13.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.777f, 0.416f)
                lineTo(8f, 13.101f)
                lineToRelative(-5.223f, 2.815f)
                arcTo(0.5f, 0.5f, 0f, false, true, 2f, 15.5f)
                close()
                moveToRelative(2f, -1f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(12.566f)
                lineToRelative(4.723f, -2.482f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.554f, 0f)
                lineTo(13f, 14.566f)
                verticalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                close()
            }
        }.build()
        
        return _BookmarkStar!!
    }

private var _BookmarkStar: ImageVector? = null

