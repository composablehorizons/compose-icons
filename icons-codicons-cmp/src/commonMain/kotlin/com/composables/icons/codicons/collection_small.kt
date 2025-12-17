package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.CollectionSmall: ImageVector
    get() {
        if (_CollectionSmall != null) return _CollectionSmall!!
        
        _CollectionSmall = ImageVector.Builder(
            name = "collection-small",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 10f,
            viewportHeight = 10f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 0f)
                horizontalLineTo(5f)
                curveTo(4.45f, 0f, 4f, 0.45f, 4f, 1f)
                horizontalLineTo(1f)
                curveTo(0.45f, 1f, 0f, 1.45f, 0f, 2f)
                verticalLineTo(6f)
                curveTo(0f, 6.55f, 0.45f, 7f, 1f, 7f)
                horizontalLineTo(2f)
                verticalLineTo(8f)
                curveTo(2f, 8.55f, 2.45f, 9f, 3f, 9f)
                horizontalLineTo(6f)
                curveTo(6.55f, 9f, 7f, 8.55f, 7f, 8f)
                verticalLineTo(6f)
                horizontalLineTo(8f)
                curveTo(8.55f, 6f, 9f, 5.55f, 9f, 5f)
                verticalLineTo(1f)
                curveTo(9f, 0.45f, 8.55f, 0f, 8f, 0f)
                close()
                moveTo(1f, 6f)
                verticalLineTo(2f)
                horizontalLineTo(4f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                curveTo(2.45f, 3f, 2f, 3.45f, 2f, 4f)
                verticalLineTo(6f)
                horizontalLineTo(1f)
                close()
                moveTo(6f, 8f)
                horizontalLineTo(3f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                verticalLineTo(8f)
                close()
                moveTo(8f, 5f)
                horizontalLineTo(7f)
                verticalLineTo(4f)
                curveTo(7f, 3.45f, 6.55f, 3f, 6f, 3f)
                horizontalLineTo(5f)
                verticalLineTo(1f)
                horizontalLineTo(8f)
                verticalLineTo(5f)
                close()
            }
        }.build()
        
        return _CollectionSmall!!
    }

private var _CollectionSmall: ImageVector? = null

