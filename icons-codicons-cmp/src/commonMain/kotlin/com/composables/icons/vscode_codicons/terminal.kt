package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Terminal: ImageVector
    get() {
        if (_Terminal != null) return _Terminal!!
        
        _Terminal = ImageVector.Builder(
            name = "terminal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18.75f, 1.5f)
                horizontalLineTo(5.25f)
                curveTo(3.1815f, 1.5f, 1.5f, 3.183f, 1.5f, 5.25f)
                verticalLineTo(18.75f)
                curveTo(1.5f, 20.8185f, 3.1815f, 22.5f, 5.25f, 22.5f)
                horizontalLineTo(18.75f)
                curveTo(20.8185f, 22.5f, 22.5f, 20.8185f, 22.5f, 18.75f)
                verticalLineTo(5.25f)
                curveTo(22.5f, 3.183f, 20.8185f, 1.5f, 18.75f, 1.5f)
                close()
                moveTo(21f, 18.75f)
                curveTo(21f, 19.9905f, 19.9905f, 21f, 18.75f, 21f)
                horizontalLineTo(5.25f)
                curveTo(4.0095f, 21f, 3f, 19.9905f, 3f, 18.75f)
                verticalLineTo(5.25f)
                curveTo(3f, 4.0095f, 4.0095f, 3f, 5.25f, 3f)
                horizontalLineTo(18.75f)
                curveTo(19.9905f, 3f, 21f, 4.0095f, 21f, 5.25f)
                verticalLineTo(18.75f)
                close()
                moveTo(10.281f, 13.281f)
                lineTo(5.781f, 17.781f)
                curveTo(5.634f, 17.928f, 5.442f, 18f, 5.25f, 18f)
                curveTo(5.058f, 18f, 4.866f, 17.9265f, 4.719f, 17.781f)
                curveTo(4.4265f, 17.4885f, 4.4265f, 17.013f, 4.719f, 16.7205f)
                lineTo(8.688f, 12.7515f)
                lineTo(4.719f, 8.7825f)
                curveTo(4.4265f, 8.49f, 4.4265f, 8.0145f, 4.719f, 7.722f)
                curveTo(5.0115f, 7.4295f, 5.487f, 7.4295f, 5.7795f, 7.722f)
                lineTo(10.2795f, 12.222f)
                curveTo(10.572f, 12.5145f, 10.572f, 12.99f, 10.2795f, 13.2825f)
                lineTo(10.281f, 13.281f)
                close()
                moveTo(19.5f, 17.25f)
                curveTo(19.5f, 17.664f, 19.164f, 18f, 18.75f, 18f)
                horizontalLineTo(11.25f)
                curveTo(10.836f, 18f, 10.5f, 17.664f, 10.5f, 17.25f)
                curveTo(10.5f, 16.836f, 10.836f, 16.5f, 11.25f, 16.5f)
                horizontalLineTo(18.75f)
                curveTo(19.164f, 16.5f, 19.5f, 16.836f, 19.5f, 17.25f)
                close()
            }
        }.build()
        
        return _Terminal!!
    }

private var _Terminal: ImageVector? = null

