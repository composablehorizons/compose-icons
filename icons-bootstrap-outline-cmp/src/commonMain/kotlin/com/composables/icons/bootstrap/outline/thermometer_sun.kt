package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.ThermometerSun: ImageVector
    get() {
        if (_ThermometerSun != null) return _ThermometerSun!!
        
        _ThermometerSun = ImageVector.Builder(
            name = "thermometer-sun",
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
                verticalLineTo(2.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                verticalLineToRelative(8.585f)
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
                verticalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineToRelative(-1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                moveToRelative(4.243f, 1.757f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 0.707f)
                lineToRelative(-0.707f, 0.708f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.708f, -0.708f)
                lineToRelative(0.708f, -0.707f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.707f, 0f)
                moveTo(8f, 5.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                arcToRelative(3f, 3f, 0f, true, true, 0f, 6f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, -4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                moveTo(12.5f, 8f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0f, 1f)
                horizontalLineToRelative(-1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                moveToRelative(-1.172f, 2.828f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, 0f)
                lineToRelative(0.707f, 0.708f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.707f, 0.707f)
                lineToRelative(-0.708f, -0.707f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -0.708f)
                moveTo(8.5f, 12f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineToRelative(-1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
            }
        }.build()
        
        return _ThermometerSun!!
    }

private var _ThermometerSun: ImageVector? = null

