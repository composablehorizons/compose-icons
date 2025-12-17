package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Settings_input_hdmi: ImageVector
    get() {
        if (_Settings_input_hdmi != null) return _Settings_input_hdmi!!
        
        _Settings_input_hdmi = ImageVector.Builder(
            name = "settings_input_hdmi",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 880f)
                verticalLineToRelative(-120f)
                lineTo(200f, 520f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(240f)
                lineTo(640f, 760f)
                verticalLineToRelative(120f)
                horizontalLineTo(320f)
                close()
                moveToRelative(0f, -600f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-120f)
                horizontalLineTo(320f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(80f, 520f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-60f)
                lineToRelative(120f, -240f)
                verticalLineToRelative(-140f)
                horizontalLineTo(280f)
                verticalLineToRelative(140f)
                lineToRelative(120f, 240f)
                verticalLineToRelative(60f)
                close()
                moveToRelative(80f, -300f)
                close()
            }
        }.build()
        
        return _Settings_input_hdmi!!
    }

private var _Settings_input_hdmi: ImageVector? = null

