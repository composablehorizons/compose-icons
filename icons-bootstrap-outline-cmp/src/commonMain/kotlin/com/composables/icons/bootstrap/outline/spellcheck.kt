package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Spellcheck: ImageVector
    get() {
        if (_Spellcheck != null) return _Spellcheck!!
        
        _Spellcheck = ImageVector.Builder(
            name = "spellcheck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.217f, 11.068f)
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
                moveToRelative(-5.583f, 1.035f)
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
                moveToRelative(8.897f, 0.567f)
                curveToRelative(-0.577f, -0.4f, -0.9f, -1.088f, -0.9f, -1.983f)
                verticalLineToRelative(-0.65f)
                curveToRelative(0f, -1.42f, 0.894f, -2.338f, 2.305f, -2.338f)
                curveToRelative(1.352f, 0f, 2.119f, 0.82f, 2.139f, 1.806f)
                horizontalLineToRelative(-1.187f)
                curveToRelative(-0.04f, -0.351f, -0.283f, -0.776f, -0.918f, -0.776f)
                curveToRelative(-0.674f, 0f, -1.045f, 0.517f, -1.045f, 1.328f)
                verticalLineToRelative(0.625f)
                curveToRelative(0f, 0.468f, 0.121f, 0.834f, 0.343f, 1.067f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.469f, 9.414f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.117f, 1.055f)
                lineToRelative(-4f, 5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.116f, 0.061f)
                lineToRelative(-2.5f, -2.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.06f, -1.06f)
                lineToRelative(1.908f, 1.907f)
                lineToRelative(3.476f, -4.346f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.055f, -0.117f)
            }
        }.build()
        
        return _Spellcheck!!
    }

private var _Spellcheck: ImageVector? = null

