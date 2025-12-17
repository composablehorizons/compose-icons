package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.SignpostSplit: ImageVector
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
                moveTo(7f, 7f)
                verticalLineTo(1.414f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
                verticalLineTo(2f)
                horizontalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, false, true, 0.8f, 0.4f)
                lineToRelative(0.975f, 1.3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 0.6f)
                lineTo(14.8f, 5.6f)
                arcToRelative(1f, 1f, 0f, false, true, -0.8f, 0.4f)
                horizontalLineTo(9f)
                verticalLineToRelative(10f)
                horizontalLineTo(7f)
                verticalLineToRelative(-5f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, true, -0.8f, -0.4f)
                lineTo(0.225f, 9.3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -0.6f)
                lineTo(1.2f, 7.4f)
                arcTo(1f, 1f, 0f, false, true, 2f, 7f)
                close()
                moveToRelative(1f, 3f)
                verticalLineTo(8f)
                horizontalLineTo(2f)
                lineToRelative(-0.75f, 1f)
                lineTo(2f, 10f)
                close()
                moveToRelative(0f, -5f)
                horizontalLineToRelative(6f)
                lineToRelative(0.75f, -1f)
                lineTo(14f, 3f)
                horizontalLineTo(8f)
                close()
            }
        }.build()
        
        return _SignpostSplit!!
    }

private var _SignpostSplit: ImageVector? = null

