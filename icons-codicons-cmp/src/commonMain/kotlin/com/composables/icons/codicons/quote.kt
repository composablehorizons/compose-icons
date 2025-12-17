package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Quote: ImageVector
    get() {
        if (_Quote != null) return _Quote!!
        
        _Quote = ImageVector.Builder(
            name = "quote",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.99902f, 2.99902f)
                curveTo(6.55101f, 2.99904f, 6.99902f, 3.44703f, 6.99902f, 3.99902f)
                verticalLineTo(4.99902f)
                curveTo(6.99902f, 7.59102f, 6.47153f, 9.73354f, 4.35254f, 11.8525f)
                curveTo(4.15754f, 12.0475f, 3.84148f, 12.0475f, 3.64648f, 11.8525f)
                curveTo(3.45148f, 11.6575f, 3.45148f, 11.3415f, 3.64648f, 11.1465f)
                curveTo(5.03348f, 9.76049f, 5.65377f, 8.38594f, 5.88477f, 6.79395f)
                curveTo(5.61781f, 6.9259f, 5.31794f, 7f, 5f, 7f)
                horizontalLineTo(4f)
                curveTo(3.448f, 7f, 3f, 6.552f, 3f, 6f)
                verticalLineTo(4f)
                curveTo(3.00001f, 3.44801f, 3.44801f, 3f, 4f, 3f)
                horizontalLineTo(6f)
                lineTo(5.99902f, 2.99902f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.999f, 2.99902f)
                curveTo(12.551f, 2.99904f, 12.999f, 3.44703f, 12.999f, 3.99902f)
                verticalLineTo(4.99902f)
                curveTo(12.999f, 7.59102f, 12.4715f, 9.73354f, 10.3525f, 11.8525f)
                curveTo(10.1575f, 12.0475f, 9.84148f, 12.0475f, 9.64648f, 11.8525f)
                curveTo(9.45148f, 11.6575f, 9.45148f, 11.3415f, 9.64648f, 11.1465f)
                curveTo(11.0335f, 9.76049f, 11.6538f, 8.38594f, 11.8848f, 6.79395f)
                curveTo(11.6178f, 6.9259f, 11.3179f, 7f, 11f, 7f)
                horizontalLineTo(10f)
                curveTo(9.448f, 7f, 9f, 6.552f, 9f, 6f)
                verticalLineTo(4f)
                curveTo(9.00001f, 3.44801f, 9.44801f, 3f, 10f, 3f)
                horizontalLineTo(12f)
                lineTo(11.999f, 2.99902f)
                close()
            }
        }.build()
        
        return _Quote!!
    }

private var _Quote: ImageVector? = null

