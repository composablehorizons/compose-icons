package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Home_speaker: ImageVector
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
                moveTo(383f, 840f)
                quadToRelative(-73f, 0f, -121f, -54.5f)
                reflectiveQuadTo(224f, 659f)
                lineToRelative(55f, -412f)
                quadToRelative(2f, -11f, 8.5f, -19.5f)
                reflectiveQuadTo(304f, 215f)
                lineToRelative(316f, -126f)
                quadToRelative(18f, -8f, 35f, 2.5f)
                reflectiveQuadToRelative(19f, 30.5f)
                lineToRelative(64f, 539f)
                quadToRelative(8f, 72f, -39f, 125.5f)
                reflectiveQuadTo(580f, 840f)
                horizontalLineTo(383f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(197f)
                quadToRelative(36f, 0f, 60f, -27f)
                reflectiveQuadToRelative(19f, -63f)
                lineToRelative(-13f, -110f)
                horizontalLineTo(319f)
                lineToRelative(-15f, 109f)
                quadToRelative(-5f, 36f, 19f, 63.5f)
                reflectiveQuadToRelative(60f, 27.5f)
                close()
                moveToRelative(-27f, -479f)
                lineToRelative(-27f, 199f)
                horizontalLineToRelative(307f)
                lineToRelative(-35f, -298f)
                lineToRelative(-245f, 99f)
                close()
                moveToRelative(126f, 279f)
                close()
                moveToRelative(1f, -80f)
                close()
                moveToRelative(-1f, 80f)
                verticalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Home_speaker!!
    }

private var _Home_speaker: ImageVector? = null

