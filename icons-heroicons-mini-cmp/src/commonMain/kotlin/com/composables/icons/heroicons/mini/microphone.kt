package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Microphone: ImageVector
    get() {
        if (_Microphone != null) return _Microphone!!
        
        _Microphone = ImageVector.Builder(
            name = "microphone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7f, 4f)
                arcToRelative(3f, 3f, 0f, false, true, 6f, 0f)
                verticalLineToRelative(6f)
                arcToRelative(3f, 3f, 0f, true, true, -6f, 0f)
                verticalLineTo(4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.5f, 9.643f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineTo(10f)
                curveToRelative(0f, 3.06f, 2.29f, 5.585f, 5.25f, 5.954f)
                verticalLineTo(17.5f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-1.546f)
                arcTo(6.001f, 6.001f, 0f, false, false, 16f, 10f)
                verticalLineToRelative(-0.357f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineTo(10f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, -9f, 0f)
                verticalLineToRelative(-0.357f)
                close()
            }
        }.build()
        
        return _Microphone!!
    }

private var _Microphone: ImageVector? = null

