package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Calendar_today: ImageVector
    get() {
        if (_Calendar_today != null) return _Calendar_today!!
        
        _Calendar_today = ImageVector.Builder(
            name = "calendar_today",
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
                moveTo(22f, 3f)
                horizontalLineToRelative(-3f)
                verticalLineTo(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineTo(7f)
                verticalLineTo(1f)
                horizontalLineTo(5f)
                verticalLineToRelative(2f)
                horizontalLineTo(2f)
                verticalLineToRelative(20f)
                horizontalLineToRelative(20f)
                verticalLineTo(3f)
                close()
                moveToRelative(-2f, 18f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(13f)
                close()
            }
        }.build()
        
        return _Calendar_today!!
    }

private var _Calendar_today: ImageVector? = null

