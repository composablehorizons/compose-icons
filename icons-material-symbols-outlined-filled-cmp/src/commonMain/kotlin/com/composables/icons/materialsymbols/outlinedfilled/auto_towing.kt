package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Auto_towing: ImageVector
    get() {
        if (_Auto_towing != null) return _Auto_towing!!
        
        _Auto_towing = ImageVector.Builder(
            name = "auto_towing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 680f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(328f)
                lineTo(120f, 324f)
                verticalLineToRelative(116f)
                horizontalLineTo(40f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(40f)
                lineToRelative(440f, 242f)
                verticalLineToRelative(-282f)
                horizontalLineToRelative(200f)
                lineToRelative(200f, 240f)
                verticalLineToRelative(280f)
                horizontalLineTo(820f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                horizontalLineTo(360f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                horizontalLineTo(40f)
                close()
                moveToRelative(200f, 60f)
                quadToRelative(26f, 0f, 43f, -17f)
                reflectiveQuadToRelative(17f, -43f)
                quadToRelative(0f, -26f, -17f, -43f)
                reflectiveQuadToRelative(-43f, -17f)
                quadToRelative(-26f, 0f, -43f, 17f)
                reflectiveQuadToRelative(-17f, 43f)
                quadToRelative(0f, 26f, 17f, 43f)
                reflectiveQuadToRelative(43f, 17f)
                close()
                moveToRelative(460f, 0f)
                quadToRelative(26f, 0f, 43f, -17f)
                reflectiveQuadToRelative(17f, -43f)
                quadToRelative(0f, -26f, -17f, -43f)
                reflectiveQuadToRelative(-43f, -17f)
                quadToRelative(-26f, 0f, -43f, 17f)
                reflectiveQuadToRelative(-17f, 43f)
                quadToRelative(0f, 26f, 17f, 43f)
                reflectiveQuadToRelative(43f, 17f)
                close()
                moveTo(600f, 400f)
                horizontalLineToRelative(216f)
                lineTo(682f, 240f)
                horizontalLineToRelative(-82f)
                verticalLineToRelative(160f)
                close()
            }
        }.build()
        
        return _Auto_towing!!
    }

private var _Auto_towing: ImageVector? = null

