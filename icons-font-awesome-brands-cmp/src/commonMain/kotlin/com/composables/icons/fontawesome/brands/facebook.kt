package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Facebook: ImageVector
    get() {
        if (_Facebook != null) return _Facebook!!
        
        _Facebook = ImageVector.Builder(
            name = "facebook",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(504f, 256f)
                curveTo(504f, 119f, 393f, 8f, 256f, 8f)
                reflectiveCurveTo(8f, 119f, 8f, 256f)
                curveToRelative(0f, 123.78f, 90.69f, 226.38f, 209.25f, 245f)
                verticalLineTo(327.69f)
                horizontalLineToRelative(-63f)
                verticalLineTo(256f)
                horizontalLineToRelative(63f)
                verticalLineToRelative(-54.64f)
                curveToRelative(0f, -62.15f, 37f, -96.48f, 93.67f, -96.48f)
                curveToRelative(27.14f, 0f, 55.52f, 4.84f, 55.52f, 4.84f)
                verticalLineToRelative(61f)
                horizontalLineToRelative(-31.28f)
                curveToRelative(-30.8f, 0f, -40.41f, 19.12f, -40.41f, 38.73f)
                verticalLineTo(256f)
                horizontalLineToRelative(68.78f)
                lineToRelative(-11f, 71.69f)
                horizontalLineToRelative(-57.78f)
                verticalLineTo(501f)
                curveTo(413.31f, 482.38f, 504f, 379.78f, 504f, 256f)
                close()
            }
        }.build()
        
        return _Facebook!!
    }

private var _Facebook: ImageVector? = null

