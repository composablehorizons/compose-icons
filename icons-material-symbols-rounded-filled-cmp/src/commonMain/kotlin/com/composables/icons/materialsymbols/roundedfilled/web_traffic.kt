package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Web_traffic: ImageVector
    get() {
        if (_Web_traffic != null) return _Web_traffic!!
        
        _Web_traffic = ImageVector.Builder(
            name = "web_traffic",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 400f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(200f, 440f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(160f, 480f)
                horizontalLineToRelative(-40f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 440f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 400f)
                close()
                moveToRelative(68f, 216f)
                lineToRelative(28f, -28f)
                quadToRelative(12f, -12f, 28f, -11.5f)
                reflectiveQuadToRelative(28f, 11.5f)
                quadToRelative(12f, 12f, 12.5f, 28.5f)
                reflectiveQuadTo(273f, 645f)
                lineToRelative(-28f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 11.5f)
                reflectiveQuadTo(188f, 672f)
                quadToRelative(-11f, -12f, -11.5f, -28f)
                reflectiveQuadToRelative(11.5f, -28f)
                close()
                moveToRelative(28f, -324f)
                lineToRelative(-28f, -28f)
                quadToRelative(-12f, -12f, -11.5f, -28f)
                reflectiveQuadToRelative(11.5f, -28f)
                quadToRelative(12f, -12f, 28.5f, -12.5f)
                reflectiveQuadTo(245f, 207f)
                lineToRelative(28f, 28f)
                quadToRelative(12f, 12f, 11.5f, 28.5f)
                reflectiveQuadTo(272f, 292f)
                quadToRelative(-12f, 11f, -28f, 11.5f)
                reflectiveQuadTo(216f, 292f)
                close()
                moveToRelative(476f, 480f)
                lineTo(530f, 610f)
                lineToRelative(-30f, 90f)
                quadToRelative(-2f, 7f, -7.5f, 10.5f)
                reflectiveQuadTo(481f, 714f)
                quadToRelative(-6f, 0f, -11.5f, -4f)
                reflectiveQuadToRelative(-7.5f, -11f)
                lineToRelative(-86f, -286f)
                quadToRelative(-2f, -8f, 0.5f, -16f)
                reflectiveQuadToRelative(7.5f, -13f)
                quadToRelative(5f, -5f, 13f, -7.5f)
                reflectiveQuadToRelative(16f, -0.5f)
                lineToRelative(288f, 86f)
                quadToRelative(7f, 2f, 10.5f, 7.5f)
                reflectiveQuadTo(715f, 481f)
                quadToRelative(0f, 6f, -3f, 11.5f)
                reflectiveQuadToRelative(-10f, 7.5f)
                lineToRelative(-90f, 32f)
                lineToRelative(160f, 160f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                lineToRelative(-24f, 24f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                close()
                moveTo(400f, 200f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(440f, 120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(480f, 160f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(440f, 240f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(400f, 200f)
                close()
                moveToRelative(207f, 35f)
                lineToRelative(29f, -29f)
                quadToRelative(11f, -11f, 27.5f, -11.5f)
                reflectiveQuadTo(692f, 206f)
                quadToRelative(11f, 11f, 11.5f, 27.5f)
                reflectiveQuadTo(693f, 262f)
                lineToRelative(-29f, 30f)
                quadToRelative(-11f, 12f, -27.5f, 11.5f)
                reflectiveQuadTo(608f, 292f)
                quadToRelative(-12f, -12f, -12.5f, -28.5f)
                reflectiveQuadTo(607f, 235f)
                close()
            }
        }.build()
        
        return _Web_traffic!!
    }

private var _Web_traffic: ImageVector? = null

