package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Home_filled: ImageVector
    get() {
        if (_Home_filled != null) return _Home_filled!!
        
        _Home_filled = ImageVector.Builder(
            name = "home_filled",
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
                moveTo(12f, 3f)
                lineTo(4f, 9f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(5f)
                verticalLineTo(9f)
                close()
            }
        }.build()
        
        return _Home_filled!!
    }

private var _Home_filled: ImageVector? = null

