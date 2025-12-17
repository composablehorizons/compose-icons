package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Alphabet: ImageVector
    get() {
        if (_Alphabet != null) return _Alphabet!!
        
        _Alphabet = ImageVector.Builder(
            name = "alphabet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.204f, 11.078f)
                curveToRelative(0.767f, 0f, 1.201f, -0.356f, 1.406f, -0.737f)
                horizontalLineToRelative(0.059f)
                verticalLineTo(11f)
                horizontalLineToRelative(1.216f)
                verticalLineTo(7.519f)
                curveToRelative(0f, -1.314f, -0.947f, -1.783f, -2.11f, -1.783f)
                curveTo(1.355f, 5.736f, 0.75f, 6.42f, 0.69f, 7.27f)
                horizontalLineToRelative(1.216f)
                curveToRelative(0.064f, -0.323f, 0.313f, -0.552f, 0.84f, -0.552f)
                reflectiveCurveToRelative(0.864f, 0.249f, 0.864f, 0.771f)
                verticalLineToRelative(0.464f)
                horizontalLineTo(2.346f)
                curveTo(1.145f, 7.953f, 0.5f, 8.568f, 0.5f, 9.496f)
                curveToRelative(0f, 0.977f, 0.693f, 1.582f, 1.704f, 1.582f)
                moveToRelative(0.42f, -0.947f)
                curveToRelative(-0.44f, 0f, -0.845f, -0.235f, -0.845f, -0.718f)
                curveToRelative(0f, -0.395f, 0.269f, -0.684f, 0.84f, -0.684f)
                horizontalLineToRelative(0.991f)
                verticalLineToRelative(0.538f)
                curveToRelative(0f, 0.503f, -0.444f, 0.864f, -0.986f, 0.864f)
                moveToRelative(5.593f, 0.937f)
                curveToRelative(1.216f, 0f, 1.948f, -0.869f, 1.948f, -2.31f)
                verticalLineToRelative(-0.702f)
                curveToRelative(0f, -1.44f, -0.727f, -2.305f, -1.929f, -2.305f)
                curveToRelative(-0.742f, 0f, -1.328f, 0.347f, -1.499f, 0.889f)
                horizontalLineToRelative(-0.063f)
                verticalLineTo(3.983f)
                horizontalLineToRelative(-1.29f)
                verticalLineTo(11f)
                horizontalLineToRelative(1.27f)
                verticalLineToRelative(-0.791f)
                horizontalLineToRelative(0.064f)
                curveToRelative(0.21f, 0.532f, 0.776f, 0.86f, 1.499f, 0.86f)
                close()
                moveToRelative(-0.43f, -1.025f)
                curveToRelative(-0.66f, 0f, -1.113f, -0.518f, -1.113f, -1.28f)
                verticalLineTo(8.12f)
                curveToRelative(0f, -0.825f, 0.42f, -1.343f, 1.098f, -1.343f)
                curveToRelative(0.684f, 0f, 1.075f, 0.518f, 1.075f, 1.416f)
                verticalLineToRelative(0.45f)
                curveToRelative(0f, 0.888f, -0.386f, 1.401f, -1.06f, 1.401f)
                close()
                moveToRelative(2.834f, -1.328f)
                curveToRelative(0f, 1.47f, 0.87f, 2.378f, 2.305f, 2.378f)
                curveToRelative(1.416f, 0f, 2.139f, -0.777f, 2.158f, -1.763f)
                horizontalLineToRelative(-1.186f)
                curveToRelative(-0.06f, 0.425f, -0.313f, 0.732f, -0.933f, 0.732f)
                curveToRelative(-0.66f, 0f, -1.05f, -0.512f, -1.05f, -1.352f)
                verticalLineToRelative(-0.625f)
                curveToRelative(0f, -0.81f, 0.371f, -1.328f, 1.045f, -1.328f)
                curveToRelative(0.635f, 0f, 0.879f, 0.425f, 0.918f, 0.776f)
                horizontalLineToRelative(1.187f)
                curveToRelative(-0.02f, -0.986f, -0.787f, -1.806f, -2.14f, -1.806f)
                curveToRelative(-1.41f, 0f, -2.304f, 0.918f, -2.304f, 2.338f)
                close()
            }
        }.build()
        
        return _Alphabet!!
    }

private var _Alphabet: ImageVector? = null

