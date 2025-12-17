package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Tags: ImageVector
    get() {
        if (_Tags != null) return _Tags!!
        
        _Tags = ImageVector.Builder(
            name = "tags",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(497.941f, 225.941f)
                lineTo(286.059f, 14.059f)
                arcTo(48f, 48f, 0f, false, false, 252.118f, 0f)
                horizontalLineTo(48f)
                curveTo(21.49f, 0f, 0f, 21.49f, 0f, 48f)
                verticalLineToRelative(204.118f)
                arcToRelative(48f, 48f, 0f, false, false, 14.059f, 33.941f)
                lineToRelative(211.882f, 211.882f)
                curveToRelative(18.744f, 18.745f, 49.136f, 18.746f, 67.882f, 0f)
                lineToRelative(204.118f, -204.118f)
                curveToRelative(18.745f, -18.745f, 18.745f, -49.137f, 0f, -67.882f)
                close()
                moveTo(112f, 160f)
                curveToRelative(-26.51f, 0f, -48f, -21.49f, -48f, -48f)
                reflectiveCurveToRelative(21.49f, -48f, 48f, -48f)
                reflectiveCurveToRelative(48f, 21.49f, 48f, 48f)
                reflectiveCurveToRelative(-21.49f, 48f, -48f, 48f)
                close()
                moveToRelative(513.941f, 133.823f)
                lineTo(421.823f, 497.941f)
                curveToRelative(-18.745f, 18.745f, -49.137f, 18.745f, -67.882f, 0f)
                lineToRelative(-0.36f, -0.36f)
                lineTo(527.64f, 323.522f)
                curveToRelative(16.999f, -16.999f, 26.36f, -39.6f, 26.36f, -63.64f)
                reflectiveCurveToRelative(-9.362f, -46.641f, -26.36f, -63.64f)
                lineTo(331.397f, 0f)
                horizontalLineToRelative(48.721f)
                arcToRelative(48f, 48f, 0f, false, true, 33.941f, 14.059f)
                lineToRelative(211.882f, 211.882f)
                curveToRelative(18.745f, 18.745f, 18.745f, 49.137f, 0f, 67.882f)
                close()
            }
        }.build()
        
        return _Tags!!
    }

private var _Tags: ImageVector? = null

