package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Type: ImageVector
    get() {
        if (_Type != null) return _Type!!
        
        _Type = ImageVector.Builder(
            name = "type",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.244f, 13.081f)
                lineToRelative(0.943f, -2.803f)
                horizontalLineTo(6.66f)
                lineToRelative(0.944f, 2.803f)
                horizontalLineTo(8.86f)
                lineTo(5.54f, 3.75f)
                horizontalLineTo(4.322f)
                lineTo(1f, 13.081f)
                close()
                moveToRelative(2.7f, -7.923f)
                lineTo(6.34f, 9.314f)
                horizontalLineTo(3.51f)
                lineToRelative(1.4f, -4.156f)
                close()
                moveToRelative(9.146f, 7.027f)
                horizontalLineToRelative(0.035f)
                verticalLineToRelative(0.896f)
                horizontalLineToRelative(1.128f)
                verticalLineTo(8.125f)
                curveToRelative(0f, -1.51f, -1.114f, -2.345f, -2.646f, -2.345f)
                curveToRelative(-1.736f, 0f, -2.59f, 0.916f, -2.666f, 2.174f)
                horizontalLineToRelative(1.108f)
                curveToRelative(0.068f, -0.718f, 0.595f, -1.19f, 1.517f, -1.19f)
                curveToRelative(0.971f, 0f, 1.518f, 0.52f, 1.518f, 1.464f)
                verticalLineToRelative(0.731f)
                horizontalLineTo(12.19f)
                curveToRelative(-1.647f, 0.007f, -2.522f, 0.8f, -2.522f, 2.058f)
                curveToRelative(0f, 1.319f, 0.957f, 2.18f, 2.345f, 2.18f)
                curveToRelative(1.06f, 0f, 1.716f, -0.43f, 2.078f, -1.011f)
                close()
                moveToRelative(-1.763f, 0.035f)
                curveToRelative(-0.752f, 0f, -1.456f, -0.397f, -1.456f, -1.244f)
                curveToRelative(0f, -0.65f, 0.424f, -1.115f, 1.408f, -1.115f)
                horizontalLineToRelative(1.805f)
                verticalLineToRelative(0.834f)
                curveToRelative(0f, 0.896f, -0.752f, 1.525f, -1.757f, 1.525f)
            }
        }.build()
        
        return _Type!!
    }

private var _Type: ImageVector? = null

