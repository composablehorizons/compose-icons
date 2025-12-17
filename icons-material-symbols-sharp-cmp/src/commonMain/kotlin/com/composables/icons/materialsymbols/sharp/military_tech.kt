package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Military_tech: ImageVector
    get() {
        if (_Military_tech != null) return _Military_tech!!
        
        _Military_tech = ImageVector.Builder(
            name = "military_tech",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(362f)
                lineTo(500f, 548f)
                lineToRelative(28f, 92f)
                horizontalLineToRelative(152f)
                lineToRelative(-124f, 88f)
                lineToRelative(48f, 152f)
                lineToRelative(-124f, -94f)
                lineToRelative(-124f, 94f)
                lineToRelative(48f, -152f)
                lineToRelative(-124f, -88f)
                horizontalLineToRelative(152f)
                lineToRelative(28f, -92f)
                lineToRelative(-180f, -106f)
                verticalLineToRelative(-362f)
                close()
                moveToRelative(80f, 80f)
                verticalLineToRelative(234f)
                lineToRelative(80f, 48f)
                verticalLineToRelative(-282f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(240f, 0f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(282f)
                lineToRelative(80f, -48f)
                verticalLineToRelative(-234f)
                close()
                moveTo(480f, 313f)
                close()
                moveToRelative(-40f, -12f)
                close()
                moveToRelative(80f, 0f)
                close()
            }
        }.build()
        
        return _Military_tech!!
    }

private var _Military_tech: ImageVector? = null

