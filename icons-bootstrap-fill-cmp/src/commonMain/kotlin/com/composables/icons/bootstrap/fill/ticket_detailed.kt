package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.TicketDetailed: ImageVector
    get() {
        if (_TicketDetailed != null) return _TicketDetailed!!
        
        _TicketDetailed = ImageVector.Builder(
            name = "ticket-detailed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 4.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 1.5f, 3f)
                horizontalLineToRelative(13f)
                arcTo(1.5f, 1.5f, 0f, false, true, 16f, 4.5f)
                verticalLineTo(6f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 0f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-13f)
                arcTo(1.5f, 1.5f, 0f, false, true, 0f, 11.5f)
                verticalLineTo(10f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, 0f, -3f)
                arcTo(0.5f, 0.5f, 0f, false, true, 0f, 6f)
                close()
                moveToRelative(4f, 1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(7f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                horizontalLineToRelative(-7f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                moveToRelative(0f, 5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(7f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                horizontalLineToRelative(-7f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                moveTo(4f, 8f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, -2f)
                horizontalLineTo(5f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
            }
        }.build()
        
        return _TicketDetailed!!
    }

private var _TicketDetailed: ImageVector? = null

