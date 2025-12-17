package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Low_priority: ImageVector
    get() {
        if (_Low_priority != null) return _Low_priority!!
        
        _Low_priority = ImageVector.Builder(
            name = "low_priority",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 5f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-8f)
                close()
                moveToRelative(0f, 5.5f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-8f)
                close()
                moveToRelative(0f, 5.5f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-8f)
                close()
                moveTo(2f, 11.5f)
                curveTo(2f, 15.08f, 4.92f, 18f, 8.5f, 18f)
                horizontalLineTo(9f)
                verticalLineToRelative(2f)
                lineToRelative(3f, -3f)
                lineToRelative(-3f, -3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-0.5f)
                curveTo(6.02f, 16f, 4f, 13.98f, 4f, 11.5f)
                reflectiveCurveTo(6.02f, 7f, 8.5f, 7f)
                horizontalLineTo(12f)
                verticalLineTo(5f)
                horizontalLineTo(8.5f)
                curveTo(4.92f, 5f, 2f, 7.92f, 2f, 11.5f)
                close()
            }
        }.build()
        
        return _Low_priority!!
    }

private var _Low_priority: ImageVector? = null

