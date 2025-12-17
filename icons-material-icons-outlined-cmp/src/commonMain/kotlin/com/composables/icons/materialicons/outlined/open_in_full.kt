package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Open_in_full: ImageVector
    get() {
        if (_Open_in_full != null) return _Open_in_full!!
        
        _Open_in_full = ImageVector.Builder(
            name = "open_in_full",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21f, 11f)
                lineTo(21f, 3f)
                lineTo(13f, 3f)
                lineTo(16.29f, 6.29f)
                lineTo(6.29f, 16.29f)
                lineTo(3f, 13f)
                lineTo(3f, 21f)
                lineTo(11f, 21f)
                lineTo(7.71f, 17.71f)
                lineTo(17.71f, 7.71f)
                close()
            }
        }.build()
        
        return _Open_in_full!!
    }

private var _Open_in_full: ImageVector? = null

