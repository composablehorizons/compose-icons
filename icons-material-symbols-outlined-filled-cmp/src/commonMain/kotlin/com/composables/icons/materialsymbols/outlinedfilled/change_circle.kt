package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Change_circle: ImageVector
    get() {
        if (_Change_circle != null) return _Change_circle!!
        
        _Change_circle = ImageVector.Builder(
            name = "change_circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(482f, 760f)
                lineToRelative(114f, -113f)
                lineToRelative(-114f, -113f)
                lineToRelative(-42f, 42f)
                lineToRelative(43f, 43f)
                quadToRelative(-28f, 1f, -54.5f, -9f)
                reflectiveQuadTo(381f, 579f)
                quadToRelative(-20f, -20f, -30.5f, -46f)
                reflectiveQuadTo(340f, 481f)
                quadToRelative(0f, -17f, 4.5f, -34f)
                reflectiveQuadToRelative(12.5f, -33f)
                lineToRelative(-44f, -44f)
                quadToRelative(-17f, 25f, -25f, 53f)
                reflectiveQuadToRelative(-8f, 57f)
                quadToRelative(0f, 38f, 15f, 75f)
                reflectiveQuadToRelative(44f, 66f)
                quadToRelative(29f, 29f, 65f, 43.5f)
                reflectiveQuadToRelative(74f, 15.5f)
                lineToRelative(-38f, 38f)
                lineToRelative(42f, 42f)
                close()
                moveToRelative(165f, -170f)
                quadToRelative(17f, -25f, 25f, -53f)
                reflectiveQuadToRelative(8f, -57f)
                quadToRelative(0f, -38f, -14.5f, -75.5f)
                reflectiveQuadTo(622f, 338f)
                quadToRelative(-29f, -29f, -65.5f, -43f)
                reflectiveQuadTo(482f, 281f)
                lineToRelative(38f, -39f)
                lineToRelative(-42f, -42f)
                lineToRelative(-114f, 113f)
                lineToRelative(114f, 113f)
                lineToRelative(42f, -42f)
                lineToRelative(-44f, -44f)
                quadToRelative(27f, 0f, 55f, 10.5f)
                reflectiveQuadToRelative(48f, 30.5f)
                quadToRelative(20f, 20f, 30.5f, 46f)
                reflectiveQuadToRelative(10.5f, 52f)
                quadToRelative(0f, 17f, -4.5f, 34f)
                reflectiveQuadTo(603f, 546f)
                lineToRelative(44f, 44f)
                close()
                moveTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Change_circle!!
    }

private var _Change_circle: ImageVector? = null

