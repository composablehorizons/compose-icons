package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Vo2_max: ImageVector
    get() {
        if (_Vo2_max != null) return _Vo2_max!!
        
        _Vo2_max = ImageVector.Builder(
            name = "vo2_max",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(180f, 800f)
                quadToRelative(-59f, 0f, -99.5f, -42f)
                reflectiveQuadTo(40f, 656f)
                verticalLineToRelative(-178f)
                quadToRelative(0f, -47f, 20f, -88f)
                reflectiveQuadToRelative(57f, -70f)
                lineToRelative(173f, -136f)
                quadToRelative(14f, -11f, 22f, -27.5f)
                reflectiveQuadToRelative(8f, -34.5f)
                verticalLineToRelative(-82f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(82f)
                quadToRelative(0f, 18f, 8f, 34.5f)
                reflectiveQuadToRelative(23f, 27.5f)
                lineToRelative(173f, 136f)
                quadToRelative(36f, 29f, 56f, 70f)
                reflectiveQuadToRelative(20f, 88f)
                verticalLineToRelative(42f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-42f)
                quadToRelative(0f, -28f, -12f, -52.5f)
                reflectiveQuadTo(554f, 384f)
                lineToRelative(-74f, -59f)
                verticalLineToRelative(461f)
                quadToRelative(-38f, -18f, -59.5f, -51.5f)
                reflectiveQuadTo(400f, 656f)
                verticalLineToRelative(-394f)
                lineToRelative(-40f, -32f)
                lineToRelative(-40f, 32f)
                verticalLineToRelative(394f)
                quadToRelative(1f, 60f, -40f, 102f)
                reflectiveQuadToRelative(-100f, 42f)
                close()
                moveToRelative(1f, -80f)
                quadToRelative(26f, 0f, 43f, -19f)
                reflectiveQuadToRelative(16f, -45f)
                verticalLineToRelative(-331f)
                lineToRelative(-74f, 59f)
                quadToRelative(-22f, 17f, -34f, 41.5f)
                reflectiveQuadTo(120f, 478f)
                verticalLineToRelative(178f)
                quadToRelative(0f, 26f, 17.5f, 45f)
                reflectiveQuadToRelative(43.5f, 19f)
                close()
                moveToRelative(379f, 80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(520f, 760f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(560f, 560f)
                horizontalLineToRelative(100f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(700f, 600f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(660f, 800f)
                horizontalLineTo(560f)
                close()
                moveToRelative(20f, -60f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(120f)
                close()
                moveTo(740f, 880f)
                verticalLineToRelative(-110f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(780f, 730f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-30f)
                horizontalLineTo(740f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(140f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 680f)
                verticalLineToRelative(70f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 790f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(30f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(60f)
                horizontalLineTo(740f)
                close()
                moveTo(180f, 522f)
                close()
                moveToRelative(360f, 0f)
                close()
            }
        }.build()
        
        return _Vo2_max!!
    }

private var _Vo2_max: ImageVector? = null

