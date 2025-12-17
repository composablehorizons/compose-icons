package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Bedroom_baby: ImageVector
    get() {
        if (_Bedroom_baby != null) return _Bedroom_baby!!
        
        _Bedroom_baby = ImageVector.Builder(
            name = "bedroom_baby",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 720f)
                quadToRelative(80f, 0f, 152f, -30f)
                reflectiveQuadToRelative(128f, -86f)
                lineToRelative(-42f, -42f)
                quadToRelative(-11f, 11f, -21.5f, 19.5f)
                reflectiveQuadTo(674f, 598f)
                lineToRelative(-34f, -58f)
                verticalLineToRelative(-100f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-40f)
                horizontalLineTo(456f)
                lineToRelative(-70f, -120f)
                horizontalLineTo(240f)
                lineToRelative(40f, 30f)
                lineToRelative(-60f, 70f)
                lineToRelative(38f, 40f)
                lineToRelative(62f, -40f)
                verticalLineToRelative(160f)
                lineToRelative(-34f, 58f)
                quadToRelative(-12f, -8f, -22.5f, -16.5f)
                reflectiveQuadTo(242f, 562f)
                lineToRelative(-42f, 42f)
                quadToRelative(56f, 56f, 128f, 86f)
                reflectiveQuadToRelative(152f, 30f)
                close()
                moveToRelative(0f, -60f)
                quadToRelative(-38f, 0f, -73.5f, -7.5f)
                reflectiveQuadTo(338f, 628f)
                lineToRelative(34f, -58f)
                quadToRelative(26f, 10f, 53.5f, 14.5f)
                reflectiveQuadTo(480f, 589f)
                quadToRelative(28f, 0f, 55f, -4.5f)
                reflectiveQuadToRelative(53f, -14.5f)
                lineToRelative(34f, 58f)
                quadToRelative(-33f, 15f, -68.5f, 23.5f)
                reflectiveQuadTo(480f, 660f)
                close()
                moveTo(160f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 80f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 160f)
                verticalLineToRelative(640f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 880f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Bedroom_baby!!
    }

private var _Bedroom_baby: ImageVector? = null

