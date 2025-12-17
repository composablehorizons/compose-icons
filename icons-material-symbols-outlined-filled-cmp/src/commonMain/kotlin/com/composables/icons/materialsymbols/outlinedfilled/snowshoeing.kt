package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Snowshoeing: ImageVector
    get() {
        if (_Snowshoeing != null) return _Snowshoeing!!
        
        _Snowshoeing = ImageVector.Builder(
            name = "snowshoeing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(340f, 920f)
                quadToRelative(-18f, 0f, -43.5f, -19f)
                reflectiveQuadTo(255f, 862f)
                lineToRelative(-95f, -122f)
                lineToRelative(47f, -38f)
                lineToRelative(46f, 59f)
                lineToRelative(115f, -81f)
                lineToRelative(64f, -325f)
                lineToRelative(-72f, 28f)
                verticalLineToRelative(137f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-189f)
                lineToRelative(165f, -69f)
                quadToRelative(32f, -14f, 47f, -18f)
                reflectiveQuadToRelative(28f, -4f)
                quadToRelative(21f, 0f, 38.5f, 11f)
                reflectiveQuadToRelative(29.5f, 29f)
                lineToRelative(40f, 63f)
                quadToRelative(26f, 41f, 70.5f, 69f)
                reflectiveQuadTo(800f, 440f)
                verticalLineToRelative(80f)
                quadToRelative(-66f, 0f, -123.5f, -28f)
                reflectiveQuadTo(580f, 419f)
                lineToRelative(-24f, 120f)
                lineToRelative(84f, 80f)
                verticalLineToRelative(241f)
                quadToRelative(15f, -1f, 28.5f, -5f)
                reflectiveQuadToRelative(25.5f, -11f)
                quadToRelative(4f, -2f, 7.5f, -3f)
                reflectiveQuadToRelative(7.5f, -1f)
                quadToRelative(14f, 0f, 22.5f, 9.5f)
                reflectiveQuadTo(740f, 870f)
                quadToRelative(0f, 8f, -3.5f, 14.5f)
                reflectiveQuadTo(725f, 896f)
                quadToRelative(-20f, 12f, -42.5f, 18f)
                reflectiveQuadTo(635f, 920f)
                horizontalLineTo(480f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-181f)
                lineToRelative(-84f, -80f)
                lineToRelative(-36f, 129f)
                lineToRelative(-137f, 97f)
                lineToRelative(3f, 4f)
                quadToRelative(9f, 12f, 20.5f, 20f)
                reflectiveQuadTo(352f, 862f)
                quadToRelative(9f, 5f, 14f, 10.5f)
                reflectiveQuadToRelative(5f, 16.5f)
                quadToRelative(0f, 13f, -9f, 22f)
                reflectiveQuadToRelative(-22f, 9f)
                close()
                moveToRelative(240f, -700f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(500f, 140f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(580f, 60f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(660f, 140f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(580f, 220f)
                close()
            }
        }.build()
        
        return _Snowshoeing!!
    }

private var _Snowshoeing: ImageVector? = null

