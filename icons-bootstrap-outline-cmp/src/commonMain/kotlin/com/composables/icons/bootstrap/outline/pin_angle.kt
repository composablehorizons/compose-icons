package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.PinAngle: ImageVector
    get() {
        if (_PinAngle != null) return _PinAngle!!
        
        _PinAngle = ImageVector.Builder(
            name = "pin-angle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.828f, 0.722f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.354f, 0.146f)
                lineToRelative(4.95f, 4.95f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 0.707f)
                curveToRelative(-0.48f, 0.48f, -1.072f, 0.588f, -1.503f, 0.588f)
                curveToRelative(-0.177f, 0f, -0.335f, -0.018f, -0.46f, -0.039f)
                lineToRelative(-3.134f, 3.134f)
                arcToRelative(6f, 6f, 0f, false, true, 0.16f, 1.013f)
                curveToRelative(0.046f, 0.702f, -0.032f, 1.687f, -0.72f, 2.375f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.707f, 0f)
                lineToRelative(-2.829f, -2.828f)
                lineToRelative(-3.182f, 3.182f)
                curveToRelative(-0.195f, 0.195f, -1.219f, 0.902f, -1.414f, 0.707f)
                reflectiveCurveToRelative(0.512f, -1.22f, 0.707f, -1.414f)
                lineToRelative(3.182f, -3.182f)
                lineToRelative(-2.828f, -2.829f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -0.707f)
                curveToRelative(0.688f, -0.688f, 1.673f, -0.767f, 2.375f, -0.72f)
                arcToRelative(6f, 6f, 0f, false, true, 1.013f, 0.16f)
                lineToRelative(3.134f, -3.133f)
                arcToRelative(3f, 3f, 0f, false, true, -0.04f, -0.461f)
                curveToRelative(0f, -0.43f, 0.108f, -1.022f, 0.589f, -1.503f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.353f, -0.146f)
                moveToRelative(0.122f, 2.112f)
                verticalLineToRelative(-0.002f)
                close()
                moveToRelative(0f, -0.002f)
                verticalLineToRelative(0.002f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.122f, 0.51f)
                lineTo(6.293f, 6.878f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.511f, 0.12f)
                horizontalLineTo(5.78f)
                lineToRelative(-0.014f, -0.004f)
                arcToRelative(5f, 5f, 0f, false, false, -0.288f, -0.076f)
                arcToRelative(5f, 5f, 0f, false, false, -0.765f, -0.116f)
                curveToRelative(-0.422f, -0.028f, -0.836f, 0.008f, -1.175f, 0.15f)
                lineToRelative(5.51f, 5.509f)
                curveToRelative(0.141f, -0.34f, 0.177f, -0.753f, 0.149f, -1.175f)
                arcToRelative(5f, 5f, 0f, false, false, -0.192f, -1.054f)
                lineToRelative(-0.004f, -0.013f)
                verticalLineToRelative(-0.001f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.12f, -0.512f)
                lineToRelative(3.536f, -3.535f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.532f, -0.115f)
                lineToRelative(0.096f, 0.022f)
                curveToRelative(0.087f, 0.017f, 0.208f, 0.034f, 0.344f, 0.034f)
                quadToRelative(0.172f, 0.002f, 0.343f, -0.04f)
                lineTo(9.927f, 2.028f)
                quadToRelative(-0.042f, 0.172f, -0.04f, 0.343f)
                arcToRelative(1.8f, 1.8f, 0f, false, false, 0.062f, 0.46f)
                close()
            }
        }.build()
        
        return _PinAngle!!
    }

private var _PinAngle: ImageVector? = null

