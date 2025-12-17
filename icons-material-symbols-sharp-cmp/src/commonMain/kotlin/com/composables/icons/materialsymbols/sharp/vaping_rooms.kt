package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Vaping_rooms: ImageVector
    get() {
        if (_Vaping_rooms != null) return _Vaping_rooms!!
        
        _Vaping_rooms = ImageVector.Builder(
            name = "vaping_rooms",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 760f)
                quadToRelative(-39f, -10f, -79.5f, -15f)
                reflectiveQuadToRelative(-80.5f, -5f)
                horizontalLineTo(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(40f)
                quadToRelative(40f, 0f, 80.5f, -5f)
                reflectiveQuadToRelative(79.5f, -15f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(40f, 0f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(120f)
                horizontalLineTo(320f)
                close()
                moveToRelative(100f, -40f)
                quadToRelative(8f, 0f, 14f, -6f)
                reflectiveQuadToRelative(6f, -14f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                quadToRelative(0f, 8f, 6f, 14f)
                reflectiveQuadToRelative(14f, 6f)
                close()
                moveToRelative(300f, -120f)
                verticalLineToRelative(-52f)
                quadToRelative(0f, -39f, -23f, -59.5f)
                reflectiveQuadTo(642f, 468f)
                horizontalLineToRelative(-62f)
                quadToRelative(-56f, 0f, -95f, -39f)
                reflectiveQuadToRelative(-39f, -95f)
                quadToRelative(0f, -56f, 39f, -95f)
                reflectiveQuadToRelative(95f, -39f)
                verticalLineToRelative(60f)
                quadToRelative(-30f, 0f, -52f, 21f)
                reflectiveQuadToRelative(-22f, 53f)
                quadToRelative(0f, 32f, 22f, 53f)
                reflectiveQuadToRelative(52f, 21f)
                horizontalLineToRelative(62f)
                quadToRelative(56f, 0f, 97f, 36f)
                reflectiveQuadToRelative(41f, 90f)
                verticalLineToRelative(66f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(100f, 0f)
                verticalLineToRelative(-90f)
                quadToRelative(0f, -66f, -46f, -114f)
                reflectiveQuadToRelative(-114f, -48f)
                verticalLineToRelative(-60f)
                quadToRelative(30f, 0f, 52f, -22f)
                reflectiveQuadToRelative(22f, -52f)
                quadToRelative(0f, -30f, -22f, -52f)
                reflectiveQuadToRelative(-52f, -22f)
                verticalLineToRelative(-60f)
                quadToRelative(56f, 0f, 95f, 39f)
                reflectiveQuadToRelative(39f, 95f)
                quadToRelative(0f, 29f, -11f, 52.5f)
                reflectiveQuadTo(754f, 310f)
                quadToRelative(56f, 26f, 91f, 80f)
                reflectiveQuadToRelative(35f, 120f)
                verticalLineToRelative(90f)
                horizontalLineToRelative(-60f)
                close()
            }
        }.build()
        
        return _Vaping_rooms!!
    }

private var _Vaping_rooms: ImageVector? = null

