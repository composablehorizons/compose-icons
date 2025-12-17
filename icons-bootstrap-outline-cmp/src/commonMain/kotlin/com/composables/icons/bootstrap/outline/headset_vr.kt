package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.HeadsetVr: ImageVector
    get() {
        if (_HeadsetVr != null) return _HeadsetVr!!
        
        _HeadsetVr = ImageVector.Builder(
            name = "headset-vr",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 1.248f)
                curveToRelative(1.857f, 0f, 3.526f, 0.641f, 4.65f, 1.794f)
                arcToRelative(5f, 5f, 0f, false, true, 2.518f, 1.09f)
                curveTo(13.907f, 1.482f, 11.295f, 0f, 8f, 0f)
                curveTo(4.75f, 0f, 2.12f, 1.48f, 0.844f, 4.122f)
                arcToRelative(5f, 5f, 0f, false, true, 2.289f, -1.047f)
                curveTo(4.236f, 1.872f, 5.974f, 1.248f, 8f, 1.248f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 12f)
                arcToRelative(4f, 4f, 0f, false, true, -2.786f, -1.13f)
                lineToRelative(-0.002f, -0.002f)
                arcToRelative(1.6f, 1.6f, 0f, false, false, -0.276f, -0.167f)
                arcTo(2.2f, 2.2f, 0f, false, false, 8f, 10.5f)
                curveToRelative(-0.414f, 0f, -0.729f, 0.103f, -0.935f, 0.201f)
                arcToRelative(1.6f, 1.6f, 0f, false, false, -0.277f, 0.167f)
                lineToRelative(-0.002f, 0.002f)
                arcTo(4f, 4f, 0f, true, true, 4f, 4f)
                horizontalLineToRelative(8f)
                arcToRelative(4f, 4f, 0f, false, true, 0f, 8f)
            }
        }.build()
        
        return _HeadsetVr!!
    }

private var _HeadsetVr: ImageVector? = null

