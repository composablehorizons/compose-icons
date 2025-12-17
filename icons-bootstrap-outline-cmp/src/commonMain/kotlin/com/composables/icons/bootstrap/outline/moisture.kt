package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Moisture: ImageVector
    get() {
        if (_Moisture != null) return _Moisture!!
        
        _Moisture = ImageVector.Builder(
            name = "moisture",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.5f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineTo(15f)
                verticalLineToRelative(2.75f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(0.5f)
                verticalLineTo(7.5f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineTo(15f)
                verticalLineToRelative(2.75f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(0.5f)
                verticalLineTo(15f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                close()
                moveTo(7f, 1.5f)
                lineToRelative(0.364f, -0.343f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.728f, 0f)
                lineToRelative(-0.002f, 0.002f)
                lineToRelative(-0.006f, 0.007f)
                lineToRelative(-0.022f, 0.023f)
                lineToRelative(-0.08f, 0.088f)
                arcToRelative(29f, 29f, 0f, false, false, -1.274f, 1.517f)
                curveToRelative(-0.769f, 0.983f, -1.714f, 2.325f, -2.385f, 3.727f)
                curveTo(2.368f, 7.564f, 2f, 8.682f, 2f, 9.733f)
                curveTo(2f, 12.614f, 4.212f, 15f, 7f, 15f)
                reflectiveCurveToRelative(5f, -2.386f, 5f, -5.267f)
                curveToRelative(0f, -1.05f, -0.368f, -2.169f, -0.867f, -3.212f)
                curveToRelative(-0.671f, -1.402f, -1.616f, -2.744f, -2.385f, -3.727f)
                arcToRelative(29f, 29f, 0f, false, false, -1.354f, -1.605f)
                lineToRelative(-0.022f, -0.023f)
                lineToRelative(-0.006f, -0.007f)
                lineToRelative(-0.002f, -0.001f)
                close()
                moveToRelative(0f, 0f)
                lineToRelative(-0.364f, -0.343f)
                close()
                moveToRelative(-0.016f, 0.766f)
                lineTo(7f, 2.247f)
                lineToRelative(0.016f, 0.019f)
                curveToRelative(0.24f, 0.274f, 0.572f, 0.667f, 0.944f, 1.144f)
                curveToRelative(0.611f, 0.781f, 1.32f, 1.776f, 1.901f, 2.827f)
                horizontalLineTo(4.14f)
                curveToRelative(0.58f, -1.051f, 1.29f, -2.046f, 1.9f, -2.827f)
                curveToRelative(0.373f, -0.477f, 0.706f, -0.87f, 0.945f, -1.144f)
                close()
                moveTo(3f, 9.733f)
                curveToRelative(0f, -0.755f, 0.244f, -1.612f, 0.638f, -2.496f)
                horizontalLineToRelative(6.724f)
                curveToRelative(0.395f, 0.884f, 0.638f, 1.741f, 0.638f, 2.496f)
                curveTo(11f, 12.117f, 9.182f, 14f, 7f, 14f)
                reflectiveCurveToRelative(-4f, -1.883f, -4f, -4.267f)
            }
        }.build()
        
        return _Moisture!!
    }

private var _Moisture: ImageVector? = null

