package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.ThermometerSnow: ImageVector
    get() {
        if (_ThermometerSnow != null) return _ThermometerSnow!!
        
        _ThermometerSnow = ImageVector.Builder(
            name = "thermometer-snow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 12.5f)
                arcToRelative(1.5f, 1.5f, 0f, true, true, -2f, -1.415f)
                verticalLineTo(9.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                verticalLineToRelative(1.585f)
                arcTo(1.5f, 1.5f, 0f, false, true, 5f, 12.5f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 2.5f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 5f, 0f)
                verticalLineToRelative(7.55f)
                arcToRelative(3.5f, 3.5f, 0f, true, true, -5f, 0f)
                close()
                moveTo(3.5f, 1f)
                arcTo(1.5f, 1.5f, 0f, false, false, 2f, 2.5f)
                verticalLineToRelative(7.987f)
                lineToRelative(-0.167f, 0.15f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, 3.333f, 0f)
                lineTo(5f, 10.486f)
                verticalLineTo(2.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 3.5f, 1f)
                moveToRelative(5f, 1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(1.293f)
                lineToRelative(0.646f, -0.647f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, 0.708f)
                lineTo(9f, 5.207f)
                verticalLineToRelative(1.927f)
                lineToRelative(1.669f, -0.963f)
                lineToRelative(0.495f, -1.85f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.966f, 0.26f)
                lineToRelative(-0.237f, 0.882f)
                lineToRelative(1.12f, -0.646f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.866f)
                lineToRelative(-1.12f, 0.646f)
                lineToRelative(0.884f, 0.237f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.26f, 0.966f)
                lineToRelative(-1.848f, -0.495f)
                lineTo(9.5f, 8f)
                lineToRelative(1.669f, 0.963f)
                lineToRelative(1.849f, -0.495f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.258f, 0.966f)
                lineToRelative(-0.883f, 0.237f)
                lineToRelative(1.12f, 0.646f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.866f)
                lineToRelative(-1.12f, -0.646f)
                lineToRelative(0.237f, 0.883f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.966f, 0.258f)
                lineTo(10.67f, 9.83f)
                lineTo(9f, 8.866f)
                verticalLineToRelative(1.927f)
                lineToRelative(1.354f, 1.353f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, 0.708f)
                lineTo(9f, 12.207f)
                verticalLineTo(13.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineToRelative(-11f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
            }
        }.build()
        
        return _ThermometerSnow!!
    }

private var _ThermometerSnow: ImageVector? = null

