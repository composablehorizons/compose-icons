package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Air: ImageVector
    get() {
        if (_Air != null) return _Air!!
        
        _Air = ImageVector.Builder(
            name = "air",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(460f, 800f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(460f, 720f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(500f, 680f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(460f, 640f)
                horizontalLineTo(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(380f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveTo(80f, 400f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(540f)
                quadToRelative(26f, 0f, 43f, -17f)
                reflectiveQuadToRelative(17f, -43f)
                quadToRelative(0f, -26f, -17f, -43f)
                reflectiveQuadToRelative(-43f, -17f)
                quadToRelative(-26f, 0f, -43f, 17f)
                reflectiveQuadToRelative(-17f, 43f)
                horizontalLineToRelative(-80f)
                quadToRelative(0f, -59f, 40.5f, -99.5f)
                reflectiveQuadTo(620f, 120f)
                quadToRelative(59f, 0f, 99.5f, 40.5f)
                reflectiveQuadTo(760f, 260f)
                quadToRelative(0f, 59f, -40.5f, 99.5f)
                reflectiveQuadTo(620f, 400f)
                horizontalLineTo(80f)
                close()
                moveToRelative(660f, 320f)
                verticalLineToRelative(-80f)
                quadToRelative(26f, 0f, 43f, -17f)
                reflectiveQuadToRelative(17f, -43f)
                quadToRelative(0f, -26f, -17f, -43f)
                reflectiveQuadToRelative(-43f, -17f)
                horizontalLineTo(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(660f)
                quadToRelative(59f, 0f, 99.5f, 40.5f)
                reflectiveQuadTo(880f, 580f)
                quadToRelative(0f, 59f, -40.5f, 99.5f)
                reflectiveQuadTo(740f, 720f)
                close()
            }
        }.build()
        
        return _Air!!
    }

private var _Air: ImageVector? = null

