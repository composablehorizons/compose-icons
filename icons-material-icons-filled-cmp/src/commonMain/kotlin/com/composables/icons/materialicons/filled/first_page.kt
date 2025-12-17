package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.First_page: ImageVector
    get() {
        if (_First_page != null) return _First_page!!
        
        _First_page = ImageVector.Builder(
            name = "first_page",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18.41f, 16.59f)
                lineTo(13.82f, 12f)
                lineToRelative(4.59f, -4.59f)
                lineTo(17f, 6f)
                lineToRelative(-6f, 6f)
                lineToRelative(6f, 6f)
                close()
                moveTo(6f, 6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(12f)
                horizontalLineTo(6f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(24f, 24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                close()
            }
        }.build()
        
        return _First_page!!
    }

private var _First_page: ImageVector? = null

