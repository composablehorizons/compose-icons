package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Voicemail: ImageVector
    get() {
        if (_Voicemail != null) return _Voicemail!!
        
        _Voicemail = ImageVector.Builder(
            name = "voicemail",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(496f, 128f)
                arcToRelative(144f, 144f, 0f, false, false, -119.74f, 224f)
                horizontalLineTo(263.74f)
                arcTo(144f, 144f, 0f, true, false, 144f, 416f)
                horizontalLineToRelative(352f)
                arcToRelative(144f, 144f, 0f, false, false, 0f, -288f)
                close()
                moveTo(64f, 272f)
                arcToRelative(80f, 80f, 0f, true, true, 80f, 80f)
                arcToRelative(80f, 80f, 0f, false, true, -80f, -80f)
                close()
                moveToRelative(432f, 80f)
                arcToRelative(80f, 80f, 0f, true, true, 80f, -80f)
                arcToRelative(80f, 80f, 0f, false, true, -80f, 80f)
                close()
            }
        }.build()
        
        return _Voicemail!!
    }

private var _Voicemail: ImageVector? = null

