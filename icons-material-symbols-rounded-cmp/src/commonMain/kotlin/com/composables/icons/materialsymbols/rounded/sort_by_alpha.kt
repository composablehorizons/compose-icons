package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Sort_by_alpha: ImageVector
    get() {
        if (_Sort_by_alpha != null) return _Sort_by_alpha!!
        
        _Sort_by_alpha = ImageVector.Builder(
            name = "sort_by_alpha",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(196f, 584f)
                lineToRelative(-23f, 70f)
                quadToRelative(-4f, 11f, -14f, 18.5f)
                reflectiveQuadToRelative(-22f, 7.5f)
                quadToRelative(-20f, 0f, -32.5f, -16.5f)
                reflectiveQuadTo(100f, 627f)
                lineToRelative(120f, -321f)
                quadToRelative(5f, -12f, 15f, -19f)
                reflectiveQuadToRelative(23f, -7f)
                horizontalLineToRelative(30f)
                quadToRelative(13f, 0f, 23f, 7f)
                reflectiveQuadToRelative(15f, 19f)
                lineToRelative(121f, 323f)
                quadToRelative(7f, 19f, -4.5f, 35f)
                reflectiveQuadTo(411f, 680f)
                quadToRelative(-12f, 0f, -22f, -7.5f)
                reflectiveQuadTo(375f, 654f)
                lineToRelative(-25f, -70f)
                horizontalLineTo(196f)
                close()
                moveToRelative(24f, -68f)
                horizontalLineToRelative(104f)
                lineToRelative(-48f, -150f)
                horizontalLineToRelative(-6f)
                lineToRelative(-50f, 150f)
                close()
                moveToRelative(418f, 92f)
                horizontalLineToRelative(166f)
                quadToRelative(15f, 0f, 25.5f, 10.5f)
                reflectiveQuadTo(840f, 644f)
                quadToRelative(0f, 15f, -10.5f, 25.5f)
                reflectiveQuadTo(804f, 680f)
                horizontalLineTo(572f)
                quadToRelative(-10f, 0f, -17f, -7f)
                reflectiveQuadToRelative(-7f, -17f)
                verticalLineToRelative(-38f)
                quadToRelative(0f, -7f, 2f, -13.5f)
                reflectiveQuadToRelative(7f, -11.5f)
                lineToRelative(193f, -241f)
                horizontalLineTo(592f)
                quadToRelative(-15f, 0f, -25.5f, -10.5f)
                reflectiveQuadTo(556f, 316f)
                quadToRelative(0f, -15f, 10.5f, -25.5f)
                reflectiveQuadTo(592f, 280f)
                horizontalLineToRelative(222f)
                quadToRelative(10f, 0f, 17f, 7f)
                reflectiveQuadToRelative(7f, 17f)
                verticalLineToRelative(38f)
                quadToRelative(0f, 7f, -2f, 13.5f)
                reflectiveQuadToRelative(-7f, 11.5f)
                lineTo(638f, 608f)
                close()
                moveTo(384f, 200f)
                quadToRelative(-7f, 0f, -9.5f, -6f)
                reflectiveQuadToRelative(2.5f, -11f)
                lineToRelative(89f, -89f)
                quadToRelative(6f, -6f, 14f, -6f)
                reflectiveQuadToRelative(14f, 6f)
                lineToRelative(89f, 89f)
                quadToRelative(5f, 5f, 2.5f, 11f)
                reflectiveQuadToRelative(-9.5f, 6f)
                horizontalLineTo(384f)
                close()
                moveToRelative(82f, 666f)
                lineToRelative(-89f, -89f)
                quadToRelative(-5f, -5f, -2.5f, -11f)
                reflectiveQuadToRelative(9.5f, -6f)
                horizontalLineToRelative(192f)
                quadToRelative(7f, 0f, 9.5f, 6f)
                reflectiveQuadToRelative(-2.5f, 11f)
                lineToRelative(-89f, 89f)
                quadToRelative(-6f, 6f, -14f, 6f)
                reflectiveQuadToRelative(-14f, -6f)
                close()
            }
        }.build()
        
        return _Sort_by_alpha!!
    }

private var _Sort_by_alpha: ImageVector? = null

