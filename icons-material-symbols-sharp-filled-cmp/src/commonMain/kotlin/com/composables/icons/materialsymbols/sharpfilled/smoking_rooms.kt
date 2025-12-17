package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Smoking_rooms: ImageVector
    get() {
        if (_Smoking_rooms != null) return _Smoking_rooms!!
        
        _Smoking_rooms = ImageVector.Builder(
            name = "smoking_rooms",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 760f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(600f)
                verticalLineToRelative(120f)
                horizontalLineTo(80f)
                close()
                moveToRelative(640f, 0f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(100f, 0f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-60f)
                close()
                moveTo(720f, 600f)
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
        
        return _Smoking_rooms!!
    }

private var _Smoking_rooms: ImageVector? = null

