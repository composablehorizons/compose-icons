package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Thumbs_up_down: ImageVector
    get() {
        if (_Thumbs_up_down != null) return _Thumbs_up_down!!
        
        _Thumbs_up_down = ImageVector.Builder(
            name = "thumbs_up_down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 560f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(0f, 480f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -12f, 5f, -23f)
                reflectiveQuadToRelative(13f, -19f)
                lineToRelative(126f, -126f)
                quadToRelative(9f, -9f, 20f, -13.5f)
                reflectiveQuadToRelative(22f, -4.5f)
                quadToRelative(26f, 0f, 45f, 20f)
                reflectiveQuadToRelative(14f, 51f)
                lineToRelative(-13f, 75f)
                horizontalLineToRelative(208f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(480f, 240f)
                verticalLineToRelative(50f)
                quadToRelative(0f, 6f, -1f, 11.5f)
                reflectiveQuadToRelative(-3f, 10.5f)
                lineToRelative(-90f, 212f)
                quadToRelative(-7f, 17f, -22.5f, 26.5f)
                reflectiveQuadTo(330f, 560f)
                horizontalLineTo(80f)
                close()
                moveToRelative(440f, 200f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(480f, 720f)
                verticalLineToRelative(-50f)
                quadToRelative(0f, -6f, 1f, -11.5f)
                reflectiveQuadToRelative(3f, -10.5f)
                lineToRelative(90f, -212f)
                quadToRelative(8f, -17f, 23f, -26.5f)
                reflectiveQuadToRelative(33f, -9.5f)
                horizontalLineToRelative(250f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(960f, 480f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 12f, -4.5f, 22.5f)
                reflectiveQuadTo(942f, 762f)
                lineTo(816f, 888f)
                quadToRelative(-9f, 9f, -20f, 13.5f)
                reflectiveQuadTo(774f, 906f)
                quadToRelative(-26f, 0f, -45f, -20f)
                reflectiveQuadToRelative(-14f, -51f)
                lineToRelative(13f, -75f)
                horizontalLineTo(520f)
                close()
            }
        }.build()
        
        return _Thumbs_up_down!!
    }

private var _Thumbs_up_down: ImageVector? = null

