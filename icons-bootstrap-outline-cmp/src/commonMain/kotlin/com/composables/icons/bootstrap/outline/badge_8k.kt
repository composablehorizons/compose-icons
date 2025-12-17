package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Badge8k: ImageVector
    get() {
        if (_Badge8k != null) return _Badge8k!!
        
        _Badge8k = ImageVector.Builder(
            name = "badge-8k",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.837f, 11.114f)
                curveToRelative(1.406f, 0f, 2.333f, -0.725f, 2.333f, -1.766f)
                curveToRelative(0f, -0.945f, -0.712f, -1.38f, -1.256f, -1.49f)
                verticalLineToRelative(-0.053f)
                curveToRelative(0.496f, -0.15f, 1.02f, -0.55f, 1.02f, -1.331f)
                curveToRelative(0f, -0.914f, -0.831f, -1.587f, -2.084f, -1.587f)
                curveToRelative(-1.257f, 0f, -2.087f, 0.673f, -2.087f, 1.587f)
                curveToRelative(0f, 0.773f, 0.51f, 1.177f, 1.02f, 1.331f)
                verticalLineToRelative(0.053f)
                curveToRelative(-0.546f, 0.11f, -1.258f, 0.54f, -1.258f, 1.494f)
                curveToRelative(0f, 1.042f, 0.906f, 1.762f, 2.312f, 1.762f)
                moveToRelative(0.013f, -3.643f)
                curveToRelative(-0.545f, 0f, -0.95f, -0.356f, -0.95f, -0.866f)
                reflectiveCurveToRelative(0.405f, -0.852f, 0.95f, -0.852f)
                reflectiveCurveToRelative(0.945f, 0.343f, 0.945f, 0.852f)
                curveToRelative(0f, 0.51f, -0.4f, 0.866f, -0.945f, 0.866f)
                moveToRelative(0f, 2.786f)
                curveToRelative(-0.65f, 0f, -1.142f, -0.395f, -1.142f, -0.984f)
                reflectiveCurveTo(4.2f, 8.28f, 4.85f, 8.28f)
                curveToRelative(0.646f, 0f, 1.143f, 0.404f, 1.143f, 0.993f)
                reflectiveCurveToRelative(-0.497f, 0.984f, -1.143f, 0.984f)
                moveTo(13.408f, 5f)
                horizontalLineToRelative(-1.306f)
                lineTo(9.835f, 7.685f)
                horizontalLineToRelative(-0.057f)
                verticalLineTo(5f)
                horizontalLineTo(8.59f)
                verticalLineToRelative(5.998f)
                horizontalLineToRelative(1.187f)
                verticalLineTo(9.075f)
                lineToRelative(0.615f, -0.699f)
                lineToRelative(1.679f, 2.623f)
                horizontalLineTo(13.5f)
                lineToRelative(-2.232f, -3.414f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 3f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
                moveTo(2f, 2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                close()
            }
        }.build()
        
        return _Badge8k!!
    }

private var _Badge8k: ImageVector? = null

