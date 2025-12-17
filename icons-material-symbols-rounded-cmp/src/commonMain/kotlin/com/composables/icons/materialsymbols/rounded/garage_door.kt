package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Garage_door: ImageVector
    get() {
        if (_Garage_door != null) return _Garage_door!!
        
        _Garage_door = ImageVector.Builder(
            name = "garage_door",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(200f, 800f)
                verticalLineToRelative(-366f)
                lineToRelative(-80f, 61f)
                quadToRelative(-14f, 10f, -30f, 8.5f)
                reflectiveQuadTo(64f, 488f)
                quadToRelative(-10f, -14f, -8f, -30f)
                reflectiveQuadToRelative(16f, -26f)
                lineToRelative(359f, -275f)
                quadToRelative(11f, -8f, 23.5f, -12f)
                reflectiveQuadToRelative(25.5f, -4f)
                quadToRelative(13f, 0f, 25.5f, 4f)
                reflectiveQuadToRelative(23.5f, 12f)
                lineToRelative(359f, 275f)
                quadToRelative(13f, 10f, 15.5f, 26f)
                reflectiveQuadToRelative(-7.5f, 30f)
                quadToRelative(-10f, 14f, -26f, 15.5f)
                reflectiveQuadToRelative(-30f, -8.5f)
                lineToRelative(-80f, -61f)
                verticalLineToRelative(366f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(720f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(680f, 800f)
                verticalLineToRelative(-360f)
                horizontalLineTo(280f)
                verticalLineToRelative(360f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(240f, 840f)
                close()
                moveToRelative(120f, -40f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(320f, 760f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(360f, 720f)
                horizontalLineToRelative(240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(640f, 760f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(600f, 800f)
                horizontalLineTo(360f)
                close()
                moveToRelative(0f, -120f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(320f, 640f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(360f, 600f)
                horizontalLineToRelative(240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(640f, 640f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(600f, 680f)
                horizontalLineTo(360f)
                close()
                moveToRelative(0f, -120f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(320f, 520f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(360f, 480f)
                horizontalLineToRelative(240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(640f, 520f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(600f, 560f)
                horizontalLineTo(360f)
                close()
                moveToRelative(-63f, -200f)
                horizontalLineToRelative(366f)
                lineTo(480f, 221f)
                lineTo(297f, 360f)
                close()
            }
        }.build()
        
        return _Garage_door!!
    }

private var _Garage_door: ImageVector? = null

