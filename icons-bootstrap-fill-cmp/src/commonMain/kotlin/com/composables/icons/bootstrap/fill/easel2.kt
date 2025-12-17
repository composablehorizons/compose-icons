package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Easel2: ImageVector
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
                moveTo(8.447f, 0.276f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.894f, 0f)
                lineTo(7.19f, 1f)
                horizontalLineTo(2.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 1f, 2.5f)
                verticalLineTo(10f)
                horizontalLineToRelative(14f)
                verticalLineTo(2.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 13.5f, 1f)
                horizontalLineTo(8.809f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0.5f, 11f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(2.86f)
                lineToRelative(-0.845f, 3.379f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.97f, 0.242f)
                lineTo(3.89f, 14f)
                horizontalLineToRelative(8.22f)
                lineToRelative(0.405f, 1.621f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.97f, -0.242f)
                lineTo(12.64f, 12f)
                horizontalLineToRelative(2.86f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                close()
                moveToRelative(3.64f, 2f)
                lineToRelative(0.25f, -1f)
                horizontalLineToRelative(7.22f)
                lineToRelative(0.25f, 1f)
                close()
            }
        }.build()
        
        return _Easel2!!
    }

private var _Easel2: ImageVector? = null

