package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Spotify: ImageVector
    get() {
        if (_Spotify != null) return _Spotify!!
        
        _Spotify = ImageVector.Builder(
            name = "spotify",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 0f)
                arcToRelative(8f, 8f, 0f, true, false, 0f, 16f)
                arcTo(8f, 8f, 0f, false, false, 8f, 0f)
                moveToRelative(3.669f, 11.538f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.686f, 0.165f)
                curveToRelative(-1.879f, -1.147f, -4.243f, -1.407f, -7.028f, -0.77f)
                arcToRelative(0.499f, 0.499f, 0f, false, true, -0.222f, -0.973f)
                curveToRelative(3.048f, -0.696f, 5.662f, -0.397f, 7.77f, 0.892f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.166f, 0.686f)
                moveToRelative(0.979f, -2.178f)
                arcToRelative(0.624f, 0.624f, 0f, false, true, -0.858f, 0.205f)
                curveToRelative(-2.15f, -1.321f, -5.428f, -1.704f, -7.972f, -0.932f)
                arcToRelative(0.625f, 0.625f, 0f, false, true, -0.362f, -1.194f)
                curveToRelative(2.905f, -0.881f, 6.517f, -0.454f, 8.986f, 1.063f)
                arcToRelative(0.624f, 0.624f, 0f, false, true, 0.206f, 0.858f)
                moveToRelative(0.084f, -2.268f)
                curveTo(10.154f, 5.56f, 5.9f, 5.419f, 3.438f, 6.166f)
                arcToRelative(0.748f, 0.748f, 0f, true, true, -0.434f, -1.432f)
                curveToRelative(2.825f, -0.857f, 7.523f, -0.692f, 10.492f, 1.07f)
                arcToRelative(0.747f, 0.747f, 0f, true, true, -0.764f, 1.288f)
            }
        }.build()
        
        return _Spotify!!
    }

private var _Spotify: ImageVector? = null

