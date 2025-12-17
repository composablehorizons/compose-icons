package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.TruckFlatbed: ImageVector
    get() {
        if (_TruckFlatbed != null) return _TruckFlatbed!!
        
        _TruckFlatbed = ImageVector.Builder(
            name = "truck-flatbed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.5f, 4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineTo(5f)
                horizontalLineToRelative(1.02f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.17f, 0.563f)
                lineToRelative(1.481f, 1.85f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 0.329f, 0.938f)
                verticalLineTo(10.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                horizontalLineTo(14f)
                arcToRelative(2f, 2f, 0f, true, true, -4f, 0f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, true, true, -4f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(11f)
                verticalLineTo(4.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                moveTo(3f, 11f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, 2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                moveToRelative(9f, 0f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, 2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                moveToRelative(1.732f, 0f)
                horizontalLineToRelative(0.768f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineTo(8.35f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.11f, -0.312f)
                lineToRelative(-1.48f, -1.85f)
                arcTo(0.5f, 0.5f, 0f, false, false, 13.02f, 6f)
                horizontalLineTo(12f)
                verticalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, false, true, 1.732f, 1f)
            }
        }.build()
        
        return _TruckFlatbed!!
    }

private var _TruckFlatbed: ImageVector? = null

