package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Electric_meter: ImageVector
    get() {
        if (_Electric_meter != null) return _Electric_meter!!
        
        _Electric_meter = ImageVector.Builder(
            name = "electric_meter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 838f)
                verticalLineToRelative(-60f)
                quadToRelative(-106f, -37f, -173f, -129.5f)
                reflectiveQuadTo(120f, 438f)
                quadToRelative(0f, -75f, 28.5f, -140.5f)
                reflectiveQuadToRelative(77f, -114f)
                quadToRelative(48.5f, -48.5f, 114f, -77f)
                reflectiveQuadTo(479f, 78f)
                quadToRelative(74f, 0f, 140f, 28.5f)
                reflectiveQuadToRelative(115f, 77f)
                quadToRelative(49f, 48.5f, 77.5f, 114f)
                reflectiveQuadTo(840f, 438f)
                quadToRelative(0f, 118f, -67.5f, 209.5f)
                reflectiveQuadTo(600f, 777f)
                verticalLineToRelative(61f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(560f, 878f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(520f, 838f)
                verticalLineToRelative(-42f)
                quadToRelative(-10f, 2f, -20f, 2f)
                horizontalLineToRelative(-21f)
                quadToRelative(-10f, 0f, -19.5f, -0.5f)
                reflectiveQuadTo(440f, 796f)
                verticalLineToRelative(42f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(400f, 878f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(360f, 838f)
                close()
                moveToRelative(0f, -478f)
                horizontalLineToRelative(240f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(640f, 320f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(600f, 280f)
                horizontalLineTo(360f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(320f, 320f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(360f, 360f)
                close()
                moveToRelative(80f, 210f)
                lineToRelative(-20f, 20f)
                quadToRelative(-13f, 13f, -13f, 30f)
                reflectiveQuadToRelative(13f, 30f)
                quadToRelative(13f, 13f, 30f, 13f)
                reflectiveQuadToRelative(30f, -13f)
                lineToRelative(62f, -62f)
                quadToRelative(12f, -12f, 12f, -28f)
                reflectiveQuadToRelative(-12f, -28f)
                lineToRelative(-22f, -22f)
                lineToRelative(20f, -20f)
                quadToRelative(13f, -13f, 13f, -30f)
                reflectiveQuadToRelative(-13f, -30f)
                quadToRelative(-13f, -13f, -30f, -13f)
                reflectiveQuadToRelative(-30f, 13f)
                lineToRelative(-62f, 62f)
                quadToRelative(-12f, 12f, -12f, 28f)
                reflectiveQuadToRelative(12f, 28f)
                lineToRelative(22f, 22f)
                close()
            }
        }.build()
        
        return _Electric_meter!!
    }

private var _Electric_meter: ImageVector? = null

