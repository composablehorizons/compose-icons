package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.HandThumbUp: ImageVector
    get() {
        if (_HandThumbUp != null) return _HandThumbUp!!
        
        _HandThumbUp = ImageVector.Builder(
            name = "hand-thumb-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.09f, 15f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(8f)
                arcToRelative(1f, 1f, 0f, true, false, -2f, 0f)
                verticalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                close()
                moveTo(5.765f, 13f)
                horizontalLineTo(4.09f)
                verticalLineTo(8f)
                curveToRelative(0.663f, 0f, 1.218f, -0.466f, 1.556f, -1.037f)
                arcToRelative(4.02f, 4.02f, 0f, false, true, 1.358f, -1.377f)
                curveToRelative(0.478f, -0.292f, 0.907f, -0.706f, 0.989f, -1.26f)
                verticalLineTo(4.32f)
                arcToRelative(9.03f, 9.03f, 0f, false, false, 0f, -2.642f)
                curveToRelative(-0.028f, -0.194f, 0.048f, -0.394f, 0.224f, -0.479f)
                arcTo(2f, 2f, 0f, false, true, 11.09f, 3f)
                curveToRelative(0f, 0.812f, -0.08f, 1.605f, -0.235f, 2.371f)
                arcToRelative(0.521f, 0.521f, 0f, false, false, 0.502f, 0.629f)
                horizontalLineToRelative(1.733f)
                curveToRelative(1.104f, 0f, 2.01f, 0.898f, 1.901f, 1.997f)
                arcToRelative(19.831f, 19.831f, 0f, false, true, -1.081f, 4.788f)
                curveToRelative(-0.27f, 0.747f, -0.998f, 1.215f, -1.793f, 1.215f)
                horizontalLineTo(9.414f)
                curveToRelative(-0.215f, 0f, -0.428f, -0.035f, -0.632f, -0.103f)
                lineToRelative(-2.384f, -0.794f)
                arcTo(2.002f, 2.002f, 0f, false, false, 5.765f, 13f)
                close()
            }
        }.build()
        
        return _HandThumbUp!!
    }

private var _HandThumbUp: ImageVector? = null

