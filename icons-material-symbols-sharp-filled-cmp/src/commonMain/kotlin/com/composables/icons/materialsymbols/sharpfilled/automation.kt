package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Automation: ImageVector
    get() {
        if (_Automation != null) return _Automation!!
        
        _Automation = ImageVector.Builder(
            name = "automation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 840f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadTo(80f, 680f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(22f, 0f, 42f, 5.5f)
                reflectiveQuadToRelative(37f, 15.5f)
                lineToRelative(105f, -106f)
                lineToRelative(-109f, -111f)
                quadToRelative(-18f, -18f, -26.5f, -39.5f)
                reflectiveQuadTo(280f, 241f)
                quadToRelative(0f, -47f, 33f, -84f)
                reflectiveQuadToRelative(87f, -37f)
                horizontalLineToRelative(160f)
                quadToRelative(54f, 0f, 87f, 37f)
                reflectiveQuadToRelative(33f, 84f)
                quadToRelative(0f, 22f, -8.5f, 44f)
                reflectiveQuadTo(645f, 325f)
                lineTo(536f, 435f)
                lineToRelative(104f, 106f)
                quadToRelative(17f, -11f, 37.5f, -16f)
                reflectiveQuadToRelative(42.5f, -5f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -22f, 6f, -43f)
                reflectiveQuadToRelative(17f, -40f)
                lineTo(480f, 492f)
                lineTo(377f, 597f)
                quadToRelative(11f, 19f, 17f, 40f)
                reflectiveQuadToRelative(6f, 43f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                close()
                moveToRelative(160f, -640f)
                quadToRelative(-18f, 0f, -29f, 12f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(0f, 8f, 3f, 15f)
                reflectiveQuadToRelative(9f, 13f)
                lineToRelative(108f, 110f)
                lineToRelative(108f, -109f)
                quadToRelative(6f, -6f, 9f, -13.5f)
                reflectiveQuadToRelative(3f, -15.5f)
                quadToRelative(0f, -16f, -11f, -28f)
                reflectiveQuadToRelative(-29f, -12f)
                horizontalLineTo(400f)
                close()
            }
        }.build()
        
        return _Automation!!
    }

private var _Automation: ImageVector? = null

