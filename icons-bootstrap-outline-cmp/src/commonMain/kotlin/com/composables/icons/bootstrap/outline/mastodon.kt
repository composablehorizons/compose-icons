package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Mastodon: ImageVector
    get() {
        if (_Mastodon != null) return _Mastodon!!
        
        _Mastodon = ImageVector.Builder(
            name = "mastodon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.19f, 12.195f)
                curveToRelative(2.016f, -0.24f, 3.77f, -1.475f, 3.99f, -2.603f)
                curveToRelative(0.348f, -1.778f, 0.32f, -4.339f, 0.32f, -4.339f)
                curveToRelative(0f, -3.47f, -2.286f, -4.488f, -2.286f, -4.488f)
                curveTo(12.062f, 0.238f, 10.083f, 0.017f, 8.027f, 0f)
                horizontalLineToRelative(-0.05f)
                curveTo(5.92f, 0.017f, 3.942f, 0.238f, 2.79f, 0.765f)
                curveToRelative(0f, 0f, -2.285f, 1.017f, -2.285f, 4.488f)
                lineToRelative(-0.002f, 0.662f)
                curveToRelative(-0.004f, 0.64f, -0.007f, 1.35f, 0.011f, 2.091f)
                curveToRelative(0.083f, 3.394f, 0.626f, 6.74f, 3.78f, 7.57f)
                curveToRelative(1.454f, 0.383f, 2.703f, 0.463f, 3.709f, 0.408f)
                curveToRelative(1.823f, -0.1f, 2.847f, -0.647f, 2.847f, -0.647f)
                lineToRelative(-0.06f, -1.317f)
                reflectiveCurveToRelative(-1.303f, 0.41f, -2.767f, 0.36f)
                curveToRelative(-1.45f, -0.05f, -2.98f, -0.156f, -3.215f, -1.928f)
                arcToRelative(4f, 4f, 0f, false, true, -0.033f, -0.496f)
                reflectiveCurveToRelative(1.424f, 0.346f, 3.228f, 0.428f)
                curveToRelative(1.103f, 0.05f, 2.137f, -0.064f, 3.188f, -0.189f)
                close()
                moveToRelative(1.613f, -2.47f)
                horizontalLineTo(11.13f)
                verticalLineToRelative(-4.08f)
                curveToRelative(0f, -0.859f, -0.364f, -1.295f, -1.091f, -1.295f)
                curveToRelative(-0.804f, 0f, -1.207f, 0.517f, -1.207f, 1.541f)
                verticalLineToRelative(2.233f)
                horizontalLineTo(7.168f)
                verticalLineTo(5.89f)
                curveToRelative(0f, -1.024f, -0.403f, -1.541f, -1.207f, -1.541f)
                curveToRelative(-0.727f, 0f, -1.091f, 0.436f, -1.091f, 1.296f)
                verticalLineToRelative(4.079f)
                horizontalLineTo(3.197f)
                verticalLineTo(5.522f)
                quadToRelative(0f, -1.288f, 0.66f, -2.046f)
                curveToRelative(0.456f, -0.505f, 1.052f, -0.764f, 1.793f, -0.764f)
                curveToRelative(0.856f, 0f, 1.504f, 0.328f, 1.933f, 0.983f)
                lineTo(8f, 4.39f)
                lineToRelative(0.417f, -0.695f)
                curveToRelative(0.429f, -0.655f, 1.077f, -0.983f, 1.934f, -0.983f)
                curveToRelative(0.74f, 0f, 1.336f, 0.259f, 1.791f, 0.764f)
                quadToRelative(0.662f, 0.757f, 0.661f, 2.046f)
                close()
            }
        }.build()
        
        return _Mastodon!!
    }

private var _Mastodon: ImageVector? = null

