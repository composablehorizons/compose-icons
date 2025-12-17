package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Linked_services: ImageVector
    get() {
        if (_Linked_services != null) return _Linked_services!!
        
        _Linked_services = ImageVector.Builder(
            name = "linked_services",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(760f, 360f)
                quadToRelative(-57f, 0f, -99f, -34f)
                reflectiveQuadToRelative(-56f, -86f)
                horizontalLineTo(354f)
                quadToRelative(-11f, 42f, -41.5f, 72.5f)
                reflectiveQuadTo(240f, 354f)
                verticalLineToRelative(251f)
                quadToRelative(52f, 14f, 86f, 56f)
                reflectiveQuadToRelative(34f, 99f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadTo(200f, 920f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadTo(40f, 760f)
                quadToRelative(0f, -57f, 34f, -99f)
                reflectiveQuadToRelative(86f, -56f)
                verticalLineToRelative(-251f)
                quadToRelative(-52f, -14f, -86f, -56f)
                reflectiveQuadToRelative(-34f, -98f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(56f, 0f, 98f, 34f)
                reflectiveQuadToRelative(56f, 86f)
                horizontalLineToRelative(251f)
                quadToRelative(14f, -52f, 56f, -86f)
                reflectiveQuadToRelative(99f, -34f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                close()
                moveTo(200f, 840f)
                quadToRelative(33f, 0f, 56.5f, -24f)
                reflectiveQuadToRelative(23.5f, -56f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(200f, 680f)
                quadToRelative(-32f, 0f, -56f, 23.5f)
                reflectiveQuadTo(120f, 760f)
                quadToRelative(0f, 32f, 24f, 56f)
                reflectiveQuadToRelative(56f, 24f)
                close()
                moveToRelative(0f, -560f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(280f, 200f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                quadToRelative(-32f, 0f, -56f, 23.5f)
                reflectiveQuadTo(120f, 200f)
                quadToRelative(0f, 33f, 24f, 56.5f)
                reflectiveQuadToRelative(56f, 23.5f)
                close()
                moveTo(760f, 920f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadTo(760f, 920f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(33f, 0f, 56.5f, -24f)
                reflectiveQuadToRelative(23.5f, -56f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(760f, 680f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(680f, 760f)
                quadToRelative(0f, 32f, 23.5f, 56f)
                reflectiveQuadToRelative(56.5f, 24f)
                close()
                moveToRelative(0f, -560f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(840f, 200f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(760f, 120f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(680f, 200f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(760f, 280f)
                close()
                moveTo(200f, 760f)
                close()
                moveToRelative(0f, -560f)
                close()
                moveToRelative(560f, 560f)
                close()
                moveToRelative(0f, -560f)
                close()
            }
        }.build()
        
        return _Linked_services!!
    }

private var _Linked_services: ImageVector? = null

