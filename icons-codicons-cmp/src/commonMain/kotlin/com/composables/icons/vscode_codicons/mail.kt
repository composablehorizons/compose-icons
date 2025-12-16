package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Mail: ImageVector
    get() {
        if (_Mail != null) return _Mail!!
        
        _Mail = ImageVector.Builder(
            name = "mail",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13f, 3f)
                horizontalLineTo(3f)
                curveTo(1.897f, 3f, 1f, 3.897f, 1f, 5f)
                verticalLineTo(11f)
                curveTo(1f, 12.103f, 1.897f, 13f, 3f, 13f)
                horizontalLineTo(13f)
                curveTo(14.103f, 13f, 15f, 12.103f, 15f, 11f)
                verticalLineTo(5f)
                curveTo(15f, 3.897f, 14.103f, 3f, 13f, 3f)
                close()
                moveTo(3f, 4f)
                horizontalLineTo(13f)
                curveTo(13.552f, 4f, 14f, 4.449f, 14f, 5f)
                verticalLineTo(5.201f)
                lineTo(8f, 8.432f)
                lineTo(2f, 5.201f)
                verticalLineTo(5f)
                curveTo(2f, 4.449f, 2.448f, 4f, 3f, 4f)
                close()
                moveTo(13f, 12f)
                horizontalLineTo(3f)
                curveTo(2.448f, 12f, 2f, 11.552f, 2f, 11f)
                verticalLineTo(6.337f)
                lineTo(7.763f, 9.44f)
                curveTo(7.837f, 9.48f, 7.919f, 9.5f, 8f, 9.5f)
                curveTo(8.081f, 9.5f, 8.163f, 9.48f, 8.237f, 9.44f)
                lineTo(14f, 6.337f)
                verticalLineTo(11f)
                curveTo(14f, 11.552f, 13.552f, 12f, 13f, 12f)
                close()
            }
        }.build()
        
        return _Mail!!
    }

private var _Mail: ImageVector? = null

