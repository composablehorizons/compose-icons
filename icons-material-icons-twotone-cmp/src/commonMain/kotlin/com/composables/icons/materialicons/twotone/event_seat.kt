package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Event_seat: ImageVector
    get() {
        if (_Event_seat != null) return _Event_seat!!
        
        _Event_seat = ImageVector.Builder(
            name = "event_seat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(7f)
                horizontalLineTo(9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 21f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                horizontalLineTo(4f)
                close()
                moveTo(17f, 5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineTo(9f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(10f)
                verticalLineTo(5f)
                close()
                moveToRelative(-2f, 7f)
                horizontalLineTo(9f)
                verticalLineTo(5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(7f)
                close()
                moveToRelative(4f, -2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(2f, 10f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineTo(2f)
                close()
            }
        }.build()
        
        return _Event_seat!!
    }

private var _Event_seat: ImageVector? = null

