package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Calendar_view_day: ImageVector
    get() {
        if (_Calendar_view_day != null) return _Calendar_view_day!!
        
        _Calendar_view_day = ImageVector.Builder(
            name = "calendar_view_day",
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
                moveTo(3f, 17f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(2f)
                horizontalLineTo(3f)
                verticalLineToRelative(-2f)
                close()
                moveToRelative(0f, -7f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(5f)
                horizontalLineTo(3f)
                verticalLineToRelative(-5f)
                close()
                moveToRelative(0f, -4f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(2f)
                horizontalLineTo(3f)
                verticalLineTo(6f)
                close()
            }
        }.build()
        
        return _Calendar_view_day!!
    }

private var _Calendar_view_day: ImageVector? = null

