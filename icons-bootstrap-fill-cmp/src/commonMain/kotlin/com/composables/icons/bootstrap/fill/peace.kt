package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Peace: ImageVector
    get() {
        if (_Peace != null) return _Peace!!
        
        _Peace = ImageVector.Builder(
            name = "peace",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 13.292f)
                arcTo(8f, 8f, 0f, false, false, 8.5f, 0.015f)
                verticalLineToRelative(7.778f)
                close()
                moveToRelative(-0.708f, 0.708f)
                lineTo(8.5f, 9.206f)
                verticalLineToRelative(6.778f)
                arcToRelative(7.97f, 7.97f, 0f, false, false, 4.792f, -1.986f)
                close()
                moveTo(7.5f, 15.985f)
                verticalLineTo(9.207f)
                lineTo(2.708f, 14f)
                arcTo(7.97f, 7.97f, 0f, false, false, 7.5f, 15.985f)
                moveTo(2f, 13.292f)
                arcTo(8f, 8f, 0f, false, true, 7.5f, 0.015f)
                verticalLineToRelative(7.778f)
                close()
            }
        }.build()
        
        return _Peace!!
    }

private var _Peace: ImageVector? = null

