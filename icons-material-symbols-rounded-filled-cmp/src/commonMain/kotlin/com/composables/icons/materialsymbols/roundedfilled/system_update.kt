package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.System_update: ImageVector
    get() {
        if (_System_update != null) return _System_update!!
        
        _System_update = ImageVector.Builder(
            name = "system_update",
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
                verticalLineToRelative(720f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(680f, 920f)
                horizontalLineTo(280f)
                close()
                moveToRelative(0f, -200f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-480f)
                horizontalLineTo(280f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(160f, -234f)
                verticalLineToRelative(-126f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 320f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 360f)
                verticalLineToRelative(126f)
                lineToRelative(36f, -35f)
                quadToRelative(11f, -11f, 27.5f, -11f)
                reflectiveQuadToRelative(28.5f, 12f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineTo(508f, 612f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                lineTo(348f, 508f)
                quadToRelative(-11f, -11f, -11.5f, -27.5f)
                reflectiveQuadTo(348f, 452f)
                quadToRelative(11f, -11f, 27.5f, -11.5f)
                reflectiveQuadTo(404f, 451f)
                lineToRelative(36f, 35f)
                close()
            }
        }.build()
        
        return _System_update!!
    }

private var _System_update: ImageVector? = null

