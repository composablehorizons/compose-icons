package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Scale: ImageVector
    get() {
        if (_Scale != null) return _Scale!!
        
        _Scale = ImageVector.Builder(
            name = "scale",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 2f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(0.258f)
                arcToRelative(33.186f, 33.186f, 0f, false, true, 6.668f, 0.83f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.336f, 1.461f)
                arcToRelative(31.28f, 31.28f, 0f, false, false, -1.103f, -0.232f)
                lineToRelative(1.702f, 7.545f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.387f, 0.832f)
                arcTo(4.981f, 4.981f, 0f, false, true, 15f, 14f)
                curveToRelative(-0.825f, 0f, -1.606f, -0.2f, -2.294f, -0.556f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.387f, -0.832f)
                lineToRelative(1.77f, -7.849f)
                arcToRelative(31.743f, 31.743f, 0f, false, false, -3.339f, -0.254f)
                verticalLineToRelative(11.505f)
                arcToRelative(20.01f, 20.01f, 0f, false, true, 3.78f, 0.501f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -0.339f, 1.462f)
                arcTo(18.558f, 18.558f, 0f, false, false, 10f, 17.5f)
                curveToRelative(-1.442f, 0f, -2.845f, 0.165f, -4.191f, 0.477f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.338f, -1.462f)
                arcToRelative(20.01f, 20.01f, 0f, false, true, 3.779f, -0.501f)
                verticalLineTo(4.509f)
                curveToRelative(-1.129f, 0.026f, -2.243f, 0.112f, -3.34f, 0.254f)
                lineToRelative(1.771f, 7.85f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.387f, 0.83f)
                arcTo(4.98f, 4.98f, 0f, false, true, 5f, 14f)
                arcToRelative(4.98f, 4.98f, 0f, false, true, -2.294f, -0.556f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.387f, -0.832f)
                lineTo(4.02f, 5.067f)
                curveToRelative(-0.37f, 0.07f, -0.738f, 0.148f, -1.103f, 0.232f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.336f, -1.462f)
                arcToRelative(32.845f, 32.845f, 0f, false, true, 6.668f, -0.829f)
                verticalLineTo(2.75f)
                arcTo(0.75f, 0.75f, 0f, false, true, 10f, 2f)
                close()
                moveTo(5f, 7.543f)
                lineTo(3.92f, 12.33f)
                arcToRelative(3.499f, 3.499f, 0f, false, false, 2.16f, 0f)
                lineTo(5f, 7.543f)
                close()
                moveToRelative(10f, 0f)
                lineToRelative(-1.08f, 4.787f)
                arcToRelative(3.498f, 3.498f, 0f, false, false, 2.16f, 0f)
                lineTo(15f, 7.543f)
                close()
            }
        }.build()
        
        return _Scale!!
    }

private var _Scale: ImageVector? = null

