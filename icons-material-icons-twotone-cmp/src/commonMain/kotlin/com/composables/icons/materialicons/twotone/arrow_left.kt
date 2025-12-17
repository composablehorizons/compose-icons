package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Arrow_left: ImageVector
    get() {
        if (_Arrow_left != null) return _Arrow_left!!
        
        _Arrow_left = ImageVector.Builder(
            name = "arrow_left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(24f, 0f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                horizontalLineToRelative(24f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 7f)
                lineToRelative(-5f, 5f)
                lineToRelative(5f, 5f)
                verticalLineTo(7f)
                close()
            }
        }.build()
        
        return _Arrow_left!!
    }

private var _Arrow_left: ImageVector? = null

