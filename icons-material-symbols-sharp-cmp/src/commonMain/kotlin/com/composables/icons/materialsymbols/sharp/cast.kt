package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Cast: ImageVector
    get() {
        if (_Cast != null) return _Cast!!
        
        _Cast = ImageVector.Builder(
            name = "cast",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 480f)
                close()
                moveToRelative(400f, 320f)
                horizontalLineTo(600f)
                quadToRelative(0f, -20f, -1.5f, -40f)
                reflectiveQuadToRelative(-4.5f, -40f)
                horizontalLineToRelative(206f)
                verticalLineToRelative(-480f)
                horizontalLineTo(160f)
                verticalLineToRelative(46f)
                quadToRelative(-20f, -3f, -40f, -4.5f)
                reflectiveQuadTo(80f, 280f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(640f)
                close()
                moveToRelative(-800f, 0f)
                verticalLineToRelative(-120f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                horizontalLineTo(80f)
                close()
                moveToRelative(200f, 0f)
                quadToRelative(0f, -83f, -58.5f, -141.5f)
                reflectiveQuadTo(80f, 600f)
                verticalLineToRelative(-80f)
                quadToRelative(117f, 0f, 198.5f, 81.5f)
                reflectiveQuadTo(360f, 800f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(160f, 0f)
                quadToRelative(0f, -75f, -28.5f, -140.5f)
                reflectiveQuadToRelative(-77f, -114f)
                quadToRelative(-48.5f, -48.5f, -114f, -77f)
                reflectiveQuadTo(80f, 440f)
                verticalLineToRelative(-80f)
                quadToRelative(91f, 0f, 171f, 34.5f)
                reflectiveQuadTo(391f, 489f)
                quadToRelative(60f, 60f, 94.5f, 140f)
                reflectiveQuadTo(520f, 800f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Cast!!
    }

private var _Cast: ImageVector? = null

