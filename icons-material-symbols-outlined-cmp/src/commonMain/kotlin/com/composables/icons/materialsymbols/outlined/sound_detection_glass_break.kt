package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Sound_detection_glass_break: ImageVector
    get() {
        if (_Sound_detection_glass_break != null) return _Sound_detection_glass_break!!
        
        _Sound_detection_glass_break = ImageVector.Builder(
            name = "sound_detection_glass_break",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(720f)
                horizontalLineTo(120f)
                close()
                moveToRelative(80f, -640f)
                verticalLineToRelative(360f)
                lineToRelative(180f, -181f)
                lineToRelative(160f, 160f)
                lineToRelative(220f, -247f)
                verticalLineToRelative(-92f)
                horizontalLineTo(200f)
                close()
                moveToRelative(0f, 560f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-348f)
                lineTo(540f, 659f)
                lineTo(380f, 499f)
                lineTo(200f, 680f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Sound_detection_glass_break!!
    }

private var _Sound_detection_glass_break: ImageVector? = null

