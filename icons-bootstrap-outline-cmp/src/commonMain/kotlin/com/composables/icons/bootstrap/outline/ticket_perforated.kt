package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.TicketPerforated: ImageVector
    get() {
        if (_TicketPerforated != null) return _TicketPerforated!!
        
        _TicketPerforated = ImageVector.Builder(
            name = "ticket-perforated",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 4.85f)
                verticalLineToRelative(0.9f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-0.9f)
                close()
                moveToRelative(7f, 0f)
                verticalLineToRelative(0.9f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-0.9f)
                close()
                moveToRelative(-7f, 1.8f)
                verticalLineToRelative(0.9f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-0.9f)
                close()
                moveToRelative(7f, 0f)
                verticalLineToRelative(0.9f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-0.9f)
                close()
                moveToRelative(-7f, 1.8f)
                verticalLineToRelative(0.9f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-0.9f)
                close()
                moveToRelative(7f, 0f)
                verticalLineToRelative(0.9f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-0.9f)
                close()
                moveToRelative(-7f, 1.8f)
                verticalLineToRelative(0.9f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-0.9f)
                close()
                moveToRelative(7f, 0f)
                verticalLineToRelative(0.9f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-0.9f)
                close()
            }
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
                moveTo(1f, 4.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(13f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(1.05f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 0f, 4.9f)
                verticalLineToRelative(1.05f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-13f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-1.05f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 0f, -4.9f)
                close()
            }
        }.build()
        
        return _TicketPerforated!!
    }

private var _TicketPerforated: ImageVector? = null

