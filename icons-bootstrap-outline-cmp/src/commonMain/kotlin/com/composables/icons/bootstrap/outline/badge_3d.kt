package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Badge3d: ImageVector
    get() {
        if (_Badge3d != null) return _Badge3d!!
        
        _Badge3d = ImageVector.Builder(
            name = "badge-3d",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.52f, 8.368f)
                horizontalLineToRelative(0.664f)
                curveToRelative(0.646f, 0f, 1.055f, 0.378f, 1.06f, 0.9f)
                curveToRelative(0.008f, 0.537f, -0.427f, 0.919f, -1.086f, 0.919f)
                curveToRelative(-0.598f, -0.004f, -1.037f, -0.325f, -1.068f, -0.756f)
                horizontalLineTo(3f)
                curveToRelative(0.03f, 0.914f, 0.791f, 1.688f, 2.153f, 1.688f)
                curveToRelative(1.24f, 0f, 2.285f, -0.66f, 2.272f, -1.798f)
                curveToRelative(-0.013f, -0.953f, -0.747f, -1.38f, -1.292f, -1.432f)
                verticalLineToRelative(-0.062f)
                curveToRelative(0.44f, -0.07f, 1.125f, -0.527f, 1.108f, -1.375f)
                curveToRelative(-0.013f, -0.906f, -0.8f, -1.57f, -2.053f, -1.565f)
                curveToRelative(-1.31f, 0.005f, -2.043f, 0.734f, -2.074f, 1.67f)
                horizontalLineToRelative(1.103f)
                curveToRelative(0.022f, -0.391f, 0.383f, -0.751f, 0.936f, -0.751f)
                curveToRelative(0.532f, 0f, 0.928f, 0.33f, 0.928f, 0.813f)
                curveToRelative(0.004f, 0.479f, -0.383f, 0.835f, -0.928f, 0.835f)
                horizontalLineToRelative(-0.632f)
                verticalLineToRelative(0.914f)
                close()
                moveToRelative(3.606f, -3.367f)
                verticalLineTo(11f)
                horizontalLineToRelative(2.189f)
                curveTo(12.125f, 11f, 13f, 9.893f, 13f, 7.985f)
                curveToRelative(0f, -1.894f, -0.861f, -2.984f, -2.685f, -2.984f)
                close()
                moveToRelative(1.187f, 0.967f)
                horizontalLineToRelative(0.844f)
                curveToRelative(1.112f, 0f, 1.621f, 0.686f, 1.621f, 2.04f)
                curveToRelative(0f, 1.353f, -0.505f, 2.02f, -1.621f, 2.02f)
                horizontalLineToRelative(-0.844f)
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
        
        return _Badge3d!!
    }

private var _Badge3d: ImageVector? = null

