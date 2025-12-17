package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Save: ImageVector
    get() {
        if (_Save != null) return _Save!!
        
        _Save = ImageVector.Builder(
            name = "save",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.414f, 3.207f)
                lineTo(12.793f, 1.586f)
                curveTo(12.421f, 1.213f, 11.905f, 1f, 11.379f, 1f)
                horizontalLineTo(3f)
                curveTo(1.897f, 1f, 1f, 1.897f, 1f, 3f)
                verticalLineTo(13f)
                curveTo(1f, 14.103f, 1.897f, 15f, 3f, 15f)
                horizontalLineTo(13f)
                curveTo(14.103f, 15f, 15f, 14.103f, 15f, 13f)
                verticalLineTo(4.621f)
                curveTo(15f, 4.095f, 14.787f, 3.579f, 14.414f, 3.207f)
                close()
                moveTo(9f, 2f)
                verticalLineTo(3.5f)
                curveTo(9f, 3.776f, 8.776f, 4f, 8.5f, 4f)
                horizontalLineTo(6.5f)
                curveTo(6.224f, 4f, 6f, 3.776f, 6f, 3.5f)
                verticalLineTo(2f)
                horizontalLineTo(9f)
                close()
                moveTo(5f, 14f)
                verticalLineTo(9.5f)
                curveTo(5f, 9.224f, 5.224f, 9f, 5.5f, 9f)
                horizontalLineTo(10.5f)
                curveTo(10.776f, 9f, 11f, 9.224f, 11f, 9.5f)
                verticalLineTo(14f)
                horizontalLineTo(5f)
                close()
                moveTo(14f, 13f)
                curveTo(14f, 13.551f, 13.551f, 14f, 13f, 14f)
                horizontalLineTo(12f)
                verticalLineTo(9.5f)
                curveTo(12f, 8.673f, 11.327f, 8f, 10.5f, 8f)
                horizontalLineTo(5.5f)
                curveTo(4.673f, 8f, 4f, 8.673f, 4f, 9.5f)
                verticalLineTo(14f)
                horizontalLineTo(3f)
                curveTo(2.449f, 14f, 2f, 13.551f, 2f, 13f)
                verticalLineTo(3f)
                curveTo(2f, 2.449f, 2.449f, 2f, 3f, 2f)
                horizontalLineTo(5f)
                verticalLineTo(3.5f)
                curveTo(5f, 4.327f, 5.673f, 5f, 6.5f, 5f)
                horizontalLineTo(8.5f)
                curveTo(9.327f, 5f, 10f, 4.327f, 10f, 3.5f)
                verticalLineTo(2f)
                horizontalLineTo(11.379f)
                curveTo(11.642f, 2f, 11.9f, 2.107f, 12.086f, 2.293f)
                lineTo(13.707f, 3.914f)
                curveTo(13.893f, 4.1f, 14f, 4.358f, 14f, 4.621f)
                verticalLineTo(13f)
                close()
            }
        }.build()
        
        return _Save!!
    }

private var _Save: ImageVector? = null

