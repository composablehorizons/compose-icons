package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Save: ImageVector
    get() {
        if (_Save != null) return _Save!!
        
        _Save = ImageVector.Builder(
            name = "save",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(433.941f, 129.941f)
                lineToRelative(-83.882f, -83.882f)
                arcTo(48f, 48f, 0f, false, false, 316.118f, 32f)
                horizontalLineTo(48f)
                curveTo(21.49f, 32f, 0f, 53.49f, 0f, 80f)
                verticalLineToRelative(352f)
                curveToRelative(0f, 26.51f, 21.49f, 48f, 48f, 48f)
                horizontalLineToRelative(352f)
                curveToRelative(26.51f, 0f, 48f, -21.49f, 48f, -48f)
                verticalLineTo(163.882f)
                arcToRelative(48f, 48f, 0f, false, false, -14.059f, -33.941f)
                close()
                moveTo(224f, 416f)
                curveToRelative(-35.346f, 0f, -64f, -28.654f, -64f, -64f)
                curveToRelative(0f, -35.346f, 28.654f, -64f, 64f, -64f)
                reflectiveCurveToRelative(64f, 28.654f, 64f, 64f)
                curveToRelative(0f, 35.346f, -28.654f, 64f, -64f, 64f)
                close()
                moveToRelative(96f, -304.52f)
                verticalLineTo(212f)
                curveToRelative(0f, 6.627f, -5.373f, 12f, -12f, 12f)
                horizontalLineTo(76f)
                curveToRelative(-6.627f, 0f, -12f, -5.373f, -12f, -12f)
                verticalLineTo(108f)
                curveToRelative(0f, -6.627f, 5.373f, -12f, 12f, -12f)
                horizontalLineToRelative(228.52f)
                curveToRelative(3.183f, 0f, 6.235f, 1.264f, 8.485f, 3.515f)
                lineToRelative(3.48f, 3.48f)
                arcTo(11.996f, 11.996f, 0f, false, true, 320f, 111.48f)
                close()
            }
        }.build()
        
        return _Save!!
    }

private var _Save: ImageVector? = null

