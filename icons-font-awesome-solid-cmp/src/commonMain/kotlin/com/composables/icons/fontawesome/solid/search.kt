package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Search: ImageVector
    get() {
        if (_Search != null) return _Search!!
        
        _Search = ImageVector.Builder(
            name = "search",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(505f, 442.7f)
                lineTo(405.3f, 343f)
                curveToRelative(-4.5f, -4.5f, -10.6f, -7f, -17f, -7f)
                horizontalLineTo(372f)
                curveToRelative(27.6f, -35.3f, 44f, -79.7f, 44f, -128f)
                curveTo(416f, 93.1f, 322.9f, 0f, 208f, 0f)
                reflectiveCurveTo(0f, 93.1f, 0f, 208f)
                reflectiveCurveToRelative(93.1f, 208f, 208f, 208f)
                curveToRelative(48.3f, 0f, 92.7f, -16.4f, 128f, -44f)
                verticalLineToRelative(16.3f)
                curveToRelative(0f, 6.4f, 2.5f, 12.5f, 7f, 17f)
                lineToRelative(99.7f, 99.7f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0f)
                lineToRelative(28.3f, -28.3f)
                curveToRelative(9.4f, -9.4f, 9.4f, -24.6f, 0.1f, -34f)
                close()
                moveTo(208f, 336f)
                curveToRelative(-70.7f, 0f, -128f, -57.2f, -128f, -128f)
                curveToRelative(0f, -70.7f, 57.2f, -128f, 128f, -128f)
                curveToRelative(70.7f, 0f, 128f, 57.2f, 128f, 128f)
                curveToRelative(0f, 70.7f, -57.2f, 128f, -128f, 128f)
                close()
            }
        }.build()
        
        return _Search!!
    }

private var _Search: ImageVector? = null

