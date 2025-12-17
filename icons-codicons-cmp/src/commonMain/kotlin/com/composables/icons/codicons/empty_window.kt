package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.EmptyWindow: ImageVector
    get() {
        if (_EmptyWindow != null) return _EmptyWindow!!
        
        _EmptyWindow = ImageVector.Builder(
            name = "empty-window",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 4f)
                verticalLineTo(12f)
                curveTo(15f, 13.657f, 13.657f, 15f, 12f, 15f)
                horizontalLineTo(4f)
                curveTo(2.343f, 15f, 1f, 13.657f, 1f, 12f)
                verticalLineTo(8.739f)
                curveTo(1.307f, 8.992f, 1.643f, 9.209f, 2f, 9.393f)
                verticalLineTo(12f)
                curveTo(2f, 13.105f, 2.895f, 14f, 4f, 14f)
                horizontalLineTo(12f)
                curveTo(13.105f, 14f, 14f, 13.105f, 14f, 12f)
                verticalLineTo(5f)
                horizontalLineTo(9.975f)
                curveTo(9.99f, 4.835f, 10f, 4.669f, 10f, 4.5f)
                curveTo(10f, 4.331f, 9.99f, 4.165f, 9.975f, 4f)
                horizontalLineTo(14f)
                curveTo(14f, 2.895f, 13.105f, 2f, 12f, 2f)
                horizontalLineTo(9.393f)
                curveTo(9.21f, 1.643f, 8.993f, 1.307f, 8.739f, 1f)
                horizontalLineTo(12f)
                curveTo(13.657f, 1f, 15f, 2.343f, 15f, 4f)
                close()
                moveTo(0f, 4.5f)
                curveTo(0f, 2.015f, 2.015f, 0f, 4.5f, 0f)
                curveTo(6.985f, 0f, 9f, 2.015f, 9f, 4.5f)
                curveTo(9f, 6.985f, 6.985f, 9f, 4.5f, 9f)
                curveTo(2.015f, 9f, 0f, 6.985f, 0f, 4.5f)
                close()
                moveTo(1.5f, 4.5f)
                curveTo(1.5f, 4.776f, 1.724f, 5f, 2f, 5f)
                horizontalLineTo(4f)
                verticalLineTo(7f)
                curveTo(4f, 7.276f, 4.224f, 7.5f, 4.5f, 7.5f)
                curveTo(4.776f, 7.5f, 5f, 7.276f, 5f, 7f)
                verticalLineTo(5f)
                horizontalLineTo(7f)
                curveTo(7.276f, 5f, 7.5f, 4.776f, 7.5f, 4.5f)
                curveTo(7.5f, 4.224f, 7.276f, 4f, 7f, 4f)
                horizontalLineTo(5f)
                verticalLineTo(2f)
                curveTo(5f, 1.724f, 4.776f, 1.5f, 4.5f, 1.5f)
                curveTo(4.224f, 1.5f, 4f, 1.724f, 4f, 2f)
                verticalLineTo(4f)
                horizontalLineTo(2f)
                curveTo(1.724f, 4f, 1.5f, 4.224f, 1.5f, 4.5f)
                close()
            }
        }.build()
        
        return _EmptyWindow!!
    }

private var _EmptyWindow: ImageVector? = null

