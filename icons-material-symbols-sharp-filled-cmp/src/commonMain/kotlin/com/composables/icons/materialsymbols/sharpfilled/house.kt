package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.House: ImageVector
    get() {
        if (_House != null) return _House!!
        
        _House = ImageVector.Builder(
            name = "house",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 800f)
                verticalLineToRelative(-366f)
                lineTo(88f, 520f)
                lineToRelative(-48f, -64f)
                lineToRelative(440f, -336f)
                lineToRelative(160f, 122f)
                verticalLineToRelative(-82f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(174f)
                lineToRelative(160f, 122f)
                lineToRelative(-48f, 64f)
                lineToRelative(-112f, -86f)
                verticalLineToRelative(366f)
                horizontalLineTo(560f)
                verticalLineToRelative(-240f)
                horizontalLineTo(400f)
                verticalLineToRelative(240f)
                horizontalLineTo(200f)
                close()
                moveToRelative(200f, -399f)
                horizontalLineToRelative(160f)
                quadToRelative(0f, -32f, -24f, -52.5f)
                reflectiveQuadTo(480f, 328f)
                quadToRelative(-32f, 0f, -56f, 20.5f)
                reflectiveQuadTo(400f, 401f)
                close()
            }
        }.build()
        
        return _House!!
    }

private var _House: ImageVector? = null

