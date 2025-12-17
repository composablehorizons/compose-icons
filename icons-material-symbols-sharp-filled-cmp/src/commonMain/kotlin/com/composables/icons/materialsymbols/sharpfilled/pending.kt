package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Pending: ImageVector
    get() {
        if (_Pending != null) return _Pending!!
        
        _Pending = ImageVector.Builder(
            name = "pending",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 540f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(340f, 480f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(280f, 420f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(220f, 480f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(280f, 540f)
                close()
                moveToRelative(200f, 0f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(540f, 480f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(480f, 420f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(420f, 480f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(480f, 540f)
                close()
                moveToRelative(200f, 0f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(740f, 480f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(680f, 420f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(620f, 480f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(680f, 540f)
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
        
        return _Pending!!
    }

private var _Pending: ImageVector? = null

