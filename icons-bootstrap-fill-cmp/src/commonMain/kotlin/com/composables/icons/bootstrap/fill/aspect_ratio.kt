package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.AspectRatio: ImageVector
    get() {
        if (_AspectRatio != null) return _AspectRatio!!
        
        _AspectRatio = ImageVector.Builder(
            name = "aspect-ratio",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 12.5f)
                verticalLineToRelative(-9f)
                arcTo(1.5f, 1.5f, 0f, false, true, 1.5f, 2f)
                horizontalLineToRelative(13f)
                arcTo(1.5f, 1.5f, 0f, false, true, 16f, 3.5f)
                verticalLineToRelative(9f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-13f)
                arcTo(1.5f, 1.5f, 0f, false, true, 0f, 12.5f)
                moveTo(2.5f, 4f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                verticalLineTo(5f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                close()
                moveToRelative(11f, 8f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -1f, 0f)
                verticalLineTo(11f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                close()
            }
        }.build()
        
        return _AspectRatio!!
    }

private var _AspectRatio: ImageVector? = null

