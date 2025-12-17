package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Poo: ImageVector
    get() {
        if (_Poo != null) return _Poo!!
        
        _Poo = ImageVector.Builder(
            name = "poo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.063f, 2.995f)
                lineToRelative(0.086f, 0.009f)
                horizontalLineToRelative(0.07f)
                curveToRelative(2.237f, 0.098f, 3.87f, 1.686f, 4.214f, 4.046f)
                lineToRelative(0.01f, 0.075f)
                lineToRelative(0.133f, 0.04f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 1.718f, 1.22f)
                lineToRelative(0.125f, 0.179f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 0.567f, 2.243f)
                lineToRelative(-0.006f, 0.049f)
                lineToRelative(0.032f, 0.025f)
                arcToRelative(4f, 4f, 0f, false, true, 1.476f, 2.8f)
                lineToRelative(0.01f, 0.191f)
                lineToRelative(0.15f, 0.125f)
                arcToRelative(4f, 4f, 0f, false, true, 1.29f, 3.693f)
                lineToRelative(-0.042f, 0.208f)
                curveToRelative(-0.4f, 1.728f, -1.89f, 2.986f, -3.72f, 3.092f)
                horizontalLineToRelative(-10.176f)
                arcToRelative(4f, 4f, 0f, false, true, -2.638f, -7.008f)
                lineToRelative(0.14f, -0.118f)
                lineToRelative(0.011f, -0.19f)
                arcToRelative(4f, 4f, 0f, false, true, 1.476f, -2.798f)
                lineToRelative(0.032f, -0.025f)
                lineToRelative(-0.006f, -0.048f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 0.452f, -2.058f)
                lineToRelative(0.114f, -0.186f)
                curveToRelative(0.603f, -0.912f, 1.598f, -1.49f, 2.755f, -1.564f)
                horizontalLineToRelative(0.164f)
                curveToRelative(0.743f, 0f, 1.26f, -1.242f, 0.606f, -2.553f)
                lineToRelative(0.006f, 0.015f)
                lineToRelative(-0.01f, -0.017f)
                arcToRelative(1f, 1f, 0f, false, true, -0.095f, -0.323f)
                lineToRelative(-0.007f, -0.117f)
                curveToRelative(0f, -0.654f, 0.539f, -1.031f, 1.063f, -1.005f)
                moveToRelative(3.758f, 12.434f)
                arcToRelative(1f, 1f, 0f, false, false, -1.392f, -0.25f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -2.858f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, -1.142f, 1.642f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, 5.142f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, 0.25f, -1.392f)
                moveToRelative(-4.811f, -4.429f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                horizontalLineToRelative(0.01f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                moveToRelative(4f, 0f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                horizontalLineToRelative(0.01f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
            }
        }.build()
        
        return _Poo!!
    }

private var _Poo: ImageVector? = null

