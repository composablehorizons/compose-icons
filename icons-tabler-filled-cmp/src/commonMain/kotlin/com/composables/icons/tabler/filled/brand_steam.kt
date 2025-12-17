package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.BrandSteam: ImageVector
    get() {
        if (_BrandSteam != null) return _BrandSteam!!
        
        _BrandSteam = ImageVector.Builder(
            name = "brand-steam",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16.5f, 4f)
                arcToRelative(5.5f, 5.5f, 0f, true, true, -0.309f, 10.992f)
                lineToRelative(-0.078f, -0.007f)
                lineToRelative(-3.646f, 2.524f)
                lineToRelative(-0.011f, 0.094f)
                curveToRelative(-0.267f, 1.775f, -1.707f, 3.18f, -3.571f, 3.38f)
                lineToRelative(-0.209f, 0.017f)
                horizontalLineToRelative(-0.176f)
                arcToRelative(4f, 4f, 0f, false, true, -3.756f, -2.623f)
                lineToRelative(-0.016f, -0.048f)
                lineToRelative(-2.122f, -0.91f)
                arcToRelative(1f, 1f, 0f, false, true, -0.599f, -0.8f)
                lineToRelative(-0.007f, -0.119f)
                verticalLineToRelative(-3.5f)
                arcToRelative(1f, 1f, 0f, false, true, 1.447f, -0.894f)
                lineToRelative(2.964f, 1.481f)
                lineToRelative(0.174f, -0.1f)
                arcToRelative(4f, 4f, 0f, false, true, 2.15f, -0.482f)
                lineToRelative(0.166f, 0.014f)
                lineToRelative(2.126f, -2.977f)
                lineToRelative(-0.01f, -0.098f)
                arcToRelative(5.5f, 5.5f, 0f, false, true, 1.092f, -3.758f)
                lineToRelative(0.169f, -0.212f)
                arcToRelative(5.5f, 5.5f, 0f, false, true, 4.222f, -1.974f)
                moveToRelative(0f, 3.5f)
                arcToRelative(2f, 2f, 0f, true, false, 0f, 4f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, -4f)
            }
        }.build()
        
        return _BrandSteam!!
    }

private var _BrandSteam: ImageVector? = null

