package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Blind: ImageVector
    get() {
        if (_Blind != null) return _Blind!!
        
        _Blind = ImageVector.Builder(
            name = "blind",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(460f, 200f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(380f, 120f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(460f, 40f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(540f, 120f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(460f, 200f)
                close()
                moveToRelative(260f, 260f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(680f, 500f)
                horizontalLineToRelative(-39f)
                lineTo(850f, 865f)
                quadToRelative(5f, 8f, 2.5f, 15f)
                reflectiveQuadTo(842f, 892f)
                quadToRelative(-8f, 5f, -15f, 3f)
                reflectiveQuadToRelative(-12f, -10f)
                lineTo(588f, 489f)
                quadToRelative(-40f, -13f, -72.5f, -37.5f)
                reflectiveQuadTo(460f, 392f)
                quadToRelative(-10f, 29f, -15.5f, 66.5f)
                reflectiveQuadTo(441f, 528f)
                lineToRelative(79f, 112f)
                verticalLineToRelative(220f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 900f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 860f)
                verticalLineToRelative(-160f)
                lineToRelative(-71f, -102f)
                lineToRelative(-9f, 142f)
                lineToRelative(-96f, 128f)
                quadToRelative(-10f, 14f, -26f, 16f)
                reflectiveQuadToRelative(-30f, -8f)
                quadToRelative(-14f, -10f, -16f, -26f)
                reflectiveQuadToRelative(8f, -30f)
                lineToRelative(80f, -107f)
                verticalLineToRelative(-213f)
                quadToRelative(0f, -31f, 5.5f, -68.5f)
                reflectiveQuadTo(300f, 364f)
                lineToRelative(-60f, 34f)
                verticalLineToRelative(102f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(200f, 540f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 500f)
                verticalLineToRelative(-125f)
                quadToRelative(0f, -11f, 5.5f, -20.5f)
                reflectiveQuadTo(180f, 340f)
                lineToRelative(196f, -111f)
                quadToRelative(8f, -5f, 17f, -7f)
                reflectiveQuadToRelative(19f, -2f)
                quadToRelative(24f, 0f, 44f, 12f)
                reflectiveQuadToRelative(30f, 33f)
                lineToRelative(31f, 67f)
                quadToRelative(20f, 44f, 61f, 66f)
                reflectiveQuadToRelative(102f, 22f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(720f, 460f)
                close()
            }
        }.build()
        
        return _Blind!!
    }

private var _Blind: ImageVector? = null

