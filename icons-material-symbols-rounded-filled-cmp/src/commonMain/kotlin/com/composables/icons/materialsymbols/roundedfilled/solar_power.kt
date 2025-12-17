package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Solar_power: ImageVector
    get() {
        if (_Solar_power != null) return _Solar_power!!
        
        _Solar_power = ImageVector.Builder(
            name = "solar_power",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 160f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 80f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(240f, 120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(200f, 160f)
                horizontalLineToRelative(-40f)
                close()
                moveToRelative(-48f, 560f)
                lineToRelative(-13f, 64f)
                quadToRelative(-8f, 38f, 16.5f, 67f)
                reflectiveQuadTo(178f, 880f)
                horizontalLineToRelative(262f)
                verticalLineToRelative(-160f)
                horizontalLineTo(112f)
                close()
                moveToRelative(105f, -432f)
                lineToRelative(28f, -28f)
                quadToRelative(11f, -11f, 27.5f, -11f)
                reflectiveQuadToRelative(28.5f, 11f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(301f, 317f)
                lineToRelative(-28f, 28f)
                quadToRelative(-11f, 11f, -27.5f, 11f)
                reflectiveQuadTo(217f, 345f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                close()
                moveToRelative(-89f, 352f)
                horizontalLineToRelative(312f)
                verticalLineToRelative(-160f)
                horizontalLineTo(226f)
                quadToRelative(-29f, 0f, -51.5f, 18f)
                reflectiveQuadTo(147f, 544f)
                lineToRelative(-19f, 96f)
                close()
                moveToRelative(312f, -240f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 320f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 360f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 440f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 400f)
                close()
                moveToRelative(80f, 480f)
                horizontalLineToRelative(262f)
                quadToRelative(38f, 0f, 62.5f, -29f)
                reflectiveQuadToRelative(16.5f, -67f)
                lineToRelative(-13f, -64f)
                horizontalLineTo(520f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(0f, -240f)
                horizontalLineToRelative(312f)
                lineToRelative(-19f, -96f)
                quadToRelative(-5f, -28f, -27.5f, -46f)
                reflectiveQuadTo(734f, 480f)
                horizontalLineTo(520f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(167f, -296f)
                lineToRelative(-28f, -28f)
                quadToRelative(-11f, -11f, -11.5f, -27.5f)
                reflectiveQuadTo(659f, 260f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(29f, 28f)
                quadToRelative(12f, 11f, 12f, 27.5f)
                reflectiveQuadTo(744f, 344f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(687f, 344f)
                close()
                moveToRelative(113f, -184f)
                horizontalLineToRelative(-40f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(720f, 120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(760f, 80f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 160f)
                close()
                moveTo(480f, 280f)
                quadToRelative(-70f, 0f, -123.5f, -42.5f)
                reflectiveQuadTo(286f, 129f)
                quadToRelative(-5f, -19f, 8.5f, -34f)
                reflectiveQuadToRelative(33.5f, -15f)
                horizontalLineToRelative(304f)
                quadToRelative(20f, 0f, 33f, 15f)
                reflectiveQuadToRelative(9f, 34f)
                quadToRelative(-17f, 66f, -70.5f, 108.5f)
                reflectiveQuadTo(480f, 280f)
                close()
            }
        }.build()
        
        return _Solar_power!!
    }

private var _Solar_power: ImageVector? = null

