package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.CollectionPlay: ImageVector
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
                moveTo(2.5f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineToRelative(11f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                close()
                moveToRelative(2f, -2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineToRelative(7f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                close()
                moveTo(0f, 13f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, 1.5f)
                horizontalLineToRelative(13f)
                arcTo(1.5f, 1.5f, 0f, false, false, 16f, 13f)
                verticalLineTo(6f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -1.5f, -1.5f)
                horizontalLineToRelative(-13f)
                arcTo(1.5f, 1.5f, 0f, false, false, 0f, 6f)
                close()
                moveToRelative(6.258f, -6.437f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.507f, 0.013f)
                lineToRelative(4f, 2.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 0.848f)
                lineToRelative(-4f, 2.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 6f, 12f)
                verticalLineTo(7f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.258f, -0.437f)
            }
        }.build()
        
        return _CollectionPlay!!
    }

private var _CollectionPlay: ImageVector? = null

