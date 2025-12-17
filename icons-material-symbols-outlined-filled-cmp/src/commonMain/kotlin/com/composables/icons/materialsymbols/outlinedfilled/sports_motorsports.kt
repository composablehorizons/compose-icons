package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Sports_motorsports: ImageVector
    get() {
        if (_Sports_motorsports != null) return _Sports_motorsports!!
        
        _Sports_motorsports = ImageVector.Builder(
            name = "sports_motorsports",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(579f, 778f)
                horizontalLineTo(96f)
                quadToRelative(-5f, 0f, -9f, -4f)
                reflectiveQuadToRelative(-4f, -9f)
                quadToRelative(0f, -47f, 1.5f, -82.5f)
                reflectiveQuadTo(89f, 619f)
                horizontalLineToRelative(314f)
                quadToRelative(69f, 0f, 117.5f, -49f)
                reflectiveQuadTo(569f, 450f)
                quadToRelative(0f, -51f, -28.5f, -92.5f)
                reflectiveQuadTo(464f, 296f)
                lineToRelative(-134f, -53f)
                quadToRelative(54f, -30f, 113.5f, -45.5f)
                reflectiveQuadTo(567f, 182f)
                quadToRelative(128f, 0f, 219f, 86.5f)
                reflectiveQuadTo(877f, 480f)
                quadToRelative(0f, 125f, -86.5f, 211.5f)
                reflectiveQuadTo(579f, 778f)
                close()
                moveTo(102f, 540f)
                quadToRelative(20f, -71f, 59f, -133.5f)
                reflectiveQuadTo(254f, 296f)
                lineToRelative(180f, 73f)
                quadToRelative(26f, 11f, 41f, 33f)
                reflectiveQuadToRelative(15f, 48f)
                quadToRelative(0f, 38f, -25.5f, 64f)
                reflectiveQuadTo(401f, 540f)
                horizontalLineTo(102f)
                close()
            }
        }.build()
        
        return _Sports_motorsports!!
    }

private var _Sports_motorsports: ImageVector? = null

