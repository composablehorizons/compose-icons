package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.No_meeting_room: ImageVector
    get() {
        if (_No_meeting_room != null) return _No_meeting_room!!
        
        _No_meeting_room = ImageVector.Builder(
            name = "no_meeting_room",
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
                moveTo(12f, 5f)
                verticalLineToRelative(3.88f)
                lineToRelative(2f, 2f)
                verticalLineTo(6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(7.88f)
                lineToRelative(2f, 2f)
                verticalLineTo(4f)
                horizontalLineToRelative(-5f)
                verticalLineTo(3f)
                horizontalLineTo(6.12f)
                lineToRelative(2f, 2f)
                close()
                moveTo(2.41f, 2.13f)
                lineTo(1f, 3.54f)
                lineToRelative(4f, 4f)
                verticalLineTo(19f)
                horizontalLineTo(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-4.46f)
                lineTo(20.46f, 23f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.41f, 2.13f)
                close()
                moveTo(12f, 19f)
                horizontalLineTo(7f)
                verticalLineTo(9.54f)
                lineToRelative(5f, 5f)
                verticalLineTo(19f)
                close()
            }
        }.build()
        
        return _No_meeting_room!!
    }

private var _No_meeting_room: ImageVector? = null

