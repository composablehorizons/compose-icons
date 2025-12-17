package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Diff: ImageVector
    get() {
        if (_Diff != null) return _Diff!!
        
        _Diff = ImageVector.Builder(
            name = "diff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.5f, 2f)
                horizontalLineTo(2.5f)
                curveTo(1.673f, 2f, 1f, 2.673f, 1f, 3.5f)
                verticalLineTo(12.5f)
                curveTo(1f, 13.327f, 1.673f, 14f, 2.5f, 14f)
                horizontalLineTo(5.5f)
                curveTo(6.327f, 14f, 7f, 13.327f, 7f, 12.5f)
                verticalLineTo(3.5f)
                curveTo(7f, 2.673f, 6.327f, 2f, 5.5f, 2f)
                close()
                moveTo(2.5f, 3f)
                horizontalLineTo(5.5f)
                curveTo(5.775f, 3f, 6f, 3.224f, 6f, 3.5f)
                verticalLineTo(5f)
                horizontalLineTo(2f)
                verticalLineTo(3.5f)
                curveTo(2f, 3.224f, 2.225f, 3f, 2.5f, 3f)
                close()
                moveTo(5.5f, 13f)
                horizontalLineTo(2.5f)
                curveTo(2.225f, 13f, 2f, 12.776f, 2f, 12.5f)
                verticalLineTo(6f)
                horizontalLineTo(6f)
                verticalLineTo(12.5f)
                curveTo(6f, 12.776f, 5.775f, 13f, 5.5f, 13f)
                close()
                moveTo(13.5f, 2f)
                horizontalLineTo(10.5f)
                curveTo(9.673f, 2f, 9f, 2.673f, 9f, 3.5f)
                verticalLineTo(12.5f)
                curveTo(9f, 13.327f, 9.673f, 14f, 10.5f, 14f)
                horizontalLineTo(13.5f)
                curveTo(14.327f, 14f, 15f, 13.327f, 15f, 12.5f)
                verticalLineTo(3.5f)
                curveTo(15f, 2.673f, 14.327f, 2f, 13.5f, 2f)
                close()
                moveTo(10.5f, 3f)
                horizontalLineTo(13.5f)
                curveTo(13.775f, 3f, 14f, 3.224f, 14f, 3.5f)
                verticalLineTo(8f)
                horizontalLineTo(10f)
                verticalLineTo(3.5f)
                curveTo(10f, 3.224f, 10.225f, 3f, 10.5f, 3f)
                close()
                moveTo(13.5f, 13f)
                horizontalLineTo(10.5f)
                curveTo(10.225f, 13f, 10f, 12.776f, 10f, 12.5f)
                verticalLineTo(10f)
                horizontalLineTo(14f)
                verticalLineTo(12.5f)
                curveTo(14f, 12.776f, 13.775f, 13f, 13.5f, 13f)
                close()
            }
        }.build()
        
        return _Diff!!
    }

private var _Diff: ImageVector? = null

