package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Flowsheet: ImageVector
    get() {
        if (_Flowsheet != null) return _Flowsheet!!
        
        _Flowsheet = ImageVector.Builder(
            name = "flowsheet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 440f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(440f, 400f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(400f, 360f)
                horizontalLineTo(280f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(240f, 400f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(280f, 440f)
                close()
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(681f)
                quadToRelative(11f, 0f, 18f, 6f)
                reflectiveQuadToRelative(7f, 16f)
                quadToRelative(0f, 11f, -7.5f, 17.5f)
                reflectiveQuadTo(841f, 204f)
                quadToRelative(-8f, -2f, -18.5f, -3f)
                reflectiveQuadToRelative(-22.5f, -1f)
                quadToRelative(-83f, 0f, -141.5f, 58.5f)
                reflectiveQuadTo(600f, 400f)
                quadToRelative(0f, 22f, 4f, 42f)
                reflectiveQuadToRelative(12f, 38f)
                horizontalLineToRelative(-56f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                verticalLineToRelative(40f)
                quadToRelative(-28f, 20f, -47f, 48.5f)
                reflectiveQuadTo(366f, 751f)
                quadToRelative(-5f, 20f, -20f, 34.5f)
                reflectiveQuadTo(311f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(400f, 40f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(600f, 800f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(560f, 760f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(520f, 800f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(560f, 840f)
                close()
                moveToRelative(240f, -400f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(840f, 400f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(800f, 360f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(760f, 400f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(800f, 440f)
                close()
                moveTo(560f, 920f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -39f, 22.5f, -70f)
                reflectiveQuadToRelative(57.5f, -43f)
                verticalLineToRelative(-87f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(560f, 560f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-47f)
                quadToRelative(-35f, -12f, -57.5f, -43f)
                reflectiveQuadTo(680f, 400f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 39f, -22.5f, 70f)
                reflectiveQuadTo(840f, 513f)
                verticalLineToRelative(87f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 640f)
                horizontalLineTo(600f)
                verticalLineToRelative(47f)
                quadToRelative(35f, 12f, 57.5f, 43f)
                reflectiveQuadToRelative(22.5f, 70f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveTo(400f, 600f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(440f, 560f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(400f, 520f)
                horizontalLineTo(280f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(240f, 560f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(280f, 600f)
                horizontalLineToRelative(120f)
                close()
            }
        }.build()
        
        return _Flowsheet!!
    }

private var _Flowsheet: ImageVector? = null

