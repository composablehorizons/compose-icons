package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.CubeTransparent: ImageVector
    get() {
        if (_CubeTransparent != null) return _CubeTransparent!!
        
        _CubeTransparent = ImageVector.Builder(
            name = "cube-transparent",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.628f, 1.349f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.744f, 0f)
                lineToRelative(1.247f, 0.712f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -0.744f, 1.303f)
                lineTo(8f, 2.864f)
                lineToRelative(-0.875f, 0.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.744f, -1.303f)
                lineToRelative(1.247f, -0.712f)
                close()
                moveTo(4.65f, 3.914f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.279f, 1.023f)
                lineTo(4.262f, 5f)
                lineToRelative(0.11f, 0.063f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.744f, 1.302f)
                lineToRelative(-0.13f, -0.073f)
                arcTo(0.75f, 0.75f, 0f, false, true, 2f, 6.25f)
                verticalLineTo(5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.378f, -0.651f)
                lineToRelative(1.25f, -0.714f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.023f, 0.279f)
                close()
                moveToRelative(6.698f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.023f, -0.28f)
                lineToRelative(1.25f, 0.715f)
                arcTo(0.75f, 0.75f, 0f, false, true, 14f, 5f)
                verticalLineToRelative(1.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.499f, 0.042f)
                lineToRelative(-0.129f, 0.073f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.744f, -1.302f)
                lineToRelative(0.11f, -0.063f)
                lineToRelative(-0.11f, -0.063f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.28f, -1.023f)
                close()
                moveTo(6.102f, 6.915f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.023f, -0.279f)
                lineToRelative(0.875f, 0.5f)
                lineToRelative(0.875f, -0.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.744f, 1.303f)
                lineToRelative(-0.869f, 0.496f)
                verticalLineToRelative(0.815f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineToRelative(-0.815f)
                lineToRelative(-0.869f, -0.496f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.28f, -1.024f)
                close()
                moveTo(2.75f, 9f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(0.815f)
                lineToRelative(0.872f, 0.498f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.744f, 1.303f)
                lineToRelative(-1.25f, -0.715f)
                arcTo(0.75f, 0.75f, 0f, false, true, 2f, 11f)
                verticalLineTo(9.75f)
                arcTo(0.75f, 0.75f, 0f, false, true, 2.75f, 9f)
                close()
                moveToRelative(10.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineTo(11f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.378f, 0.651f)
                lineToRelative(-1.25f, 0.715f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.744f, -1.303f)
                lineToRelative(0.872f, -0.498f)
                verticalLineTo(9.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                close()
                moveToRelative(-4.501f, 3.708f)
                lineToRelative(0.126f, -0.072f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.744f, 1.303f)
                lineToRelative(-1.247f, 0.712f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.744f, 0f)
                lineTo(6.38f, 13.94f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.744f, -1.303f)
                lineToRelative(0.126f, 0.072f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.498f, 0f)
                close()
            }
        }.build()
        
        return _CubeTransparent!!
    }

private var _CubeTransparent: ImageVector? = null

