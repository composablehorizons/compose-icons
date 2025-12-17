package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Meeting_room: ImageVector
    get() {
        if (_Meeting_room != null) return _Meeting_room!!
        
        _Meeting_room = ImageVector.Builder(
            name = "meeting_room",
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
                moveTo(7f, 19f)
                horizontalLineToRelative(6f)
                verticalLineTo(5f)
                horizontalLineTo(7f)
                verticalLineToRelative(14f)
                close()
                moveToRelative(3f, -8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 19f)
                verticalLineTo(4f)
                horizontalLineToRelative(-4f)
                verticalLineTo(3f)
                horizontalLineTo(5f)
                verticalLineToRelative(16f)
                horizontalLineTo(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(12f)
                verticalLineTo(6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                close()
                moveToRelative(-6f, 0f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(14f)
                close()
                moveToRelative(-3f, -8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.build()
        
        return _Meeting_room!!
    }

private var _Meeting_room: ImageVector? = null

