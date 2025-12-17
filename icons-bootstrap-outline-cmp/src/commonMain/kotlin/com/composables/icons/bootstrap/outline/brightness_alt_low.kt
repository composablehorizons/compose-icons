package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.BrightnessAltLow: ImageVector
    get() {
        if (_BrightnessAltLow != null) return _BrightnessAltLow!!
        
        _BrightnessAltLow = ImageVector.Builder(
            name = "brightness-alt-low",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.5f, 5.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -1f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                moveToRelative(5f, 6f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0f, -1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                moveTo(2f, 11f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 1f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -1f, 0f)
                moveToRelative(10.243f, -3.536f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.707f, -0.707f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.707f, 0.707f)
                moveToRelative(-8.486f, -0.707f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0.707f, 0.707f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.707f, -0.707f)
                moveTo(8f, 7f)
                arcToRelative(4f, 4f, 0f, false, false, -4f, 4f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(7f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                arcToRelative(4f, 4f, 0f, false, false, -4f, -4f)
                moveToRelative(0f, 1f)
                arcToRelative(3f, 3f, 0f, false, true, 2.959f, 2.5f)
                horizontalLineTo(5.04f)
                arcTo(3f, 3f, 0f, false, true, 8f, 8f)
            }
        }.build()
        
        return _BrightnessAltLow!!
    }

private var _BrightnessAltLow: ImageVector? = null

