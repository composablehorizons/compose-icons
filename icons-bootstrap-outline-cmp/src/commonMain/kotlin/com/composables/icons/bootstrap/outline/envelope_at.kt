package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.EnvelopeAt: ImageVector
    get() {
        if (_EnvelopeAt != null) return _EnvelopeAt!!
        
        _EnvelopeAt = ImageVector.Builder(
            name = "envelope-at",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(8.01f)
                arcTo(2f, 2f, 0f, false, false, 2f, 14f)
                horizontalLineToRelative(5.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, true, -0.966f, -0.741f)
                lineToRelative(5.64f, -3.471f)
                lineTo(8f, 9.583f)
                lineToRelative(7f, -4.2f)
                verticalLineTo(8.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                close()
                moveToRelative(3.708f, 6.208f)
                lineTo(1f, 11.105f)
                verticalLineTo(5.383f)
                close()
                moveTo(1f, 4.217f)
                verticalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(0.217f)
                lineToRelative(-7f, 4.2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.247f, 14.269f)
                curveToRelative(1.01f, 0f, 1.587f, -0.857f, 1.587f, -2.025f)
                verticalLineToRelative(-0.21f)
                curveTo(15.834f, 10.43f, 14.64f, 9f, 12.52f, 9f)
                horizontalLineToRelative(-0.035f)
                curveTo(10.42f, 9f, 9f, 10.36f, 9f, 12.432f)
                verticalLineToRelative(0.214f)
                curveTo(9f, 14.82f, 10.438f, 16f, 12.358f, 16f)
                horizontalLineToRelative(0.044f)
                curveToRelative(0.594f, 0f, 1.018f, -0.074f, 1.237f, -0.175f)
                verticalLineToRelative(-0.73f)
                curveToRelative(-0.245f, 0.11f, -0.673f, 0.18f, -1.18f, 0.18f)
                horizontalLineToRelative(-0.044f)
                curveToRelative(-1.334f, 0f, -2.571f, -0.788f, -2.571f, -2.655f)
                verticalLineToRelative(-0.157f)
                curveToRelative(0f, -1.657f, 1.058f, -2.724f, 2.64f, -2.724f)
                horizontalLineToRelative(0.04f)
                curveToRelative(1.535f, 0f, 2.484f, 1.05f, 2.484f, 2.326f)
                verticalLineToRelative(0.118f)
                curveToRelative(0f, 0.975f, -0.324f, 1.39f, -0.639f, 1.39f)
                curveToRelative(-0.232f, 0f, -0.41f, -0.148f, -0.41f, -0.42f)
                verticalLineToRelative(-2.19f)
                horizontalLineToRelative(-0.906f)
                verticalLineToRelative(0.569f)
                horizontalLineToRelative(-0.03f)
                curveToRelative(-0.084f, -0.298f, -0.368f, -0.63f, -0.954f, -0.63f)
                curveToRelative(-0.778f, 0f, -1.259f, 0.555f, -1.259f, 1.4f)
                verticalLineToRelative(0.528f)
                curveToRelative(0f, 0.892f, 0.49f, 1.434f, 1.26f, 1.434f)
                curveToRelative(0.471f, 0f, 0.896f, -0.227f, 1.014f, -0.643f)
                horizontalLineToRelative(0.043f)
                curveToRelative(0.118f, 0.42f, 0.617f, 0.648f, 1.12f, 0.648f)
                moveToRelative(-2.453f, -1.588f)
                verticalLineToRelative(-0.227f)
                curveToRelative(0f, -0.546f, 0.227f, -0.791f, 0.573f, -0.791f)
                curveToRelative(0.297f, 0f, 0.572f, 0.192f, 0.572f, 0.708f)
                verticalLineToRelative(0.367f)
                curveToRelative(0f, 0.573f, -0.253f, 0.744f, -0.564f, 0.744f)
                curveToRelative(-0.354f, 0f, -0.581f, -0.215f, -0.581f, -0.8f)
                close()
            }
        }.build()
        
        return _EnvelopeAt!!
    }

private var _EnvelopeAt: ImageVector? = null

