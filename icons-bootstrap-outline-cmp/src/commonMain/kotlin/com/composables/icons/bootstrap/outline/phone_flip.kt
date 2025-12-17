package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.PhoneFlip: ImageVector
    get() {
        if (_PhoneFlip != null) return _PhoneFlip!!
        
        _PhoneFlip = ImageVector.Builder(
            name = "phone-flip",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11f, 1f)
                horizontalLineTo(5f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(6f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(6f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(6f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                moveToRelative(1f, 13f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(5f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineToRelative(-2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -1f, 0f)
                verticalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(6f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineToRelative(-2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -1f, 0f)
                close()
                moveTo(1.713f, 7.954f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.419f, -0.908f)
                curveToRelative(-0.347f, 0.16f, -0.654f, 0.348f, -0.882f, 0.57f)
                curveTo(0.184f, 7.842f, 0f, 8.139f, 0f, 8.5f)
                curveToRelative(0f, 0.546f, 0.408f, 0.94f, 0.823f, 1.201f)
                curveToRelative(0.44f, 0.278f, 1.043f, 0.51f, 1.745f, 0.696f)
                curveTo(3.978f, 10.773f, 5.898f, 11f, 8f, 11f)
                quadToRelative(0.148f, 0f, 0.294f, -0.002f)
                lineToRelative(-1.148f, 1.148f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, 0.708f)
                lineToRelative(2f, -2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -0.708f)
                lineToRelative(-2f, -2f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.708f, 0.708f)
                lineToRelative(1.145f, 1.144f)
                lineTo(8f, 10f)
                curveToRelative(-2.04f, 0f, -3.87f, -0.221f, -5.174f, -0.569f)
                curveToRelative(-0.656f, -0.175f, -1.151f, -0.374f, -1.47f, -0.575f)
                curveTo(1.012f, 8.639f, 1f, 8.506f, 1f, 8.5f)
                curveToRelative(0f, -0.003f, 0f, -0.059f, 0.112f, -0.17f)
                curveToRelative(0.115f, -0.112f, 0.31f, -0.242f, 0.6f, -0.376f)
                close()
                moveToRelative(12.993f, -0.908f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.419f, 0.908f)
                curveToRelative(0.292f, 0.134f, 0.486f, 0.264f, 0.6f, 0.377f)
                curveToRelative(0.113f, 0.11f, 0.113f, 0.166f, 0.113f, 0.169f)
                reflectiveCurveToRelative(0f, 0.065f, -0.13f, 0.187f)
                curveToRelative(-0.132f, 0.122f, -0.352f, 0.26f, -0.677f, 0.4f)
                curveToRelative(-0.645f, 0.28f, -1.596f, 0.523f, -2.763f, 0.687f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.14f, 0.99f)
                curveToRelative(1.212f, -0.17f, 2.26f, -0.43f, 3.02f, -0.758f)
                curveToRelative(0.38f, -0.164f, 0.713f, -0.357f, 0.96f, -0.587f)
                curveToRelative(0.246f, -0.229f, 0.45f, -0.537f, 0.45f, -0.919f)
                curveToRelative(0f, -0.362f, -0.184f, -0.66f, -0.412f, -0.883f)
                reflectiveCurveToRelative(-0.535f, -0.411f, -0.882f, -0.571f)
                moveTo(7.5f, 2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                close()
            }
        }.build()
        
        return _PhoneFlip!!
    }

private var _PhoneFlip: ImageVector? = null

