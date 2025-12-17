package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Balloon: ImageVector
    get() {
        if (_Balloon != null) return _Balloon!!
        
        _Balloon = ImageVector.Builder(
            name = "balloon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 9.984f)
                curveTo(10.403f, 9.506f, 12f, 7.48f, 12f, 5f)
                arcToRelative(4f, 4f, 0f, false, false, -8f, 0f)
                curveToRelative(0f, 2.48f, 1.597f, 4.506f, 4f, 4.984f)
                moveTo(13f, 5f)
                curveToRelative(0f, 2.837f, -1.789f, 5.227f, -4.52f, 5.901f)
                lineToRelative(0.244f, 0.487f)
                arcToRelative(0.25f, 0.25f, 0f, true, true, -0.448f, 0.224f)
                lineToRelative(-0.008f, -0.017f)
                curveToRelative(0.008f, 0.11f, 0.02f, 0.202f, 0.037f, 0.29f)
                curveToRelative(0.054f, 0.27f, 0.161f, 0.488f, 0.419f, 1.003f)
                curveToRelative(0.288f, 0.578f, 0.235f, 1.15f, 0.076f, 1.629f)
                curveToRelative(-0.157f, 0.469f, -0.422f, 0.867f, -0.588f, 1.115f)
                lineToRelative(-0.004f, 0.007f)
                arcToRelative(0.25f, 0.25f, 0f, true, true, -0.416f, -0.278f)
                curveToRelative(0.168f, -0.252f, 0.4f, -0.6f, 0.533f, -1.003f)
                curveToRelative(0.133f, -0.396f, 0.163f, -0.824f, -0.049f, -1.246f)
                lineToRelative(-0.013f, -0.028f)
                curveToRelative(-0.24f, -0.48f, -0.38f, -0.758f, -0.448f, -1.102f)
                arcToRelative(3f, 3f, 0f, false, true, -0.052f, -0.45f)
                lineToRelative(-0.04f, 0.08f)
                arcToRelative(0.25f, 0.25f, 0f, true, true, -0.447f, -0.224f)
                lineToRelative(0.244f, -0.487f)
                curveTo(4.789f, 10.227f, 3f, 7.837f, 3f, 5f)
                arcToRelative(5f, 5f, 0f, false, true, 10f, 0f)
                moveToRelative(-6.938f, -0.495f)
                arcToRelative(2f, 2f, 0f, false, true, 1.443f, -1.443f)
                curveTo(7.773f, 2.994f, 8f, 2.776f, 8f, 2.5f)
                reflectiveCurveToRelative(-0.226f, -0.504f, -0.498f, -0.459f)
                arcToRelative(3f, 3f, 0f, false, false, -2.46f, 2.461f)
                curveToRelative(-0.046f, 0.272f, 0.182f, 0.498f, 0.458f, 0.498f)
                reflectiveCurveToRelative(0.494f, -0.227f, 0.562f, -0.495f)
            }
        }.build()
        
        return _Balloon!!
    }

private var _Balloon: ImageVector? = null

