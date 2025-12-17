package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Backward: ImageVector
    get() {
        if (_Backward != null) return _Backward!!
        
        _Backward = ImageVector.Builder(
            name = "backward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.5f, 4.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.107f, -0.66f)
                lineToRelative(-6f, 3.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.32f)
                lineToRelative(6f, 3.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.107f, -0.66f)
                verticalLineTo(8.988f)
                lineToRelative(5.393f, 2.921f)
                arcTo(0.75f, 0.75f, 0f, false, false, 15f, 11.25f)
                verticalLineToRelative(-6.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.107f, -0.66f)
                lineTo(8.5f, 7.013f)
                verticalLineTo(4.75f)
                close()
            }
        }.build()
        
        return _Backward!!
    }

private var _Backward: ImageVector? = null

