package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Rainy_light: ImageVector
    get() {
        if (_Rainy_light != null) return _Rainy_light!!
        
        _Rainy_light = ImageVector.Builder(
            name = "rainy_light",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(162f, 495f)
                lineTo(26f, 222f)
                lineToRelative(72f, -36f)
                lineToRelative(136f, 272f)
                lineToRelative(-72f, 37f)
                close()
                moveToRelative(140f, 280f)
                lineTo(187f, 542f)
                lineToRelative(70f, -36f)
                lineToRelative(116f, 232f)
                lineToRelative(-71f, 37f)
                close()
                moveToRelative(82f, -200f)
                lineTo(208f, 222f)
                lineToRelative(71f, -36f)
                lineToRelative(176f, 352f)
                lineToRelative(-71f, 37f)
                close()
                moveToRelative(87f, -201f)
                lineToRelative(-76f, -152f)
                lineToRelative(71f, -35f)
                lineToRelative(76f, 151f)
                lineToRelative(-71f, 36f)
                close()
                moveToRelative(24f, 400f)
                lineToRelative(-76f, -152f)
                lineToRelative(71f, -35f)
                lineToRelative(75f, 150f)
                lineToRelative(-70f, 37f)
                close()
                moveToRelative(186f, 0f)
                lineTo(505f, 422f)
                lineToRelative(71f, -36f)
                lineToRelative(176f, 351f)
                lineToRelative(-71f, 37f)
                close()
                moveToRelative(61f, -239f)
                lineTo(587f, 222f)
                lineToRelative(71f, -35f)
                lineToRelative(156f, 311f)
                lineToRelative(-72f, 37f)
                close()
                moveToRelative(120f, 240f)
                lineToRelative(-95f, -193f)
                lineToRelative(71f, -35f)
                lineToRelative(96f, 191f)
                lineToRelative(-72f, 37f)
                close()
            }
        }.build()
        
        return _Rainy_light!!
    }

private var _Rainy_light: ImageVector? = null

