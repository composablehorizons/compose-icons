package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Ticket: ImageVector
    get() {
        if (_Ticket != null) return _Ticket!!
        
        _Ticket = ImageVector.Builder(
            name = "ticket",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.5f, 3f)
                arcTo(1.5f, 1.5f, 0f, false, false, 0f, 4.5f)
                verticalLineTo(6f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                arcToRelative(1.5f, 1.5f, 0f, true, true, 0f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 1.5f, 13f)
                horizontalLineToRelative(13f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineTo(10f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 0f, -3f)
                arcTo(0.5f, 0.5f, 0f, false, false, 16f, 6f)
                verticalLineTo(4.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 14.5f, 3f)
                close()
            }
        }.build()
        
        return _Ticket!!
    }

private var _Ticket: ImageVector? = null

