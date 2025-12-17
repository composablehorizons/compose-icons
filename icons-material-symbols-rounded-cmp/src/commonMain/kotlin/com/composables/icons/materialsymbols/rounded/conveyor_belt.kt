package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Conveyor_belt: ImageVector
    get() {
        if (_Conveyor_belt != null) return _Conveyor_belt!!
        
        _Conveyor_belt = ImageVector.Builder(
            name = "conveyor_belt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 840f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                horizontalLineToRelative(560f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                horizontalLineTo(200f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(560f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(800f, 720f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(760f, 680f)
                horizontalLineTo(200f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(160f, 720f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(200f, 760f)
                close()
                moveToRelative(200f, -240f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(360f, 480f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(400f, 120f)
                horizontalLineToRelative(320f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(760f, 160f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(720f, 520f)
                horizontalLineTo(400f)
                close()
                moveToRelative(40f, -80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-240f)
                horizontalLineTo(440f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(-322f, -2f)
                quadToRelative(-16f, 0f, -27f, -11.5f)
                reflectiveQuadTo(80f, 399f)
                quadToRelative(0f, -16f, 11.5f, -27f)
                reflectiveQuadToRelative(27.5f, -11f)
                horizontalLineToRelative(120f)
                quadToRelative(16f, 0f, 27f, 11f)
                reflectiveQuadToRelative(11f, 27f)
                quadToRelative(0f, 16f, -11f, 27.5f)
                reflectiveQuadTo(239f, 438f)
                horizontalLineTo(118f)
                close()
                moveToRelative(402f, -118f)
                horizontalLineToRelative(81f)
                quadToRelative(17f, 0f, 28f, -11.5f)
                reflectiveQuadToRelative(11f, -28.5f)
                quadToRelative(0f, -17f, -11f, -28f)
                reflectiveQuadToRelative(-28f, -11f)
                horizontalLineToRelative(-82f)
                quadToRelative(-17f, 0f, -28f, 11f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(520f, 320f)
                close()
                moveToRelative(-321f, 0f)
                quadToRelative(-17f, 0f, -28f, -11.5f)
                reflectiveQuadTo(160f, 280f)
                quadToRelative(0f, -17f, 11.5f, -28f)
                reflectiveQuadToRelative(28.5f, -11f)
                horizontalLineToRelative(38f)
                quadToRelative(17f, 0f, 28f, 11f)
                reflectiveQuadToRelative(11f, 28f)
                quadToRelative(0f, 17f, -11f, 28.5f)
                reflectiveQuadTo(238f, 320f)
                horizontalLineToRelative(-39f)
                close()
                moveToRelative(241f, 120f)
                verticalLineToRelative(-240f)
                verticalLineToRelative(240f)
                close()
            }
        }.build()
        
        return _Conveyor_belt!!
    }

private var _Conveyor_belt: ImageVector? = null

