package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Badge8k: ImageVector
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
                moveTo(3.9f, 6.605f)
                curveToRelative(0f, 0.51f, 0.405f, 0.866f, 0.95f, 0.866f)
                reflectiveCurveToRelative(0.945f, -0.356f, 0.945f, -0.866f)
                reflectiveCurveToRelative(-0.4f, -0.852f, -0.945f, -0.852f)
                reflectiveCurveToRelative(-0.95f, 0.343f, -0.95f, 0.852f)
                moveToRelative(-0.192f, 2.668f)
                curveToRelative(0f, 0.589f, 0.492f, 0.984f, 1.142f, 0.984f)
                curveToRelative(0.646f, 0f, 1.143f, -0.395f, 1.143f, -0.984f)
                reflectiveCurveTo(5.496f, 8.28f, 4.85f, 8.28f)
                curveToRelative(-0.65f, 0f, -1.142f, 0.404f, -1.142f, 0.993f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                close()
                moveToRelative(5.17f, 7.348f)
                curveToRelative(0f, 1.041f, -0.927f, 1.766f, -2.333f, 1.766f)
                reflectiveCurveToRelative(-2.312f, -0.72f, -2.312f, -1.762f)
                curveToRelative(0f, -0.954f, 0.712f, -1.384f, 1.257f, -1.494f)
                verticalLineToRelative(-0.053f)
                curveToRelative(-0.51f, -0.154f, -1.02f, -0.558f, -1.02f, -1.331f)
                curveToRelative(0f, -0.914f, 0.831f, -1.587f, 2.088f, -1.587f)
                curveToRelative(1.253f, 0f, 2.083f, 0.673f, 2.083f, 1.587f)
                curveToRelative(0f, 0.782f, -0.523f, 1.182f, -1.02f, 1.331f)
                verticalLineToRelative(0.053f)
                curveToRelative(0.545f, 0.11f, 1.257f, 0.545f, 1.257f, 1.49f)
                moveTo(12.102f, 5f)
                horizontalLineToRelative(1.306f)
                lineToRelative(-2.14f, 2.584f)
                lineToRelative(2.232f, 3.415f)
                horizontalLineToRelative(-1.428f)
                lineToRelative(-1.679f, -2.624f)
                lineToRelative(-0.615f, 0.699f)
                verticalLineToRelative(1.925f)
                horizontalLineTo(8.59f)
                verticalLineTo(5f)
                horizontalLineToRelative(1.187f)
                verticalLineToRelative(2.685f)
                horizontalLineToRelative(0.057f)
                close()
            }
        }.build()
        
        return _Badge8k!!
    }

private var _Badge8k: ImageVector? = null

