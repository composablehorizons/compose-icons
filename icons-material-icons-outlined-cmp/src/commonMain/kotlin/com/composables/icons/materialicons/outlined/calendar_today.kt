package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Calendar_today: ImageVector
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
                moveTo(20f, 3f)
                horizontalLineToRelative(-1f)
                verticalLineTo(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineTo(7f)
                verticalLineTo(1f)
                horizontalLineTo(5f)
                verticalLineToRelative(2f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(16f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(0f, 18f)
                horizontalLineTo(4f)
                verticalLineTo(10f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(11f)
                close()
                moveToRelative(0f, -13f)
                horizontalLineTo(4f)
                verticalLineTo(5f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(3f)
                close()
            }
        }.build()
        
        return _Calendar_today!!
    }

private var _Calendar_today: ImageVector? = null

