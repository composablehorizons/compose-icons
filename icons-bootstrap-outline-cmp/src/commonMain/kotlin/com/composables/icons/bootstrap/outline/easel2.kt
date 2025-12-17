package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Easel2: ImageVector
    get() {
        if (_Easel2 != null) return _Easel2!!
        
        _Easel2 = ImageVector.Builder(
            name = "easel2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.447f, 0.276f)
                lineTo(8.81f, 1f)
                horizontalLineToRelative(4.69f)
                arcTo(1.5f, 1.5f, 0f, false, true, 15f, 2.5f)
                verticalLineTo(11f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-2.86f)
                lineToRelative(0.845f, 3.379f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.97f, 0.242f)
                lineTo(12.11f, 14f)
                horizontalLineTo(3.89f)
                lineToRelative(-0.405f, 1.621f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.97f, -0.242f)
                lineTo(3.36f, 12f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineTo(1f)
                verticalLineTo(2.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 2.5f, 1f)
                horizontalLineToRelative(4.691f)
                lineToRelative(0.362f, -0.724f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8f, 0f)
                moveTo(2f, 11f)
                horizontalLineToRelative(12f)
                verticalLineTo(2.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-11f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                close()
                moveToRelative(9.61f, 1f)
                horizontalLineTo(4.39f)
                lineToRelative(-0.25f, 1f)
                horizontalLineToRelative(7.72f)
                close()
            }
        }.build()
        
        return _Easel2!!
    }

private var _Easel2: ImageVector? = null

