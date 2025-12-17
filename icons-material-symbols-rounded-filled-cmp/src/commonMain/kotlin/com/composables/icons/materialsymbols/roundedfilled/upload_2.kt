package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Upload_2: ImageVector
    get() {
        if (_Upload_2 != null) return _Upload_2!!
        
        _Upload_2 = ImageVector.Builder(
            name = "upload_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 800f)
                horizontalLineToRelative(560f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 880f)
                horizontalLineTo(200f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 840f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 800f)
                close()
                moveToRelative(200f, -80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(360f, 680f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(-78f)
                quadToRelative(-25f, 0f, -36f, -22.5f)
                reflectiveQuadToRelative(4f, -42.5f)
                lineToRelative(198f, -254f)
                quadToRelative(6f, -8f, 14.5f, -12f)
                reflectiveQuadToRelative(17.5f, -4f)
                quadToRelative(9f, 0f, 17.5f, 4f)
                reflectiveQuadToRelative(14.5f, 12f)
                lineToRelative(198f, 254f)
                quadToRelative(15f, 20f, 4f, 42.5f)
                reflectiveQuadTo(678f, 440f)
                horizontalLineToRelative(-78f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(560f, 720f)
                horizontalLineTo(400f)
                close()
            }
        }.build()
        
        return _Upload_2!!
    }

private var _Upload_2: ImageVector? = null

