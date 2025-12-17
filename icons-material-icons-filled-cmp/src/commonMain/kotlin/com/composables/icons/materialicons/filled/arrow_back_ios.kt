package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Arrow_back_ios: ImageVector
    get() {
        if (_Arrow_back_ios != null) return _Arrow_back_ios!!
        
        _Arrow_back_ios = ImageVector.Builder(
            name = "arrow_back_ios",
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
                moveTo(11.67f, 3.87f)
                lineTo(9.9f, 2.1f)
                lineTo(0f, 12f)
                lineToRelative(9.9f, 9.9f)
                lineToRelative(1.77f, -1.77f)
                lineTo(3.54f, 12f)
                close()
            }
        }.build()
        
        return _Arrow_back_ios!!
    }

private var _Arrow_back_ios: ImageVector? = null

