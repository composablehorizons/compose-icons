package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Filter_retrolux: ImageVector
    get() {
        if (_Filter_retrolux != null) return _Filter_retrolux!!
        
        _Filter_retrolux = ImageVector.Builder(
            name = "filter_retrolux",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(602f, 878f)
                lineToRelative(-90f, -92f)
                quadToRelative(-17f, 42f, -52.5f, 68f)
                reflectiveQuadTo(380f, 880f)
                quadToRelative(-59f, 0f, -99.5f, -40.5f)
                reflectiveQuadTo(240f, 740f)
                quadToRelative(0f, -59f, 40.5f, -99.5f)
                reflectiveQuadTo(380f, 600f)
                quadToRelative(14f, 0f, 28f, 2f)
                reflectiveQuadToRelative(26f, 8f)
                lineTo(240f, 320f)
                lineToRelative(240f, -240f)
                lineToRelative(240f, 240f)
                lineToRelative(-200f, 300f)
                verticalLineToRelative(62f)
                lineToRelative(138f, 138f)
                lineToRelative(-56f, 58f)
                close()
                moveToRelative(-222f, -78f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(440f, 740f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(380f, 680f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(320f, 740f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(380f, 800f)
                close()
                moveToRelative(100f, -264f)
                lineToRelative(138f, -206f)
                lineToRelative(-138f, -138f)
                lineToRelative(-138f, 138f)
                lineToRelative(138f, 206f)
                close()
                moveToRelative(0f, -172f)
                close()
            }
        }.build()
        
        return _Filter_retrolux!!
    }

private var _Filter_retrolux: ImageVector? = null

