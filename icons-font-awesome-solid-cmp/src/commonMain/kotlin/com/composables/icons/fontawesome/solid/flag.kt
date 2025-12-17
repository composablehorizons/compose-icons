package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Flag: ImageVector
    get() {
        if (_Flag != null) return _Flag!!
        
        _Flag = ImageVector.Builder(
            name = "flag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(349.565f, 98.783f)
                curveTo(295.978f, 98.783f, 251.721f, 64f, 184.348f, 64f)
                curveToRelative(-24.955f, 0f, -47.309f, 4.384f, -68.045f, 12.013f)
                arcToRelative(55.947f, 55.947f, 0f, false, false, 3.586f, -23.562f)
                curveTo(118.117f, 24.015f, 94.806f, 1.206f, 66.338f, 0.048f)
                curveTo(34.345f, -1.254f, 8f, 24.296f, 8f, 56f)
                curveToRelative(0f, 19.026f, 9.497f, 35.825f, 24f, 45.945f)
                verticalLineTo(488f)
                curveToRelative(0f, 13.255f, 10.745f, 24f, 24f, 24f)
                horizontalLineToRelative(16f)
                curveToRelative(13.255f, 0f, 24f, -10.745f, 24f, -24f)
                verticalLineToRelative(-94.4f)
                curveToRelative(28.311f, -12.064f, 63.582f, -22.122f, 114.435f, -22.122f)
                curveToRelative(53.588f, 0f, 97.844f, 34.783f, 165.217f, 34.783f)
                curveToRelative(48.169f, 0f, 86.667f, -16.294f, 122.505f, -40.858f)
                curveTo(506.84f, 359.452f, 512f, 349.571f, 512f, 339.045f)
                verticalLineToRelative(-243.1f)
                curveToRelative(0f, -23.393f, -24.269f, -38.87f, -45.485f, -29.016f)
                curveToRelative(-34.338f, 15.948f, -76.454f, 31.854f, -116.95f, 31.854f)
                close()
            }
        }.build()
        
        return _Flag!!
    }

private var _Flag: ImageVector? = null

