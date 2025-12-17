package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.PersonWheelchair: ImageVector
    get() {
        if (_PersonWheelchair != null) return _PersonWheelchair!!
        
        _PersonWheelchair = ImageVector.Builder(
            name = "person-wheelchair",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 3f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, 0f, -3f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 0f, 3f)
                moveToRelative(-0.663f, 2.146f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -0.47f, -2.115f)
                lineToRelative(-2.5f, -1.508f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -1.676f, 0.086f)
                lineToRelative(-2.329f, 1.75f)
                arcToRelative(0.866f, 0.866f, 0f, false, false, 1.051f, 1.375f)
                lineTo(7.361f, 3.37f)
                lineToRelative(0.922f, 0.71f)
                lineToRelative(-2.038f, 2.445f)
                arcTo(4.73f, 4.73f, 0f, false, false, 2.628f, 7.67f)
                lineToRelative(1.064f, 1.065f)
                arcToRelative(3.25f, 3.25f, 0f, false, true, 4.574f, 4.574f)
                lineToRelative(1.064f, 1.063f)
                arcToRelative(4.73f, 4.73f, 0f, false, false, 1.09f, -3.998f)
                lineToRelative(1.043f, -0.292f)
                lineToRelative(-0.187f, 2.991f)
                arcToRelative(0.872f, 0.872f, 0f, true, false, 1.741f, 0.098f)
                lineToRelative(0.206f, -4.121f)
                arcTo(1f, 1f, 0f, false, false, 12.224f, 8f)
                horizontalLineToRelative(-2.79f)
                close()
                moveTo(3.023f, 9.48f)
                arcToRelative(3.25f, 3.25f, 0f, false, false, 4.496f, 4.496f)
                lineToRelative(1.077f, 1.077f)
                arcToRelative(4.75f, 4.75f, 0f, false, true, -6.65f, -6.65f)
                close()
            }
        }.build()
        
        return _PersonWheelchair!!
    }

private var _PersonWheelchair: ImageVector? = null

