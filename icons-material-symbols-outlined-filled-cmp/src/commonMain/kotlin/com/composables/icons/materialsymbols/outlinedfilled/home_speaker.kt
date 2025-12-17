package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Home_speaker: ImageVector
    get() {
        if (_Home_speaker != null) return _Home_speaker!!
        
        _Home_speaker = ImageVector.Builder(
            name = "home_speaker",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(248f, 480f)
                lineToRelative(31f, -233f)
                quadToRelative(2f, -11f, 8.5f, -19.5f)
                reflectiveQuadTo(304f, 215f)
                lineToRelative(316f, -126f)
                quadToRelative(18f, -8f, 35f, 2.5f)
                reflectiveQuadToRelative(19f, 30.5f)
                lineToRelative(43f, 358f)
                horizontalLineTo(248f)
                close()
                moveToRelative(135f, 360f)
                quadToRelative(-73f, 0f, -121f, -54.5f)
                reflectiveQuadTo(224f, 659f)
                lineToRelative(13f, -99f)
                horizontalLineToRelative(489f)
                lineToRelative(12f, 101f)
                quadToRelative(8f, 72f, -39f, 125.5f)
                reflectiveQuadTo(580f, 840f)
                horizontalLineTo(383f)
                close()
            }
        }.build()
        
        return _Home_speaker!!
    }

private var _Home_speaker: ImageVector? = null

