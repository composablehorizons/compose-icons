package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Notebook: ImageVector
    get() {
        if (_Notebook != null) return _Notebook!!
        
        _Notebook = ImageVector.Builder(
            name = "notebook",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.75f, 3f)
                curveTo(4.33579f, 3f, 4f, 3.33579f, 4f, 3.75f)
                verticalLineTo(5.25f)
                curveTo(4f, 5.66421f, 4.33579f, 6f, 4.75f, 6f)
                horizontalLineTo(10.25f)
                curveTo(10.6642f, 6f, 11f, 5.66421f, 11f, 5.25f)
                verticalLineTo(3.75f)
                curveTo(11f, 3.33579f, 10.6642f, 3f, 10.25f, 3f)
                horizontalLineTo(4.75f)
                close()
                moveTo(5f, 5f)
                verticalLineTo(4f)
                horizontalLineTo(10f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                close()
                moveTo(2f, 2.75f)
                curveTo(2f, 1.7835f, 2.7835f, 1f, 3.75f, 1f)
                horizontalLineTo(11.25f)
                curveTo(12.2165f, 1f, 13f, 1.7835f, 13f, 2.75f)
                verticalLineTo(13.25f)
                curveTo(13f, 14.2165f, 12.2165f, 15f, 11.25f, 15f)
                horizontalLineTo(3.75f)
                curveTo(2.7835f, 15f, 2f, 14.2165f, 2f, 13.25f)
                verticalLineTo(2.75f)
                close()
                moveTo(3.75f, 2f)
                curveTo(3.33579f, 2f, 3f, 2.33579f, 3f, 2.75f)
                verticalLineTo(13.25f)
                curveTo(3f, 13.6642f, 3.33579f, 14f, 3.75f, 14f)
                horizontalLineTo(11.25f)
                curveTo(11.6642f, 14f, 12f, 13.6642f, 12f, 13.25f)
                verticalLineTo(2.75f)
                curveTo(12f, 2.33579f, 11.6642f, 2f, 11.25f, 2f)
                horizontalLineTo(3.75f)
                close()
                moveTo(14.625f, 4f)
                horizontalLineTo(14f)
                verticalLineTo(6f)
                horizontalLineTo(14.625f)
                curveTo(14.8321f, 6f, 15f, 5.83211f, 15f, 5.625f)
                verticalLineTo(4.375f)
                curveTo(15f, 4.16789f, 14.8321f, 4f, 14.625f, 4f)
                close()
                moveTo(14f, 7f)
                horizontalLineTo(14.625f)
                curveTo(14.8321f, 7f, 15f, 7.16789f, 15f, 7.375f)
                verticalLineTo(8.625f)
                curveTo(15f, 8.83211f, 14.8321f, 9f, 14.625f, 9f)
                horizontalLineTo(14f)
                verticalLineTo(7f)
                close()
                moveTo(14.625f, 10f)
                horizontalLineTo(14f)
                verticalLineTo(12f)
                horizontalLineTo(14.625f)
                curveTo(14.8321f, 12f, 15f, 11.8321f, 15f, 11.625f)
                verticalLineTo(10.375f)
                curveTo(15f, 10.1679f, 14.8321f, 10f, 14.625f, 10f)
                close()
            }
        }.build()
        
        return _Notebook!!
    }

private var _Notebook: ImageVector? = null

