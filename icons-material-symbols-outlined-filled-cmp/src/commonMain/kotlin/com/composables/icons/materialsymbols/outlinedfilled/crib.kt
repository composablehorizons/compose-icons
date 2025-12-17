package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Crib: ImageVector
    get() {
        if (_Crib != null) return _Crib!!
        
        _Crib = ImageVector.Builder(
            name = "crib",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 800f)
                quadToRelative(20f, 0f, 40f, -2.5f)
                reflectiveQuadToRelative(40f, -7.5f)
                verticalLineToRelative(-150f)
                horizontalLineTo(400f)
                verticalLineToRelative(150f)
                quadToRelative(20f, 5f, 40f, 7.5f)
                reflectiveQuadToRelative(40f, 2.5f)
                close()
                moveToRelative(0f, 80f)
                quadToRelative(-80f, 0f, -153f, -30.5f)
                reflectiveQuadTo(197f, 763f)
                lineToRelative(57f, -57f)
                quadToRelative(15f, 15f, 31.5f, 27.5f)
                reflectiveQuadTo(320f, 757f)
                verticalLineToRelative(-117f)
                horizontalLineToRelative(-80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 560f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(240f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 440f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 640f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(117f)
                quadToRelative(18f, -11f, 34.5f, -23.5f)
                reflectiveQuadTo(706f, 706f)
                lineToRelative(57f, 57f)
                quadToRelative(-57f, 56f, -130f, 86.5f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Crib!!
    }

private var _Crib: ImageVector? = null

