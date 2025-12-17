package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Twitter: ImageVector
    get() {
        if (_Twitter != null) return _Twitter!!
        
        _Twitter = ImageVector.Builder(
            name = "twitter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.026f, 15f)
                curveToRelative(6.038f, 0f, 9.341f, -5.003f, 9.341f, -9.334f)
                quadToRelative(0.002f, -0.211f, -0.006f, -0.422f)
                arcTo(6.7f, 6.7f, 0f, false, false, 16f, 3.542f)
                arcToRelative(6.7f, 6.7f, 0f, false, true, -1.889f, 0.518f)
                arcToRelative(3.3f, 3.3f, 0f, false, false, 1.447f, -1.817f)
                arcToRelative(6.5f, 6.5f, 0f, false, true, -2.087f, 0.793f)
                arcTo(3.286f, 3.286f, 0f, false, false, 7.875f, 6.03f)
                arcToRelative(9.32f, 9.32f, 0f, false, true, -6.767f, -3.429f)
                arcToRelative(3.29f, 3.29f, 0f, false, false, 1.018f, 4.382f)
                arcTo(3.3f, 3.3f, 0f, false, true, 0.64f, 6.575f)
                verticalLineToRelative(0.045f)
                arcToRelative(3.29f, 3.29f, 0f, false, false, 2.632f, 3.218f)
                arcToRelative(3.2f, 3.2f, 0f, false, true, -0.865f, 0.115f)
                arcToRelative(3f, 3f, 0f, false, true, -0.614f, -0.057f)
                arcToRelative(3.28f, 3.28f, 0f, false, false, 3.067f, 2.277f)
                arcTo(6.6f, 6.6f, 0f, false, true, 0.78f, 13.58f)
                arcToRelative(6f, 6f, 0f, false, true, -0.78f, -0.045f)
                arcTo(9.34f, 9.34f, 0f, false, false, 5.026f, 15f)
            }
        }.build()
        
        return _Twitter!!
    }

private var _Twitter: ImageVector? = null

