package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.SaveAll: ImageVector
    get() {
        if (_SaveAll != null) return _SaveAll!!
        
        _SaveAll = ImageVector.Builder(
            name = "save-all",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 6.12f)
                verticalLineTo(11f)
                curveTo(15f, 12.06f, 14.58f, 13.08f, 13.83f, 13.83f)
                curveTo(13.08f, 14.58f, 12.06f, 15f, 11f, 15f)
                horizontalLineTo(5f)
                curveTo(4.91f, 15f, 4.82f, 14.99f, 4.74f, 14.98f)
                curveTo(4.66f, 14.97f, 4.58f, 14.96f, 4.5f, 14.93f)
                curveTo(4.32f, 14.89f, 4.15f, 14.82f, 4f, 14.73f)
                curveTo(3.92f, 14.68f, 3.85f, 14.64f, 3.78f, 14.58f)
                curveTo(3.64f, 14.48f, 3.52f, 14.36f, 3.42f, 14.22f)
                curveTo(3.36f, 14.15f, 3.32f, 14.08f, 3.27f, 14f)
                horizontalLineTo(11f)
                curveTo(11.35f, 14f, 11.69f, 13.94f, 12f, 13.82f)
                curveTo(12.42f, 13.68f, 12.8f, 13.44f, 13.12f, 13.12f)
                curveTo(13.68f, 12.56f, 14f, 11.8f, 14f, 11f)
                verticalLineTo(4.3f)
                lineTo(14.41f, 4.71f)
                curveTo(14.79f, 5.08f, 15f, 5.6f, 15f, 6.12f)
                close()
                moveTo(11f, 13f)
                horizontalLineTo(3f)
                curveTo(1.897f, 13f, 1f, 12.103f, 1f, 11f)
                verticalLineTo(3f)
                curveTo(1f, 1.897f, 1.897f, 1f, 3f, 1f)
                horizontalLineTo(9.879f)
                curveTo(10.405f, 1f, 10.921f, 1.213f, 11.293f, 1.586f)
                lineTo(12.414f, 2.707f)
                curveTo(12.787f, 3.079f, 13f, 3.595f, 13f, 4.121f)
                verticalLineTo(11f)
                curveTo(13f, 12.103f, 12.103f, 13f, 11f, 13f)
                close()
                moveTo(5.999f, 3f)
                horizontalLineTo(8f)
                verticalLineTo(2f)
                horizontalLineTo(5.999f)
                verticalLineTo(3f)
                close()
                moveTo(9f, 8f)
                horizontalLineTo(5f)
                verticalLineTo(12f)
                horizontalLineTo(9f)
                verticalLineTo(8f)
                close()
                moveTo(10f, 8f)
                verticalLineTo(12f)
                horizontalLineTo(11f)
                curveTo(11.551f, 12f, 12f, 11.551f, 12f, 11f)
                verticalLineTo(4.121f)
                curveTo(12f, 3.858f, 11.893f, 3.6f, 11.707f, 3.414f)
                lineTo(10.586f, 2.293f)
                curveTo(10.4f, 2.107f, 10.142f, 2f, 9.879f, 2f)
                horizontalLineTo(9f)
                verticalLineTo(3f)
                curveTo(9f, 3.551f, 8.551f, 4f, 8f, 4f)
                horizontalLineTo(6f)
                curveTo(5.449f, 4f, 5f, 3.551f, 5f, 3f)
                verticalLineTo(2f)
                horizontalLineTo(3f)
                curveTo(2.449f, 2f, 2f, 2.449f, 2f, 3f)
                verticalLineTo(11f)
                curveTo(2f, 11.551f, 2.449f, 12f, 3f, 12f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                curveTo(4f, 7.449f, 4.449f, 7f, 5f, 7f)
                horizontalLineTo(9f)
                curveTo(9.551f, 7f, 10f, 7.449f, 10f, 8f)
                close()
            }
        }.build()
        
        return _SaveAll!!
    }

private var _SaveAll: ImageVector? = null

