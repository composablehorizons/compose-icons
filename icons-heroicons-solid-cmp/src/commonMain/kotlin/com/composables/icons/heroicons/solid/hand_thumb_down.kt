package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.HandThumbDown: ImageVector
    get() {
        if (_HandThumbDown != null) return _HandThumbDown!!
        
        _HandThumbDown = ImageVector.Builder(
            name = "hand-thumb-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15.73f, 5.5f)
                horizontalLineToRelative(1.035f)
                arcTo(7.465f, 7.465f, 0f, false, true, 18f, 9.625f)
                arcToRelative(7.465f, 7.465f, 0f, false, true, -1.235f, 4.125f)
                horizontalLineToRelative(-0.148f)
                curveToRelative(-0.806f, 0f, -1.534f, 0.446f, -2.031f, 1.08f)
                arcToRelative(9.04f, 9.04f, 0f, false, true, -2.861f, 2.4f)
                curveToRelative(-0.723f, 0.384f, -1.35f, 0.956f, -1.653f, 1.715f)
                arcToRelative(4.499f, 4.499f, 0f, false, false, -0.322f, 1.672f)
                verticalLineToRelative(0.633f)
                arcTo(0.75f, 0.75f, 0f, false, true, 9f, 22f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, -2.25f, -2.25f)
                curveToRelative(0f, -1.152f, 0.26f, -2.243f, 0.723f, -3.218f)
                curveToRelative(0.266f, -0.558f, -0.107f, -1.282f, -0.725f, -1.282f)
                horizontalLineTo(3.622f)
                curveToRelative(-1.026f, 0f, -1.945f, -0.694f, -2.054f, -1.715f)
                arcTo(12.137f, 12.137f, 0f, false, true, 1.5f, 12.25f)
                curveToRelative(0f, -2.848f, 0.992f, -5.464f, 2.649f, -7.521f)
                curveTo(4.537f, 4.247f, 5.136f, 4f, 5.754f, 4f)
                horizontalLineTo(9.77f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, 1.423f, 0.23f)
                lineToRelative(3.114f, 1.04f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, 1.423f, 0.23f)
                close()
                moveTo(21.669f, 14.023f)
                curveToRelative(0.536f, -1.362f, 0.831f, -2.845f, 0.831f, -4.398f)
                curveToRelative(0f, -1.22f, -0.182f, -2.398f, -0.52f, -3.507f)
                curveToRelative(-0.26f, -0.85f, -1.084f, -1.368f, -1.973f, -1.368f)
                horizontalLineTo(19.1f)
                curveToRelative(-0.445f, 0f, -0.72f, 0.498f, -0.523f, 0.898f)
                curveToRelative(0.591f, 1.2f, 0.924f, 2.55f, 0.924f, 3.977f)
                arcToRelative(8.958f, 8.958f, 0f, false, true, -1.302f, 4.666f)
                curveToRelative(-0.245f, 0.403f, 0.028f, 0.959f, 0.5f, 0.959f)
                horizontalLineToRelative(1.053f)
                curveToRelative(0.832f, 0f, 1.612f, -0.453f, 1.918f, -1.227f)
                close()
            }
        }.build()
        
        return _HandThumbDown!!
    }

private var _HandThumbDown: ImageVector? = null

