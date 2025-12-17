package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Location_away: ImageVector
    get() {
        if (_Location_away != null) return _Location_away!!
        
        _Location_away = ImageVector.Builder(
            name = "location_away",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(343f, 490f)
                close()
                moveTo(160f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 760f)
                verticalLineToRelative(-360f)
                quadToRelative(0f, -19f, 8.5f, -36f)
                reflectiveQuadToRelative(23.5f, -28f)
                lineToRelative(240f, -180f)
                quadToRelative(11f, -8f, 23f, -12f)
                reflectiveQuadToRelative(25f, -4f)
                quadToRelative(13f, 0f, 25f, 4f)
                reflectiveQuadToRelative(23f, 12f)
                lineToRelative(109f, 82f)
                quadToRelative(16f, 12f, 16.5f, 28.5f)
                reflectiveQuadTo(565f, 295f)
                quadToRelative(-9f, 12f, -24.5f, 15.5f)
                reflectiveQuadTo(508f, 302f)
                lineToRelative(-108f, -82f)
                lineToRelative(-240f, 180f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(320f, 800f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(280f, 840f)
                horizontalLineTo(160f)
                close()
                moveToRelative(480f, -200f)
                quadToRelative(54f, 0f, 104.5f, 14f)
                reflectiveQuadToRelative(96.5f, 41f)
                quadToRelative(18f, 11f, 28.5f, 29.5f)
                reflectiveQuadTo(880f, 764f)
                quadToRelative(0f, 32f, -22f, 54f)
                reflectiveQuadToRelative(-54f, 22f)
                horizontalLineTo(476f)
                quadToRelative(-32f, 0f, -54f, -22f)
                reflectiveQuadToRelative(-22f, -54f)
                quadToRelative(0f, -21f, 10.5f, -39.5f)
                reflectiveQuadTo(439f, 695f)
                quadToRelative(46f, -27f, 96.5f, -41f)
                reflectiveQuadTo(640f, 640f)
                close()
                moveTo(486f, 760f)
                horizontalLineToRelative(308f)
                quadToRelative(-35f, -20f, -74f, -30f)
                reflectiveQuadToRelative(-80f, -10f)
                quadToRelative(-41f, 0f, -80f, 10f)
                reflectiveQuadToRelative(-74f, 30f)
                close()
                moveToRelative(154f, -160f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(680f, 480f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(640f, 440f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(600f, 480f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(640f, 520f)
                close()
                moveToRelative(0f, 240f)
                close()
            }
        }.build()
        
        return _Location_away!!
    }

private var _Location_away: ImageVector? = null

