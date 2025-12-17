package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Water_ph: ImageVector
    get() {
        if (_Water_ph != null) return _Water_ph!!
        
        _Water_ph = ImageVector.Builder(
            name = "water_ph",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(580f, 800f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(50f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(470f, 880f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(440f, 850f)
                verticalLineToRelative(-180f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(470f, 640f)
                horizontalLineToRelative(110f)
                quadToRelative(24f, 0f, 42f, 18f)
                reflectiveQuadToRelative(18f, 42f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 24f, -18f, 42f)
                reflectiveQuadToRelative(-42f, 18f)
                close()
                moveToRelative(160f, -20f)
                verticalLineToRelative(70f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(710f, 880f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(680f, 850f)
                verticalLineToRelative(-180f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(710f, 640f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(740f, 670f)
                verticalLineToRelative(50f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-50f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(850f, 640f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(880f, 670f)
                verticalLineToRelative(180f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(850f, 880f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(820f, 850f)
                verticalLineToRelative(-70f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-240f, -40f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(40f)
                close()
                moveTo(400f, 94f)
                quadToRelative(8f, 0f, 14.5f, 2.5f)
                reflectiveQuadTo(427f, 104f)
                quadToRelative(138f, 124f, 208f, 223.5f)
                reflectiveQuadTo(717f, 516f)
                quadToRelative(2f, 17f, -10f, 30.5f)
                reflectiveQuadTo(676f, 560f)
                horizontalLineTo(440f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(360f, 640f)
                verticalLineToRelative(188f)
                quadToRelative(0f, 17f, -11.5f, 29f)
                reflectiveQuadTo(320f, 869f)
                quadToRelative(-118f, 0f, -179f, -94f)
                reflectiveQuadTo(80f, 552f)
                quadToRelative(0f, -94f, 74.5f, -207.5f)
                reflectiveQuadTo(373f, 104f)
                quadToRelative(6f, -5f, 12.5f, -7.5f)
                reflectiveQuadTo(400f, 94f)
                close()
            }
        }.build()
        
        return _Water_ph!!
    }

private var _Water_ph: ImageVector? = null

