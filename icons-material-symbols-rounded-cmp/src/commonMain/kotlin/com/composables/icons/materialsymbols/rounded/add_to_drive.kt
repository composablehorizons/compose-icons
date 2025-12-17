package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Add_to_drive: ImageVector
    get() {
        if (_Add_to_drive != null) return _Add_to_drive!!
        
        _Add_to_drive = ImageVector.Builder(
            name = "add_to_drive",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(220f, 860f)
                quadToRelative(-17f, 0f, -34.5f, -10.5f)
                reflectiveQuadTo(160f, 825f)
                lineTo(60f, 650f)
                quadToRelative(-8f, -14f, -8f, -34.5f)
                reflectiveQuadToRelative(8f, -34.5f)
                lineToRelative(260f, -446f)
                quadToRelative(8f, -14f, 25.5f, -24.5f)
                reflectiveQuadTo(380f, 100f)
                horizontalLineToRelative(200f)
                quadToRelative(17f, 0f, 34.5f, 10.5f)
                reflectiveQuadTo(640f, 135f)
                lineToRelative(144f, 247f)
                quadToRelative(12f, 21f, -0.5f, 41.5f)
                reflectiveQuadTo(747f, 442f)
                quadToRelative(-10f, -1f, -18.5f, -5.5f)
                reflectiveQuadTo(715f, 423f)
                lineTo(574f, 180f)
                horizontalLineTo(386f)
                lineTo(132f, 616f)
                lineToRelative(94f, 164f)
                horizontalLineToRelative(296f)
                quadToRelative(10f, 0f, 18f, 4f)
                reflectiveQuadToRelative(14f, 12f)
                quadToRelative(14f, 20f, 3.5f, 42f)
                reflectiveQuadTo(522f, 860f)
                horizontalLineTo(220f)
                close()
                moveToRelative(93f, -180f)
                quadToRelative(-11f, 0f, -20.5f, -5f)
                reflectiveQuadTo(278f, 660f)
                lineToRelative(-6f, -11f)
                quadToRelative(-5f, -9f, -5f, -20f)
                reflectiveQuadToRelative(5f, -20f)
                lineToRelative(160f, -279f)
                quadToRelative(5f, -9f, 14.5f, -14.5f)
                reflectiveQuadTo(467f, 310f)
                horizontalLineToRelative(26f)
                quadToRelative(11f, 0f, 20.5f, 5.5f)
                reflectiveQuadTo(528f, 330f)
                lineToRelative(74f, 130f)
                quadToRelative(7f, 11f, 5.5f, 24.5f)
                reflectiveQuadTo(597f, 508f)
                quadToRelative(-14f, 15f, -34f, 12f)
                reflectiveQuadToRelative(-30f, -20f)
                lineToRelative(-53f, -92f)
                lineToRelative(-110f, 192f)
                horizontalLineToRelative(117f)
                quadToRelative(19f, 0f, 30.5f, 14f)
                reflectiveQuadToRelative(8.5f, 33f)
                quadToRelative(-2f, 14f, -14f, 23.5f)
                reflectiveQuadToRelative(-26f, 9.5f)
                horizontalLineTo(313f)
                close()
                moveToRelative(407f, 40f)
                horizontalLineToRelative(-80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(600f, 680f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 640f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(760f, 520f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 560f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 680f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 720f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(720f, 800f)
                verticalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Add_to_drive!!
    }

private var _Add_to_drive: ImageVector? = null

