package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.BrightnessLow: ImageVector
    get() {
        if (_BrightnessLow != null) return _BrightnessLow!!
        
        _BrightnessLow = ImageVector.Builder(
            name = "brightness-low",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 8f)
                arcToRelative(4f, 4f, 0f, true, true, -8f, 0f)
                arcToRelative(4f, 4f, 0f, false, true, 8f, 0f)
                moveTo(8.5f, 2.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -1f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                moveToRelative(0f, 11f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -1f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                moveToRelative(5f, -5f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0f, -1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                moveToRelative(-11f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0f, -1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                moveToRelative(9.743f, -4.036f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.707f, -0.707f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.707f, 0.707f)
                moveToRelative(-7.779f, 7.779f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.707f, -0.707f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.707f, 0.707f)
                moveToRelative(7.072f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.707f, -0.707f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.707f, 0.707f)
                moveTo(3.757f, 4.464f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.707f, -0.707f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.707f, 0.707f)
            }
        }.build()
        
        return _BrightnessLow!!
    }

private var _BrightnessLow: ImageVector? = null

