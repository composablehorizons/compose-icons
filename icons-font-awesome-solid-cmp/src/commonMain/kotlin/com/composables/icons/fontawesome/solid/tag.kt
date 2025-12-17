package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Tag: ImageVector
    get() {
        if (_Tag != null) return _Tag!!
        
        _Tag = ImageVector.Builder(
            name = "tag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 252.118f)
                verticalLineTo(48f)
                curveTo(0f, 21.49f, 21.49f, 0f, 48f, 0f)
                horizontalLineToRelative(204.118f)
                arcToRelative(48f, 48f, 0f, false, true, 33.941f, 14.059f)
                lineToRelative(211.882f, 211.882f)
                curveToRelative(18.745f, 18.745f, 18.745f, 49.137f, 0f, 67.882f)
                lineTo(293.823f, 497.941f)
                curveToRelative(-18.745f, 18.745f, -49.137f, 18.745f, -67.882f, 0f)
                lineTo(14.059f, 286.059f)
                arcTo(48f, 48f, 0f, false, true, 0f, 252.118f)
                close()
                moveTo(112f, 64f)
                curveToRelative(-26.51f, 0f, -48f, 21.49f, -48f, 48f)
                reflectiveCurveToRelative(21.49f, 48f, 48f, 48f)
                reflectiveCurveToRelative(48f, -21.49f, 48f, -48f)
                reflectiveCurveToRelative(-21.49f, -48f, -48f, -48f)
                close()
            }
        }.build()
        
        return _Tag!!
    }

private var _Tag: ImageVector? = null

