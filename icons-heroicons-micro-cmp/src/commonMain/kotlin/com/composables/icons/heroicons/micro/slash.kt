package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Slash: ImageVector
    get() {
        if (_Slash != null) return _Slash!!
        
        _Slash = ImageVector.Builder(
            name = "slash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.074f, 2.047f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.449f, 0.961f)
                lineTo(6.705f, 13.507f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.41f, -0.513f)
                lineTo(9.113f, 2.496f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.961f, -0.449f)
                close()
            }
        }.build()
        
        return _Slash!!
    }

private var _Slash: ImageVector? = null

