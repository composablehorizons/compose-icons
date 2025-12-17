package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.FaceMask: ImageVector
    get() {
        if (_FaceMask != null) return _FaceMask!!
        
        _FaceMask = ImageVector.Builder(
            name = "face-mask",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.825f, 4.196f)
                lineToRelative(5f, 1.43f)
                arcToRelative(3f, 3f, 0f, false, true, 2.175f, 2.884f)
                verticalLineToRelative(0.065f)
                curveToRelative(1.7f, 0.33f, 3f, 1.72f, 3f, 3.425f)
                reflectiveCurveToRelative(-1.3f, 3.095f, -3f, 3.425f)
                verticalLineToRelative(0.066f)
                arcToRelative(3f, 3f, 0f, false, true, -2.175f, 2.885f)
                lineToRelative(-5f, 1.428f)
                arcToRelative(3f, 3f, 0f, false, true, -1.65f, 0f)
                lineToRelative(-5f, -1.429f)
                arcToRelative(3f, 3f, 0f, false, true, -2.17f, -2.702f)
                lineToRelative(-0.005f, -0.247f)
                curveToRelative(-1.7f, -0.33f, -3f, -1.72f, -3f, -3.426f)
                curveToRelative(0f, -1.705f, 1.3f, -3.096f, 3f, -3.426f)
                verticalLineToRelative(-0.064f)
                arcToRelative(3f, 3f, 0f, false, true, 2.175f, -2.884f)
                lineToRelative(5f, -1.428f)
                arcToRelative(3f, 3f, 0f, false, true, 1.65f, 0f)
                moveToRelative(2.175f, 8.802f)
                horizontalLineToRelative(-6f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                horizontalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                moveToRelative(-11f, -2.349f)
                curveToRelative(-0.6f, 0.248f, -1f, 0.77f, -1f, 1.349f)
                curveToRelative(0f, 0.578f, 0.4f, 1.101f, 1f, 1.349f)
                close()
                moveToRelative(16.001f, 0f)
                verticalLineToRelative(2.697f)
                curveToRelative(0.599f, -0.248f, 0.999f, -0.77f, 0.999f, -1.348f)
                reflectiveCurveToRelative(-0.4f, -1.1f, -0.999f, -1.348f)
                moveToRelative(-5.001f, -1.652f)
                horizontalLineToRelative(-6f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, 2f)
                horizontalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
            }
        }.build()
        
        return _FaceMask!!
    }

private var _FaceMask: ImageVector? = null

