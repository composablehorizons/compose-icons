package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Server: ImageVector
    get() {
        if (_Server != null) return _Server!!
        
        _Server = ImageVector.Builder(
            name = "server",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 11.5f)
                curveTo(12f, 11.5989f, 11.9707f, 11.6956f, 11.9157f, 11.7778f)
                curveTo(11.8608f, 11.86f, 11.7827f, 11.9241f, 11.6913f, 11.9619f)
                curveTo(11.6f, 11.9998f, 11.4994f, 12.0097f, 11.4025f, 11.9904f)
                curveTo(11.3055f, 11.9711f, 11.2164f, 11.9235f, 11.1464f, 11.8536f)
                curveTo(11.0765f, 11.7836f, 11.0289f, 11.6945f, 11.0096f, 11.5975f)
                curveTo(10.9903f, 11.5006f, 11.0002f, 11.4f, 11.0381f, 11.3087f)
                curveTo(11.0759f, 11.2173f, 11.14f, 11.1392f, 11.2222f, 11.0843f)
                curveTo(11.3044f, 11.0293f, 11.4011f, 11f, 11.5f, 11f)
                curveTo(11.6326f, 11f, 11.7598f, 11.0527f, 11.8536f, 11.1464f)
                curveTo(11.9473f, 11.2402f, 12f, 11.3674f, 12f, 11.5f)
                close()
                moveTo(11.5f, 8f)
                curveTo(11.5989f, 8f, 11.6956f, 7.97068f, 11.7778f, 7.91573f)
                curveTo(11.86f, 7.86079f, 11.9241f, 7.7827f, 11.9619f, 7.69134f)
                curveTo(11.9998f, 7.59998f, 12.0097f, 7.49945f, 11.9904f, 7.40245f)
                curveTo(11.9711f, 7.30546f, 11.9235f, 7.21637f, 11.8536f, 7.14645f)
                curveTo(11.7836f, 7.07652f, 11.6945f, 7.0289f, 11.5975f, 7.00961f)
                curveTo(11.5006f, 6.99031f, 11.4f, 7.00022f, 11.3087f, 7.03806f)
                curveTo(11.2173f, 7.0759f, 11.1392f, 7.13999f, 11.0843f, 7.22221f)
                curveTo(11.0293f, 7.30444f, 11f, 7.40111f, 11f, 7.5f)
                curveTo(11f, 7.63261f, 11.0527f, 7.75979f, 11.1464f, 7.85355f)
                curveTo(11.2402f, 7.94732f, 11.3674f, 8f, 11.5f, 8f)
                close()
                moveTo(14f, 4.5f)
                curveTo(13.999f, 4.87026f, 13.86f, 5.22685f, 13.61f, 5.5f)
                curveTo(13.86f, 5.77315f, 13.999f, 6.12974f, 14f, 6.5f)
                verticalLineTo(8.5f)
                curveTo(13.999f, 8.87026f, 13.86f, 9.22685f, 13.61f, 9.5f)
                curveTo(13.86f, 9.77315f, 13.999f, 10.1297f, 14f, 10.5f)
                verticalLineTo(12.5f)
                curveTo(14f, 12.8978f, 13.842f, 13.2794f, 13.5607f, 13.5607f)
                curveTo(13.2794f, 13.842f, 12.8978f, 14f, 12.5f, 14f)
                horizontalLineTo(3.5f)
                curveTo(3.10218f, 14f, 2.72064f, 13.842f, 2.43934f, 13.5607f)
                curveTo(2.15804f, 13.2794f, 2f, 12.8978f, 2f, 12.5f)
                verticalLineTo(10.5f)
                curveTo(2.00097f, 10.1297f, 2.14003f, 9.77315f, 2.39f, 9.5f)
                curveTo(2.14003f, 9.22685f, 2.00097f, 8.87026f, 2f, 8.5f)
                verticalLineTo(6.5f)
                curveTo(2.00097f, 6.12974f, 2.14003f, 5.77315f, 2.39f, 5.5f)
                curveTo(2.14003f, 5.22685f, 2.00097f, 4.87026f, 2f, 4.5f)
                verticalLineTo(2.5f)
                curveTo(2f, 2.10218f, 2.15804f, 1.72064f, 2.43934f, 1.43934f)
                curveTo(2.72064f, 1.15804f, 3.10218f, 1f, 3.5f, 1f)
                horizontalLineTo(12.5f)
                curveTo(12.8978f, 1f, 13.2794f, 1.15804f, 13.5607f, 1.43934f)
                curveTo(13.842f, 1.72064f, 14f, 2.10218f, 14f, 2.5f)
                verticalLineTo(4.5f)
                close()
                moveTo(3f, 4.5f)
                curveTo(3f, 4.63261f, 3.05268f, 4.75979f, 3.14645f, 4.85355f)
                curveTo(3.24021f, 4.94732f, 3.36739f, 5f, 3.5f, 5f)
                horizontalLineTo(12.5f)
                curveTo(12.6326f, 5f, 12.7598f, 4.94732f, 12.8536f, 4.85355f)
                curveTo(12.9473f, 4.75979f, 13f, 4.63261f, 13f, 4.5f)
                verticalLineTo(2.5f)
                curveTo(13f, 2.36739f, 12.9473f, 2.24021f, 12.8536f, 2.14645f)
                curveTo(12.7598f, 2.05268f, 12.6326f, 2f, 12.5f, 2f)
                horizontalLineTo(3.5f)
                curveTo(3.36739f, 2f, 3.24021f, 2.05268f, 3.14645f, 2.14645f)
                curveTo(3.05268f, 2.24021f, 3f, 2.36739f, 3f, 2.5f)
                verticalLineTo(4.5f)
                close()
                moveTo(12.5f, 6f)
                horizontalLineTo(3.5f)
                curveTo(3.36739f, 6f, 3.24021f, 6.05268f, 3.14645f, 6.14645f)
                curveTo(3.05268f, 6.24021f, 3f, 6.36739f, 3f, 6.5f)
                verticalLineTo(8.5f)
                curveTo(3f, 8.63261f, 3.05268f, 8.75979f, 3.14645f, 8.85355f)
                curveTo(3.24021f, 8.94732f, 3.36739f, 9f, 3.5f, 9f)
                horizontalLineTo(12.5f)
                curveTo(12.6326f, 9f, 12.7598f, 8.94732f, 12.8536f, 8.85355f)
                curveTo(12.9473f, 8.75979f, 13f, 8.63261f, 13f, 8.5f)
                verticalLineTo(6.5f)
                curveTo(13f, 6.36739f, 12.9473f, 6.24021f, 12.8536f, 6.14645f)
                curveTo(12.7598f, 6.05268f, 12.6326f, 6f, 12.5f, 6f)
                close()
                moveTo(13f, 10.5f)
                curveTo(13f, 10.3674f, 12.9473f, 10.2402f, 12.8536f, 10.1464f)
                curveTo(12.7598f, 10.0527f, 12.6326f, 10f, 12.5f, 10f)
                horizontalLineTo(3.5f)
                curveTo(3.36739f, 10f, 3.24021f, 10.0527f, 3.14645f, 10.1464f)
                curveTo(3.05268f, 10.2402f, 3f, 10.3674f, 3f, 10.5f)
                verticalLineTo(12.5f)
                curveTo(3f, 12.6326f, 3.05268f, 12.7598f, 3.14645f, 12.8536f)
                curveTo(3.24021f, 12.9473f, 3.36739f, 13f, 3.5f, 13f)
                horizontalLineTo(12.5f)
                curveTo(12.6326f, 13f, 12.7598f, 12.9473f, 12.8536f, 12.8536f)
                curveTo(12.9473f, 12.7598f, 13f, 12.6326f, 13f, 12.5f)
                verticalLineTo(10.5f)
                close()
                moveTo(11.5f, 4f)
                curveTo(11.5989f, 4f, 11.6956f, 3.97068f, 11.7778f, 3.91573f)
                curveTo(11.86f, 3.86079f, 11.9241f, 3.7827f, 11.9619f, 3.69134f)
                curveTo(11.9998f, 3.59998f, 12.0097f, 3.49945f, 11.9904f, 3.40245f)
                curveTo(11.9711f, 3.30546f, 11.9235f, 3.21637f, 11.8536f, 3.14645f)
                curveTo(11.7836f, 3.07652f, 11.6945f, 3.0289f, 11.5975f, 3.00961f)
                curveTo(11.5006f, 2.99031f, 11.4f, 3.00022f, 11.3087f, 3.03806f)
                curveTo(11.2173f, 3.0759f, 11.1392f, 3.13999f, 11.0843f, 3.22221f)
                curveTo(11.0293f, 3.30444f, 11f, 3.40111f, 11f, 3.5f)
                curveTo(11f, 3.63261f, 11.0527f, 3.75979f, 11.1464f, 3.85355f)
                curveTo(11.2402f, 3.94732f, 11.3674f, 4f, 11.5f, 4f)
                close()
            }
        }.build()
        
        return _Server!!
    }

private var _Server: ImageVector? = null

