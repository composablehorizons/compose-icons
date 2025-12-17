package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.BadgeTm: ImageVector
    get() {
        if (_BadgeTm != null) return _BadgeTm!!
        
        _BadgeTm = ImageVector.Builder(
            name = "badge-tm",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.295f, 11f)
                verticalLineTo(5.995f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                horizontalLineTo(2.403f)
                verticalLineToRelative(0.994f)
                horizontalLineToRelative(1.701f)
                verticalLineTo(11f)
                close()
                moveToRelative(3.397f, 0f)
                verticalLineTo(7.01f)
                horizontalLineToRelative(0.058f)
                lineToRelative(1.428f, 3.239f)
                horizontalLineToRelative(0.773f)
                lineToRelative(1.42f, -3.24f)
                horizontalLineToRelative(0.057f)
                verticalLineTo(11f)
                horizontalLineTo(13.5f)
                verticalLineTo(5.001f)
                horizontalLineToRelative(-1.2f)
                lineToRelative(-1.71f, 3.894f)
                horizontalLineToRelative(-0.039f)
                lineToRelative(-1.71f, -3.894f)
                horizontalLineTo(7.634f)
                verticalLineTo(11f)
                horizontalLineToRelative(1.06f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 3f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
                moveTo(2f, 2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                close()
            }
        }.build()
        
        return _BadgeTm!!
    }

private var _BadgeTm: ImageVector? = null

