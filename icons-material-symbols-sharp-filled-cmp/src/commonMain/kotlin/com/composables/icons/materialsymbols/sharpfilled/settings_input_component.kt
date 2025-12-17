package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Settings_input_component: ImageVector
    get() {
        if (_Settings_input_component != null) return _Settings_input_component!!
        
        _Settings_input_component = ImageVector.Builder(
            name = "settings_input_component",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 920f)
                verticalLineToRelative(-166f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-114f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(114f)
                lineToRelative(-80f, 80f)
                verticalLineToRelative(166f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(320f, 0f)
                verticalLineToRelative(-166f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-114f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(114f)
                lineToRelative(-80f, 80f)
                verticalLineToRelative(166f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(320f, 0f)
                verticalLineToRelative(-166f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-114f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(114f)
                lineToRelative(-80f, 80f)
                verticalLineToRelative(166f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(40f, 480f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                horizontalLineTo(40f)
                close()
                moveToRelative(320f, 0f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                horizontalLineTo(360f)
                close()
                moveToRelative(320f, 0f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                horizontalLineTo(680f)
                close()
            }
        }.build()
        
        return _Settings_input_component!!
    }

private var _Settings_input_component: ImageVector? = null

