package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Car_tag: ImageVector
    get() {
        if (_Car_tag != null) return _Car_tag!!
        
        _Car_tag = ImageVector.Builder(
            name = "car_tag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(260f, 640f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(320f, 580f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(260f, 520f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(200f, 580f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(260f, 640f)
                close()
                moveToRelative(-100f, 40f)
                verticalLineToRelative(-200f)
                verticalLineToRelative(200f)
                close()
                moveToRelative(40f, 80f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                verticalLineToRelative(-360f)
                lineToRelative(98f, -280f)
                horizontalLineToRelative(182f)
                verticalLineToRelative(80f)
                horizontalLineTo(234f)
                lineToRelative(-42f, 120f)
                horizontalLineToRelative(254f)
                lineToRelative(80f, 80f)
                horizontalLineTo(160f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-37f)
                lineToRelative(80f, -80f)
                verticalLineToRelative(277f)
                horizontalLineTo(680f)
                verticalLineToRelative(-80f)
                horizontalLineTo(200f)
                close()
                moveToRelative(400f, -520f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(640f, 200f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(600f, 160f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(560f, 200f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(600f, 240f)
                close()
                moveToRelative(104f, 305f)
                lineTo(440f, 280f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(240f)
                lineToRelative(264f, 265f)
                lineToRelative(-240f, 240f)
                close()
                moveToRelative(0f, -113f)
                lineToRelative(127f, -127f)
                lineToRelative(-185f, -185f)
                horizontalLineTo(520f)
                verticalLineToRelative(127f)
                lineToRelative(184f, 185f)
                close()
                moveToRelative(-84f, 208f)
                quadToRelative(14f, 0f, 25.5f, -5.5f)
                reflectiveQuadTo(665f, 619f)
                lineToRelative(-84f, -84f)
                quadToRelative(-10f, 8f, -15.5f, 19.5f)
                reflectiveQuadTo(560f, 580f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(620f, 640f)
                close()
                moveToRelative(56f, -364f)
                close()
            }
        }.build()
        
        return _Car_tag!!
    }

private var _Car_tag: ImageVector? = null

