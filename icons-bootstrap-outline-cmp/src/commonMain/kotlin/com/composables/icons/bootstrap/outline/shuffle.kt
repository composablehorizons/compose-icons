package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Shuffle: ImageVector
    get() {
        if (_Shuffle != null) return _Shuffle!!
        
        _Shuffle = ImageVector.Builder(
            name = "shuffle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 3.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 0.5f, 3f)
                horizontalLineTo(1f)
                curveToRelative(2.202f, 0f, 3.827f, 1.24f, 4.874f, 2.418f)
                curveToRelative(0.49f, 0.552f, 0.865f, 1.102f, 1.126f, 1.532f)
                curveToRelative(0.26f, -0.43f, 0.636f, -0.98f, 1.126f, -1.532f)
                curveTo(9.173f, 4.24f, 10.798f, 3f, 13f, 3f)
                verticalLineToRelative(1f)
                curveToRelative(-1.798f, 0f, -3.173f, 1.01f, -4.126f, 2.082f)
                arcTo(9.6f, 9.6f, 0f, false, false, 7.556f, 8f)
                arcToRelative(9.6f, 9.6f, 0f, false, false, 1.317f, 1.918f)
                curveTo(9.828f, 10.99f, 11.204f, 12f, 13f, 12f)
                verticalLineToRelative(1f)
                curveToRelative(-2.202f, 0f, -3.827f, -1.24f, -4.874f, -2.418f)
                arcTo(10.6f, 10.6f, 0f, false, true, 7f, 9.05f)
                curveToRelative(-0.26f, 0.43f, -0.636f, 0.98f, -1.126f, 1.532f)
                curveTo(4.827f, 11.76f, 3.202f, 13f, 1f, 13f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineTo(1f)
                curveToRelative(1.798f, 0f, 3.173f, -1.01f, 4.126f, -2.082f)
                arcTo(9.6f, 9.6f, 0f, false, false, 6.444f, 8f)
                arcToRelative(9.6f, 9.6f, 0f, false, false, -1.317f, -1.918f)
                curveTo(4.172f, 5.01f, 2.796f, 4f, 1f, 4f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13f, 5.466f)
                verticalLineTo(1.534f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.41f, -0.192f)
                lineToRelative(2.36f, 1.966f)
                curveToRelative(0.12f, 0.1f, 0.12f, 0.284f, 0f, 0.384f)
                lineToRelative(-2.36f, 1.966f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.41f, -0.192f)
                moveToRelative(0f, 9f)
                verticalLineToRelative(-3.932f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.41f, -0.192f)
                lineToRelative(2.36f, 1.966f)
                curveToRelative(0.12f, 0.1f, 0.12f, 0.284f, 0f, 0.384f)
                lineToRelative(-2.36f, 1.966f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.41f, -0.192f)
            }
        }.build()
        
        return _Shuffle!!
    }

private var _Shuffle: ImageVector? = null

