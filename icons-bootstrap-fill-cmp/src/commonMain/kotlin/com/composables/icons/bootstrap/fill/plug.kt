package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Plug: ImageVector
    get() {
        if (_Plug != null) return _Plug!!
        
        _Plug = ImageVector.Builder(
            name = "plug",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineTo(3f)
                horizontalLineToRelative(3f)
                verticalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                verticalLineTo(3f)
                horizontalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(3f)
                arcTo(3.5f, 3.5f, 0f, false, true, 8.5f, 10f)
                curveToRelative(-0.002f, 0.434f, -0.01f, 0.845f, -0.04f, 1.22f)
                curveToRelative(-0.041f, 0.514f, -0.126f, 1.003f, -0.317f, 1.424f)
                arcToRelative(2.08f, 2.08f, 0f, false, true, -0.97f, 1.028f)
                curveTo(6.725f, 13.9f, 6.169f, 14f, 5.5f, 14f)
                curveToRelative(-0.998f, 0f, -1.61f, 0.33f, -1.974f, 0.718f)
                arcTo(1.92f, 1.92f, 0f, false, false, 3f, 16f)
                horizontalLineTo(2f)
                curveToRelative(0f, -0.616f, 0.232f, -1.367f, 0.797f, -1.968f)
                curveTo(3.374f, 13.42f, 4.261f, 13f, 5.5f, 13f)
                curveToRelative(0.581f, 0f, 0.962f, -0.088f, 1.218f, -0.219f)
                curveToRelative(0.241f, -0.123f, 0.4f, -0.3f, 0.514f, -0.55f)
                curveToRelative(0.121f, -0.266f, 0.193f, -0.621f, 0.23f, -1.09f)
                curveToRelative(0.027f, -0.34f, 0.035f, -0.718f, 0.037f, -1.141f)
                arcTo(3.5f, 3.5f, 0f, false, true, 4f, 6.5f)
                verticalLineToRelative(-3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(1f)
                verticalLineTo(0.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 6f, 0f)
            }
        }.build()
        
        return _Plug!!
    }

private var _Plug: ImageVector? = null

