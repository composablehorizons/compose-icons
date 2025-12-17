package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.School: ImageVector
    get() {
        if (_School != null) return _School!!
        
        _School = ImageVector.Builder(
            name = "school",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(840f, 680f)
                verticalLineToRelative(-276f)
                lineTo(480f, 600f)
                lineTo(40f, 360f)
                lineToRelative(440f, -240f)
                lineToRelative(440f, 240f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(480f, 840f)
                lineTo(200f, 688f)
                verticalLineToRelative(-200f)
                lineToRelative(280f, 152f)
                lineToRelative(280f, -152f)
                verticalLineToRelative(200f)
                lineTo(480f, 840f)
                close()
            }
        }.build()
        
        return _School!!
    }

private var _School: ImageVector? = null

