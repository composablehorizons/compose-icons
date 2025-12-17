package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Extension_off: ImageVector
    get() {
        if (_Extension_off != null) return _Extension_off!!
        
        _Extension_off = ImageVector.Builder(
            name = "extension_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20.49f, 21.9f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                lineToRelative(-0.92f, -0.92f)
                curveTo(18.1f, 20.98f, 18.05f, 21f, 18f, 21f)
                horizontalLineToRelative(-3.8f)
                curveToRelative(0f, -2.71f, -2.16f, -3f, -2.7f, -3f)
                reflectiveCurveToRelative(-2.7f, 0.29f, -2.7f, 3f)
                horizontalLineTo(5f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-3.8f)
                curveToRelative(2.71f, 0f, 3f, -2.16f, 3f, -2.7f)
                curveToRelative(0f, -0.54f, -0.3f, -2.7f, -2.99f, -2.7f)
                verticalLineTo(6f)
                curveToRelative(0f, -0.05f, 0.02f, -0.09f, 0.02f, -0.14f)
                lineTo(2.1f, 4.93f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(0f, 0f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(16.97f, 16.97f)
                curveTo(20.88f, 20.88f, 20.88f, 21.51f, 20.49f, 21.9f)
                lineTo(20.49f, 21.9f)
                close()
                moveTo(20f, 17.17f)
                verticalLineTo(15f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveTo(21.38f, 10f, 20f, 10f)
                verticalLineTo(6f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-4f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveTo(9f, 2.62f, 9f, 4f)
                horizontalLineTo(6.83f)
                lineTo(20f, 17.17f)
                close()
            }
        }.build()
        
        return _Extension_off!!
    }

private var _Extension_off: ImageVector? = null

