package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Call_made: ImageVector
    get() {
        if (_Call_made != null) return _Call_made!!
        
        _Call_made = ImageVector.Builder(
            name = "call_made",
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
                moveTo(9f, 5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6.59f)
                lineTo(4f, 18.59f)
                lineTo(5.41f, 20f)
                lineTo(17f, 8.41f)
                verticalLineTo(15f)
                horizontalLineToRelative(2f)
                verticalLineTo(5f)
                horizontalLineTo(9f)
                close()
            }
        }.build()
        
        return _Call_made!!
    }

private var _Call_made: ImageVector? = null

