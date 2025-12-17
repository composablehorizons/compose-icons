package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Cog: ImageVector
    get() {
        if (_Cog != null) return _Cog!!
        
        _Cog = ImageVector.Builder(
            name = "cog",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.024f, 9.25f)
                curveToRelative(0.47f, 0f, 0.827f, -0.433f, 0.637f, -0.863f)
                arcToRelative(4f, 4f, 0f, false, false, -4.094f, -2.364f)
                curveToRelative(-0.468f, 0.05f, -0.665f, 0.576f, -0.43f, 0.984f)
                lineToRelative(1.08f, 1.868f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.649f, 0.375f)
                horizontalLineToRelative(2.158f)
                close()
                moveTo(7.84f, 7.758f)
                curveToRelative(-0.236f, -0.408f, -0.79f, -0.5f, -1.068f, -0.12f)
                arcTo(3.982f, 3.982f, 0f, false, false, 6f, 10f)
                curveToRelative(0f, 0.884f, 0.287f, 1.7f, 0.772f, 2.363f)
                curveToRelative(0.278f, 0.38f, 0.832f, 0.287f, 1.068f, -0.12f)
                lineToRelative(1.078f, -1.868f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -0.75f)
                lineTo(7.839f, 7.758f)
                close()
                moveTo(9.138f, 12.993f)
                curveToRelative(-0.235f, 0.408f, -0.039f, 0.934f, 0.43f, 0.984f)
                arcToRelative(4f, 4f, 0f, false, false, 4.094f, -2.364f)
                curveToRelative(0.19f, -0.43f, -0.168f, -0.863f, -0.638f, -0.863f)
                horizontalLineToRelative(-2.158f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.65f, 0.375f)
                lineToRelative(-1.078f, 1.868f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.13f, 4.347f)
                lineToRelative(0.644f, -1.117f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.299f, -0.75f)
                lineToRelative(-0.644f, 1.116f)
                arcToRelative(6.954f, 6.954f, 0f, false, false, -2.081f, -0.556f)
                verticalLineTo(1.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(1.29f)
                arcToRelative(6.954f, 6.954f, 0f, false, false, -2.081f, 0.556f)
                lineTo(6.525f, 2.48f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.3f, 0.75f)
                lineToRelative(0.645f, 1.117f)
                arcTo(7.04f, 7.04f, 0f, false, false, 4.347f, 5.87f)
                lineTo(3.23f, 5.225f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -0.75f, 1.3f)
                lineToRelative(1.116f, 0.644f)
                arcTo(6.954f, 6.954f, 0f, false, false, 3.04f, 9.25f)
                horizontalLineTo(1.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(1.29f)
                curveToRelative(0.078f, 0.733f, 0.27f, 1.433f, 0.556f, 2.081f)
                lineToRelative(-1.116f, 0.645f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 0.75f, 1.298f)
                lineToRelative(1.117f, -0.644f)
                arcToRelative(7.04f, 7.04f, 0f, false, false, 1.523f, 1.523f)
                lineToRelative(-0.645f, 1.117f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.3f, 0.75f)
                lineToRelative(0.644f, -1.116f)
                arcToRelative(6.954f, 6.954f, 0f, false, false, 2.081f, 0.556f)
                verticalLineToRelative(1.29f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineToRelative(-1.29f)
                arcToRelative(6.954f, 6.954f, 0f, false, false, 2.081f, -0.556f)
                lineToRelative(0.645f, 1.116f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.299f, -0.75f)
                lineToRelative(-0.645f, -1.117f)
                arcToRelative(7.042f, 7.042f, 0f, false, false, 1.523f, -1.523f)
                lineToRelative(1.117f, 0.644f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.75f, -1.298f)
                lineToRelative(-1.116f, -0.645f)
                arcToRelative(6.954f, 6.954f, 0f, false, false, 0.556f, -2.081f)
                horizontalLineToRelative(1.29f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-1.29f)
                arcToRelative(6.954f, 6.954f, 0f, false, false, -0.556f, -2.081f)
                lineToRelative(1.116f, -0.644f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, -1.3f)
                lineToRelative(-1.117f, 0.645f)
                arcToRelative(7.04f, 7.04f, 0f, false, false, -1.524f, -1.523f)
                close()
                moveTo(10f, 4.5f)
                arcToRelative(5.475f, 5.475f, 0f, false, false, -2.781f, 0.754f)
                arcTo(5.527f, 5.527f, 0f, false, false, 5.22f, 7.277f)
                arcTo(5.475f, 5.475f, 0f, false, false, 4.5f, 10f)
                arcToRelative(5.475f, 5.475f, 0f, false, false, 0.752f, 2.777f)
                arcToRelative(5.527f, 5.527f, 0f, false, false, 2.028f, 2.004f)
                curveToRelative(0.802f, 0.458f, 1.73f, 0.719f, 2.72f, 0.719f)
                arcToRelative(5.474f, 5.474f, 0f, false, false, 2.78f, -0.753f)
                arcToRelative(5.527f, 5.527f, 0f, false, false, 2.001f, -2.027f)
                curveToRelative(0.458f, -0.802f, 0.719f, -1.73f, 0.719f, -2.72f)
                arcToRelative(5.475f, 5.475f, 0f, false, false, -0.753f, -2.78f)
                arcToRelative(5.528f, 5.528f, 0f, false, false, -2.028f, -2.002f)
                arcTo(5.475f, 5.475f, 0f, false, false, 10f, 4.5f)
                close()
            }
        }.build()
        
        return _Cog!!
    }

private var _Cog: ImageVector? = null

