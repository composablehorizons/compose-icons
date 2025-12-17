package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Gif: ImageVector
    get() {
        if (_Gif != null) return _Gif!!
        
        _Gif = ImageVector.Builder(
            name = "gif",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 3f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(6f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineTo(3f)
                close()
                moveToRelative(0.895f, 3.458f)
                curveTo(4.142f, 6.071f, 4.38f, 6f, 4.5f, 6f)
                reflectiveCurveToRelative(0.358f, 0.07f, 0.605f, 0.458f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.265f, -0.805f)
                curveTo(5.933f, 4.966f, 5.274f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(-1.433f, 0.466f, -1.87f, 1.153f)
                curveTo(2.195f, 6.336f, 2f, 7.187f, 2f, 8f)
                reflectiveCurveToRelative(0.195f, 1.664f, 0.63f, 2.347f)
                curveToRelative(0.437f, 0.687f, 1.096f, 1.153f, 1.87f, 1.153f)
                reflectiveCurveToRelative(1.433f, -0.466f, 1.87f, -1.153f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.117f, -0.402f)
                verticalLineTo(8f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, -0.75f)
                horizontalLineTo(5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.013f, 1.5f)
                verticalLineToRelative(0.955f)
                curveTo(4.785f, 9.95f, 4.602f, 10f, 4.5f, 10f)
                curveToRelative(-0.121f, 0f, -0.358f, -0.07f, -0.605f, -0.458f)
                curveTo(3.647f, 9.15f, 3.5f, 8.595f, 3.5f, 8f)
                curveToRelative(0f, -0.595f, 0.147f, -1.15f, 0.395f, -1.542f)
                close()
                moveTo(9f, 5.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(5.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineToRelative(-5.5f)
                close()
                moveToRelative(1f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineTo(11.5f)
                verticalLineToRelative(1.25f)
                horizontalLineToRelative(0.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-0.75f)
                verticalLineToRelative(2f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineToRelative(-5.5f)
                close()
            }
        }.build()
        
        return _Gif!!
    }

private var _Gif: ImageVector? = null

