package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.SignIn: ImageVector
    get() {
        if (_SignIn != null) return _SignIn!!
        
        _SignIn = ImageVector.Builder(
            name = "sign-in",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.5f, 2f)
                curveTo(9.77614f, 2f, 10f, 2.22386f, 10f, 2.5f)
                curveTo(10f, 2.77614f, 9.77614f, 3f, 9.5f, 3f)
                horizontalLineTo(4.5f)
                curveTo(3.67157f, 3f, 3f, 3.67157f, 3f, 4.5f)
                verticalLineTo(11.5f)
                curveTo(3f, 12.3284f, 3.67157f, 13f, 4.5f, 13f)
                horizontalLineTo(9.5f)
                curveTo(9.77614f, 13f, 10f, 13.2239f, 10f, 13.5f)
                curveTo(10f, 13.7761f, 9.77614f, 14f, 9.5f, 14f)
                horizontalLineTo(4.5f)
                curveTo(3.11929f, 14f, 2f, 12.8807f, 2f, 11.5f)
                verticalLineTo(4.5f)
                curveTo(2f, 3.11929f, 3.11929f, 2f, 4.5f, 2f)
                horizontalLineTo(9.5f)
                close()
                moveTo(6.14645f, 7.64645f)
                lineTo(9.14645f, 4.64645f)
                curveTo(9.34171f, 4.45118f, 9.65829f, 4.45118f, 9.85355f, 4.64645f)
                curveTo(10.0488f, 4.84171f, 10.0488f, 5.15829f, 9.85355f, 5.35355f)
                lineTo(7.70711f, 7.5f)
                horizontalLineTo(14.5f)
                curveTo(14.7761f, 7.5f, 15f, 7.72386f, 15f, 8f)
                curveTo(15f, 8.27614f, 14.7761f, 8.5f, 14.5f, 8.5f)
                horizontalLineTo(7.70711f)
                lineTo(9.85355f, 10.6464f)
                curveTo(10.0488f, 10.8417f, 10.0488f, 11.1583f, 9.85355f, 11.3536f)
                curveTo(9.65829f, 11.5488f, 9.34171f, 11.5488f, 9.14645f, 11.3536f)
                lineTo(6.14645f, 8.35355f)
                curveTo(5.95118f, 8.15829f, 5.95118f, 7.84171f, 6.14645f, 7.64645f)
                close()
            }
        }.build()
        
        return _SignIn!!
    }

private var _SignIn: ImageVector? = null

