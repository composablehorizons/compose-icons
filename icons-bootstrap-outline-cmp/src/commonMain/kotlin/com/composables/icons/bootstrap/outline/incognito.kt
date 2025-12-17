package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Incognito: ImageVector
    get() {
        if (_Incognito != null) return _Incognito!!
        
        _Incognito = ImageVector.Builder(
            name = "incognito",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.736f, 1.968f)
                lineToRelative(-0.892f, 3.269f)
                lineToRelative(-0.014f, 0.058f)
                curveTo(2.113f, 5.568f, 1f, 6.006f, 1f, 6.5f)
                curveTo(1f, 7.328f, 4.134f, 8f, 8f, 8f)
                reflectiveCurveToRelative(7f, -0.672f, 7f, -1.5f)
                curveToRelative(0f, -0.494f, -1.113f, -0.932f, -2.83f, -1.205f)
                lineToRelative(-0.014f, -0.058f)
                lineToRelative(-0.892f, -3.27f)
                curveToRelative(-0.146f, -0.533f, -0.698f, -0.849f, -1.239f, -0.734f)
                curveTo(9.411f, 1.363f, 8.62f, 1.5f, 8f, 1.5f)
                reflectiveCurveToRelative(-1.411f, -0.136f, -2.025f, -0.267f)
                curveToRelative(-0.541f, -0.115f, -1.093f, 0.2f, -1.239f, 0.735f)
                moveToRelative(0.015f, 3.867f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.274f, -0.224f)
                curveToRelative(0.9f, 0.092f, 1.91f, 0.143f, 2.975f, 0.143f)
                arcToRelative(30f, 30f, 0f, false, false, 2.975f, -0.143f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.05f, 0.498f)
                curveToRelative(-0.918f, 0.093f, -1.944f, 0.145f, -3.025f, 0.145f)
                reflectiveCurveToRelative(-2.107f, -0.052f, -3.025f, -0.145f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.224f, -0.274f)
                moveTo(3.5f, 10f)
                horizontalLineToRelative(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(1f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -3f, 0f)
                verticalLineToRelative(-1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                moveToRelative(-1.5f, 0.5f)
                quadToRelative(0.001f, -0.264f, 0.085f, -0.5f)
                horizontalLineTo(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineToRelative(3.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.488f, 1.312f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 2.024f, 0f)
                arcTo(1.5f, 1.5f, 0f, false, true, 10.5f, 9f)
                horizontalLineTo(14f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-0.085f)
                quadToRelative(0.084f, 0.236f, 0.085f, 0.5f)
                verticalLineToRelative(1f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -5f, 0f)
                verticalLineToRelative(-0.14f)
                lineToRelative(-0.21f, -0.07f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -1.58f, 0f)
                lineToRelative(-0.21f, 0.07f)
                verticalLineToRelative(0.14f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -5f, 0f)
                close()
                moveToRelative(8.5f, -0.5f)
                horizontalLineToRelative(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(1f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -3f, 0f)
                verticalLineToRelative(-1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
            }
        }.build()
        
        return _Incognito!!
    }

private var _Incognito: ImageVector? = null

