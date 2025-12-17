package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.BubbleText: ImageVector
    get() {
        if (_BubbleText != null) return _BubbleText!!
        
        _BubbleText = ImageVector.Builder(
            name = "bubble-text",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.4f, 2f)
                lineToRelative(0.253f, 0.005f)
                arcToRelative(6.34f, 6.34f, 0f, false, true, 5.235f, 3.166f)
                lineToRelative(0.089f, 0.163f)
                lineToRelative(0.178f, 0.039f)
                arcToRelative(6.33f, 6.33f, 0f, false, true, 4.254f, 3.406f)
                lineToRelative(0.105f, 0.228f)
                arcToRelative(6.334f, 6.334f, 0f, false, true, -5.74f, 8.865f)
                lineToRelative(-0.144f, -0.002f)
                lineToRelative(-0.037f, 0.052f)
                arcToRelative(5.26f, 5.26f, 0f, false, true, -5.458f, 1.926f)
                lineToRelative(-0.186f, -0.051f)
                lineToRelative(-3.435f, 2.06f)
                arcToRelative(1f, 1f, 0f, false, true, -1.508f, -0.743f)
                lineToRelative(-0.006f, -0.114f)
                verticalLineToRelative(-2.435f)
                lineToRelative(-0.055f, -0.026f)
                arcToRelative(3.67f, 3.67f, 0f, false, true, -1.554f, -1.498f)
                lineToRelative(-0.102f, -0.199f)
                arcToRelative(3.67f, 3.67f, 0f, false, true, -0.312f, -2.14f)
                lineToRelative(0.038f, -0.21f)
                lineToRelative(-0.116f, -0.092f)
                arcToRelative(5.8f, 5.8f, 0f, false, true, -1.887f, -6.025f)
                lineToRelative(0.071f, -0.238f)
                arcToRelative(5.8f, 5.8f, 0f, false, true, 5.42f, -4.004f)
                horizontalLineToRelative(0.157f)
                lineToRelative(0.15f, -0.165f)
                arcToRelative(6.33f, 6.33f, 0f, false, true, 4.33f, -1.963f)
                close()
                moveToRelative(1.6f, 11f)
                horizontalLineToRelative(-5f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                horizontalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                moveToRelative(3f, -4f)
                horizontalLineToRelative(-10f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, 2f)
                horizontalLineToRelative(10f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
            }
        }.build()
        
        return _BubbleText!!
    }

private var _BubbleText: ImageVector? = null

