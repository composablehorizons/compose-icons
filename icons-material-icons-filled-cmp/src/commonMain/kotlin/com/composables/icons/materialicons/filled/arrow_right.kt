package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Arrow_right: ImageVector
    get() {
        if (_Arrow_right != null) return _Arrow_right!!
        
        _Arrow_right = ImageVector.Builder(
            name = "arrow_right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 17f)
                lineToRelative(5f, -5f)
                lineToRelative(-5f, -5f)
                verticalLineToRelative(10f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 24f)
                verticalLineTo(0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                close()
            }
        }.build()
        
        return _Arrow_right!!
    }

private var _Arrow_right: ImageVector? = null

