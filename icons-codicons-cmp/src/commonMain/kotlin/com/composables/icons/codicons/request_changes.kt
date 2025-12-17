package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.RequestChanges: ImageVector
    get() {
        if (_RequestChanges != null) return _RequestChanges!!
        
        _RequestChanges = ImageVector.Builder(
            name = "request-changes",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.561f, 4.35398f)
                lineTo(9.647f, 1.43998f)
                curveTo(9.368f, 1.16098f, 8.981f, 1.00098f, 8.586f, 1.00098f)
                horizontalLineTo(4f)
                curveTo(2.897f, 1.00098f, 2f, 1.89798f, 2f, 3.00098f)
                verticalLineTo(13.001f)
                curveTo(2f, 14.104f, 2.897f, 15.001f, 4f, 15.001f)
                horizontalLineTo(11f)
                curveTo(12.103f, 15.001f, 13f, 14.104f, 13f, 13.001f)
                verticalLineTo(5.41498f)
                curveTo(13f, 5.01998f, 12.84f, 4.63398f, 12.561f, 4.35398f)
                close()
                moveTo(12f, 13f)
                curveTo(12f, 13.552f, 11.552f, 14f, 11f, 14f)
                horizontalLineTo(4f)
                curveTo(3.448f, 14f, 3f, 13.552f, 3f, 13f)
                verticalLineTo(2.99998f)
                curveTo(3f, 2.44798f, 3.448f, 1.99998f, 4f, 1.99998f)
                horizontalLineTo(8.586f)
                curveTo(8.718f, 1.99998f, 8.847f, 2.05398f, 8.94f, 2.14598f)
                lineTo(11.854f, 5.05998f)
                curveTo(11.947f, 5.15298f, 12f, 5.28198f, 12f, 5.41398f)
                verticalLineTo(13f)
                close()
                moveTo(10f, 6.49998f)
                curveTo(10f, 6.77598f, 9.776f, 6.99998f, 9.5f, 6.99998f)
                horizontalLineTo(8f)
                verticalLineTo(8.49998f)
                curveTo(8f, 8.77598f, 7.776f, 8.99998f, 7.5f, 8.99998f)
                curveTo(7.224f, 8.99998f, 7f, 8.77598f, 7f, 8.49998f)
                verticalLineTo(6.99998f)
                horizontalLineTo(5.5f)
                curveTo(5.224f, 6.99998f, 5f, 6.77598f, 5f, 6.49998f)
                curveTo(5f, 6.22398f, 5.224f, 5.99998f, 5.5f, 5.99998f)
                horizontalLineTo(7f)
                verticalLineTo(4.49998f)
                curveTo(7f, 4.22398f, 7.224f, 3.99998f, 7.5f, 3.99998f)
                curveTo(7.776f, 3.99998f, 8f, 4.22398f, 8f, 4.49998f)
                verticalLineTo(5.99998f)
                horizontalLineTo(9.5f)
                curveTo(9.776f, 5.99998f, 10f, 6.22398f, 10f, 6.49998f)
                close()
                moveTo(10f, 11.5f)
                curveTo(10f, 11.776f, 9.776f, 12f, 9.5f, 12f)
                horizontalLineTo(5.5f)
                curveTo(5.224f, 12f, 5f, 11.776f, 5f, 11.5f)
                curveTo(5f, 11.224f, 5.224f, 11f, 5.5f, 11f)
                horizontalLineTo(9.5f)
                curveTo(9.776f, 11f, 10f, 11.224f, 10f, 11.5f)
                close()
            }
        }.build()
        
        return _RequestChanges!!
    }

private var _RequestChanges: ImageVector? = null

