package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.SignpostSplit: ImageVector
    get() {
        if (_SignpostSplit != null) return _SignpostSplit!!
        
        _SignpostSplit = ImageVector.Builder(
            name = "signpost-split",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7f, 16f)
                horizontalLineToRelative(2f)
                verticalLineTo(6f)
                horizontalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, false, false, 0.8f, -0.4f)
                lineToRelative(0.975f, -1.3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -0.6f)
                lineTo(14.8f, 2.4f)
                arcTo(1f, 1f, 0f, false, false, 14f, 2f)
                horizontalLineTo(9f)
                verticalLineToRelative(-0.586f)
                arcToRelative(1f, 1f, 0f, false, false, -2f, 0f)
                verticalLineTo(7f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, false, -0.8f, 0.4f)
                lineTo(0.225f, 8.7f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 0.6f)
                lineToRelative(0.975f, 1.3f)
                arcToRelative(1f, 1f, 0f, false, false, 0.8f, 0.4f)
                horizontalLineToRelative(5f)
                close()
            }
        }.build()
        
        return _SignpostSplit!!
    }

private var _SignpostSplit: ImageVector? = null

