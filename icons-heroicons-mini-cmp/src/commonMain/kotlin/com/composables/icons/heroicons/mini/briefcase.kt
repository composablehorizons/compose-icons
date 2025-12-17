package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Briefcase: ImageVector
    get() {
        if (_Briefcase != null) return _Briefcase!!
        
        _Briefcase = ImageVector.Builder(
            name = "briefcase",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 3.75f)
                arcTo(2.75f, 2.75f, 0f, false, true, 8.75f, 1f)
                horizontalLineToRelative(2.5f)
                arcTo(2.75f, 2.75f, 0f, false, true, 14f, 3.75f)
                verticalLineToRelative(0.443f)
                curveToRelative(0.572f, 0.055f, 1.14f, 0.122f, 1.706f, 0.2f)
                curveTo(17.053f, 4.582f, 18f, 5.75f, 18f, 7.07f)
                verticalLineToRelative(3.469f)
                curveToRelative(0f, 1.126f, -0.694f, 2.191f, -1.83f, 2.54f)
                curveToRelative(-1.952f, 0.599f, -4.024f, 0.921f, -6.17f, 0.921f)
                reflectiveCurveToRelative(-4.219f, -0.322f, -6.17f, -0.921f)
                curveTo(2.694f, 12.73f, 2f, 11.665f, 2f, 10.539f)
                verticalLineTo(7.07f)
                curveToRelative(0f, -1.321f, 0.947f, -2.489f, 2.294f, -2.676f)
                arcTo(41.047f, 41.047f, 0f, false, true, 6f, 4.193f)
                verticalLineTo(3.75f)
                close()
                moveToRelative(6.5f, 0f)
                verticalLineToRelative(0.325f)
                arcToRelative(41.622f, 41.622f, 0f, false, false, -5f, 0f)
                verticalLineTo(3.75f)
                curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
                close()
                moveTo(10f, 10f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(0.01f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(0.01f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(11f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineTo(10f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 15.055f)
                verticalLineToRelative(-0.684f)
                curveToRelative(0.126f, 0.053f, 0.255f, 0.1f, 0.39f, 0.142f)
                curveToRelative(2.092f, 0.642f, 4.313f, 0.987f, 6.61f, 0.987f)
                curveToRelative(2.297f, 0f, 4.518f, -0.345f, 6.61f, -0.987f)
                curveToRelative(0.135f, -0.041f, 0.264f, -0.089f, 0.39f, -0.142f)
                verticalLineToRelative(0.684f)
                curveToRelative(0f, 1.347f, -0.985f, 2.53f, -2.363f, 2.686f)
                arcToRelative(41.454f, 41.454f, 0f, false, true, -9.274f, 0f)
                curveTo(3.985f, 17.585f, 3f, 16.402f, 3f, 15.055f)
                close()
            }
        }.build()
        
        return _Briefcase!!
    }

private var _Briefcase: ImageVector? = null

