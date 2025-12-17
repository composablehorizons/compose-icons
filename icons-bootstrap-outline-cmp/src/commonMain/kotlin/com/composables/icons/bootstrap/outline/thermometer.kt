package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Thermometer: ImageVector
    get() {
        if (_Thermometer != null) return _Thermometer!!
        
        _Thermometer = ImageVector.Builder(
            name = "thermometer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 14f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, 0f, -3f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 0f, 3f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -2.5f, 2.5f)
                verticalLineToRelative(7.55f)
                arcToRelative(3.5f, 3.5f, 0f, true, false, 5f, 0f)
                verticalLineTo(2.5f)
                arcTo(2.5f, 2.5f, 0f, false, false, 8f, 0f)
                moveTo(6.5f, 2.5f)
                arcToRelative(1.5f, 1.5f, 0f, true, true, 3f, 0f)
                verticalLineToRelative(7.987f)
                lineToRelative(0.167f, 0.15f)
                arcToRelative(2.5f, 2.5f, 0f, true, true, -3.333f, 0f)
                lineToRelative(0.166f, -0.15f)
                close()
            }
        }.build()
        
        return _Thermometer!!
    }

private var _Thermometer: ImageVector? = null

