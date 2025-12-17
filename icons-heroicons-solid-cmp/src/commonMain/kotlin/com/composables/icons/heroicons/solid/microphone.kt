package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Microphone: ImageVector
    get() {
        if (_Microphone != null) return _Microphone!!
        
        _Microphone = ImageVector.Builder(
            name = "microphone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.25f, 4.5f)
                arcToRelative(3.75f, 3.75f, 0f, true, true, 7.5f, 0f)
                verticalLineToRelative(8.25f)
                arcToRelative(3.75f, 3.75f, 0f, true, true, -7.5f, 0f)
                verticalLineTo(4.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 10.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(1.5f)
                arcToRelative(5.25f, 5.25f, 0f, true, false, 10.5f, 0f)
                verticalLineToRelative(-1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                verticalLineToRelative(1.5f)
                arcToRelative(6.751f, 6.751f, 0f, false, true, -6f, 6.709f)
                verticalLineToRelative(2.291f)
                horizontalLineToRelative(3f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-7.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2.291f)
                arcToRelative(6.751f, 6.751f, 0f, false, true, -6f, -6.709f)
                verticalLineToRelative(-1.5f)
                arcTo(0.75f, 0.75f, 0f, false, true, 6f, 10.5f)
                close()
            }
        }.build()
        
        return _Microphone!!
    }

private var _Microphone: ImageVector? = null

