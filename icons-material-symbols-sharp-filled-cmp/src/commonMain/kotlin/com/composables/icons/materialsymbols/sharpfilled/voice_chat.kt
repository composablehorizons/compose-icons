package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Voice_chat: ImageVector
    get() {
        if (_Voice_chat != null) return _Voice_chat!!
        
        _Voice_chat = ImageVector.Builder(
            name = "voice_chat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 440f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(100f, 80f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(110f, 80f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(400f)
                close()
                moveToRelative(110f, -80f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(100f, -80f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(80f)
                close()
                moveTo(80f, 880f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(640f)
                horizontalLineTo(240f)
                lineTo(80f, 880f)
                close()
            }
        }.build()
        
        return _Voice_chat!!
    }

private var _Voice_chat: ImageVector? = null

