package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.BrightnessAltHigh: ImageVector
    get() {
        if (_BrightnessAltHigh != null) return _BrightnessAltHigh!!
        
        _BrightnessAltHigh = ImageVector.Builder(
            name = "brightness-alt-high",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineToRelative(-2f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8f, 3f)
                moveToRelative(8f, 8f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineToRelative(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                moveToRelative(-13.5f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                horizontalLineToRelative(-2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                close()
                moveToRelative(11.157f, -6.157f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 0.707f)
                lineToRelative(-1.414f, 1.414f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.707f, -0.707f)
                lineToRelative(1.414f, -1.414f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.707f, 0f)
                moveToRelative(-9.9f, 2.121f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.707f, -0.707f)
                lineTo(3.05f, 5.343f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.707f, 0.707f)
                close()
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
        
        return _BrightnessAltHigh!!
    }

private var _BrightnessAltHigh: ImageVector? = null

