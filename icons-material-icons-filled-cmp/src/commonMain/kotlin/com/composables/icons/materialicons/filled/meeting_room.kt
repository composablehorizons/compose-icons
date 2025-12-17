package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Meeting_room: ImageVector
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
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 6f)
                verticalLineToRelative(15f)
                horizontalLineTo(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineTo(3f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                verticalLineTo(6f)
                horizontalLineToRelative(-3f)
                close()
                moveToRelative(-4f, 5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.build()
        
        return _Meeting_room!!
    }

private var _Meeting_room: ImageVector? = null

