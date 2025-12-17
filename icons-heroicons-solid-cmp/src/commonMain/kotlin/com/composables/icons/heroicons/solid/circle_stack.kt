package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.CircleStack: ImageVector
    get() {
        if (_CircleStack != null) return _CircleStack!!
        
        _CircleStack = ImageVector.Builder(
            name = "circle-stack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21f, 6.375f)
                curveToRelative(0f, 2.692f, -4.03f, 4.875f, -9f, 4.875f)
                reflectiveCurveTo(3f, 9.067f, 3f, 6.375f)
                reflectiveCurveTo(7.03f, 1.5f, 12f, 1.5f)
                reflectiveCurveToRelative(9f, 2.183f, 9f, 4.875f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 12.75f)
                curveToRelative(2.685f, 0f, 5.19f, -0.586f, 7.078f, -1.609f)
                arcToRelative(8.283f, 8.283f, 0f, false, false, 1.897f, -1.384f)
                curveToRelative(0.016f, 0.121f, 0.025f, 0.244f, 0.025f, 0.368f)
                curveTo(21f, 12.817f, 16.97f, 15f, 12f, 15f)
                reflectiveCurveToRelative(-9f, -2.183f, -9f, -4.875f)
                curveToRelative(0f, -0.124f, 0.009f, -0.247f, 0.025f, -0.368f)
                arcToRelative(8.285f, 8.285f, 0f, false, false, 1.897f, 1.384f)
                curveTo(6.809f, 12.164f, 9.315f, 12.75f, 12f, 12.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 16.5f)
                curveToRelative(2.685f, 0f, 5.19f, -0.586f, 7.078f, -1.609f)
                arcToRelative(8.282f, 8.282f, 0f, false, false, 1.897f, -1.384f)
                curveToRelative(0.016f, 0.121f, 0.025f, 0.244f, 0.025f, 0.368f)
                curveToRelative(0f, 2.692f, -4.03f, 4.875f, -9f, 4.875f)
                reflectiveCurveToRelative(-9f, -2.183f, -9f, -4.875f)
                curveToRelative(0f, -0.124f, 0.009f, -0.247f, 0.025f, -0.368f)
                arcToRelative(8.284f, 8.284f, 0f, false, false, 1.897f, 1.384f)
                curveTo(6.809f, 15.914f, 9.315f, 16.5f, 12f, 16.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 20.25f)
                curveToRelative(2.685f, 0f, 5.19f, -0.586f, 7.078f, -1.609f)
                arcToRelative(8.282f, 8.282f, 0f, false, false, 1.897f, -1.384f)
                curveToRelative(0.016f, 0.121f, 0.025f, 0.244f, 0.025f, 0.368f)
                curveToRelative(0f, 2.692f, -4.03f, 4.875f, -9f, 4.875f)
                reflectiveCurveToRelative(-9f, -2.183f, -9f, -4.875f)
                curveToRelative(0f, -0.124f, 0.009f, -0.247f, 0.025f, -0.368f)
                arcToRelative(8.284f, 8.284f, 0f, false, false, 1.897f, 1.384f)
                curveTo(6.809f, 19.664f, 9.315f, 20.25f, 12f, 20.25f)
                close()
            }
        }.build()
        
        return _CircleStack!!
    }

private var _CircleStack: ImageVector? = null

