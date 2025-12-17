package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.HeartPulse: ImageVector
    get() {
        if (_HeartPulse != null) return _HeartPulse!!
        
        _HeartPulse = ImageVector.Builder(
            name = "heart-pulse",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.475f, 9f)
                curveTo(2.702f, 10.84f, 4.779f, 12.871f, 8f, 15f)
                curveToRelative(3.221f, -2.129f, 5.298f, -4.16f, 6.525f, -6f)
                horizontalLineTo(12f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.464f, -0.314f)
                lineToRelative(-1.457f, -3.642f)
                lineToRelative(-1.598f, 5.593f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.945f, 0.049f)
                lineTo(5.889f, 6.568f)
                lineToRelative(-1.473f, 2.21f)
                arcTo(0.5f, 0.5f, 0f, false, true, 4f, 9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0.88f, 8f)
                curveTo(-2.427f, 1.68f, 4.41f, -2f, 7.823f, 1.143f)
                quadToRelative(0.09f, 0.083f, 0.176f, 0.171f)
                arcToRelative(3f, 3f, 0f, false, true, 0.176f, -0.17f)
                curveTo(11.59f, -2f, 18.426f, 1.68f, 15.12f, 8f)
                horizontalLineToRelative(-2.783f)
                lineToRelative(-1.874f, -4.686f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.945f, 0.049f)
                lineTo(7.921f, 8.956f)
                lineTo(6.464f, 5.314f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.88f, -0.091f)
                lineTo(3.732f, 8f)
                close()
            }
        }.build()
        
        return _HeartPulse!!
    }

private var _HeartPulse: ImageVector? = null

