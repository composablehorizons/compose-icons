package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.PinAngle: ImageVector
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
            }
        }.build()
        
        return _PinAngle!!
    }

private var _PinAngle: ImageVector? = null

