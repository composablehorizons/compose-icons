package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Playstation: ImageVector
    get() {
        if (_Playstation != null) return _Playstation!!
        
        _Playstation = ImageVector.Builder(
            name = "playstation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15.858f, 11.451f)
                curveToRelative(-0.313f, 0.395f, -1.079f, 0.676f, -1.079f, 0.676f)
                lineToRelative(-5.696f, 2.046f)
                verticalLineToRelative(-1.509f)
                lineToRelative(4.192f, -1.493f)
                curveToRelative(0.476f, -0.17f, 0.549f, -0.412f, 0.162f, -0.538f)
                curveToRelative(-0.386f, -0.127f, -1.085f, -0.09f, -1.56f, 0.08f)
                lineToRelative(-2.794f, 0.984f)
                verticalLineToRelative(-1.566f)
                lineToRelative(0.161f, -0.054f)
                reflectiveCurveToRelative(0.807f, -0.286f, 1.942f, -0.412f)
                curveToRelative(1.135f, -0.125f, 2.525f, 0.017f, 3.616f, 0.43f)
                curveToRelative(1.23f, 0.39f, 1.368f, 0.962f, 1.056f, 1.356f)
                moveTo(9.625f, 8.883f)
                verticalLineToRelative(-3.86f)
                curveToRelative(0f, -0.453f, -0.083f, -0.87f, -0.508f, -0.988f)
                curveToRelative(-0.326f, -0.105f, -0.528f, 0.198f, -0.528f, 0.65f)
                verticalLineToRelative(9.664f)
                lineToRelative(-2.606f, -0.827f)
                verticalLineTo(2f)
                curveToRelative(1.108f, 0.206f, 2.722f, 0.692f, 3.59f, 0.985f)
                curveToRelative(2.207f, 0.757f, 2.955f, 1.7f, 2.955f, 3.825f)
                curveToRelative(0f, 2.071f, -1.278f, 2.856f, -2.903f, 2.072f)
                close()
                moveToRelative(-8.424f, 3.625f)
                curveTo(-0.061f, 12.15f, -0.271f, 11.41f, 0.304f, 10.984f)
                curveToRelative(0.532f, -0.394f, 1.436f, -0.69f, 1.436f, -0.69f)
                lineToRelative(3.737f, -1.33f)
                verticalLineToRelative(1.515f)
                lineToRelative(-2.69f, 0.963f)
                curveToRelative(-0.474f, 0.17f, -0.547f, 0.411f, -0.161f, 0.538f)
                curveToRelative(0.386f, 0.126f, 1.085f, 0.09f, 1.56f, -0.08f)
                lineToRelative(1.29f, -0.469f)
                verticalLineToRelative(1.356f)
                lineToRelative(-0.257f, 0.043f)
                arcToRelative(8.45f, 8.45f, 0f, false, true, -4.018f, -0.323f)
                close()
            }
        }.build()
        
        return _Playstation!!
    }

private var _Playstation: ImageVector? = null

