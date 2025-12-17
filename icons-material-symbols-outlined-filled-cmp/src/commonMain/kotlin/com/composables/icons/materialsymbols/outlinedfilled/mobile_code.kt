package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Mobile_code: ImageVector
    get() {
        if (_Mobile_code != null) return _Mobile_code!!
        
        _Mobile_code = ImageVector.Builder(
            name = "mobile_code",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 920f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 840f)
                verticalLineToRelative(-720f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(280f, 40f)
                horizontalLineToRelative(400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 120f)
                verticalLineToRelative(124f)
                quadToRelative(18f, 7f, 29f, 22f)
                reflectiveQuadToRelative(11f, 34f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 19f, -11f, 34f)
                reflectiveQuadToRelative(-29f, 22f)
                verticalLineToRelative(84f)
                horizontalLineTo(600f)
                quadToRelative(-100f, 0f, -170f, 70f)
                reflectiveQuadToRelative(-70f, 170f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(496f, -16f)
                lineToRelative(-56f, -57f)
                lineToRelative(87f, -87f)
                lineToRelative(-87f, -87f)
                lineToRelative(56f, -57f)
                lineToRelative(144f, 144f)
                lineTo(776f, 904f)
                close()
                moveToRelative(-192f, 0f)
                lineTo(440f, 760f)
                lineToRelative(144f, -144f)
                lineToRelative(56f, 57f)
                lineToRelative(-87f, 87f)
                lineToRelative(87f, 87f)
                lineToRelative(-56f, 57f)
                close()
                moveTo(480f, 240f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 200f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 200f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 240f)
                close()
            }
        }.build()
        
        return _Mobile_code!!
    }

private var _Mobile_code: ImageVector? = null

