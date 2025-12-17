package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Dangerous: ImageVector
    get() {
        if (_Dangerous != null) return _Dangerous!!
        
        _Dangerous = ImageVector.Builder(
            name = "dangerous",
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
                moveTo(15.73f, 3f)
                horizontalLineTo(8.27f)
                lineTo(3f, 8.27f)
                verticalLineToRelative(7.46f)
                lineTo(8.27f, 21f)
                horizontalLineToRelative(7.46f)
                lineTo(21f, 15.73f)
                verticalLineTo(8.27f)
                lineTo(15.73f, 3f)
                close()
                moveTo(17f, 15.74f)
                lineTo(15.74f, 17f)
                lineTo(12f, 13.26f)
                lineTo(8.26f, 17f)
                lineTo(7f, 15.74f)
                lineTo(10.74f, 12f)
                lineTo(7f, 8.26f)
                lineTo(8.26f, 7f)
                lineTo(12f, 10.74f)
                lineTo(15.74f, 7f)
                lineTo(17f, 8.26f)
                lineTo(13.26f, 12f)
                lineTo(17f, 15.74f)
                close()
            }
        }.build()
        
        return _Dangerous!!
    }

private var _Dangerous: ImageVector? = null

