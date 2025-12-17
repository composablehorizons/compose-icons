package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Woman: ImageVector
    get() {
        if (_Woman != null) return _Woman!!
        
        _Woman = ImageVector.Builder(
            name = "woman",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 8f)
                curveToRelative(1.91f, 0f, 3.79f, 0.752f, 5.625f, 2.219f)
                arcToRelative(1f, 1f, 0f, true, true, -1.25f, 1.562f)
                curveToRelative(-1.019f, -0.815f, -2.016f, -1.345f, -2.997f, -1.6f)
                lineToRelative(1.584f, 5.544f)
                arcToRelative(1f, 1f, 0f, false, true, -0.962f, 1.275f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, true, -2f, 0f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, true, -2f, 0f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, false, true, -0.962f, -1.275f)
                lineToRelative(1.584f, -5.545f)
                curveToRelative(-0.98f, 0.256f, -1.978f, 0.786f, -2.997f, 1.601f)
                arcToRelative(1f, 1f, 0f, true, true, -1.25f, -1.562f)
                curveToRelative(1.733f, -1.386f, 3.506f, -2.133f, 5.307f, -2.212f)
                lineToRelative(0.335f, -0.007f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 1f)
                arcToRelative(3f, 3f, 0f, true, true, -3f, 3f)
                lineToRelative(0.005f, -0.176f)
                arcToRelative(3f, 3f, 0f, false, true, 2.995f, -2.824f)
            }
        }.build()
        
        return _Woman!!
    }

private var _Woman: ImageVector? = null

