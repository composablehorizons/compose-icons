package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Cake: ImageVector
    get() {
        if (_Cake != null) return _Cake!!
        
        _Cake = ImageVector.Builder(
            name = "cake",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(12f, 8.25f)
                verticalLineToRelative(-1.5f)
                moveToRelative(0f, 1.5f)
                curveToRelative(-1.355f, 0f, -2.697f, 0.056f, -4.024f, 0.166f)
                curveTo(6.845f, 8.51f, 6f, 9.473f, 6f, 10.608f)
                verticalLineToRelative(2.513f)
                moveToRelative(6f, -4.871f)
                curveToRelative(1.355f, 0f, 2.697f, 0.056f, 4.024f, 0.166f)
                curveTo(17.155f, 8.51f, 18f, 9.473f, 18f, 10.608f)
                verticalLineToRelative(2.513f)
                moveTo(15f, 8.25f)
                verticalLineToRelative(-1.5f)
                moveToRelative(-6f, 1.5f)
                verticalLineToRelative(-1.5f)
                moveToRelative(12f, 9.75f)
                lineToRelative(-1.5f, 0.75f)
                arcToRelative(3.354f, 3.354f, 0f, false, true, -3f, 0f)
                arcToRelative(3.354f, 3.354f, 0f, false, false, -3f, 0f)
                arcToRelative(3.354f, 3.354f, 0f, false, true, -3f, 0f)
                arcToRelative(3.354f, 3.354f, 0f, false, false, -3f, 0f)
                arcToRelative(3.354f, 3.354f, 0f, false, true, -3f, 0f)
                lineTo(3f, 16.5f)
                moveToRelative(15f, -3.379f)
                arcToRelative(48.474f, 48.474f, 0f, false, false, -6f, -0.371f)
                curveToRelative(-2.032f, 0f, -4.034f, 0.126f, -6f, 0.371f)
                moveToRelative(12f, 0f)
                curveToRelative(0.39f, 0.049f, 0.777f, 0.102f, 1.163f, 0.16f)
                curveToRelative(1.07f, 0.16f, 1.837f, 1.094f, 1.837f, 2.175f)
                verticalLineToRelative(5.169f)
                curveToRelative(0f, 0.621f, -0.504f, 1.125f, -1.125f, 1.125f)
                horizontalLineTo(4.125f)
                arcTo(1.125f, 1.125f, 0f, false, true, 3f, 20.625f)
                verticalLineToRelative(-5.17f)
                curveToRelative(0f, -1.08f, 0.768f, -2.014f, 1.837f, -2.174f)
                arcTo(47.78f, 47.78f, 0f, false, true, 6f, 13.12f)
                moveTo(12.265f, 3.11f)
                arcToRelative(0.375f, 0.375f, 0f, true, true, -0.53f, 0f)
                lineTo(12f, 2.845f)
                lineToRelative(0.265f, 0.265f)
                close()
                moveToRelative(-3f, 0f)
                arcToRelative(0.375f, 0.375f, 0f, true, true, -0.53f, 0f)
                lineTo(9f, 2.845f)
                lineToRelative(0.265f, 0.265f)
                close()
                moveToRelative(6f, 0f)
                arcToRelative(0.375f, 0.375f, 0f, true, true, -0.53f, 0f)
                lineTo(15f, 2.845f)
                lineToRelative(0.265f, 0.265f)
                close()
            }
        }.build()
        
        return _Cake!!
    }

private var _Cake: ImageVector? = null

