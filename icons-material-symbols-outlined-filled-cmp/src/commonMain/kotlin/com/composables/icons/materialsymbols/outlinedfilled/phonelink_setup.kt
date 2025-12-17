package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Phonelink_setup: ImageVector
    get() {
        if (_Phonelink_setup != null) return _Phonelink_setup!!
        
        _Phonelink_setup = ImageVector.Builder(
            name = "phonelink_setup",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 920f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 840f)
                verticalLineToRelative(-720f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(280f, 40f)
                horizontalLineToRelative(400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 120f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-40f)
                horizontalLineTo(280f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(680f, 920f)
                horizontalLineTo(280f)
                close()
                moveToRelative(400f, -280f)
                lineToRelative(-6f, -50f)
                quadToRelative(-8f, -3f, -14f, -6.5f)
                reflectiveQuadToRelative(-12f, -9.5f)
                lineToRelative(-46f, 20f)
                lineToRelative(-40f, -70f)
                lineToRelative(40f, -30f)
                quadToRelative(-2f, -8f, -2f, -15f)
                reflectiveQuadToRelative(2f, -15f)
                lineToRelative(-40f, -30f)
                lineToRelative(42f, -68f)
                lineToRelative(44f, 18f)
                quadToRelative(6f, -5f, 12f, -8f)
                reflectiveQuadToRelative(14f, -6f)
                lineToRelative(6f, -50f)
                horizontalLineToRelative(80f)
                lineToRelative(6f, 50f)
                quadToRelative(8f, 3f, 14f, 6f)
                reflectiveQuadToRelative(12f, 8f)
                lineToRelative(44f, -18f)
                lineToRelative(42f, 68f)
                lineToRelative(-40f, 30f)
                quadToRelative(2f, 8f, 2f, 15f)
                reflectiveQuadToRelative(-2f, 15f)
                lineToRelative(40f, 30f)
                lineToRelative(-40f, 70f)
                lineToRelative(-46f, -20f)
                quadToRelative(-6f, 6f, -12f, 9.5f)
                reflectiveQuadToRelative(-14f, 6.5f)
                lineToRelative(-6f, 50f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(40f, -100f)
                quadToRelative(26f, 0f, 43f, -17f)
                reflectiveQuadToRelative(17f, -43f)
                quadToRelative(0f, -26f, -17f, -43f)
                reflectiveQuadToRelative(-43f, -17f)
                quadToRelative(-26f, 0f, -43f, 17f)
                reflectiveQuadToRelative(-17f, 43f)
                quadToRelative(0f, 26f, 17f, 43f)
                reflectiveQuadToRelative(43f, 17f)
                close()
            }
        }.build()
        
        return _Phonelink_setup!!
    }

private var _Phonelink_setup: ImageVector? = null

