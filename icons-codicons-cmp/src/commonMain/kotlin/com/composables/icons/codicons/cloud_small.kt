package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.CloudSmall: ImageVector
    get() {
        if (_CloudSmall != null) return _CloudSmall!!
        
        _CloudSmall = ImageVector.Builder(
            name = "cloud-small",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 10f,
            viewportHeight = 10f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.75f, 8f)
                horizontalLineTo(2.25f)
                curveTo(1.01f, 8f, 0f, 6.99f, 0f, 5.75f)
                curveTo(0f, 4.58f, 0.897f, 3.616f, 2.04f, 3.51f)
                curveTo(2.274f, 2.088f, 3.513f, 1f, 5f, 1f)
                curveTo(6.487f, 1f, 7.726f, 2.088f, 7.96f, 3.51f)
                curveTo(9.103f, 3.616f, 10f, 4.58f, 10f, 5.75f)
                curveTo(10f, 6.99f, 8.99f, 8f, 7.75f, 8f)
                close()
                moveTo(2.25f, 4.5f)
                curveTo(1.561f, 4.5f, 1f, 5.061f, 1f, 5.75f)
                curveTo(1f, 6.439f, 1.561f, 7f, 2.25f, 7f)
                horizontalLineTo(7.75f)
                curveTo(8.439f, 7f, 9f, 6.439f, 9f, 5.75f)
                curveTo(9f, 5.061f, 8.439f, 4.5f, 7.75f, 4.5f)
                horizontalLineTo(7.5f)
                curveTo(7.224f, 4.5f, 7f, 4.276f, 7f, 4f)
                curveTo(7f, 2.897f, 6.103f, 2f, 5f, 2f)
                curveTo(3.897f, 2f, 3f, 2.897f, 3f, 4f)
                curveTo(3f, 4.276f, 2.776f, 4.5f, 2.5f, 4.5f)
                horizontalLineTo(2.25f)
                close()
            }
        }.build()
        
        return _CloudSmall!!
    }

private var _CloudSmall: ImageVector? = null

