package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Duffle: ImageVector
    get() {
        if (_Duffle != null) return _Duffle!!
        
        _Duffle = ImageVector.Builder(
            name = "duffle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.007f, 4.097f)
                quadToRelative(0.011f, -0.146f, 0.027f, -0.298f)
                curveToRelative(0.05f, -0.464f, 0.141f, -0.979f, 0.313f, -1.45f)
                curveToRelative(0.169f, -0.465f, 0.432f, -0.933f, 0.853f, -1.249f)
                curveToRelative(1.115f, -0.836f, 2.485f, -0.836f, 3.6f, 0f)
                curveToRelative(0.42f, 0.316f, 0.684f, 0.784f, 0.853f, 1.25f)
                curveToRelative(0.171f, 0.47f, 0.263f, 0.985f, 0.313f, 1.449f)
                quadToRelative(0.016f, 0.15f, 0.027f, 0.298f)
                curveToRelative(1.401f, 0.194f, 2.65f, 0.531f, 3.525f, 1.012f)
                curveToRelative(2.126f, 1.169f, 1.446f, 6.095f, 1.089f, 8.018f)
                arcToRelative(0.954f, 0.954f, 0f, false, true, -0.95f, 0.772f)
                horizontalLineTo(1.343f)
                arcToRelative(0.954f, 0.954f, 0f, false, true, -0.95f, -0.772f)
                curveToRelative(-0.357f, -1.923f, -1.037f, -6.85f, 1.09f, -8.018f)
                curveToRelative(0.873f, -0.48f, 2.123f, -0.818f, 3.524f, -1.012f)
                moveTo(4.05f, 5.633f)
                arcToRelative(22f, 22f, 0f, false, false, -1.565f, 0.352f)
                lineToRelative(-0.091f, 0.026f)
                lineToRelative(-0.034f, 0.01f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.282f, 0.959f)
                lineToRelative(0.005f, -0.002f)
                lineToRelative(0.02f, -0.005f)
                lineToRelative(0.08f, -0.023f)
                arcToRelative(21f, 21f, 0f, false, true, 1.486f, -0.334f)
                arcTo(21f, 21f, 0f, false, true, 8f, 6.25f)
                curveToRelative(1.439f, 0f, 2.781f, 0.183f, 3.767f, 0.367f)
                arcToRelative(21f, 21f, 0f, false, true, 1.567f, 0.356f)
                lineToRelative(0.02f, 0.005f)
                lineToRelative(0.004f, 0.001f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.283f, -0.959f)
                horizontalLineToRelative(-0.003f)
                lineToRelative(-0.006f, -0.002f)
                lineToRelative(-0.025f, -0.007f)
                arcToRelative(15f, 15f, 0f, false, false, -0.43f, -0.113f)
                arcToRelative(22f, 22f, 0f, false, false, -1.226f, -0.265f)
                arcTo(22f, 22f, 0f, false, false, 8f, 5.25f)
                curveToRelative(-1.518f, 0f, -2.926f, 0.192f, -3.95f, 0.383f)
                moveTo(6.8f, 1.9f)
                curveToRelative(-0.203f, 0.153f, -0.377f, 0.42f, -0.513f, 0.791f)
                arcToRelative(5.3f, 5.3f, 0f, false, false, -0.265f, 1.292f)
                arcToRelative(35f, 35f, 0f, false, true, 1.374f, -0.076f)
                curveToRelative(0.866f, -0.022f, 1.742f, 0.003f, 2.584f, 0.076f)
                arcToRelative(5.3f, 5.3f, 0f, false, false, -0.266f, -1.292f)
                curveToRelative(-0.135f, -0.372f, -0.309f, -0.638f, -0.513f, -0.791f)
                curveToRelative(-0.76f, -0.57f, -1.64f, -0.57f, -2.4f, 0f)
                close()
            }
        }.build()
        
        return _Duffle!!
    }

private var _Duffle: ImageVector? = null

