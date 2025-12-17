package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.No_flash: ImageVector
    get() {
        if (_No_flash != null) return _No_flash!!
        
        _No_flash = ImageVector.Builder(
            name = "no_flash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(791f, 903f)
                lineToRelative(-72f, -71f)
                quadToRelative(-4f, 20f, -20.5f, 34f)
                reflectiveQuadTo(660f, 880f)
                horizontalLineTo(140f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(80f, 820f)
                verticalLineToRelative(-384f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(140f, 376f)
                horizontalLineToRelative(106f)
                lineToRelative(8f, -9f)
                lineTo(55f, 168f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadTo(55f, 111f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(736f, 736f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(791f, 903f)
                close()
                moveTo(370f, 483f)
                quadToRelative(-57f, 12f, -93.5f, 55f)
                reflectiveQuadTo(240f, 640f)
                quadToRelative(0f, 66f, 47f, 113f)
                reflectiveQuadToRelative(113f, 47f)
                quadToRelative(59f, 0f, 103f, -37f)
                reflectiveQuadToRelative(55f, -93f)
                lineToRelative(-0.5f, 1f)
                lineToRelative(0.5f, -1f)
                lineToRelative(-188f, -187f)
                close()
                moveToRelative(30f, 237f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(320f, 640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(400f, 560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(480f, 640f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(400f, 720f)
                close()
                moveToRelative(360f, -440f)
                horizontalLineToRelative(-20f)
                quadToRelative(-8f, 0f, -14f, -6f)
                reflectiveQuadToRelative(-6f, -14f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -8f, 6f, -14f)
                reflectiveQuadToRelative(14f, -6f)
                horizontalLineToRelative(109f)
                quadToRelative(11f, 0f, 17.5f, 9f)
                reflectiveQuadToRelative(1.5f, 19f)
                lineToRelative(-52f, 116f)
                horizontalLineToRelative(30f)
                quadToRelative(11f, 0f, 16.5f, 10f)
                reflectiveQuadToRelative(0.5f, 20f)
                lineToRelative(-84f, 152f)
                quadToRelative(-4f, 7f, -11.5f, 5f)
                reflectiveQuadToRelative(-7.5f, -10f)
                verticalLineToRelative(-121f)
                close()
                moveToRelative(-40f, 156f)
                verticalLineToRelative(72f)
                quadToRelative(0f, 27f, -24.5f, 37.5f)
                reflectiveQuadTo(652f, 537f)
                lineTo(503f, 388f)
                quadToRelative(-14f, -14f, -12.5f, -29.5f)
                reflectiveQuadTo(503f, 332f)
                quadToRelative(11f, -11f, 26.5f, -12.5f)
                reflectiveQuadTo(559f, 332f)
                lineToRelative(45f, 44f)
                horizontalLineToRelative(56f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(720f, 436f)
                close()
            }
        }.build()
        
        return _No_flash!!
    }

private var _No_flash: ImageVector? = null

