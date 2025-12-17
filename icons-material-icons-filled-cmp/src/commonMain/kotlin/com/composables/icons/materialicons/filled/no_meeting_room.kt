package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.No_meeting_room: ImageVector
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
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11f, 11f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                lineToRelative(9.73f, 9.73f)
                lineTo(20.46f, 23f)
                lineTo(14f, 16.54f)
                verticalLineTo(21f)
                horizontalLineTo(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineTo(7.54f)
                lineToRelative(-4f, -4f)
                lineToRelative(1.27f, -1.27f)
                lineTo(11f, 11f)
                close()
                moveToRelative(3f, 0.49f)
                lineTo(5.51f, 3f)
                horizontalLineTo(14f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(12.49f)
                lineToRelative(-2f, -2f)
                verticalLineTo(6f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(5.49f)
                close()
            }
        }.build()
        
        return _No_meeting_room!!
    }

private var _No_meeting_room: ImageVector? = null

