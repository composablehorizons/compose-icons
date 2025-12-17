package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Microphone: ImageVector
    get() {
        if (_Microphone != null) return _Microphone!!
        
        _Microphone = ImageVector.Builder(
            name = "microphone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 1f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, true, false, 4f, 0f)
                verticalLineTo(3f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 7f)
                arcTo(0.75f, 0.75f, 0f, false, false, 3f, 7f)
                arcToRelative(5.001f, 5.001f, 0f, false, false, 4.25f, 4.944f)
                verticalLineTo(13.5f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-1.556f)
                arcTo(5.001f, 5.001f, 0f, false, false, 13f, 7f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                arcToRelative(3.5f, 3.5f, 0f, true, true, -7f, 0f)
                close()
            }
        }.build()
        
        return _Microphone!!
    }

private var _Microphone: ImageVector? = null

