package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.StarOfLife: ImageVector
    get() {
        if (_StarOfLife != null) return _StarOfLife!!
        
        _StarOfLife = ImageVector.Builder(
            name = "star-of-life",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 480f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(471.99f, 334.43f)
                lineTo(336.06f, 256f)
                lineToRelative(135.93f, -78.43f)
                curveToRelative(7.66f, -4.42f, 10.28f, -14.2f, 5.86f, -21.86f)
                lineToRelative(-32.02f, -55.43f)
                curveToRelative(-4.42f, -7.65f, -14.21f, -10.28f, -21.87f, -5.86f)
                lineToRelative(-135.93f, 78.43f)
                verticalLineTo(16f)
                curveToRelative(0f, -8.84f, -7.17f, -16f, -16.01f, -16f)
                horizontalLineToRelative(-64.04f)
                curveToRelative(-8.84f, 0f, -16.01f, 7.16f, -16.01f, 16f)
                verticalLineToRelative(156.86f)
                lineTo(56.04f, 94.43f)
                curveToRelative(-7.66f, -4.42f, -17.45f, -1.79f, -21.87f, 5.86f)
                lineTo(2.15f, 155.71f)
                curveToRelative(-4.42f, 7.65f, -1.8f, 17.44f, 5.86f, 21.86f)
                lineTo(143.94f, 256f)
                lineTo(8.01f, 334.43f)
                curveToRelative(-7.66f, 4.42f, -10.28f, 14.21f, -5.86f, 21.86f)
                lineToRelative(32.02f, 55.43f)
                curveToRelative(4.42f, 7.65f, 14.21f, 10.27f, 21.87f, 5.86f)
                lineToRelative(135.93f, -78.43f)
                verticalLineTo(496f)
                curveToRelative(0f, 8.84f, 7.17f, 16f, 16.01f, 16f)
                horizontalLineToRelative(64.04f)
                curveToRelative(8.84f, 0f, 16.01f, -7.16f, 16.01f, -16f)
                verticalLineTo(339.14f)
                lineToRelative(135.93f, 78.43f)
                curveToRelative(7.66f, 4.42f, 17.45f, 1.8f, 21.87f, -5.86f)
                lineToRelative(32.02f, -55.43f)
                curveToRelative(4.42f, -7.65f, 1.8f, -17.43f, -5.86f, -21.85f)
                close()
            }
        }.build()
        
        return _StarOfLife!!
    }

private var _StarOfLife: ImageVector? = null

