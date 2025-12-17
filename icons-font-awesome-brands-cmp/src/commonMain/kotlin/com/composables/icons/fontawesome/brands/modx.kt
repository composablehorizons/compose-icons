package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Modx: ImageVector
    get() {
        if (_Modx != null) return _Modx!!
        
        _Modx = ImageVector.Builder(
            name = "modx",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(356f, 241.8f)
                lineToRelative(36.7f, 23.7f)
                verticalLineTo(480f)
                lineToRelative(-133f, -83.8f)
                lineTo(356f, 241.8f)
                close()
                moveTo(440f, 75f)
                horizontalLineTo(226.3f)
                lineToRelative(-23f, 37.8f)
                lineToRelative(153.5f, 96.5f)
                lineTo(440f, 75f)
                close()
                moveToRelative(-89f, 142.8f)
                lineTo(55.2f, 32f)
                verticalLineToRelative(214.5f)
                lineToRelative(46f, 29f)
                lineTo(351f, 217.8f)
                close()
                moveTo(97f, 294.2f)
                lineTo(8f, 437f)
                horizontalLineToRelative(213.7f)
                lineToRelative(125f, -200.5f)
                lineTo(97f, 294.2f)
                close()
            }
        }.build()
        
        return _Modx!!
    }

private var _Modx: ImageVector? = null

