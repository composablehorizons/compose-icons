package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Headset_off: ImageVector
    get() {
        if (_Headset_off != null) return _Headset_off!!
        
        _Headset_off = ImageVector.Builder(
            name = "headset_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(800f, 680f)
                quadToRelative(-15f, 0f, -27.5f, -10.5f)
                reflectiveQuadTo(760f, 639f)
                verticalLineToRelative(-79f)
                horizontalLineToRelative(-80f)
                quadToRelative(-20f, 0f, -30f, -12.5f)
                reflectiveQuadTo(640f, 520f)
                quadToRelative(0f, -15f, 10f, -27.5f)
                reflectiveQuadToRelative(30f, -12.5f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -118f, -82f, -199f)
                reflectiveQuadToRelative(-198f, -81f)
                quadToRelative(-44f, 0f, -83.5f, 12.5f)
                reflectiveQuadTo(324f, 208f)
                lineToRelative(-58f, -56f)
                quadToRelative(45f, -35f, 99.5f, -53.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(74f, 0f, 139.5f, 28f)
                reflectiveQuadTo(734f, 185f)
                quadToRelative(49f, 49f, 77.5f, 114.5f)
                reflectiveQuadTo(840f, 440f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 20f, -12.5f, 30f)
                reflectiveQuadTo(800f, 680f)
                close()
                moveTo(520f, 920f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(480f, 880f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(520f, 840f)
                horizontalLineToRelative(207f)
                lineToRelative(-40f, -40f)
                horizontalLineToRelative(-7f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(600f, 720f)
                verticalLineToRelative(-7f)
                lineTo(221f, 334f)
                quadToRelative(-9f, 24f, -15f, 51.5f)
                reflectiveQuadToRelative(-6f, 54.5f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(360f, 560f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(280f, 800f)
                horizontalLineToRelative(-80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 720f)
                verticalLineToRelative(-280f)
                quadToRelative(0f, -45f, 10.5f, -87f)
                reflectiveQuadToRelative(30.5f, -80f)
                lineTo(56f, 168f)
                quadToRelative(-12f, -12f, -12f, -28f)
                reflectiveQuadToRelative(12f, -28f)
                quadToRelative(12f, -11f, 28f, -11.5f)
                reflectiveQuadToRelative(28f, 11.5f)
                lineTo(868f, 869f)
                quadToRelative(14f, 14f, 6.5f, 32.5f)
                reflectiveQuadTo(847f, 920f)
                horizontalLineTo(520f)
                close()
                moveTo(200f, 560f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(0f, 0f)
                horizontalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(480f, 0f)
                horizontalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Headset_off!!
    }

private var _Headset_off: ImageVector? = null

