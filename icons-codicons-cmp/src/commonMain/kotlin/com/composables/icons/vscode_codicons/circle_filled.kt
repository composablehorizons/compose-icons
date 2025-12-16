package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.CircleFilled: ImageVector
    get() {
        if (_CircleFilled != null) return _CircleFilled!!
        
        _CircleFilled = ImageVector.Builder(
            name = "circle-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 4f)
                curveTo(8.36719f, 4f, 8.72135f, 4.04818f, 9.0625f, 4.14453f)
                curveTo(9.40365f, 4.23828f, 9.72135f, 4.3724f, 10.0156f, 4.54688f)
                curveTo(10.3125f, 4.72135f, 10.582f, 4.93099f, 10.8242f, 5.17578f)
                curveTo(11.069f, 5.41797f, 11.2786f, 5.6875f, 11.4531f, 5.98438f)
                curveTo(11.6276f, 6.27865f, 11.7617f, 6.59635f, 11.8555f, 6.9375f)
                curveTo(11.9518f, 7.27865f, 12f, 7.63281f, 12f, 8f)
                curveTo(12f, 8.36719f, 11.9518f, 8.72135f, 11.8555f, 9.0625f)
                curveTo(11.7617f, 9.40365f, 11.6276f, 9.72266f, 11.4531f, 10.0195f)
                curveTo(11.2786f, 10.3138f, 11.069f, 10.5833f, 10.8242f, 10.8281f)
                curveTo(10.582f, 11.0703f, 10.3125f, 11.2786f, 10.0156f, 11.4531f)
                curveTo(9.72135f, 11.6276f, 9.40365f, 11.763f, 9.0625f, 11.8594f)
                curveTo(8.72135f, 11.9531f, 8.36719f, 12f, 8f, 12f)
                curveTo(7.63281f, 12f, 7.27865f, 11.9531f, 6.9375f, 11.8594f)
                curveTo(6.59635f, 11.763f, 6.27734f, 11.6276f, 5.98047f, 11.4531f)
                curveTo(5.6862f, 11.2786f, 5.41667f, 11.0703f, 5.17188f, 10.8281f)
                curveTo(4.92969f, 10.5833f, 4.72135f, 10.3138f, 4.54688f, 10.0195f)
                curveTo(4.3724f, 9.72266f, 4.23698f, 9.40365f, 4.14062f, 9.0625f)
                curveTo(4.04688f, 8.72135f, 4f, 8.36719f, 4f, 8f)
                curveTo(4f, 7.63281f, 4.04688f, 7.27865f, 4.14062f, 6.9375f)
                curveTo(4.23698f, 6.59635f, 4.3724f, 6.27865f, 4.54688f, 5.98438f)
                curveTo(4.72135f, 5.6875f, 4.92969f, 5.41797f, 5.17188f, 5.17578f)
                curveTo(5.41667f, 4.93099f, 5.6862f, 4.72135f, 5.98047f, 4.54688f)
                curveTo(6.27734f, 4.3724f, 6.59635f, 4.23828f, 6.9375f, 4.14453f)
                curveTo(7.27865f, 4.04818f, 7.63281f, 4f, 8f, 4f)
                close()
            }
        }.build()
        
        return _CircleFilled!!
    }

private var _CircleFilled: ImageVector? = null

