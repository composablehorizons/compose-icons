package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Cottage: ImageVector
    get() {
        if (_Cottage != null) return _Cottage!!
        
        _Cottage = ImageVector.Builder(
            name = "cottage",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 840f)
                verticalLineToRelative(-375f)
                lineToRelative(-72f, 55f)
                lineToRelative(-48f, -64f)
                lineToRelative(120f, -92f)
                verticalLineToRelative(-124f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(63f)
                lineToRelative(240f, -183f)
                lineToRelative(440f, 336f)
                lineToRelative(-48f, 63f)
                lineToRelative(-72f, -54f)
                verticalLineToRelative(375f)
                horizontalLineTo(160f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-356f)
                lineTo(480f, 221f)
                lineTo(240f, 404f)
                verticalLineToRelative(356f)
                close()
                moveToRelative(-80f, -560f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(320f, 40f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(240f, 200f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(80f, 560f)
                horizontalLineToRelative(480f)
                horizontalLineToRelative(-480f)
                close()
            }
        }.build()
        
        return _Cottage!!
    }

private var _Cottage: ImageVector? = null

