package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Voicemail: ImageVector
    get() {
        if (_Voicemail != null) return _Voicemail!!
        
        _Voicemail = ImageVector.Builder(
            name = "voicemail",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7f, 8.5f)
                arcTo(3.5f, 3.5f, 0f, false, true, 5.95f, 11f)
                horizontalLineToRelative(4.1f)
                arcToRelative(3.5f, 3.5f, 0f, true, true, 2.45f, 1f)
                horizontalLineToRelative(-9f)
                arcTo(3.5f, 3.5f, 0f, true, true, 7f, 8.5f)
                moveToRelative(-6f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, 5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -5f, 0f)
                moveToRelative(14f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, -5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 5f, 0f)
            }
        }.build()
        
        return _Voicemail!!
    }

private var _Voicemail: ImageVector? = null

