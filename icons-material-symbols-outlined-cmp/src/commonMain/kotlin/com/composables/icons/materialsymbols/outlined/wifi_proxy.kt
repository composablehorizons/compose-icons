package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Wifi_proxy: ImageVector
    get() {
        if (_Wifi_proxy != null) return _Wifi_proxy!!
        
        _Wifi_proxy = ImageVector.Builder(
            name = "wifi_proxy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(700f, 780f)
                horizontalLineToRelative(50f)
                verticalLineToRelative(-50f)
                horizontalLineToRelative(-50f)
                verticalLineToRelative(50f)
                close()
                moveToRelative(0f, -110f)
                horizontalLineToRelative(50f)
                verticalLineToRelative(-50f)
                horizontalLineToRelative(-50f)
                verticalLineToRelative(50f)
                close()
                moveToRelative(110f, 110f)
                horizontalLineToRelative(50f)
                verticalLineToRelative(-50f)
                horizontalLineToRelative(-50f)
                verticalLineToRelative(50f)
                close()
                moveToRelative(-170f, 60f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(170f)
                verticalLineToRelative(110f)
                horizontalLineToRelative(110f)
                verticalLineToRelative(170f)
                horizontalLineTo(640f)
                close()
                moveToRelative(-160f, 0f)
                lineTo(0f, 360f)
                quadToRelative(95f, -97f, 219.5f, -148.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(136f, 0f, 260.5f, 51.5f)
                reflectiveQuadTo(960f, 360f)
                lineTo(822f, 497f)
                quadToRelative(-14f, -14f, -28f, -28.5f)
                reflectiveQuadTo(766f, 440f)
                lineToRelative(78f, -78f)
                quadToRelative(-79f, -60f, -172f, -91f)
                reflectiveQuadToRelative(-192f, -31f)
                quadToRelative(-99f, 0f, -192f, 31f)
                reflectiveQuadToRelative(-172f, 91f)
                lineToRelative(364f, 364f)
                lineToRelative(40f, -40f)
                lineToRelative(28.5f, 28.5f)
                lineTo(577f, 743f)
                lineToRelative(-97f, 97f)
                close()
                moveToRelative(0f, -357f)
                close()
            }
        }.build()
        
        return _Wifi_proxy!!
    }

private var _Wifi_proxy: ImageVector? = null

