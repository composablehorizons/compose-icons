package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Rss: ImageVector
    get() {
        if (_Rss != null) return _Rss!!
        
        _Rss = ImageVector.Builder(
            name = "rss",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(128.081f, 415.959f)
                curveToRelative(0f, 35.369f, -28.672f, 64.041f, -64.041f, 64.041f)
                reflectiveCurveTo(0f, 451.328f, 0f, 415.959f)
                reflectiveCurveToRelative(28.672f, -64.041f, 64.041f, -64.041f)
                reflectiveCurveToRelative(64.04f, 28.673f, 64.04f, 64.041f)
                close()
                moveToRelative(175.66f, 47.25f)
                curveToRelative(-8.354f, -154.6f, -132.185f, -278.587f, -286.95f, -286.95f)
                curveTo(7.656f, 175.765f, 0f, 183.105f, 0f, 192.253f)
                verticalLineToRelative(48.069f)
                curveToRelative(0f, 8.415f, 6.49f, 15.472f, 14.887f, 16.018f)
                curveToRelative(111.832f, 7.284f, 201.473f, 96.702f, 208.772f, 208.772f)
                curveToRelative(0.547f, 8.397f, 7.604f, 14.887f, 16.018f, 14.887f)
                horizontalLineToRelative(48.069f)
                curveToRelative(9.149f, 0.001f, 16.489f, -7.655f, 15.995f, -16.79f)
                close()
                moveToRelative(144.249f, 0.288f)
                curveTo(439.596f, 229.677f, 251.465f, 40.445f, 16.503f, 32.01f)
                curveTo(7.473f, 31.686f, 0f, 38.981f, 0f, 48.016f)
                verticalLineToRelative(48.068f)
                curveToRelative(0f, 8.625f, 6.835f, 15.645f, 15.453f, 15.999f)
                curveToRelative(191.179f, 7.839f, 344.627f, 161.316f, 352.465f, 352.465f)
                curveToRelative(0.353f, 8.618f, 7.373f, 15.453f, 15.999f, 15.453f)
                horizontalLineToRelative(48.068f)
                curveToRelative(9.034f, -0.001f, 16.329f, -7.474f, 16.005f, -16.504f)
                close()
            }
        }.build()
        
        return _Rss!!
    }

private var _Rss: ImageVector? = null

