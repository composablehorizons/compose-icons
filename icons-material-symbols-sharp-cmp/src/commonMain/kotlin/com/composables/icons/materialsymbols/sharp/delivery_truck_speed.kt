package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Delivery_truck_speed: ImageVector
    get() {
        if (_Delivery_truck_speed != null) return _Delivery_truck_speed!!
        
        _Delivery_truck_speed = ImageVector.Builder(
            name = "delivery_truck_speed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 800f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                horizontalLineTo(60f)
                lineToRelative(18f, -80f)
                horizontalLineToRelative(113f)
                quadToRelative(17f, -19f, 40f, -29.5f)
                reflectiveQuadToRelative(49f, -10.5f)
                quadToRelative(26f, 0f, 49f, 10.5f)
                reflectiveQuadToRelative(40f, 29.5f)
                horizontalLineToRelative(167f)
                lineToRelative(84f, -360f)
                horizontalLineTo(182f)
                lineToRelative(4f, -17f)
                quadToRelative(6f, -28f, 27.5f, -45.5f)
                reflectiveQuadTo(264f, 160f)
                horizontalLineToRelative(456f)
                lineToRelative(-37f, 160f)
                horizontalLineToRelative(117f)
                lineToRelative(120f, 160f)
                lineToRelative(-40f, 200f)
                horizontalLineToRelative(-80f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                horizontalLineTo(400f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveToRelative(357f, -280f)
                horizontalLineToRelative(193f)
                lineToRelative(4f, -21f)
                lineToRelative(-74f, -99f)
                horizontalLineToRelative(-95f)
                lineToRelative(-28f, 120f)
                close()
                moveToRelative(-19f, -273f)
                lineToRelative(2f, -7f)
                lineToRelative(-84f, 360f)
                lineToRelative(2f, -7f)
                lineToRelative(34f, -146f)
                lineToRelative(46f, -200f)
                close()
                moveTo(20f, 533f)
                lineToRelative(20f, -80f)
                horizontalLineToRelative(220f)
                lineToRelative(-20f, 80f)
                horizontalLineTo(20f)
                close()
                moveToRelative(80f, -146f)
                lineToRelative(20f, -80f)
                horizontalLineToRelative(260f)
                lineToRelative(-20f, 80f)
                horizontalLineTo(100f)
                close()
                moveToRelative(180f, 333f)
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
            }
        }.build()
        
        return _Delivery_truck_speed!!
    }

private var _Delivery_truck_speed: ImageVector? = null

