package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.School: ImageVector
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
                moveTo(480f, 840f)
                lineTo(200f, 688f)
                verticalLineToRelative(-240f)
                lineTo(40f, 360f)
                lineToRelative(440f, -240f)
                lineToRelative(440f, 240f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-276f)
                lineToRelative(-80f, 44f)
                verticalLineToRelative(240f)
                lineTo(480f, 840f)
                close()
                moveToRelative(0f, -332f)
                lineToRelative(274f, -148f)
                lineToRelative(-274f, -148f)
                lineToRelative(-274f, 148f)
                lineToRelative(274f, 148f)
                close()
                moveToRelative(0f, 241f)
                lineToRelative(200f, -108f)
                verticalLineToRelative(-151f)
                lineTo(480f, 600f)
                lineTo(280f, 490f)
                verticalLineToRelative(151f)
                lineToRelative(200f, 108f)
                close()
                moveToRelative(0f, -241f)
                close()
                moveToRelative(0f, 90f)
                close()
                moveToRelative(0f, 0f)
                close()
            }
        }.build()
        
        return _School!!
    }

private var _School: ImageVector? = null

