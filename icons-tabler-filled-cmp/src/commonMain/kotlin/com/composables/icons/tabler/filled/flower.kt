package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Flower: ImageVector
    get() {
        if (_Flower != null) return _Flower!!
        
        _Flower = ImageVector.Builder(
            name = "flower",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 1f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, 4f)
                lineToRelative(-0.002f, 0.055f)
                lineToRelative(0.03f, -0.018f)
                arcToRelative(3.97f, 3.97f, 0f, false, true, 2.79f, -0.455f)
                lineToRelative(0.237f, 0.056f)
                arcToRelative(3.97f, 3.97f, 0f, false, true, 2.412f, 1.865f)
                arcToRelative(4.01f, 4.01f, 0f, false, true, -1.455f, 5.461f)
                lineToRelative(-0.068f, 0.036f)
                lineToRelative(0.071f, 0.039f)
                arcToRelative(4.01f, 4.01f, 0f, false, true, 1.555f, 5.27f)
                lineToRelative(-0.101f, 0.186f)
                arcToRelative(3.97f, 3.97f, 0f, false, true, -5.441f, 1.468f)
                lineToRelative(-0.03f, -0.02f)
                lineToRelative(0.002f, 0.057f)
                arcToRelative(4f, 4f, 0f, false, true, -3.8f, 3.995f)
                lineToRelative(-0.2f, 0.005f)
                arcToRelative(4f, 4f, 0f, false, true, -4f, -4f)
                lineToRelative(0.001f, -0.056f)
                lineToRelative(-0.029f, 0.019f)
                arcToRelative(3.97f, 3.97f, 0f, false, true, -2.79f, 0.456f)
                lineToRelative(-0.236f, -0.056f)
                arcToRelative(3.97f, 3.97f, 0f, false, true, -2.413f, -1.865f)
                arcToRelative(4.01f, 4.01f, 0f, false, true, 1.453f, -5.46f)
                lineToRelative(0.07f, -0.038f)
                lineToRelative(-0.071f, -0.038f)
                arcToRelative(4.01f, 4.01f, 0f, false, true, -1.555f, -5.27f)
                lineToRelative(0.1f, -0.187f)
                arcToRelative(3.97f, 3.97f, 0f, false, true, 5.444f, -1.468f)
                lineToRelative(0.026f, 0.018f)
                verticalLineToRelative(-0.055f)
                arcToRelative(4f, 4f, 0f, false, true, 3.8f, -3.995f)
                close()
                moveToRelative(0f, 8f)
                arcToRelative(3f, 3f, 0f, true, false, 0f, 6f)
                arcToRelative(3f, 3f, 0f, false, false, 0f, -6f)
            }
        }.build()
        
        return _Flower!!
    }

private var _Flower: ImageVector? = null

