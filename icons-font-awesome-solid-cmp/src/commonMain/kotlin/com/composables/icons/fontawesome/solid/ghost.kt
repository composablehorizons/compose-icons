package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Ghost: ImageVector
    get() {
        if (_Ghost != null) return _Ghost!!
        
        _Ghost = ImageVector.Builder(
            name = "ghost",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(186.1f, 0.09f)
                curveTo(81.01f, 3.24f, 0f, 94.92f, 0f, 200.05f)
                verticalLineToRelative(263.92f)
                curveToRelative(0f, 14.26f, 17.23f, 21.39f, 27.31f, 11.31f)
                lineToRelative(24.92f, -18.53f)
                curveToRelative(6.66f, -4.95f, 16f, -3.99f, 21.51f, 2.21f)
                lineToRelative(42.95f, 48.35f)
                curveToRelative(6.25f, 6.25f, 16.38f, 6.25f, 22.63f, 0f)
                lineToRelative(40.72f, -45.85f)
                curveToRelative(6.37f, -7.17f, 17.56f, -7.17f, 23.92f, 0f)
                lineToRelative(40.72f, 45.85f)
                curveToRelative(6.25f, 6.25f, 16.38f, 6.25f, 22.63f, 0f)
                lineToRelative(42.95f, -48.35f)
                curveToRelative(5.51f, -6.2f, 14.85f, -7.17f, 21.51f, -2.21f)
                lineToRelative(24.92f, 18.53f)
                curveToRelative(10.08f, 10.08f, 27.31f, 2.94f, 27.31f, -11.31f)
                verticalLineTo(192f)
                curveTo(384f, 84f, 294.83f, -3.17f, 186.1f, 0.09f)
                close()
                moveTo(128f, 224f)
                curveToRelative(-17.67f, 0f, -32f, -14.33f, -32f, -32f)
                reflectiveCurveToRelative(14.33f, -32f, 32f, -32f)
                reflectiveCurveToRelative(32f, 14.33f, 32f, 32f)
                reflectiveCurveToRelative(-14.33f, 32f, -32f, 32f)
                close()
                moveToRelative(128f, 0f)
                curveToRelative(-17.67f, 0f, -32f, -14.33f, -32f, -32f)
                reflectiveCurveToRelative(14.33f, -32f, 32f, -32f)
                reflectiveCurveToRelative(32f, 14.33f, 32f, 32f)
                reflectiveCurveToRelative(-14.33f, 32f, -32f, 32f)
                close()
            }
        }.build()
        
        return _Ghost!!
    }

private var _Ghost: ImageVector? = null

