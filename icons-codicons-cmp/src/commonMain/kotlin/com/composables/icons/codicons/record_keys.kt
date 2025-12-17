package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.RecordKeys: ImageVector
    get() {
        if (_RecordKeys != null) return _RecordKeys!!
        
        _RecordKeys = ImageVector.Builder(
            name = "record-keys",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 10.5f)
                curveTo(3f, 10.2239f, 3.22386f, 10f, 3.5f, 10f)
                horizontalLineTo(12.5f)
                curveTo(12.7761f, 10f, 13f, 10.2239f, 13f, 10.5f)
                curveTo(13f, 10.7761f, 12.7761f, 11f, 12.5f, 11f)
                horizontalLineTo(3.5f)
                curveTo(3.22386f, 11f, 3f, 10.7761f, 3f, 10.5f)
                close()
                moveTo(3.25f, 7f)
                curveTo(3.66421f, 7f, 4f, 6.66421f, 4f, 6.25f)
                curveTo(4f, 5.83579f, 3.66421f, 5.5f, 3.25f, 5.5f)
                curveTo(2.83579f, 5.5f, 2.5f, 5.83579f, 2.5f, 6.25f)
                curveTo(2.5f, 6.66421f, 2.83579f, 7f, 3.25f, 7f)
                close()
                moveTo(10f, 6.25f)
                curveTo(10f, 6.66421f, 9.66421f, 7f, 9.25f, 7f)
                curveTo(8.83579f, 7f, 8.5f, 6.66421f, 8.5f, 6.25f)
                curveTo(8.5f, 5.83579f, 8.83579f, 5.5f, 9.25f, 5.5f)
                curveTo(9.66421f, 5.5f, 10f, 5.83579f, 10f, 6.25f)
                close()
                moveTo(6.25f, 7f)
                curveTo(6.66421f, 7f, 7f, 6.66421f, 7f, 6.25f)
                curveTo(7f, 5.83579f, 6.66421f, 5.5f, 6.25f, 5.5f)
                curveTo(5.83579f, 5.5f, 5.5f, 5.83579f, 5.5f, 6.25f)
                curveTo(5.5f, 6.66421f, 5.83579f, 7f, 6.25f, 7f)
                close()
                moveTo(13f, 6.25f)
                curveTo(13f, 6.66421f, 12.6642f, 7f, 12.25f, 7f)
                curveTo(11.8358f, 7f, 11.5f, 6.66421f, 11.5f, 6.25f)
                curveTo(11.5f, 5.83579f, 11.8358f, 5.5f, 12.25f, 5.5f)
                curveTo(12.6642f, 5.5f, 13f, 5.83579f, 13f, 6.25f)
                close()
                moveTo(5.25f, 9f)
                curveTo(5.66421f, 9f, 6f, 8.66421f, 6f, 8.25f)
                curveTo(6f, 7.83579f, 5.66421f, 7.5f, 5.25f, 7.5f)
                curveTo(4.83579f, 7.5f, 4.5f, 7.83579f, 4.5f, 8.25f)
                curveTo(4.5f, 8.66421f, 4.83579f, 9f, 5.25f, 9f)
                close()
                moveTo(9f, 8.25f)
                curveTo(9f, 8.66421f, 8.66421f, 9f, 8.25f, 9f)
                curveTo(7.83579f, 9f, 7.5f, 8.66421f, 7.5f, 8.25f)
                curveTo(7.5f, 7.83579f, 7.83579f, 7.5f, 8.25f, 7.5f)
                curveTo(8.66421f, 7.5f, 9f, 7.83579f, 9f, 8.25f)
                close()
                moveTo(11.25f, 9f)
                curveTo(11.6642f, 9f, 12f, 8.66421f, 12f, 8.25f)
                curveTo(12f, 7.83579f, 11.6642f, 7.5f, 11.25f, 7.5f)
                curveTo(10.8358f, 7.5f, 10.5f, 7.83579f, 10.5f, 8.25f)
                curveTo(10.5f, 8.66421f, 10.8358f, 9f, 11.25f, 9f)
                close()
                moveTo(1f, 4.75f)
                curveTo(1f, 3.7835f, 1.7835f, 3f, 2.75f, 3f)
                horizontalLineTo(13.25f)
                curveTo(14.2165f, 3f, 15f, 3.7835f, 15f, 4.75f)
                verticalLineTo(11.25f)
                curveTo(15f, 12.2165f, 14.2165f, 13f, 13.25f, 13f)
                horizontalLineTo(2.75f)
                curveTo(1.7835f, 13f, 1f, 12.2165f, 1f, 11.25f)
                verticalLineTo(4.75f)
                close()
                moveTo(2.75f, 4f)
                curveTo(2.33579f, 4f, 2f, 4.33579f, 2f, 4.75f)
                verticalLineTo(11.25f)
                curveTo(2f, 11.6642f, 2.33579f, 12f, 2.75f, 12f)
                horizontalLineTo(13.25f)
                curveTo(13.6642f, 12f, 14f, 11.6642f, 14f, 11.25f)
                verticalLineTo(4.75f)
                curveTo(14f, 4.33579f, 13.6642f, 4f, 13.25f, 4f)
                horizontalLineTo(2.75f)
                close()
            }
        }.build()
        
        return _RecordKeys!!
    }

private var _RecordKeys: ImageVector? = null

