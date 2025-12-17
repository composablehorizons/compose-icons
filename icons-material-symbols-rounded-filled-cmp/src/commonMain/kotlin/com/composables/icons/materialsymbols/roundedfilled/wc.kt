package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Wc: ImageVector
    get() {
        if (_Wc != null) return _Wc!!
        
        _Wc = ImageVector.Builder(
            name = "wc",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(220f, 840f)
                verticalLineToRelative(-260f)
                horizontalLineToRelative(-20f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 540f)
                verticalLineToRelative(-180f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 280f)
                horizontalLineToRelative(120f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(440f, 360f)
                verticalLineToRelative(180f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(400f, 580f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(260f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(340f, 880f)
                horizontalLineToRelative(-80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(220f, 840f)
                close()
                moveToRelative(80f, -600f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(220f, 160f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(300f, 80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(380f, 160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(300f, 240f)
                close()
                moveToRelative(300f, 600f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(-65f)
                quadToRelative(-20f, 0f, -32f, -16.5f)
                reflectiveQuadToRelative(-5f, -36.5f)
                lineToRelative(84f, -253f)
                quadToRelative(8f, -26f, 29.5f, -40f)
                reflectiveQuadToRelative(48.5f, -14f)
                quadToRelative(27f, 0f, 48.5f, 14f)
                reflectiveQuadToRelative(29.5f, 40f)
                lineToRelative(84f, 253f)
                quadToRelative(7f, 20f, -5f, 36.5f)
                reflectiveQuadTo(785f, 640f)
                horizontalLineToRelative(-65f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(680f, 880f)
                horizontalLineToRelative(-40f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(600f, 840f)
                close()
                moveToRelative(60f, -600f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(580f, 160f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(660f, 80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(740f, 160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(660f, 240f)
                close()
            }
        }.build()
        
        return _Wc!!
    }

private var _Wc: ImageVector? = null

