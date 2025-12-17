package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Delivery_truck_bolt: ImageVector
    get() {
        if (_Delivery_truck_bolt != null) return _Delivery_truck_bolt!!
        
        _Delivery_truck_bolt = ImageVector.Builder(
            name = "delivery_truck_bolt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(140f, 520f)
                verticalLineToRelative(-120f)
                horizontalLineTo(40f)
                lineToRelative(140f, -200f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(100f)
                lineTo(140f, 520f)
                close()
                moveToRelative(132f, 280f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -25f, 11.5f, -47f)
                reflectiveQuadToRelative(31.5f, -38f)
                lineToRelative(239f, -355f)
                horizontalLineTo(262f)
                lineToRelative(17f, -80f)
                horizontalLineToRelative(441f)
                lineToRelative(-37f, 160f)
                horizontalLineToRelative(117f)
                lineToRelative(120f, 160f)
                lineToRelative(-40f, 200f)
                horizontalLineToRelative(-80f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                horizontalLineTo(392f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveToRelative(8f, -80f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(320f, 680f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(280f, 640f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(240f, 680f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(280f, 720f)
                close()
                moveToRelative(400f, 0f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(720f, 680f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(680f, 640f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(640f, 680f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(680f, 720f)
                close()
                moveToRelative(-43f, -200f)
                horizontalLineToRelative(193f)
                lineToRelative(4f, -21f)
                lineToRelative(-74f, -99f)
                horizontalLineToRelative(-95f)
                lineToRelative(-28f, 120f)
                close()
            }
        }.build()
        
        return _Delivery_truck_bolt!!
    }

private var _Delivery_truck_bolt: ImageVector? = null

