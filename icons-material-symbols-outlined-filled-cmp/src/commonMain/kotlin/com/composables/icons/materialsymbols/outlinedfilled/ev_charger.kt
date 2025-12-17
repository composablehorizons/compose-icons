package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Ev_charger: ImageVector
    get() {
        if (_Ev_charger != null) return _Ev_charger!!
        
        _Ev_charger = ImageVector.Builder(
            name = "ev_charger",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 400f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-200f)
                horizontalLineTo(240f)
                verticalLineToRelative(200f)
                close()
                moveToRelative(-80f, 440f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 120f)
                horizontalLineToRelative(240f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 200f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(50f)
                quadToRelative(29f, 0f, 49.5f, 20.5f)
                reflectiveQuadTo(680f, 550f)
                verticalLineToRelative(185f)
                quadToRelative(0f, 17f, 14f, 31f)
                reflectiveQuadToRelative(31f, 14f)
                quadToRelative(18f, 0f, 31.5f, -14f)
                reflectiveQuadToRelative(13.5f, -31f)
                verticalLineToRelative(-375f)
                horizontalLineToRelative(-10f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(720f, 320f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 360f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(375f)
                quadToRelative(0f, 42f, -30.5f, 73.5f)
                reflectiveQuadTo(725f, 840f)
                quadToRelative(-43f, 0f, -74f, -31.5f)
                reflectiveQuadTo(620f, 735f)
                verticalLineToRelative(-185f)
                quadToRelative(0f, -5f, -2.5f, -7.5f)
                reflectiveQuadTo(610f, 540f)
                horizontalLineToRelative(-50f)
                verticalLineToRelative(300f)
                horizontalLineTo(160f)
                close()
                moveToRelative(180f, -80f)
                lineToRelative(100f, -160f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-120f)
                lineTo(280f, 640f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(120f)
                close()
            }
        }.build()
        
        return _Ev_charger!!
    }

private var _Ev_charger: ImageVector? = null

