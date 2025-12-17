package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.HandThumbDown: ImageVector
    get() {
        if (_HandThumbDown != null) return _HandThumbDown!!
        
        _HandThumbDown = ImageVector.Builder(
            name = "hand-thumb-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.325f, 3f)
                horizontalLineTo(12f)
                verticalLineToRelative(5f)
                curveToRelative(-0.663f, 0f, -1.219f, 0.466f, -1.557f, 1.037f)
                arcToRelative(4.02f, 4.02f, 0f, false, true, -1.357f, 1.377f)
                curveToRelative(-0.478f, 0.292f, -0.907f, 0.706f, -0.989f, 1.26f)
                verticalLineToRelative(0.005f)
                arcToRelative(9.031f, 9.031f, 0f, false, false, 0f, 2.642f)
                curveToRelative(0.028f, 0.194f, -0.048f, 0.394f, -0.224f, 0.479f)
                arcTo(2f, 2f, 0f, false, true, 5f, 13f)
                curveToRelative(0f, -0.812f, 0.08f, -1.605f, 0.234f, -2.371f)
                arcToRelative(0.521f, 0.521f, 0f, false, false, -0.5f, -0.629f)
                horizontalLineTo(3f)
                curveTo(1.896f, 10f, 0.99f, 9.102f, 1.1f, 8.003f)
                arcTo(19.827f, 19.827f, 0f, false, true, 2.18f, 3.215f)
                curveTo(2.45f, 2.469f, 3.178f, 2f, 3.973f, 2f)
                horizontalLineToRelative(2.703f)
                arcToRelative(2f, 2f, 0f, false, true, 0.632f, 0.103f)
                lineToRelative(2.384f, 0.794f)
                arcToRelative(2f, 2f, 0f, false, false, 0.633f, 0.103f)
                close()
                moveTo(14f, 2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, true, false, 2f, 0f)
                verticalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                close()
            }
        }.build()
        
        return _HandThumbDown!!
    }

private var _HandThumbDown: ImageVector? = null

