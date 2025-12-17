package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Production_quantity_limits: ImageVector
    get() {
        if (_Production_quantity_limits != null) return _Production_quantity_limits!!
        
        _Production_quantity_limits = ImageVector.Builder(
            name = "production_quantity_limits",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 380f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 340f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 300f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 340f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 380f)
                close()
                moveToRelative(-40f, -140f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(280f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 800f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(280f, 720f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(360f, 800f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(280f, 880f)
                close()
                moveToRelative(400f, 0f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(600f, 800f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(680f, 720f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 800f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(680f, 880f)
                close()
                moveTo(40f, 160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(131f)
                lineToRelative(170f, 360f)
                horizontalLineToRelative(280f)
                lineToRelative(156f, -280f)
                horizontalLineToRelative(91f)
                lineTo(692f, 478f)
                quadToRelative(-11f, 20f, -29.5f, 31f)
                reflectiveQuadTo(622f, 520f)
                horizontalLineTo(324f)
                lineToRelative(-44f, 80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(80f)
                horizontalLineTo(280f)
                quadToRelative(-45f, 0f, -68.5f, -39f)
                reflectiveQuadToRelative(-1.5f, -79f)
                lineToRelative(54f, -98f)
                lineToRelative(-144f, -304f)
                horizontalLineTo(40f)
                close()
            }
        }.build()
        
        return _Production_quantity_limits!!
    }

private var _Production_quantity_limits: ImageVector? = null

