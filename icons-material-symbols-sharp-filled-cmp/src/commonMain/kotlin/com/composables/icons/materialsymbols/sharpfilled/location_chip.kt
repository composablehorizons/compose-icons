package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Location_chip: ImageVector
    get() {
        if (_Location_chip != null) return _Location_chip!!
        
        _Location_chip = ImageVector.Builder(
            name = "location_chip",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 760f)
                quadToRelative(-117f, 0f, -198.5f, -81.5f)
                reflectiveQuadTo(40f, 480f)
                quadToRelative(0f, -117f, 81.5f, -198.5f)
                reflectiveQuadTo(320f, 200f)
                horizontalLineToRelative(320f)
                quadToRelative(117f, 0f, 198.5f, 81.5f)
                reflectiveQuadTo(920f, 480f)
                quadToRelative(0f, 117f, -81.5f, 198.5f)
                reflectiveQuadTo(640f, 760f)
                horizontalLineTo(320f)
                close()
                moveToRelative(30f, -310f)
                quadToRelative(0f, 61f, 41f, 106.5f)
                reflectiveQuadToRelative(89f, 83.5f)
                quadToRelative(48f, -38f, 89f, -83.5f)
                reflectiveQuadTo(610f, 450f)
                quadToRelative(0f, -54f, -38f, -92f)
                reflectiveQuadToRelative(-92f, -38f)
                quadToRelative(-54f, 0f, -92f, 38f)
                reflectiveQuadToRelative(-38f, 92f)
                close()
                moveToRelative(130f, 30f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 440f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 400f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 440f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 480f)
                close()
            }
        }.build()
        
        return _Location_chip!!
    }

private var _Location_chip: ImageVector? = null

