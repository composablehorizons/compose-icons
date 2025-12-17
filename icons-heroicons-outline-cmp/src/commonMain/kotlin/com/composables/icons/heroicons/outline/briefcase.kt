package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Briefcase: ImageVector
    get() {
        if (_Briefcase != null) return _Briefcase!!
        
        _Briefcase = ImageVector.Builder(
            name = "briefcase",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(20.25f, 14.15f)
                verticalLineToRelative(4.25f)
                curveToRelative(0f, 1.094f, -0.787f, 2.036f, -1.872f, 2.18f)
                curveToRelative(-2.087f, 0.277f, -4.216f, 0.42f, -6.378f, 0.42f)
                reflectiveCurveToRelative(-4.291f, -0.143f, -6.378f, -0.42f)
                curveToRelative(-1.085f, -0.144f, -1.872f, -1.086f, -1.872f, -2.18f)
                verticalLineToRelative(-4.25f)
                moveToRelative(16.5f, 0f)
                arcToRelative(2.18f, 2.18f, 0f, false, false, 0.75f, -1.661f)
                verticalLineTo(8.706f)
                curveToRelative(0f, -1.081f, -0.768f, -2.015f, -1.837f, -2.175f)
                arcToRelative(48.114f, 48.114f, 0f, false, false, -3.413f, -0.387f)
                moveToRelative(4.5f, 8.006f)
                curveToRelative(-0.194f, 0.165f, -0.42f, 0.295f, -0.673f, 0.38f)
                arcTo(23.978f, 23.978f, 0f, false, true, 12f, 15.75f)
                curveToRelative(-2.648f, 0f, -5.195f, -0.429f, -7.577f, -1.22f)
                arcToRelative(2.016f, 2.016f, 0f, false, true, -0.673f, -0.38f)
                moveToRelative(0f, 0f)
                arcTo(2.18f, 2.18f, 0f, false, true, 3f, 12.489f)
                verticalLineTo(8.706f)
                curveToRelative(0f, -1.081f, 0.768f, -2.015f, 1.837f, -2.175f)
                arcToRelative(48.111f, 48.111f, 0f, false, true, 3.413f, -0.387f)
                moveToRelative(7.5f, 0f)
                verticalLineTo(5.25f)
                arcTo(2.25f, 2.25f, 0f, false, false, 13.5f, 3f)
                horizontalLineToRelative(-3f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, -2.25f, 2.25f)
                verticalLineToRelative(0.894f)
                moveToRelative(7.5f, 0f)
                arcToRelative(48.667f, 48.667f, 0f, false, false, -7.5f, 0f)
                moveTo(12f, 12.75f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineTo(12f)
                verticalLineToRelative(-0.008f)
                close()
            }
        }.build()
        
        return _Briefcase!!
    }

private var _Briefcase: ImageVector? = null

