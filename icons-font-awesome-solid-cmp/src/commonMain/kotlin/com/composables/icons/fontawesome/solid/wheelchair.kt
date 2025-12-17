package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Wheelchair: ImageVector
    get() {
        if (_Wheelchair != null) return _Wheelchair!!
        
        _Wheelchair = ImageVector.Builder(
            name = "wheelchair",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(496.101f, 385.669f)
                lineToRelative(14.227f, 28.663f)
                curveToRelative(3.929f, 7.915f, 0.697f, 17.516f, -7.218f, 21.445f)
                lineToRelative(-65.465f, 32.886f)
                curveToRelative(-16.049f, 7.967f, -35.556f, 1.194f, -43.189f, -15.055f)
                lineTo(331.679f, 320f)
                horizontalLineTo(192f)
                curveToRelative(-15.925f, 0f, -29.426f, -11.71f, -31.679f, -27.475f)
                curveTo(126.433f, 55.308f, 128.38f, 70.044f, 128f, 64f)
                curveToRelative(0f, -36.358f, 30.318f, -65.635f, 67.052f, -63.929f)
                curveToRelative(33.271f, 1.545f, 60.048f, 28.905f, 60.925f, 62.201f)
                curveToRelative(0.868f, 32.933f, -23.152f, 60.423f, -54.608f, 65.039f)
                lineToRelative(4.67f, 32.69f)
                horizontalLineTo(336f)
                curveToRelative(8.837f, 0f, 16f, 7.163f, 16f, 16f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 8.837f, -7.163f, 16f, -16f, 16f)
                horizontalLineTo(215.182f)
                lineToRelative(4.572f, 32f)
                horizontalLineTo(352f)
                arcToRelative(32f, 32f, 0f, false, true, 28.962f, 18.392f)
                lineTo(438.477f, 396.8f)
                lineToRelative(36.178f, -18.349f)
                curveToRelative(7.915f, -3.929f, 17.517f, -0.697f, 21.446f, 7.218f)
                close()
                moveTo(311.358f, 352f)
                horizontalLineToRelative(-24.506f)
                curveToRelative(-7.788f, 54.204f, -54.528f, 96f, -110.852f, 96f)
                curveToRelative(-61.757f, 0f, -112f, -50.243f, -112f, -112f)
                curveToRelative(0f, -41.505f, 22.694f, -77.809f, 56.324f, -97.156f)
                curveToRelative(-3.712f, -25.965f, -6.844f, -47.86f, -9.488f, -66.333f)
                curveTo(45.956f, 198.464f, 0f, 261.963f, 0f, 336f)
                curveToRelative(0f, 97.047f, 78.953f, 176f, 176f, 176f)
                curveToRelative(71.87f, 0f, 133.806f, -43.308f, 161.11f, -105.192f)
                lineTo(311.358f, 352f)
                close()
            }
        }.build()
        
        return _Wheelchair!!
    }

private var _Wheelchair: ImageVector? = null

