package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.CollectionPlay: ImageVector
    get() {
        if (_CollectionPlay != null) return _CollectionPlay!!
        
        _CollectionPlay = ImageVector.Builder(
            name = "collection-play",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(11f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                horizontalLineToRelative(-11f)
                arcTo(0.5f, 0.5f, 0f, false, false, 2f, 3f)
                moveToRelative(2f, -2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(7f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                horizontalLineToRelative(-7f)
                arcTo(0.5f, 0.5f, 0f, false, false, 4f, 1f)
                moveToRelative(2.765f, 5.576f)
                arcTo(0.5f, 0.5f, 0f, false, false, 6f, 7f)
                verticalLineToRelative(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.765f, 0.424f)
                lineToRelative(4f, -2.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -0.848f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.5f, 14.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 0f, 13f)
                verticalLineTo(6f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.5f, -1.5f)
                horizontalLineToRelative(13f)
                arcTo(1.5f, 1.5f, 0f, false, true, 16f, 6f)
                verticalLineToRelative(7f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                close()
                moveToRelative(13f, -1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineTo(6f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-13f)
                arcTo(0.5f, 0.5f, 0f, false, false, 1f, 6f)
                verticalLineToRelative(7f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                close()
            }
        }.build()
        
        return _CollectionPlay!!
    }

private var _CollectionPlay: ImageVector? = null

