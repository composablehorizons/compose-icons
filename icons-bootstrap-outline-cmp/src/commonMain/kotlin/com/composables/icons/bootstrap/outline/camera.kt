package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Camera: ImageVector
    get() {
        if (_Camera != null) return _Camera!!
        
        _Camera = ImageVector.Builder(
            name = "camera",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 12f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(6f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(1.172f)
                arcToRelative(3f, 3f, 0f, false, false, 2.12f, -0.879f)
                lineToRelative(0.83f, -0.828f)
                arcTo(1f, 1f, 0f, false, true, 6.827f, 3f)
                horizontalLineToRelative(2.344f)
                arcToRelative(1f, 1f, 0f, false, true, 0.707f, 0.293f)
                lineToRelative(0.828f, 0.828f)
                arcTo(3f, 3f, 0f, false, false, 12.828f, 5f)
                horizontalLineTo(14f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                close()
                moveTo(2f, 4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(6f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineToRelative(-1.172f)
                arcToRelative(2f, 2f, 0f, false, true, -1.414f, -0.586f)
                lineToRelative(-0.828f, -0.828f)
                arcTo(2f, 2f, 0f, false, false, 9.172f, 2f)
                horizontalLineTo(6.828f)
                arcToRelative(2f, 2f, 0f, false, false, -1.414f, 0.586f)
                lineToRelative(-0.828f, 0.828f)
                arcTo(2f, 2f, 0f, false, true, 3.172f, 4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 11f)
                arcToRelative(2.5f, 2.5f, 0f, true, true, 0f, -5f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 0f, 5f)
                moveToRelative(0f, 1f)
                arcToRelative(3.5f, 3.5f, 0f, true, false, 0f, -7f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, 0f, 7f)
                moveTo(3f, 6.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -1f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
            }
        }.build()
        
        return _Camera!!
    }

private var _Camera: ImageVector? = null

