package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Traffic: ImageVector
    get() {
        if (_Traffic != null) return _Traffic!!
        
        _Traffic = ImageVector.Builder(
            name = "traffic",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 720f)
                quadToRelative(26f, 0f, 43f, -17f)
                reflectiveQuadToRelative(17f, -43f)
                quadToRelative(0f, -26f, -17f, -43f)
                reflectiveQuadToRelative(-43f, -17f)
                quadToRelative(-26f, 0f, -43f, 17f)
                reflectiveQuadToRelative(-17f, 43f)
                quadToRelative(0f, 26f, 17f, 43f)
                reflectiveQuadToRelative(43f, 17f)
                close()
                moveToRelative(0f, -180f)
                quadToRelative(26f, 0f, 43f, -17f)
                reflectiveQuadToRelative(17f, -43f)
                quadToRelative(0f, -26f, -17f, -43f)
                reflectiveQuadToRelative(-43f, -17f)
                quadToRelative(-26f, 0f, -43f, 17f)
                reflectiveQuadToRelative(-17f, 43f)
                quadToRelative(0f, 26f, 17f, 43f)
                reflectiveQuadToRelative(43f, 17f)
                close()
                moveToRelative(0f, -180f)
                quadToRelative(26f, 0f, 43f, -17f)
                reflectiveQuadToRelative(17f, -43f)
                quadToRelative(0f, -26f, -17f, -43f)
                reflectiveQuadToRelative(-43f, -17f)
                quadToRelative(-26f, 0f, -43f, 17f)
                reflectiveQuadToRelative(-17f, 43f)
                quadToRelative(0f, 26f, 17f, 43f)
                reflectiveQuadToRelative(43f, 17f)
                close()
                moveTo(280f, 840f)
                verticalLineToRelative(-86f)
                quadToRelative(-51f, -14f, -85.5f, -56f)
                reflectiveQuadTo(160f, 600f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-46f)
                quadToRelative(-51f, -14f, -85.5f, -56f)
                reflectiveQuadTo(160f, 400f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-46f)
                quadToRelative(-51f, -14f, -85.5f, -56f)
                reflectiveQuadTo(160f, 200f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(120f)
                quadToRelative(0f, 56f, -34.5f, 98f)
                reflectiveQuadTo(680f, 354f)
                verticalLineToRelative(46f)
                horizontalLineToRelative(120f)
                quadToRelative(0f, 56f, -34.5f, 98f)
                reflectiveQuadTo(680f, 554f)
                verticalLineToRelative(46f)
                horizontalLineToRelative(120f)
                quadToRelative(0f, 56f, -34.5f, 98f)
                reflectiveQuadTo(680f, 754f)
                verticalLineToRelative(86f)
                horizontalLineTo(280f)
                close()
            }
        }.build()
        
        return _Traffic!!
    }

private var _Traffic: ImageVector? = null

