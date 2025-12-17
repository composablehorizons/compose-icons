package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.ThermometerLow: ImageVector
    get() {
        if (_ThermometerLow != null) return _ThermometerLow!!
        
        _ThermometerLow = ImageVector.Builder(
            name = "thermometer-low",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.5f, 12.5f)
                arcToRelative(1.5f, 1.5f, 0f, true, true, -2f, -1.415f)
                verticalLineTo(9.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                verticalLineToRelative(1.585f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1f, 1.415f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.5f, 2.5f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 5f, 0f)
                verticalLineToRelative(7.55f)
                arcToRelative(3.5f, 3.5f, 0f, true, true, -5f, 0f)
                close()
                moveTo(8f, 1f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -1.5f, 1.5f)
                verticalLineToRelative(7.987f)
                lineToRelative(-0.167f, 0.15f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, 3.333f, 0f)
                lineToRelative(-0.166f, -0.15f)
                verticalLineTo(2.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 8f, 1f)
            }
        }.build()
        
        return _ThermometerLow!!
    }

private var _ThermometerLow: ImageVector? = null

