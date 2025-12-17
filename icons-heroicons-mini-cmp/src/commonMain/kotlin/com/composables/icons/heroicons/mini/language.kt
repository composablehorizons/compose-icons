package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Language: ImageVector
    get() {
        if (_Language != null) return _Language!!
        
        _Language = ImageVector.Builder(
            name = "language",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.75f, 2.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(1.258f)
                arcToRelative(32.987f, 32.987f, 0f, false, false, -3.599f, 0.278f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 0.198f, 1.487f)
                arcTo(31.545f, 31.545f, 0f, false, true, 8.7f, 5.545f)
                arcTo(19.381f, 19.381f, 0f, false, true, 7f, 9.56f)
                arcToRelative(19.418f, 19.418f, 0f, false, true, -1.002f, -2.05f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.384f, 0.577f)
                arcToRelative(20.935f, 20.935f, 0f, false, false, 1.492f, 2.91f)
                arcToRelative(19.613f, 19.613f, 0f, false, true, -3.828f, 4.154f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 0.945f, 1.164f)
                arcTo(21.116f, 21.116f, 0f, false, false, 7f, 12.331f)
                curveToRelative(0.095f, 0.132f, 0.192f, 0.262f, 0.29f, 0.391f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.194f, -0.91f)
                curveToRelative(-0.204f, -0.266f, -0.4f, -0.538f, -0.59f, -0.815f)
                arcToRelative(20.888f, 20.888f, 0f, false, false, 2.333f, -5.332f)
                curveToRelative(0.31f, 0.031f, 0.618f, 0.068f, 0.924f, 0.108f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.198f, -1.487f)
                arcToRelative(32.832f, 32.832f, 0f, false, false, -3.599f, -0.278f)
                verticalLineTo(2.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13f, 8f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.671f, 0.415f)
                lineToRelative(4.25f, 8.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.342f, 0.67f)
                lineTo(15.787f, 16f)
                horizontalLineToRelative(-5.573f)
                lineToRelative(-0.793f, 1.585f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.342f, -0.67f)
                lineToRelative(4.25f, -8.5f)
                arcTo(0.75f, 0.75f, 0f, false, true, 13f, 8f)
                close()
                moveToRelative(2.037f, 6.5f)
                lineTo(13f, 10.427f)
                lineTo(10.964f, 14.5f)
                horizontalLineToRelative(4.073f)
                close()
            }
        }.build()
        
        return _Language!!
    }

private var _Language: ImageVector? = null

