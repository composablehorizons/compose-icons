package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Fire_truck: ImageVector
    get() {
        if (_Fire_truck != null) return _Fire_truck!!
        
        _Fire_truck = ImageVector.Builder(
            name = "fire_truck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 840f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                horizontalLineToRelative(-40f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(40f, 640f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(560f, 200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(680f, 120f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(760f, 160f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(22f)
                quadToRelative(26f, 0f, 47f, 15f)
                reflectiveQuadToRelative(29f, 40f)
                lineToRelative(58f, 172f)
                quadToRelative(2f, 6f, 3f, 12.5f)
                reflectiveQuadToRelative(1f, 13.5f)
                verticalLineToRelative(267f)
                horizontalLineTo(800f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                horizontalLineTo(400f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(320f, 720f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(280f, 680f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(240f, 720f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(280f, 760f)
                close()
                moveToRelative(400f, 0f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(720f, 720f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(680f, 680f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(640f, 720f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(680f, 760f)
                close()
                moveTo(560f, 440f)
                horizontalLineToRelative(276f)
                lineToRelative(-54f, -160f)
                horizontalLineTo(560f)
                verticalLineToRelative(160f)
                close()
                moveTo(40f, 400f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-80f)
                horizontalLineTo(40f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(60f)
                horizontalLineTo(40f)
                close()
                moveToRelative(100f, -60f)
                horizontalLineToRelative(70f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-70f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(130f, 0f)
                horizontalLineToRelative(70f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-70f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Fire_truck!!
    }

private var _Fire_truck: ImageVector? = null

