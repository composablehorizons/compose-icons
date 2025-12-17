package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Power_input: ImageVector
    get() {
        if (_Power_input != null) return _Power_input!!
        
        _Power_input = ImageVector.Builder(
            name = "power_input",
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
                moveTo(2f, 9f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(19f)
                verticalLineTo(9f)
                horizontalLineTo(2f)
                close()
                moveToRelative(0f, 6f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                horizontalLineTo(2f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(7f, 0f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                horizontalLineTo(9f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(7f, 0f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                close()
            }
        }.build()
        
        return _Power_input!!
    }

private var _Power_input: ImageVector? = null

