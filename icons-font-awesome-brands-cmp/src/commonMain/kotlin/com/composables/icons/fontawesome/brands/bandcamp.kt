package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Bandcamp: ImageVector
    get() {
        if (_Bandcamp != null) return _Bandcamp!!
        
        _Bandcamp = ImageVector.Builder(
            name = "bandcamp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(256f, 8f)
                curveTo(119f, 8f, 8f, 119f, 8f, 256f)
                reflectiveCurveTo(119f, 504f, 256f, 504f)
                reflectiveCurveTo(504f, 393f, 504f, 256f)
                reflectiveCurveTo(393f, 8f, 256f, 8f)
                close()
                moveToRelative(48.2f, 326.1f)
                horizontalLineToRelative(-181f)
                lineTo(207.9f, 178f)
                horizontalLineToRelative(181f)
                close()
            }
        }.build()
        
        return _Bandcamp!!
    }

private var _Bandcamp: ImageVector? = null

