package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.NintendoSwitch: ImageVector
    get() {
        if (_NintendoSwitch != null) return _NintendoSwitch!!
        
        _NintendoSwitch = ImageVector.Builder(
            name = "nintendo-switch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.34f, 8.005f)
                curveToRelative(0f, -4.38f, 0.01f, -7.972f, 0.023f, -7.982f)
                curveTo(9.373f, 0.01f, 10.036f, 0f, 10.831f, 0f)
                curveToRelative(1.153f, 0f, 1.51f, 0.01f, 1.743f, 0.05f)
                curveToRelative(1.73f, 0.298f, 3.045f, 1.6f, 3.373f, 3.326f)
                curveToRelative(0.046f, 0.242f, 0.053f, 0.809f, 0.053f, 4.61f)
                curveToRelative(0f, 4.06f, 0.005f, 4.537f, -0.123f, 4.976f)
                curveToRelative(-0.022f, 0.076f, -0.048f, 0.15f, -0.08f, 0.242f)
                arcToRelative(4.14f, 4.14f, 0f, false, true, -3.426f, 2.767f)
                curveToRelative(-0.317f, 0.033f, -2.889f, 0.046f, -2.978f, 0.013f)
                curveToRelative(-0.05f, -0.02f, -0.053f, -0.752f, -0.053f, -7.979f)
                moveToRelative(4.675f, 0.269f)
                arcToRelative(1.62f, 1.62f, 0f, false, false, -1.113f, -1.034f)
                arcToRelative(1.61f, 1.61f, 0f, false, false, -1.938f, 1.073f)
                arcToRelative(1.9f, 1.9f, 0f, false, false, -0.014f, 0.935f)
                arcToRelative(1.63f, 1.63f, 0f, false, false, 1.952f, 1.107f)
                curveToRelative(0.51f, -0.136f, 0.908f, -0.504f, 1.11f, -1.028f)
                curveToRelative(0.11f, -0.285f, 0.113f, -0.742f, 0.003f, -1.053f)
                moveTo(3.71f, 3.317f)
                curveToRelative(-0.208f, 0.04f, -0.526f, 0.199f, -0.695f, 0.348f)
                curveToRelative(-0.348f, 0.301f, -0.52f, 0.729f, -0.494f, 1.232f)
                curveToRelative(0.013f, 0.262f, 0.03f, 0.332f, 0.136f, 0.544f)
                curveToRelative(0.155f, 0.321f, 0.39f, 0.556f, 0.712f, 0.715f)
                curveToRelative(0.222f, 0.11f, 0.278f, 0.123f, 0.567f, 0.133f)
                curveToRelative(0.261f, 0.01f, 0.354f, 0f, 0.53f, -0.06f)
                curveToRelative(0.719f, -0.242f, 1.153f, -0.94f, 1.03f, -1.656f)
                curveToRelative(-0.142f, -0.852f, -0.95f, -1.422f, -1.786f, -1.256f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.425f, 0.053f)
                arcToRelative(4.14f, 4.14f, 0f, false, false, -3.28f, 3.015f)
                curveTo(0f, 3.628f, -0.01f, 3.956f, 0.005f, 8.3f)
                curveToRelative(0.01f, 3.99f, 0.014f, 4.082f, 0.08f, 4.39f)
                curveToRelative(0.368f, 1.66f, 1.548f, 2.844f, 3.224f, 3.235f)
                curveToRelative(0.22f, 0.05f, 0.497f, 0.06f, 2.29f, 0.07f)
                curveToRelative(1.856f, 0.012f, 2.048f, 0.009f, 2.097f, -0.04f)
                curveToRelative(0.05f, -0.05f, 0.053f, -0.69f, 0.053f, -7.94f)
                curveToRelative(0f, -5.374f, -0.01f, -7.906f, -0.033f, -7.952f)
                curveToRelative(-0.033f, -0.06f, -0.09f, -0.063f, -2.03f, -0.06f)
                curveToRelative(-1.578f, 0.004f, -2.052f, 0.014f, -2.26f, 0.05f)
                close()
                moveToRelative(3f, 14.665f)
                lineToRelative(-1.35f, -0.016f)
                curveToRelative(-1.242f, -0.013f, -1.375f, -0.02f, -1.623f, -0.083f)
                arcToRelative(2.81f, 2.81f, 0f, false, true, -2.08f, -2.167f)
                curveToRelative(-0.074f, -0.335f, -0.074f, -8.579f, -0.004f, -8.907f)
                arcToRelative(2.85f, 2.85f, 0f, false, true, 1.716f, -2.05f)
                curveToRelative(0.438f, -0.176f, 0.64f, -0.196f, 2.058f, -0.2f)
                lineToRelative(1.282f, -0.003f)
                verticalLineToRelative(13.426f)
                close()
            }
        }.build()
        
        return _NintendoSwitch!!
    }

private var _NintendoSwitch: ImageVector? = null

