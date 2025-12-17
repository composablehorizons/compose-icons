package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Gift: ImageVector
    get() {
        if (_Gift != null) return _Gift!!
        
        _Gift = ImageVector.Builder(
            name = "gift",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 1f)
                curveTo(6.59735f, 1f, 7.13353f, 1.26188f, 7.5f, 1.67709f)
                curveTo(7.86647f, 1.26188f, 8.40265f, 1f, 9f, 1f)
                curveTo(10.1046f, 1f, 11f, 1.89543f, 11f, 3f)
                curveTo(11f, 3.36429f, 10.9026f, 3.70583f, 10.7324f, 4f)
                horizontalLineTo(13f)
                curveTo(13.5523f, 4f, 14f, 4.44772f, 14f, 5f)
                verticalLineTo(7f)
                curveTo(14f, 7.55229f, 13.5523f, 8f, 13f, 8f)
                lineTo(12.9998f, 12f)
                curveTo(12.9998f, 13.1046f, 12.1044f, 14f, 10.9998f, 14f)
                horizontalLineTo(3.99978f)
                curveTo(2.89521f, 14f, 1.99978f, 13.1046f, 1.99978f, 12f)
                verticalLineTo(8f)
                curveTo(1.4476f, 7.99988f, 1f, 7.55221f, 1f, 7f)
                verticalLineTo(5f)
                curveTo(1f, 4.44772f, 1.44772f, 4f, 2f, 4f)
                horizontalLineTo(4.26756f)
                curveTo(4.09739f, 3.70583f, 4f, 3.36429f, 4f, 3f)
                curveTo(4f, 1.89543f, 4.89543f, 1f, 6f, 1f)
                close()
                moveTo(5f, 3f)
                curveTo(5f, 3.55228f, 5.44772f, 4f, 6f, 4f)
                horizontalLineTo(7f)
                verticalLineTo(3f)
                curveTo(7f, 2.44772f, 6.55228f, 2f, 6f, 2f)
                curveTo(5.44772f, 2f, 5f, 2.44772f, 5f, 3f)
                close()
                moveTo(8f, 5f)
                lineTo(7.99961f, 7f)
                horizontalLineTo(13f)
                verticalLineTo(5f)
                horizontalLineTo(8f)
                close()
                moveTo(6.99961f, 5f)
                horizontalLineTo(2f)
                verticalLineTo(7f)
                horizontalLineTo(2.49978f)
                horizontalLineTo(6.99961f)
                verticalLineTo(5f)
                close()
                moveTo(2.99978f, 8f)
                verticalLineTo(12f)
                curveTo(2.99978f, 12.5523f, 3.4475f, 13f, 3.99978f, 13f)
                horizontalLineTo(6.99961f)
                verticalLineTo(8f)
                horizontalLineTo(2.99978f)
                close()
                moveTo(7.99961f, 13f)
                horizontalLineTo(10.9998f)
                curveTo(11.5521f, 13f, 11.9998f, 12.5523f, 11.9998f, 12f)
                verticalLineTo(8f)
                horizontalLineTo(7.99961f)
                verticalLineTo(13f)
                close()
                moveTo(10f, 3f)
                curveTo(10f, 2.44772f, 9.55228f, 2f, 9f, 2f)
                curveTo(8.44772f, 2f, 8f, 2.44772f, 8f, 3f)
                verticalLineTo(4f)
                horizontalLineTo(9f)
                curveTo(9.55228f, 4f, 10f, 3.55228f, 10f, 3f)
                close()
            }
        }.build()
        
        return _Gift!!
    }

private var _Gift: ImageVector? = null

