package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Linkedin: ImageVector
    get() {
        if (_Linkedin != null) return _Linkedin!!
        
        _Linkedin = ImageVector.Builder(
            name = "linkedin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 1.146f)
                curveTo(0f, 0.513f, 0.526f, 0f, 1.175f, 0f)
                horizontalLineToRelative(13.65f)
                curveTo(15.474f, 0f, 16f, 0.513f, 16f, 1.146f)
                verticalLineToRelative(13.708f)
                curveToRelative(0f, 0.633f, -0.526f, 1.146f, -1.175f, 1.146f)
                horizontalLineTo(1.175f)
                curveTo(0.526f, 16f, 0f, 15.487f, 0f, 14.854f)
                close()
                moveToRelative(4.943f, 12.248f)
                verticalLineTo(6.169f)
                horizontalLineTo(2.542f)
                verticalLineToRelative(7.225f)
                close()
                moveToRelative(-1.2f, -8.212f)
                curveToRelative(0.837f, 0f, 1.358f, -0.554f, 1.358f, -1.248f)
                curveToRelative(-0.015f, -0.709f, -0.52f, -1.248f, -1.342f, -1.248f)
                reflectiveCurveTo(2.4f, 3.226f, 2.4f, 3.934f)
                curveToRelative(0f, 0.694f, 0.521f, 1.248f, 1.327f, 1.248f)
                close()
                moveToRelative(4.908f, 8.212f)
                verticalLineTo(9.359f)
                curveToRelative(0f, -0.216f, 0.016f, -0.432f, 0.08f, -0.586f)
                curveToRelative(0.173f, -0.431f, 0.568f, -0.878f, 1.232f, -0.878f)
                curveToRelative(0.869f, 0f, 1.216f, 0.662f, 1.216f, 1.634f)
                verticalLineToRelative(3.865f)
                horizontalLineToRelative(2.401f)
                verticalLineTo(9.25f)
                curveToRelative(0f, -2.22f, -1.184f, -3.252f, -2.764f, -3.252f)
                curveToRelative(-1.274f, 0f, -1.845f, 0.7f, -2.165f, 1.193f)
                verticalLineToRelative(0.025f)
                horizontalLineToRelative(-0.016f)
                lineToRelative(0.016f, -0.025f)
                verticalLineTo(6.169f)
                horizontalLineToRelative(-2.4f)
                curveToRelative(0.03f, 0.678f, 0f, 7.225f, 0f, 7.225f)
                close()
            }
        }.build()
        
        return _Linkedin!!
    }

private var _Linkedin: ImageVector? = null

