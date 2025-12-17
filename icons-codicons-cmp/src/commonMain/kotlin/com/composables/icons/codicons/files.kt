package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Files: ImageVector
    get() {
        if (_Files != null) return _Files!!
        
        _Files = ImageVector.Builder(
            name = "files",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.5f, 22.5f)
                horizontalLineTo(17.595f)
                curveTo(17.07f, 23.4f, 16.11f, 24f, 15f, 24f)
                horizontalLineTo(7.5f)
                curveTo(4.185f, 24f, 1.5f, 21.315f, 1.5f, 18f)
                verticalLineTo(6f)
                curveTo(1.5f, 4.89f, 2.1f, 3.93f, 3f, 3.405f)
                verticalLineTo(18f)
                curveTo(3f, 20.475f, 5.025f, 22.5f, 7.5f, 22.5f)
                close()
                moveTo(21f, 8.121f)
                verticalLineTo(18f)
                curveTo(21f, 19.6545f, 19.6545f, 21f, 18f, 21f)
                horizontalLineTo(7.5f)
                curveTo(5.8455f, 21f, 4.5f, 19.6545f, 4.5f, 18f)
                verticalLineTo(3f)
                curveTo(4.5f, 1.3455f, 5.8455f, 0f, 7.5f, 0f)
                horizontalLineTo(12.879f)
                curveTo(13.4715f, 0f, 14.0505f, 0.24f, 14.4705f, 0.6585f)
                lineTo(20.3415f, 6.5295f)
                curveTo(20.766f, 6.954f, 21f, 7.5195f, 21f, 8.121f)
                close()
                moveTo(13.5f, 6.75f)
                curveTo(13.5f, 7.164f, 13.8375f, 7.5f, 14.25f, 7.5f)
                horizontalLineTo(19.1895f)
                lineTo(13.5f, 1.8105f)
                verticalLineTo(6.75f)
                close()
                moveTo(19.5f, 18f)
                verticalLineTo(9f)
                horizontalLineTo(14.25f)
                curveTo(13.0095f, 9f, 12f, 7.9905f, 12f, 6.75f)
                verticalLineTo(1.5f)
                horizontalLineTo(7.5f)
                curveTo(6.672f, 1.5f, 6f, 2.1735f, 6f, 3f)
                verticalLineTo(18f)
                curveTo(6f, 18.8265f, 6.672f, 19.5f, 7.5f, 19.5f)
                horizontalLineTo(18f)
                curveTo(18.828f, 19.5f, 19.5f, 18.8265f, 19.5f, 18f)
                close()
            }
        }.build()
        
        return _Files!!
    }

private var _Files: ImageVector? = null

