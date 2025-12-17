package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Sound_detection_glass_break: ImageVector
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
                moveTo(120f, 640f)
                verticalLineToRelative(-520f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(82f)
                lineTo(540f, 539f)
                lineTo(380f, 379f)
                lineTo(120f, 640f)
                close()
                moveToRelative(0f, 200f)
                verticalLineToRelative(-80f)
                lineToRelative(260f, -261f)
                lineToRelative(160f, 160f)
                lineToRelative(300f, -337f)
                verticalLineToRelative(518f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Sound_detection_glass_break!!
    }

private var _Sound_detection_glass_break: ImageVector? = null

