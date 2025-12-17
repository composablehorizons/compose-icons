package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Water_orp: ImageVector
    get() {
        if (_Water_orp != null) return _Water_orp!!
        
        _Water_orp = ImageVector.Builder(
            name = "water_orp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(300f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(260f, 840f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(300f, 640f)
                horizontalLineToRelative(100f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(440f, 680f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(400f, 880f)
                horizontalLineTo(300f)
                close()
                moveToRelative(20f, -60f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(160f, 60f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(140f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(680f, 700f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 18f, -10f, 33f)
                reflectiveQuadToRelative(-26f, 23f)
                lineToRelative(36f, 84f)
                horizontalLineToRelative(-60f)
                lineToRelative(-34f, -80f)
                horizontalLineToRelative(-46f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(240f, 0f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(140f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(920f, 700f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(860f, 800f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-60f)
                close()
                moveTo(540f, 740f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(240f, 0f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(-600f, 54f)
                quadToRelative(-47f, -45f, -73.5f, -107f)
                reflectiveQuadTo(80f, 552f)
                quadToRelative(0f, -100f, 79.5f, -217.5f)
                reflectiveQuadTo(400f, 80f)
                quadToRelative(161f, 137f, 240.5f, 254.5f)
                reflectiveQuadTo(720f, 552f)
                verticalLineToRelative(8f)
                horizontalLineTo(260f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(180f, 640f)
                verticalLineToRelative(154f)
                close()
            }
        }.build()
        
        return _Water_orp!!
    }

private var _Water_orp: ImageVector? = null

