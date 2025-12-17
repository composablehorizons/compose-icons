package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Settings_bluetooth: ImageVector
    get() {
        if (_Settings_bluetooth != null) return _Settings_bluetooth!!
        
        _Settings_bluetooth = ImageVector.Builder(
            name = "settings_bluetooth",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 960f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 920f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(320f, 880f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(360f, 920f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(320f, 960f)
                close()
                moveToRelative(160f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 920f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 880f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 920f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 960f)
                close()
                moveToRelative(160f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(600f, 920f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 880f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(680f, 920f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(640f, 960f)
                close()
                moveTo(440f, 800f)
                verticalLineToRelative(-304f)
                lineTo(256f, 680f)
                lineToRelative(-56f, -56f)
                lineToRelative(224f, -224f)
                lineToRelative(-224f, -224f)
                lineToRelative(56f, -56f)
                lineToRelative(184f, 184f)
                verticalLineToRelative(-304f)
                horizontalLineToRelative(40f)
                lineToRelative(228f, 228f)
                lineToRelative(-172f, 172f)
                lineToRelative(172f, 172f)
                lineToRelative(-228f, 228f)
                horizontalLineToRelative(-40f)
                close()
                moveToRelative(80f, -154f)
                lineToRelative(76f, -74f)
                lineToRelative(-76f, -76f)
                verticalLineToRelative(150f)
                close()
                moveToRelative(0f, -342f)
                lineToRelative(76f, -76f)
                lineToRelative(-76f, -74f)
                verticalLineToRelative(150f)
                close()
            }
        }.build()
        
        return _Settings_bluetooth!!
    }

private var _Settings_bluetooth: ImageVector? = null

