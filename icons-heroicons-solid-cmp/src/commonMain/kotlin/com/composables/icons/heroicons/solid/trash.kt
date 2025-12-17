package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Trash: ImageVector
    get() {
        if (_Trash != null) return _Trash!!
        
        _Trash = ImageVector.Builder(
            name = "trash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16.5f, 4.478f)
                verticalLineToRelative(0.227f)
                arcToRelative(48.816f, 48.816f, 0f, false, true, 3.878f, 0.512f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -0.256f, 1.478f)
                lineToRelative(-0.209f, -0.035f)
                lineToRelative(-1.005f, 13.07f)
                arcToRelative(3f, 3f, 0f, false, true, -2.991f, 2.77f)
                horizontalLineTo(8.084f)
                arcToRelative(3f, 3f, 0f, false, true, -2.991f, -2.77f)
                lineTo(4.087f, 6.66f)
                lineToRelative(-0.209f, 0.035f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.256f, -1.478f)
                arcTo(48.567f, 48.567f, 0f, false, true, 7.5f, 4.705f)
                verticalLineToRelative(-0.227f)
                curveToRelative(0f, -1.564f, 1.213f, -2.9f, 2.816f, -2.951f)
                arcToRelative(52.662f, 52.662f, 0f, false, true, 3.369f, 0f)
                curveToRelative(1.603f, 0.051f, 2.815f, 1.387f, 2.815f, 2.951f)
                close()
                moveToRelative(-6.136f, -1.452f)
                arcToRelative(51.196f, 51.196f, 0f, false, true, 3.273f, 0f)
                curveTo(14.39f, 3.05f, 15f, 3.684f, 15f, 4.478f)
                verticalLineToRelative(0.113f)
                arcToRelative(49.488f, 49.488f, 0f, false, false, -6f, 0f)
                verticalLineToRelative(-0.113f)
                curveToRelative(0f, -0.794f, 0.609f, -1.428f, 1.364f, -1.452f)
                close()
                moveToRelative(-0.355f, 5.945f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.5f, 0.058f)
                lineToRelative(0.347f, 9f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.499f, -0.058f)
                lineToRelative(-0.346f, -9f)
                close()
                moveToRelative(5.48f, 0.058f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.498f, -0.058f)
                lineToRelative(-0.347f, 9f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0.058f)
                lineToRelative(0.345f, -9f)
                close()
            }
        }.build()
        
        return _Trash!!
    }

private var _Trash: ImageVector? = null

